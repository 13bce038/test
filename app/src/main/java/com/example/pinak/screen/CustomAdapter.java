package com.example.pinak.screen;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.support.v13.app.FragmentStatePagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

public class CustomAdapter extends FragmentStatePagerAdapter {

    private final int PAGE_COUNT = 2;
    private Context mContext;
    private String tabTitles[];

    CustomAdapter(FragmentManager fm, Context mContext) {
        super(fm);
        this.mContext = mContext;
        tabTitles = new String[]{
                mContext.getString(R.string.tab_one_name),
                mContext.getString(R.string.tab_two_name)
        };
    }

    // This method determines the fragment for each tab.
    @Override
    public Fragment getItem(int position) {
        if (position == 0)
            return new TabOneFragment();
        else if (position == 1)
            return new TabOneFragment();
        return null;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    View getTabView(int position) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.custom_tab, null);
        TextView tv = v.findViewById(R.id.text1);
        tv.setText(tabTitles[position]);
        return v;
    }


}
