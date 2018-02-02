package hah.htetaunghlaing.ted.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;


import butterknife.BindView;
import butterknife.ButterKnife;
import hah.htetaunghlaing.ted.R;
import hah.htetaunghlaing.ted.adapters.SearchTopicAdapter;
import hah.htetaunghlaing.ted.adapters.TalkItemAdapter;

/**
 * Created by Htet Aung Hlaing on 2/3/2018.
 */

public class TedSearchTopicActivity extends AppCompatActivity {

    @BindView(R.id.tool_bar)
    Toolbar toolbar;

    @BindView(R.id.rv_search_page)
    RecyclerView rvSearchPage;

    private SearchTopicAdapter searchTopicAdapter;

    public static Intent newIntent(Context context){
        Intent intent = new Intent(context,TedSearchTopicActivity.class);
        return intent;
    }
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_page_ted);
        ButterKnife.bind(this,this);
        toolbar.setTitle(" ");
        setSupportActionBar(toolbar);



        if(getSupportActionBar() != null){
            getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_arrow_back_white_24dp);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        searchTopicAdapter = new SearchTopicAdapter();

        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false);
        rvSearchPage.setLayoutManager(layoutManager);
        rvSearchPage.setAdapter(searchTopicAdapter);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == android.R.id.home){
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}
