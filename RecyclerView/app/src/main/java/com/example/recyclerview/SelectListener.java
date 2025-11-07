package com.example.recyclerview;

// Interface dùng để xử lý sự kiện khi người dùng click vào 1 món ăn trong danh sách
public interface SelectListener {
    void onItemClicked(MyModel myModel);
}
