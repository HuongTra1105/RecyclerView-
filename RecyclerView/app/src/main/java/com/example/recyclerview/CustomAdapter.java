package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomViewHolder> {

    private Context context123;
    private List<MyModel> foodList123;
    private SelectListener selectListener123;

    public CustomAdapter(Context context, List<MyModel> list, SelectListener listener) {
        this.context123 = context;
        this.foodList123 = list;
        this.selectListener123 = listener;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view123 = LayoutInflater.from(context123).inflate(R.layout.food_items, parent, false);
        return new CustomViewHolder(view123);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        MyModel foodItem123 = foodList123.get(position);

        holder.textName123.setText(foodItem123.getName());
        holder.textPrice123.setText(foodItem123.getPrice());
        holder.foodImage123.setImageResource(foodItem123.getImage());

        holder.cardView123.setOnClickListener(v -> selectListener123.onItemClicked(foodItem123));
    }

    @Override
    public int getItemCount() {
        return foodList123.size();
    }
}
