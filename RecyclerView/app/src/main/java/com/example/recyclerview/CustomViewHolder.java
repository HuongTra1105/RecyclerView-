package com.example.recyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class CustomViewHolder extends RecyclerView.ViewHolder {

    public TextView textName, textPrice;
    public ImageView foodImage;
    public CardView cardView;

    public CustomViewHolder(@NonNull View itemView) {
        super(itemView);

        textName = itemView.findViewById(R.id.textName);
        textPrice = itemView.findViewById(R.id.textAge);   // ID trong layout là textAge
        foodImage = itemView.findViewById(R.id.foodImage);
        cardView = itemView.findViewById(R.id.main_content);
    }
}
