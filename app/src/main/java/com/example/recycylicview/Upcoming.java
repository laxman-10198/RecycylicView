package com.example.recycylicview;

import androidx.annotation.NonNull;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.TextView;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class Upcoming extends AppCompatActivity {

    private ViewPager mViewPager;
    private TabLayout mTabLayout;
    public TextView toolbarTitle;
    private TabItem mtabItem1,mTabItem2,mTabItem3;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upcoming);
        mtabItem1=(TabItem)findViewById(R.id.tt1);
        mTabItem2=(TabItem)findViewById(R.id.tt2);
        mTabItem3=(TabItem)findViewById(R.id.tt3);
        mTabLayout=(TabLayout)findViewById(R.id.upcoming_tabLayout1);


        mViewPager=(ViewPager)findViewById(R.id.viewpager1);
        toolbarTitle=(TextView)findViewById(R.id.toolBar_title);


        ViewPagerAdapter mAdapter1=new ViewPagerAdapter(getSupportFragmentManager(),mTabLayout.getTabCount());

        mViewPager.setAdapter(mAdapter1);
       // mTabLayout.setupWithViewPager(mViewPager);

        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTabLayout));

        mTabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {

            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                mViewPager.setCurrentItem(tab.getPosition());
                switch (tab.getPosition())
                {
                    case 0:
                        toolbarTitle.setText("Upcoming");
                    case 1:
                        toolbarTitle.setText("Live");
                    case 2:
                        toolbarTitle.setText("Past");

                }


            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }

     private class ViewPagerAdapter extends FragmentPagerAdapter {

        private int numOfTab;


        public ViewPagerAdapter(FragmentManager fm,int numOfTab )
        {
            super(fm);
            this.numOfTab=numOfTab;
        }

        @NonNull
        @Override
        public Fragment getItem(int position)
        {
            switch (position) {
                case 0:

                    return new Upcoming_Fragement();
                case 1:
                    return new Live_Fragment();
                case 2:
                    return new Past_fragement();
                    default:
                        return null;
            }

        }

        @Override
        public int getCount() {
            return numOfTab;
        }
     }
}
