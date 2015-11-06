package app.ieee.ma.emsi.navdrawtest.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.astuetz.PagerSlidingTabStrip;

import app.ieee.ma.emsi.navdrawtest.R;
import app.ieee.ma.emsi.navdrawtest.wiki_fragment.FirstFragment;

/**
 * Created by idriss on 04/11/2015.
 */
public class GeneralInfo extends AppCompatActivity {

    public static final String ARG_PAGE = "ARG_PAGE";


    FragmentPagerAdapter adapterViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.info_fragment);

        // Get the ViewPager and set it's PagerAdapter so that it can display items
        ViewPager vPager = (ViewPager) findViewById(R.id.vp);
        adapterViewPager= new MyPagerAdapter(getSupportFragmentManager());
        vPager.setAdapter(adapterViewPager);
        // Give the PagerSlidingTabStrip the ViewPager
        PagerSlidingTabStrip tabsStrip = (PagerSlidingTabStrip) findViewById(R.id.tabs);
        // Attach the view pager to the tab strip
        tabsStrip.setViewPager(vPager);

        ;

    }


    
    public static class MyPagerAdapter extends FragmentPagerAdapter {
        private static int NUM_ITEMS = 3;
        private String tabTitles[] = new String[] { "Tab1", "Tab2", "Tab3" };
        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {

            switch (position) {
                case 0:
                    return FirstFragment.new_instance(position, "fragment 1");
                case 1:
                    return FirstFragment.new_instance(position, "fragment 2");
                case 2:
                    return FirstFragment.new_instance(position, "fragment 3");
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            return NUM_ITEMS;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return tabTitles[position];
        }

    }

}