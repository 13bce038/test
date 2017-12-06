package com.example.pinak.screen;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.pinak.screen.models.Item;

import java.util.List;

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.MyViewHolder> {

    private List<Item> items;

    MyRecyclerViewAdapter(List<Item> items) {
        this.items = items;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.custom_item_row, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Item item = items.get(position);
        holder.bind(item);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tvNumber, tvTime, tvValue;

        MyViewHolder(View itemView) {
            super(itemView);
            tvNumber = itemView.findViewById(R.id.tvNumber);
            tvTime = itemView.findViewById(R.id.tvTime);
            tvValue = itemView.findViewById(R.id.tvValue);
        }

        void bind(Item item) {
            tvNumber.setText(item.getNumber());
            tvTime.setText(item.getDate());
            tvValue.setText(item.getValue());
        }

//        void bind
    }
}
