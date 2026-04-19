package nts.cntt2.ontapgk2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ActivityBaiThuoc extends AppCompatActivity {
    BaiThuocAdapter baiThuocAdapter;
    ArrayList<BaiThuoc> lstData;
    RecyclerView recyclerViewBaiThuoc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_bai_thuoc);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //3
        lstData = getDataForRecyclerView();
        //4
        recyclerViewBaiThuoc = findViewById(R.id.recyclerLand);
        //5
        //RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(this);
        //recyclerViewLandScape.setLayoutManager(layoutLinear);
        //RecyclerView.LayoutManager layoutLinearHoriozonal = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        //recyclerViewLandScape.setLayoutManager(layoutLinearHoriozonal);
        RecyclerView.LayoutManager layoutGrid = new GridLayoutManager(this,1);
        recyclerViewBaiThuoc.setLayoutManager(layoutGrid);
        //6
        baiThuocAdapter = new BaiThuocAdapter(this,lstData);
        //7
        recyclerViewBaiThuoc.setAdapter(baiThuocAdapter);
    }
    ArrayList<BaiThuoc> getDataForRecyclerView(){
        ArrayList<BaiThuoc> dsDuLieu = new ArrayList<BaiThuoc>();
        BaiThuoc baiThuoc1 = new BaiThuoc("thuocho", "Thuốc ho","12/6/2026");
        dsDuLieu.add(baiThuoc1);
        dsDuLieu.add(new BaiThuoc("thuocdaubung", "Thuốc đau bụng","30/2/2026"));
        dsDuLieu.add(new BaiThuoc("thuocdaday", "Thuốc dạ dày","29/6/2026"));
        return dsDuLieu;
    }
    public void QuayVe (View v) {
        //tao doi tuong intent
        //Tham số thứ 2 của ham tạo này, là tên Activity ( màn hình ) ta muốn chuyển sang
        Intent iManHinhCHINH = new Intent(this, MainActivity.class);
        //Thuc hien chuyen
        startActivity(iManHinhCHINH);
    }
}