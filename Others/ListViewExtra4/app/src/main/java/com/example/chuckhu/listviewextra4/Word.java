package com.example.chuckhu.listviewextra4;

/**
 * Created by chuckhu on 2017/5/23.
 */

public class Word {

    private String mDefaultTranslation;

    private String mMiwokTranslation;

    // 4.Drawable resource ID
    private int mImageResourceId;




    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    //4.
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;

        mImageResourceId = imageResourceId;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }


    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    //4.
    public int getImageResourceId() {
        return mImageResourceId;
    }

}