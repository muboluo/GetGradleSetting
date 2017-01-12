package set.gradle.get.getgradlesetproject;

import android.app.Application;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;

/**
 * Created by Henry on 2017/1/12.
 */

public class MyApplication extends Application {

    public static int mBuildVersion; //使用meta-data样式获取 gradle中的数据
    public static boolean mBuildVersionField ; // 使用 buildConfigField 获取 gradle配置中的数据


    @Override
    public void onCreate() {
        super.onCreate();
        //可以用来控制是否打印日志
        mBuildVersion = buildVersion();

        mBuildVersionField = BuildConfig.LOG_DEBUG;


    }


    /**
     * 从 gradle 里面获取 是debug版本， 还是 relase 版本。 还可以自定义版本，
     * 打渠道包的时候，可以在这里进行使用。
     * @return
     */
    public int buildVersion() {
        ApplicationInfo appInfo = null;
        try {
            appInfo = this.getPackageManager().getApplicationInfo(getPackageName(), PackageManager.GET_META_DATA);
            int ver = appInfo.metaData.getInt("BUILD_VERSION");
            return ver;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 1;
    }
}
