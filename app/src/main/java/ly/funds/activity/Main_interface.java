package ly.funds.activity;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import ly.funds.R;
import ly.funds.adapter.ViewPagerAdapter;
import ly.funds.fragment.FundFragment;

public class Main_interface extends BaseActivity implements View.OnClickListener {

    @Bind(R.id.text_huoyuan)
    TextView text_huoyuan;

    @Bind(R.id.text_cheyuan)
    TextView text_cheyuan;
    @Bind(R.id.viewpager)
    ViewPager viewpager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interface);
        setStatusBar();
        ButterKnife.bind(this);
        initListener();


    }

    private void initListener() {
        text_huoyuan.setOnClickListener(this);
        text_cheyuan.setOnClickListener(this);
        setupViewPager(viewpager);
        viewpager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                hiddenLayout();
                if (position == 0) {
                    text_huoyuan.setBackground(ContextCompat.getDrawable(Main_interface.this, R.drawable.toobar_bg_select_left));
                    text_huoyuan.setTextColor(ContextCompat.getColor(Main_interface.this, R.color.colorPrimary));
                } else if (position == 1) {
                    text_cheyuan.setBackground(ContextCompat.getDrawable(Main_interface.this, R.drawable.toobar_bg_select_right));
                    text_cheyuan.setTextColor(ContextCompat.getColor(Main_interface.this, R.color.colorPrimary));
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }


    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(FundFragment.newInstance(), "公积金");
        adapter.addFragment(FundFragment.newInstance(), "发布车源");
        viewPager.setAdapter(adapter);
        viewPager.setCurrentItem(0);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.text_cheyuan:
                hiddenLayout();
                text_cheyuan.setBackground(ContextCompat.getDrawable(Main_interface.this, R.drawable.toobar_bg_select_right));
                text_cheyuan.setTextColor(ContextCompat.getColor(Main_interface.this, R.color.colorPrimary));
                viewpager.setCurrentItem(0);
                break;
            case R.id.text_huoyuan:
                hiddenLayout();
                text_huoyuan.setBackground(ContextCompat.getDrawable(Main_interface.this, R.drawable.toobar_bg_select_left));
                text_huoyuan.setTextColor(ContextCompat.getColor(Main_interface.this, R.color.colorPrimary));
                viewpager.setCurrentItem(1);
                break;

            default:

                break;

        }
    }

    private void hiddenLayout() {
        text_cheyuan.setBackground(ContextCompat.getDrawable(Main_interface.this, R.drawable.toobar_bg_cancle_right));
        text_cheyuan.setTextColor(ContextCompat.getColor(Main_interface.this, R.color.black));
        text_huoyuan.setBackground(ContextCompat.getDrawable(Main_interface.this, R.drawable.toobar_bg_cancle_left));
        text_huoyuan.setTextColor(ContextCompat.getColor(Main_interface.this, R.color.black));

    }


    /**
     * 点两次退出按钮退出
     */
    boolean isExit = false;

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            if (!isExit) {
                isExit = true;
                Toast.makeText(getApplicationContext(), "再按一次退出",
                        Toast.LENGTH_SHORT).show();
                new Handler().postDelayed(new Runnable() {
                    public void run() {
                        isExit = false;
                    }
                }, 2000);
                return false;
            }
        }

        return super.onKeyDown(keyCode, event);
    }
}
