package hah.htetaunghlaing.ted.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import hah.htetaunghlaing.ted.R;
import hah.htetaunghlaing.ted.viewholders.SearchItemViewHolder;

/**
 * Created by Htet Aung Hlaing on 2/3/2018.
 */

public class SearchTopicAdapter extends RecyclerView.Adapter {

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        SearchItemViewHolder searchItemViewHolder = new SearchItemViewHolder
                (inflater.inflate(R.layout.item_ted_search_page,parent,false));
        return searchItemViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }
}
