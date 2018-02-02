package hah.htetaunghlaing.ted.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.BindView;
import butterknife.ButterKnife;
import hah.htetaunghlaing.ted.R;
import hah.htetaunghlaing.ted.adapters.PodCastItemAdapter;
import hah.htetaunghlaing.ted.adapters.TalkItemAdapter;

/**
 * Created by Htet Aung Hlaing on 2/2/2018.
 */

public class TedPodCastFragment extends Fragment {
    @BindView(R.id.rv_ted_podcasts_fragment)
    RecyclerView rvTedPodCastFragment;

    private PodCastItemAdapter podCastItemAdapter;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_podcasts, container, false);
        ButterKnife.bind(this, view);


        podCastItemAdapter = new PodCastItemAdapter();
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        rvTedPodCastFragment.setLayoutManager(layoutManager);
        rvTedPodCastFragment.setAdapter(podCastItemAdapter);

        return view;
    }
}
