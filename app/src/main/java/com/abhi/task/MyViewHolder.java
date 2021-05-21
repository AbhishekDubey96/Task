package com.abhi.task;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    ImageView brandLogo, imgStatus;
    TextView brandName, brandAmt, brandDate, brandStatus;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);

        brandLogo = itemView.findViewById(R.id.imv_brand_logo);
        imgStatus = itemView.findViewById(R.id.imv_mark);
        brandName = itemView.findViewById(R.id.brand_name);
        brandAmt = itemView.findViewById(R.id.tv_amount);
        brandDate = itemView.findViewById(R.id.tv_date);
        brandStatus = itemView.findViewById(R.id.tv_status);
    }
}
