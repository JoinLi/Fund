package ly.funds.fragment;

import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.gson.Gson;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.Calendar;

import butterknife.Bind;
import butterknife.ButterKnife;
import ly.funds.R;
import ly.funds.bean.FundBean;
import ly.funds.bean.FundResultBean;
import ly.funds.util.LogUtil;
import ly.funds.view.CircleImageView;
import okhttp3.Call;

public class FundFragment extends BaseFragment {

    @Bind(R.id.photo)
    CircleImageView photo;
    @Bind(R.id.text_xfz)
    TextView textXfz;
    @Bind(R.id.text_ye)
    TextView textYe;
    @Bind(R.id.text_danwei)
    TextView textDanwei;
    @Bind(R.id.text_yuejiao)
    TextView textYuejiao;
    @Bind(R.id.text_jishu)
    TextView textJishu;
    @Bind(R.id.text_date)
    TextView textDate;
    @Bind(R.id.text_grzh)
    TextView textGrzh;
    @Bind(R.id.text_khrq)
    TextView textKhrq;
    @Bind(R.id.text_dwzh)
    TextView textDwzh;
    @Bind(R.id.name)
    TextView name;
    @Bind(R.id.layout_cheyuan)
    LinearLayout layoutCheyuan;
    private FundBean bean = new FundBean();
    private FundResultBean.DataBean dataBean = new FundResultBean().getData();

    public static FundFragment newInstance() {
        FundFragment fragment = new FundFragment();
        return fragment;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_fund;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {
        String result = getActivity().getIntent().getStringExtra("result");
        String cookie = getActivity().getIntent().getStringExtra("cookie");
        try {

            Gson gson = new Gson();
            bean = gson.fromJson(result, FundBean.class);
//            Map<String, String> retMap2 = gson.fromJson(result, new TypeToken<Map<String, String>>() {
//            }.getType());
//            for (String key : retMap2.keySet()) {
//
//                LogUtil.m("............." + "key:" + key + " values:" + retMap2.get(key));
//            }
            String url = "http://www.sjzgjj.cn/wsyyt/command.summer?uuid=" + Calendar.getInstance().getTimeInMillis();
            LogUtil.e("**********" + url);
            LogUtil.e("**********" + cookie);
            OkHttpUtils
                    .post()
                    .url(url)
                    .addHeader("X-Requested-With", "XMLHttpRequest")
                    .addHeader("Accept", "application/json, text/javascript, */*; q=0.01")
                    .addHeader("Content-Type", "application/x-www-form-urlencoded; charset=utf-8")
                    .addHeader("User-Agent", "Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 6.1; WOW64; Trident/4.0; SLCC2; .NET CLR 2.0.50727; .NET CLR 3.5.30729; .NET CLR 3.0.30729; Media Center PC 6.0; .NET4.0C; .NET4.0E; Shuame; InfoPath.2)")
                    .addHeader("Cookie", cookie)
                    .addParams("_ACCNUM", bean.get_ACCNUM())
                    .addParams("_UNITACCNUM", bean.get_UNITACCNUM())
                    .addParams("_IS", bean.get_IS())
                    .addParams("_PAGEID", bean.get_PAGEID())
                    .addParams("_LOGIP", bean.get_LOGIP())
                    .addParams("isSamePer", bean.getIsSamePer())
                    .addParams("_PROCID", bean.get_PROCID())
                    .addParams("_SENDOPERID", bean.get_SENDOPERID())
                    .addParams("_BRANCHKIND", bean.get_BRANCHKIND())
                    .addParams("_SENDDATE", bean.get_SENDDATE())
                    .addParams("CURRENT_SYSTEM_DATE", bean.getCURRENT_SYSTEM_DATE())
                    .addParams("_ISCROP", bean.get_ISCROP())
                    .addParams("_TYPE", bean.get_TYPE())
                    .addParams("_PORCNAME", bean.get_TYPE())
                    .addParams("temp__rownum", bean.getTemp__rownum())
                    .addParams("_UNITACCNAME", bean.get_UNITACCNAME())
                    .addParams("_ACCNAME", bean.get_ACCNAME())
                    .addParams("_DEPUTYIDCARDNUM", bean.get_DEPUTYIDCARDNUM())
                    .addParams("_SENDTIME", bean.get_SENDTIME())
                    .addParams("_WITHKEY", bean.get_WITHKEY())
                    .addParams("AccName", bean.get_ACCNAME())
                    .addParams("AccNum", bean.get_ACCNUM())
                    .addParams("CertiNum", bean.get_SENDOPERID())
                    .addParams("UnitAccNum", bean.get_UNITACCNUM())
                    .addParams("UnitAccName", bean.get_UNITACCNAME())
                    .addParams("indiaccstate", "0")
                    .addParams("trancode", "118898")
                    .addParams("accname2", "query1")
                    .addParams("accnum", bean.get_ACCNUM())
                    .build()
                    .execute(new StringCallback() {
                        @Override
                        public void onError(Call call, Exception e, int id) {
                            LogUtil.e("*****" + e);
                        }

                        @Override
                        public void onResponse(String response, int id) {
                            Gson gson = new Gson();
                            FundResultBean fundResultBean = gson.fromJson(response, FundResultBean.class);
                            dataBean = fundResultBean.getData();
                            textYe.setText(getString(R.string.text_ye) + dataBean.getAmt1()); //公积金余额
                            textYuejiao.setText(getString(R.string.text_ce) + dataBean.getIntamt());//月缴存额
                            textJishu.setText(getString(R.string.text_js) + dataBean.getPrin());//缴存基数
                            textDate.setText(getString(R.string.text_rq) + dataBean.getAccname());//交至年月
                            textKhrq.setText(getString(R.string.text_kh) + dataBean.getTransdate());//开户日期
//                            LogUtil.e("******" + response);
                            name.setText(bean.get_ACCNAME());  //名字
                            textXfz.setText(getString(R.string.text_sfz) + bean.get_SENDOPERID());//身份证号
                            textDanwei.setText(getString(R.string.text_dwmc) + bean.get_UNITACCNAME());//单位名称
                            textGrzh.setText(getString(R.string.text_gr) + bean.get_ACCNUM());//个人账号
                            textDwzh.setText(getString(R.string.text_dwzh) + bean.get_UNITACCNUM());//单位账号
                        }
                    });


        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}
