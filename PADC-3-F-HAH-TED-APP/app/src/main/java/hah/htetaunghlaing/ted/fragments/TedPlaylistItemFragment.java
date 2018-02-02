package hah.htetaunghlaing.ted.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.BindView;
import butterknife.ButterKnife;
import hah.htetaunghlaing.ted.R;
import hah.htetaunghlaing.ted.adapters.PlaylistsItemAdapter;

/**
 * Created by Htet Aung Hlaing on 2/2/2018.
 */

public class TedPlaylistItemFragment extends Fragment {


    @BindView(R.id.rv_ted_playlist_fragment)
    RecyclerView rvTedPlaylistFragment;

    private PlaylistsItemAdapter mPlaylistsItemAdapter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_playlists,container,false);
        ButterKnife.bind(this,view);


        mPlaylistsItemAdapter = new PlaylistsItemAdapter();
        GridLayoutManager layoutManager = new GridLayoutManager(getContext(),2);
        rvTedPlaylistFragment.setLayoutManager(layoutManager);
        rvTedPlaylistFragment.setAdapter(mPlaylistsItemAdapter);

        return view;

    }
}
