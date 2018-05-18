package com.example.fatmaali.madrasty.Activity;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.example.fatmaali.madrasty.Activity.LoginResActivity;
import com.example.fatmaali.madrasty.Adapter.SplashAdapter;
import com.example.fatmaali.madrasty.R;

public class SplashActivity extends AppCompatActivity {

    ViewPager viewPagerSplash;
    LinearLayout mLinearLayout;
    ImageView[] mLines;
    SplashAdapter splashAdapter;
    TextView txtSkip;
    int mCurrentPage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        viewPagerSplash = (ViewPager) findViewById(R.id.viewPagerSplash);
        mLinearLayout = (LinearLayout) findViewById(R.id.linearSplashLines);
        txtSkip = (TextView) findViewById(R.id.txtSkip);

        splashAdapter = new SplashAdapter(this);
        viewPagerSplash.setAdapter(splashAdapter);
        addLinesIndicators(0);
        viewPagerSplash.addOnPageChangeListener(view);
        txtSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLogin = new Intent(SplashActivity.this, LoginResActivity.class);
                startActivity(intentLogin);
            }
        });

    }

    public void addLinesIndicators(int position) {
        mLines = new ImageView[3];
        mLinearLayout.removeAllViews();
        for (int i = 0; i < mLines.length; i++) {
            mLines[i] = new ImageView(this);
            mLines[i].setImageResource(R.drawable.whiterec);
            mLinearLayout.addView(mLines[i]);
        }
        if (mLines.length > 0) {
            mLines[position].getLayoutParams().width = 250;
            mLines[position].getLayoutParams().height = 200;
            mLines[position].requestLayout();
            if (position == 0) {
                mLines[position].setImageResource(R.drawable.purrec);
            } else if (position == 1) {
                mLines[position].setImageResource(R.drawable.yellowrec);
            } else {
                mLines[position].setImageResource(R.drawable.bluerec);
            }

        }

    }

    ViewPager.OnPageChangeListener view = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {
            addLinesIndicators(position);
            mCurrentPage = position;
        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };
}
