package com.example.fatmaali.madrasty.Models;

public class ModelNewFinancialCentre {
    private int mImage;
    private int mTitle;
    private int mNum;

    public ModelNewFinancialCentre(int mImage, int mTitle, int mNum) {
        this.mImage = mImage;
        this.mTitle = mTitle;
        this.mNum = mNum;
    }

    public int getmImage() {
        return mImage;
    }

    public void setmImage(int mImage) {
        this.mImage = mImage;
    }

    public int getmTitle() {
        return mTitle;
    }

    public void setmTitle(int mTitle) {
        this.mTitle = mTitle;
    }

    public int getmNum() {
        return mNum;
    }

    public void setmNum(int mNum) {
        this.mNum = mNum;
    }
}
