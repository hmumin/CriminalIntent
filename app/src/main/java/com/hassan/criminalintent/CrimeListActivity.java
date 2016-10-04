package com.hassan.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by hmumin on 9/26/16.
 */
public class CrimeListActivity extends SingleFragmentActivity{

    @Override
    protected Fragment createFragment()
    {
        return new CrimeListFragment();
    }
}
