package thigk2.nguyentruongson;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class ActivityTinhThanh extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tinh_thanh);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //Tìm List view
        ListView lvDSTinhThanh = (ListView) findViewById(R.id.lvDSTinhThanh);
        // Chuẩn bị nguồn dữ liệu
        ArrayList<TinhThanh> dsTinhThanh = new ArrayList<TinhThanh>();
        dsTinhThanh.add(new TinhThanh("Nha Trang"));
        dsTinhThanh.add(new TinhThanh("Thanh Hóa"));
        dsTinhThanh.add(new TinhThanh("Đà Nẵng"));
        dsTinhThanh.add(new TinhThanh("Hà Nội"));
        dsTinhThanh.add(new TinhThanh("Cà Mau"));
        dsTinhThanh.add(new TinhThanh("Lào Cai"));
        dsTinhThanh.add(new TinhThanh("Phú Yên"));
        dsTinhThanh.add(new TinhThanh("Đắk Lắk"));
        dsTinhThanh.add(new TinhThanh("Huế"));
        dsTinhThanh.add(new TinhThanh("Nguyễn Trường Sơn"));

        //
        TinhThanhAdapter adapter = new TinhThanhAdapter(dsTinhThanh,this);
        lvDSTinhThanh.setAdapter(adapter);
        //Bật xử lý sự kiện
        lvDSTinhThanh.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                //Lấy phần tử đc chạm
                TinhThanh tinhThanhChon = dsTinhThanh.get(i);
                //Làm gì đó
                Toast.makeText(ActivityTinhThanh.this,tinhThanhChon.getTenTinhThanh(),Toast.LENGTH_SHORT).show();
            }
        });
    }

}