package com.wexing.menggang.verticalviewpager;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

public class MainActivity extends Activity {

    private VerticalViewPager verticalViewPager;
    private final int[] imgSource = {R.drawable.bg_android_v7_1,
            R.drawable.bg_android_v7_2, R.drawable.bg_android_v7_3,
            R.drawable.bg_android_v7_4, R.drawable.bg_android_v7_5,
            R.drawable.bg_android_v7_6};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.requestWindowFeature(Window.FEATURE_NO_TITLE);//去掉标题栏
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);//去掉信息栏

        setContentView(R.layout.activity_main);

        verticalViewPager = (VerticalViewPager) findViewById(R.id.vertical_viewpager);

        List<View> viewList = new ArrayList<View>();
        for (int i = 0; i < imgSource.length; i++) {
            View view = getLayoutInflater().inflate(R.layout.pager, null);
            ImageView img = (ImageView) view.findViewById(R.id.pager);
            img.setImageResource(imgSource[i]);
            viewList.add(view);
        }
        verticalViewPager.setViewList(viewList);
    }

}
