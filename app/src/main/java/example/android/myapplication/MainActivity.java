package example.android.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int cell = 5;
        ImageView img = (ImageView) findViewById(R.id.imageView2);
        TranslateAnimation translate = new TranslateAnimation(0, 150*cell, 0, 0);
        translate.setDuration(1500); // 3000msかけてアニメーションする
        translate.setFillAfter(true);
        img.startAnimation(translate); // アニメーション適用
    }
}
