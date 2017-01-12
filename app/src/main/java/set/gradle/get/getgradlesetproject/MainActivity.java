package set.gradle.get.getgradlesetproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView text_1;
    private TextView text_2;
    private TextView text_3;
    private TextView text_4;
    private TextView text_5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        getBuildTypes();


    }

    private void initViews() {
        text_1 = (TextView) findViewById(R.id.text_1);
        text_2 = (TextView) findViewById(R.id.text_2);
        text_3 = (TextView) findViewById(R.id.text_3);
        text_4 = (TextView) findViewById(R.id.text_4);
        text_5 = (TextView) findViewById(R.id.text_5);
    }

    /**
     * 获取 buildType中的各个参数。
     */
    public void getBuildTypes() {

        //  as 侧边栏，右面的 build varieties 应该可以实现 build 和 release 模式的自由切换。 不去哦release 需要签名文件。

        //获取第一类数据
        text_1.setText(MyApplication.mBuildVersion + "");

        //获取第二类数据
        text_2.setText(MyApplication.mBuildVersionField + "");

        //获取versionNumber
        text_3.setText("获取versionNumber");

        // 获取versionName
        text_4.setText("获取versionName");


    }
}
