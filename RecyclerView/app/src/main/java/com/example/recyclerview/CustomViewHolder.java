package com.example.recyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class CustomViewHolder extends RecyclerView.ViewHolder {

    public TextView textName123, textPrice123;
    public ImageView foodImage123;
    public CardView cardView123;

    public CustomViewHolder(@NonNull View itemView) {
        super(itemView);

        textName123 = itemView.findViewById(R.id.textName);
        textPrice123 = itemView.findViewById(R.id.textPrice);
        foodImage123 = itemView.findViewById(R.id.foodImage);
        cardView123 = itemView.findViewById(R.id.main_content);
    }
}
