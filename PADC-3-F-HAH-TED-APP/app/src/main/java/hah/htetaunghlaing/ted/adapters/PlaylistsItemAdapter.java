package hah.htetaunghlaing.ted.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import hah.htetaunghlaing.ted.R;
import hah.htetaunghlaing.ted.viewholders.PlaylistItemViewHolder;

/**
 * Created by Htet Aung Hlaing on 2/2/2018.
 */

public class PlaylistsItemAdapter extends RecyclerView.Adapter{
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_ted_playlists,parent,false);
        PlaylistItemViewHolder playlistItemViewHolder = new PlaylistItemViewHolder(view);
        return  playlistItemViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 20;
    }
}
