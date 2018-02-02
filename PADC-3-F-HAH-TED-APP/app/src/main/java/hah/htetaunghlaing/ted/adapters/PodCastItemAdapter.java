package hah.htetaunghlaing.ted.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import hah.htetaunghlaing.ted.R;
import hah.htetaunghlaing.ted.viewholders.PodCastItemViewHolder;

/**
 * Created by Htet Aung Hlaing on 2/2/2018.
 */

public class PodCastItemAdapter extends RecyclerView.Adapter {
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        PodCastItemViewHolder podCastItemViewHolder = new PodCastItemViewHolder(inflater.inflate(R.layout.item_ted_podcasts,parent,false));

        return podCastItemViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }
}
