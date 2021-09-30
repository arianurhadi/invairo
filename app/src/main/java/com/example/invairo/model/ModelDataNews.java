package com.example.invairo.model;

public class ModelDataNews {
    private int mImg;
    private String mTitle, mCat;

    public ModelDataNews(int img, String title, String cat){
        mImg = img;
        mTitle = title;
        mCat = cat;
    }

    public int getImg(){
        return mImg;
    }

    public String getTitle(){
        return mTitle;
    }

    public String getCat(){
        return mCat;
    }

}

