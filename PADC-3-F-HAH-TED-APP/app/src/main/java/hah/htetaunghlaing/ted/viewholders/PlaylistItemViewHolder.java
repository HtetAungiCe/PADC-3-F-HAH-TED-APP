package hah.htetaunghlaing.ted.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import butterknife.ButterKnife;

/**
 * Created by Htet Aung Hlaing on 2/2/2018.
 */

public class PlaylistItemViewHolder extends RecyclerView.ViewHolder {
    public PlaylistItemViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);
    }
}
