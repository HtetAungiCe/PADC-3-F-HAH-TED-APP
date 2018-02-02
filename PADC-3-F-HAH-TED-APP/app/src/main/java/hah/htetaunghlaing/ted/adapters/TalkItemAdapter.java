package hah.htetaunghlaing.ted.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.zip.Inflater;

import hah.htetaunghlaing.ted.R;
import hah.htetaunghlaing.ted.viewholders.TalkItemViewHolder;

/**
 * Created by Htet Aung Hlaing on 1/31/2018.
 */

public class TalkItemAdapter extends RecyclerView.Adapter {
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_ted_talks,parent,false);
        TalkItemViewHolder talkItemViewHolder = new TalkItemViewHolder(view);
        return  talkItemViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }
}
