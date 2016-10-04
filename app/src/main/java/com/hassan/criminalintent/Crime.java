package com.hassan.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by hmumin on 9/19/16.
 */
public class Crime {

    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;



    public Crime()
    {
        //Generate unique identifier
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    //Getter
    public UUID getId() {
        return mId;
    }

    //Getter and setter
    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date mDate) {
        this.mDate = mDate;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean mSolved) {
        this.mSolved = mSolved;
    }
}
