package com.laioffer.matrix;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class OnBoardingPageAdapter extends FragmentPagerAdapter {

    private static int NUM_ITEMS = 2; // ??????

    public OnBoardingPageAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @NonNull  // ??????


    // Returns the fragment to display for that page
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return LoginFragment.newInstance();
            case 1:
                return RegisterFragment.newInstance();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return NUM_ITEMS;
    }

    @Nullable
    public CharSequence getPageTitle(int position) {
        switch(position) {
            case 0:
                return "Login";
            case 1:
                return "Register";
            default:
                return null;
        }
    }
}
