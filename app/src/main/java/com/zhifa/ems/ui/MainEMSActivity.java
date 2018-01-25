package com.zhifa.ems.ui;

import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.alibaba.android.vlayout.VirtualLayoutManager;
import com.zhifa.ems.R;

public class MainEMSActivity extends AppCompatActivity {

    private static final String TAG = "MainEMSActivity";


    private ViewPager mViewPager;
    private FragmentPagerAdapter mAdapter;
    private List<Fragment> mFragments = new ArrayList<Fragment>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_ems);
        mViewPager = (ViewPager) findViewById(R.id.id_viewpager);


    }
}
