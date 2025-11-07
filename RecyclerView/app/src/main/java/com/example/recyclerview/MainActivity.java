package com.example.recyclerview;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements SelectListener {

    RecyclerView recyclerView;
    List<MyModel> myModelList;
    CustomAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayItems();
    }

    private void displayItems() {
        recyclerView = findViewById(R.id.recycler_main);
        recyclerView.setHasFixedSize(true);

        // Nếu bạn muốn hiển thị 1 cột (list dọc)
        recyclerView.setLayoutManager(new GridLayoutManager(this, 1));

        // Nếu muốn dạng lưới 2 cột, thay bằng:
        // recyclerView.setLayoutManager(new GridLayoutManager(this, 2));

        myModelList = new ArrayList<>();

        // 🥘 Thêm danh sách món ăn (ảnh minh họa bạn có thể đổi lại sau)
        myModelList.add(new MyModel("Phở bò Hà Nội", "40.000đ", R.drawable.phobo));
        myModelList.add(new MyModel("Bún chả Hà Nội", "35.000đ", R.drawable.buncha));
        myModelList.add(new MyModel("Cơm tấm Sài Gòn", "45.000đ", R.drawable.comtam));
        myModelList.add(new MyModel("Mì Quảng", "30.000đ", R.drawable.miquang));
        myModelList.add(new MyModel("Bánh mì Việt Nam", "20.000đ", R.drawable.banhmi));
        myModelList.add(new MyModel("Gỏi cuốn tôm thịt", "25.000đ", R.drawable.goicuon));

        // Tạo adapter và gán vào RecyclerView
        customAdapter = new CustomAdapter(this, myModelList, this);
        recyclerView.setAdapter(customAdapter);
    }

    @Override
    public void onItemClicked(MyModel myModel) {
        Toast.makeText(this, "Bạn chọn: " + myModel.getName(), Toast.LENGTH_SHORT).show();
    }
}
