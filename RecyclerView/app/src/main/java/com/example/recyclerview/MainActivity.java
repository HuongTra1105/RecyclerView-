package com.example.recyclerview;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements SelectListener {
    RecyclerView recyclerView123;
    List<MyModel> myModelList123;
    CustomAdapter customAdapter123;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayItems123();
    }

    private void displayItems123() {
        recyclerView123 = findViewById(R.id.recycler_main);
        recyclerView123.setHasFixedSize(true);

        recyclerView123.setLayoutManager(new GridLayoutManager(this, 1));

        myModelList123 = new ArrayList<>();

        myModelList123.add(new MyModel("Phở bò Hà Nội", "40.000đ", R.drawable.phobo));
        myModelList123.add(new MyModel("Bún chả Hà Nội", "35.000đ", R.drawable.buncha));
        myModelList123.add(new MyModel("Cơm tấm Sài Gòn", "45.000đ", R.drawable.comtam));
        myModelList123.add(new MyModel("Mì Quảng", "30.000đ", R.drawable.miquang));
        myModelList123.add(new MyModel("Bánh mì Việt Nam", "20.000đ", R.drawable.banhmi));
        myModelList123.add(new MyModel("Gỏi cuốn tôm thịt", "25.000đ", R.drawable.goicuon));

        customAdapter123 = new CustomAdapter(this, myModelList123, this);
        recyclerView123.setAdapter(customAdapter123);
    }
    @Override
    public void onItemClicked(MyModel myModel123) {
        Toast.makeText(this, "Bạn chọn: " + myModel123.getName(), Toast.LENGTH_SHORT).show();
    }
}
