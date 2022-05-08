package com.example.android.miwok;

public class Word {
    private final static int NOTHING = -1;
    private int mImageId = NOTHING;
    private  int mMediaId = NOTHING;
    private String mMiwokWord;
    private  String mDefaultWord;

    public Word(int imageId, String miwokWord, String defaultWord, int mediaId) {
        mMediaId = mediaId;
        mImageId = imageId;
        mMiwokWord = miwokWord;
        mDefaultWord = defaultWord;
    }

    public Word(String mMiwokWord, String mDefaultWord, int mMediaId) {
        this.mMiwokWord = mMiwokWord;
        this.mDefaultWord = mDefaultWord;
        this.mMediaId = mMediaId;
    }

    public String getMiwokWord() {
        return mMiwokWord;
    }

    public String getDefaultWord() {
        return mDefaultWord;
    }

    public int getImageId() {
        return mImageId;
    }

    public int getmMediaId() {
        return mMediaId;
    }
}
