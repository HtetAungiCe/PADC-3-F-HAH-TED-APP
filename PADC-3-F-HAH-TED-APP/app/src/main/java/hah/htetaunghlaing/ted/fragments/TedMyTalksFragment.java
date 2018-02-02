package hah.htetaunghlaing.ted.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import hah.htetaunghlaing.ted.R;

/**
 * Created by Htet Aung Hlaing on 2/3/2018.
 */

public class TedMyTalksFragment extends Fragment {

    @BindView(R.id.ll_my_talk)
    LinearLayout llMyTalk;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_my_talks,container,false);
        ButterKnife.bind(this,view);
        return view;
    }
}
