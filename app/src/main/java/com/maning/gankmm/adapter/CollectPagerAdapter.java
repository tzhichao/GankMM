package com.maning.gankmm.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.maning.gankmm.constant.Constants;
import com.maning.gankmm.fragment.collect.CollectPagerFragment;

/**
 * Created by maning on 16/3/5.
 */
public class CollectPagerAdapter extends FragmentPagerAdapter {

    public final String[] TITLES = {
            Constants.FlagWelFare,
            Constants.FlagAndroid,
            Constants.FlagIOS,
            Constants.FlagVideo,
            Constants.FlagJS,
            Constants.FlagExpand,
            Constants.FlagRecommend,
            Constants.FlagAPP,
    };

    public CollectPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return TITLES[position];
    }

    @Override
    public int getCount() {
        return TITLES.length;
    }

    @Override
    public Fragment getItem(int position) {
        return CollectPagerFragment.newInstance(TITLES[position]);
    }

}
