package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomViewHolder> {

    private Context context;
    private List<MyModel> list;
    private SelectListener listener;

    public CustomAdapter(Context context, List<MyModel> list, SelectListener listener) {
        this.context = context;
        this.list = list;
        this.listener = listener;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.food_items, parent, false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        MyModel item = list.get(position);

        // Gán dữ liệu vào layout
        holder.textName.setText(item.getName());
        holder.textPrice.setText(item.getPrice());
        holder.foodImage.setImageResource(item.getImage());

        // Xử lý sự kiện click vào card
        holder.cardView.setOnClickListener(v -> listener.onItemClicked(item));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
