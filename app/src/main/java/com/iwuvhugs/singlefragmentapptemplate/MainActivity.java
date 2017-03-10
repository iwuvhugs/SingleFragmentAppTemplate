package com.iwuvhugs.singlefragmentapptemplate;

import android.support.v4.app.Fragment;

public class MainActivity extends SingleFragmentActivity implements MainFragment.OnFragmentInteractionListener {

    @Override
    protected Fragment createFragment() {
        return MainFragment.newInstance();
    }
}
