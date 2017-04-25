package ly.funds.activity;

import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;

import com.readystatesoftware.systembartint.SystemBarTintManager;

import ly.funds.R;

/**
 * author：Administrator on 2017/3/21 09:13
 * description:文件说明
 * version:版本
 */
public abstract class BaseActivity extends AppCompatActivity {

    public void setStatusBar() {
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        SystemBarTintManager tintManager = new SystemBarTintManager(this);
        // enable status bar tint
        tintManager.setStatusBarTintEnabled(true);
        // enable navigation bar tint
        tintManager.setNavigationBarTintEnabled(true);
        tintManager.setStatusBarTintResource(R.color.colorPrimaryDark);
    }

}
