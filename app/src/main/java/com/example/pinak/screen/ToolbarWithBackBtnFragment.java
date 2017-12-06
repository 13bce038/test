package com.example.pinak.screen;


import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class ToolbarWithBackBtnFragment extends Fragment {

    public ToolbarWithBackBtnFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_main_ac_toolbar, container, false);

        setupToolBar(view);

        return view;
    }

    /**
     * This method sets up toolbar defined in xml as support action bar
     *
     * @param view View of this fragment
     */
    private void setupToolBar(View view) {
//        get reference of the toolbar
        Toolbar toolbar = view.findViewById(R.id.my_toolbar);
//        set it as support actionbar
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayShowHomeEnabled(true);
    }


}
