package com.example.pinak.screen;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupReferences();
        setupViewPagerAndTabs();

    }

    /**
     * sets up the viewpager with tablayout
     */
    private void setupViewPagerAndTabs() {
        CustomAdapter viewPagerAdapter = new CustomAdapter(getFragmentManager(), this);
        // Set the adapter onto the viewpager.
        viewPager.setAdapter(viewPagerAdapter);
        // Give the tab layout to the viewpager.
        tabLayout.setupWithViewPager(viewPager);

        // Iterate over all tabs and set the custom view
        for (int i = 0; i < tabLayout.getTabCount(); i++) {
            TabLayout.Tab tab = tabLayout.getTabAt(i);
            tab.setCustomView(viewPagerAdapter.getTabView(i));
        }

    }

    /**
     * get references from layout file and
     * assign them in the variables
     */
    private void setupReferences() {
        tabLayout = findViewById(R.id.tab_layout);
        viewPager = findViewById(R.id.view_pager);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            super.onBackPressed();
            return true;
        }
        return false;
    }
}

