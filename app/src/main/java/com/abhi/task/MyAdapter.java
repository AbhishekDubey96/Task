package com.abhi.task;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    ArrayList<Model> data;

    public MyAdapter(ArrayList<Model> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.list_item,parent,false);
        return new MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.brandName.setText(data.get(position).getBrandName());
        holder.imgStatus.setImageResource(data.get(position).getBrandStatus());
        holder.brandLogo.setImageResource(data.get(position).getBrandLogo());
        holder.brandAmt.setText(data.get(position).getBrandAmount());
        holder.brandDate.setText(data.get(position).getBrandDate());
        holder.brandStatus.setText(data.get(position).getBrandStats());



//        holder.tvVeggieName.setText(data.get(position).getHeader());
//        holder.tvVeggiePrice.setText(data.get(position).getDescription());
//        holder.tvItemKgs.setText(data.get(position).getItemkgs());
//        holder.imgVeggie.setImageResource(data.get(position).getImgname());
    }

    @Override
    public void onViewAttachedToWindow(@NonNull MyViewHolder holder) {
        super.onViewAttachedToWindow(holder);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }
}
