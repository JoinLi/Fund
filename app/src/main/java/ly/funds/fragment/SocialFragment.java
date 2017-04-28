package ly.funds.fragment;

import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.gson.Gson;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;
import com.zhy.http.okhttp.cookie.CookieJarImpl;
import com.zhy.http.okhttp.cookie.store.CookieStore;
import com.zhy.http.okhttp.cookie.store.PersistentCookieStore;

import java.util.List;

import butterknife.Bind;
import ly.funds.R;
import ly.funds.bean.FundApi;
import ly.funds.bean.SocialLoginBean;
import ly.funds.bean.YiLiaoBean;
import ly.funds.util.LogUtil;
import ly.funds.view.CircleImageView;
import okhttp3.Call;
import okhttp3.Cookie;

public class SocialFragment extends BaseFragment {


    @Bind(R.id.photo)
    CircleImageView photo;
    @Bind(R.id.name)
    TextView name;
    @Bind(R.id.text_xfz)
    TextView textXfz;
    @Bind(R.id.text_shebao)
    TextView textShebao;
    @Bind(R.id.text_yanglao)
    TextView textYanglao;
    @Bind(R.id.text_yiliao)
    TextView textYiliao;
    @Bind(R.id.text_shiye)
    TextView textShiye;
    @Bind(R.id.text_gongshang)
    TextView textGongshang;
    @Bind(R.id.text_shengyu)
    TextView textShengyu;
    @Bind(R.id.layout_cheyuan)
    LinearLayout layoutCheyuan;

    private SocialLoginBean.DataBean dataBean = new SocialLoginBean().getData();
    private YiLiaoBean.DataBeanX yiBean = new YiLiaoBean().getData();
    private Cookie cookie;

    public static SocialFragment newInstance() {
        SocialFragment fragment = new SocialFragment();
        return fragment;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_social;
    }

    @Override
    protected void initView() {
        loginPosts();
        YilaioPosts();
    }

    @Override
    protected void initData() {

    }

    private void loginPosts() {

        OkHttpUtils
                .post()
                .url(FundApi.SOCIAL_LOGIN_URL)
                .addHeader("User-Agent", "Apache-HttpClient/UNAVAILABLE (java 1.4)")
                .addHeader("Content-Type",
                        "application/x-www-form-urlencoded")
                .addParams("data", "{\"password\":\"199412\",\"username\":\"130626199412155831\"}")
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {
                        LogUtil.e("社保登录失败" + e);

                    }

                    @Override
                    public void onResponse(String response, int id) {

                        Gson gson = new Gson();
                        SocialLoginBean socialLoginBean = gson.fromJson(response, SocialLoginBean.class);
                        dataBean = socialLoginBean.getData();
                        textXfz.setText(getString(R.string.text_sfz) + dataBean.getUn()); //身份证
                        name.setText(dataBean.getName());//姓名
                        textShebao.setText(getString(R.string.text_shebao) + dataBean.getIdno());//社保卡号

                        LogUtil.e("数据" + response);

                    }
                });


        try {
            CookieJarImpl cookieJar = new CookieJarImpl(new PersistentCookieStore(getActivity()));
            CookieStore cookieStore1 = cookieJar.getCookieStore();
            List<Cookie> cookies1 = cookieStore1.getCookies();
            cookie = cookies1.get(0);

            LogUtil.m("社保登录COOKIE值：" + cookie.value());
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private void YilaioPosts() {

        OkHttpUtils
                .post()
                .url(FundApi.SOCIAL_YILIAO_URL)
                .addHeader("User-Agent", "Apache-HttpClient/UNAVAILABLE (java 1.4)")
                .addHeader("Content-Type",
                        "application/x-www-form-urlencoded")
                .addParams("data", "{\"pageno\":0,\"pagesize\":0,\"total\":0,\"year\":\"2017\"}")
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {
                        LogUtil.e("医疗保险失败" + e);

                    }

                    @Override
                    public void onResponse(String response, int id) {

                        Gson gson = new Gson();
                        YiLiaoBean yiLiaoBean = gson.fromJson(response, YiLiaoBean.class);
                        yiBean = yiLiaoBean.getData();
                        textYiliao.setText(getString(R.string.text_yiliao) + yiBean.getData().get(0).getBkc010()); //医疗账户余额
                        textGongshang.setText(getString(R.string.text_gongshang) +"正常参保"); //工伤
                        textShengyu.setText(getString(R.string.text_shengyu) +"正常参保"); //生育
                        textShiye.setText(getString(R.string.text_shiye)  +"正常参保"); //失业
                        textYanglao.setText(getString(R.string.text_yanglao)  +"正常参保"); //养老
                        LogUtil.e("医疗保险数据" + response);

                    }
                });


        try {
            CookieJarImpl cookieJar = new CookieJarImpl(new PersistentCookieStore(getActivity()));
            CookieStore cookieStore1 = cookieJar.getCookieStore();
            List<Cookie> cookies1 = cookieStore1.getCookies();
            cookie = cookies1.get(0);

            LogUtil.m("医疗COOKIE值：" + cookie.value());
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
