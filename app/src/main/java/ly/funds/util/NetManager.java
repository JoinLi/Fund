package ly.funds.util;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;

import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.BitmapCallback;
import com.zhy.http.okhttp.callback.StringCallback;
import com.zhy.http.okhttp.cookie.CookieJarImpl;
import com.zhy.http.okhttp.cookie.store.CookieStore;
import com.zhy.http.okhttp.cookie.store.PersistentCookieStore;

import java.util.List;

import ly.funds.activity.Main_interface;
import ly.funds.bean.FundApi;
import okhttp3.Call;
import okhttp3.Cookie;

public class NetManager {
    private Cookie cookie;
    private Context context;
    private static NetManager netManager;
    private Bitmap bitmap = null;
    private String loginResult = null;

    private NetManager(Context context) {
        this.context = context;
    }

    public static NetManager getNetManager(Context context) {

        if (netManager == null) {
            netManager = new NetManager(context);
        }
        return netManager;
    }

    /**
     * 1 获取验证码以及cookie
     *
     * @param
     * @param
     * @param
     */
    public Bitmap getCode() {

        OkHttpUtils
                .get()
                .url(FundApi.FUND_CODE_URL)
                .build()
                .execute(new BitmapCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {

                        LogUtil.e("验证码获取失败");
                    }

                    @Override
                    public void onResponse(Bitmap response, int id) {
                        bitmap = response;
                    }


                });
        try {
            CookieJarImpl cookieJar = new CookieJarImpl(new PersistentCookieStore(context));
            CookieStore cookieStore1 = cookieJar.getCookieStore();
            List<Cookie> cookies1 = cookieStore1.getCookies();
            cookie = cookies1.get(0);
            LogUtil.e("COOKIE值：" + cookie.value());
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        return bitmap;
    }

    public String loginPosts(String yzm, String id, String passWord) {

        OkHttpUtils
                .post()
                .url(FundApi.FUND_LOGIN_URL)
                .addHeader("Cookie", "JSESSIONID=" + cookie.value())
                .addHeader("Content-Type",
                        "application/x-www-form-urlencoded")
                .addParams("certinum", id)
                .addParams("perpwd", passWord)
                .addParams("vericode", yzm)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {
                        LogUtil.e("数据" + e);
                    }

                    @Override
                    public void onResponse(String response, int id) {
                        LogUtil.e("数据" + response);
                        if (response.indexOf("个人信息查询") != -1) {
                            loginResult = "登录成功";
                        }
                    }
                });


        try {
            CookieJarImpl cookieJar = new CookieJarImpl(new PersistentCookieStore(context));
            CookieStore cookieStore1 = cookieJar.getCookieStore();
            List<Cookie> cookies1 = cookieStore1.getCookies();
            cookie = cookies1.get(0);
            if (cookie == null) {

                LogUtil.m("验证码获取cookie失败" + cookie.value());
            }

            LogUtil.m("登录COOKIE值：" + cookie.value());
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        return loginResult;
    }

    public void getLoginValue() {

        OkHttpUtils
                .get()
                .url("http://www.sjzgjj.cn/wsyyt/init.summer?_PROCID=60020007")
                .addHeader("Cookie", cookie.value())
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {
                        ToastUtil.showToast(context, "获取数据失败");
                        LogUtil.e("最后数据" + e);
                    }

                    @Override
                    public void onResponse(String response, int id) {
                        LogUtil.e("最后数据" + response);

                        int start = response.indexOf("poolSelect") + 12;
                        String reult = response.substring(start);
                        int end = reult.indexOf(";");
                        String reult1 = reult.substring(0, end);
                        String reult2 = reult1.replace("'", "\"");
                        LogUtil.e("结果" + reult2);
                        Intent intent = new Intent(context, Main_interface.class);
                        intent.putExtra("result", reult2);
                        intent.putExtra("cookie", cookie.value());
                        context.startActivity(intent);

                    }


                });
    }


}
