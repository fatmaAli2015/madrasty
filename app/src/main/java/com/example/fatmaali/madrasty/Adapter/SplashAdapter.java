package com.example.fatmaali.madrasty.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.fatmaali.madrasty.R;

public class SplashAdapter extends PagerAdapter {
    Context context;
    LayoutInflater layoutInflater;
    ImageView imageView;
    TextView textView;
    //arrays
    public int[] slide_images = {R.drawable.img1, R.drawable.img2, R.drawable.img3};
    public int[] slide_decs = {R.string.splash_text1,R.string.splash_text2,R.string.splash_text3};

    public SplashAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return slide_decs.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == (LinearLayout) object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_splash, container, false);
        imageView = (ImageView) view.findViewById(R.id.imageSlideSplash);
        textView = (TextView) view.findViewById(R.id.textSlideSplash);
        imageView.setImageResource(slide_images[position]);
        textView.setText(slide_decs[position]);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout) object);
    }
}
