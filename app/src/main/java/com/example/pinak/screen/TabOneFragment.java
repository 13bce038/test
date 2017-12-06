package com.example.pinak.screen;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pinak.screen.models.Item;


public class TabOneFragment extends Fragment {

    RecyclerView recyclerView;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.recycler_view, container, false);

        recyclerView = view.findViewById(R.id.recyclerView);
        setupRecyclerView();

        return view;

    }

    /**
     * sets up recycler view with linear layout manager
     */
    private void setupRecyclerView() {

        MyRecyclerViewAdapter myRecyclerViewAdapter = new MyRecyclerViewAdapter(Item.prepareData());
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(myRecyclerViewAdapter);

    }
}
