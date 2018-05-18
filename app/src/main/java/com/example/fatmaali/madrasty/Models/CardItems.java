package com.example.fatmaali.madrasty.Models;

import android.widget.LinearLayout;

import com.example.fatmaali.madrasty.R;

public class CardItems {
    private int Images;
    private LinearLayout linearLayout;
    private int mTitle;

    public CardItems(int images, int mTitle) {
        Images = images;
        this.mTitle = mTitle;
    }

    public int getImages() {
        return Images;
    }

    public void setImages(int images) {
        Images = images;
    }

    public LinearLayout getLinearLayout() {
        return linearLayout;
    }

    public void setLinearLayout(LinearLayout linearLayout, int img[]) {
        this.linearLayout = linearLayout;
        linearLayout.setBackgroundResource(img[3]);
    }

    public int getmTitle() {
        return mTitle;
    }

    public void setmTitle(int mTitle) {
        this.mTitle = mTitle;
    }
}
