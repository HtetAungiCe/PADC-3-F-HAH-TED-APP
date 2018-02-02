package hah.htetaunghlaing.ted.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import hah.htetaunghlaing.ted.R;
import hah.htetaunghlaing.ted.adapters.TedByCategoryAdapter;
import hah.htetaunghlaing.ted.fragments.TedMyTalksFragment;
import hah.htetaunghlaing.ted.fragments.TedPlaylistItemFragment;
import hah.htetaunghlaing.ted.fragments.TedPodCastFragment;
import hah.htetaunghlaing.ted.fragments.TedTalkFragment;

/**
 * Created by Htet Aung Hlaing on 2/1/2018.
 */

public class TedByCategoryActivity extends AppCompatActivity {
    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @BindView(R.id.tl_ted_by_category)
    TabLayout tabLayout;

    @BindView(R.id.vp_teb_by_category)
    ViewPager viewPager;

    @BindView(R.id.fab1)
    FloatingActionButton fab1;

    private TedByCategoryAdapter mTedByCategoryAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ted_by_category);
        ButterKnife.bind(this, this);

        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(R.string.title_of_app);
        }

        mTedByCategoryAdapter = new TedByCategoryAdapter(getSupportFragmentManager());
        viewPager.setAdapter(mTedByCategoryAdapter);


        mTedByCategoryAdapter.addTab("", new TedTalkFragment());
        mTedByCategoryAdapter.addTab("", new TedPlaylistItemFragment());
        mTedByCategoryAdapter.addTab("", new TedPodCastFragment());
        mTedByCategoryAdapter.addTab("", new TedTalkFragment());
        mTedByCategoryAdapter.addTab("", new TedMyTalksFragment());




        /**
         * tablayout nae viewPager nae bind
         */
        tabLayout.setupWithViewPager(viewPager);




            tabLayout.getTabAt(0).setIcon(R.drawable.ic_format_list_bulleted_black_24dp);
            tabLayout.getTabAt(1).setIcon(R.drawable.ic_video_library_black_24dp);
            tabLayout.getTabAt(2).setIcon(R.drawable.ic_headset_black_24dp);
            tabLayout.getTabAt(3).setIcon(R.drawable.ic_lightbulb_outline_black_24dp);
            tabLayout.getTabAt(4).setIcon(R.drawable.ic_account_circle_black_24dp);




        viewPager.setOffscreenPageLimit(mTedByCategoryAdapter.getCount());



    }
    @OnClick(R.id.fab1)
    public void onTapFab(View view){
        //Snackbar.make(view,"ha ha",Snackbar.LENGTH_INDEFINITE).show();

        Intent intent = TedSearchTopicActivity.newIntent(getApplicationContext());
        startActivity(intent);
    }


}
