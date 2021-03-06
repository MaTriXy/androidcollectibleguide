package com.irit.androidcollectibleguide.bugdroids;

import java.util.GregorianCalendar;

/**
 * Created by Nicolas on 22/06/2014.
 */
public class GoogleBugdroid extends AbstractBugdroid {
    public GoogleBugdroid(int mID, String mName, String mTag, String mArtist, String mDescription,
                             GregorianCalendar mReleaseDate, float mWishedPrice, int mSimplePicture,
                             int mLargePicture) {
        super(mID, mName, mTag, mArtist, mDescription, mReleaseDate, mWishedPrice, mSimplePicture, mLargePicture);
        mBuyingPrice = 0.0f;

    }
}
