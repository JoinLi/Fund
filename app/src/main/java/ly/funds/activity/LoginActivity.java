package ly.funds.activity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.EditorInfo;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.BitmapCallback;
import com.zhy.http.okhttp.callback.StringCallback;
import com.zhy.http.okhttp.cookie.CookieJarImpl;
import com.zhy.http.okhttp.cookie.store.CookieStore;
import com.zhy.http.okhttp.cookie.store.PersistentCookieStore;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import ly.funds.R;
import ly.funds.bean.FundApi;
import ly.funds.util.LogUtil;
import ly.funds.util.ToastUtil;
import okhttp3.Call;
import okhttp3.Cookie;

/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends AppCompatActivity {

    @Bind(R.id.password)
    EditText mPasswordView;
    @Bind(R.id.ed_yzm)
    EditText ed_yzm;
    @Bind(R.id.im_yzm)
    ImageView im_yzm;
    @Bind(R.id.login_button)
    Button loginButton;
    @Bind(R.id.text_id)
    AutoCompleteTextView textId;
    private Dialog progressDialog;
    private Cookie cookie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        // Set up the login form.
        initView();
        getCode();

    }

    private void initView() {
        im_yzm.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                getCode();
            }
        });
        loginButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                String yzm = ed_yzm.getText().toString().trim();
                String id = textId.getText().toString().trim();
                String passWord = mPasswordView.getText().toString().trim();
                if (TextUtils.isEmpty(id)) {
                    Snackbar.make(getCurrentFocus(), "身份证号不能为空", Snackbar.LENGTH_SHORT).show();

                } else if (TextUtils.isEmpty(passWord)) {
                    Snackbar.make(getCurrentFocus(), "密码不能为空", Snackbar.LENGTH_SHORT).show();
                } else if (TextUtils.isEmpty(yzm)) {
                    Snackbar.make(getCurrentFocus(), "验证码不能为空", Snackbar.LENGTH_SHORT).show();
                } else {
                    dialogShow();
                    loginPosts(yzm, id, passWord);
                }


            }
        });

        mPasswordView.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int id, KeyEvent keyEvent) {
                if (id == R.id.login || id == EditorInfo.IME_NULL) {
                    return true;
                }
                return false;
            }
        });


    }

    private void dialogShow() {
        progressDialog = new Dialog(LoginActivity.this, R.style.progress_dialog);
        progressDialog.setContentView(R.layout.layout_dialog);
        progressDialog.setCancelable(true);
        progressDialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        TextView msg = (TextView) progressDialog.findViewById(R.id.id_tv_loadingmsg);
        msg.setText("正在加载中");
        progressDialog.show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        progressDialog.dismiss();
    }

    /**
     * 1 获取验证码以及cookie
     *
     * @param
     * @param
     * @param
     */
    private void getCode() {

        OkHttpUtils
                .get()
                .url(FundApi.FUND_CODE_URL)
                .build()
                .execute(new BitmapCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {
                        LogUtil.e("验证码获取失败");
                        Snackbar.make(getCurrentFocus(), "验证码获取失败", Snackbar.LENGTH_LONG).show();
                    }

                    @Override
                    public void onResponse(Bitmap response, int id) {
                        im_yzm.setImageBitmap(response);
                    }


                });
        try {
            CookieJarImpl cookieJar = new CookieJarImpl(new PersistentCookieStore(this));
            CookieStore cookieStore1 = cookieJar.getCookieStore();
            List<Cookie> cookies1 = cookieStore1.getCookies();
            cookie = cookies1.get(0);
            LogUtil.e("COOKIE值：" + cookie.value());
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    private void loginPosts(String yzm, String id, String passWord) {

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
                        progressDialog.dismiss();
                        Snackbar.make(getCurrentFocus(), "登录失败", Snackbar.LENGTH_LONG).show();
                    }

                    @Override
                    public void onResponse(String response, int id) {
                        LogUtil.e("数据" + response);
                        if (response.indexOf("个人信息查询") != -1) {
                            getLoginValue();
                        } else {
                            progressDialog.dismiss();
                            Snackbar.make(getCurrentFocus(), "登录失败", Snackbar.LENGTH_LONG).show();
                        }
                    }
                });


        try {
            CookieJarImpl cookieJar = new CookieJarImpl(new PersistentCookieStore(this));
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
                        progressDialog.dismiss();
                        ToastUtil.showToast(LoginActivity.this, "获取数据失败");
                        LogUtil.e("结果" + e);
                    }

                    @Override
                    public void onResponse(String response, int id) {
                        try {
                            int start = response.indexOf("poolSelect") + 12;
                            String reult = response.substring(start);
                            int end = reult.indexOf(";");
                            String reult1 = reult.substring(0, end);
                            String reult2 = reult1.replace("'", "\"");
                            LogUtil.e("结果" + reult2);
                            progressDialog.dismiss();
                            ToastUtil.showToast(LoginActivity.this, "登录成功");
                            Intent intent = new Intent(LoginActivity.this, Main_interface.class);
                            intent.putExtra("result", reult2);
                            intent.putExtra("cookie", cookie.value());
                            startActivity(intent);
                        } catch (Exception e) {
                            progressDialog.dismiss();
                            ToastUtil.showToast(LoginActivity.this, "服务器错误");
                            e.printStackTrace();
                        }


                    }


                });
    }

}

