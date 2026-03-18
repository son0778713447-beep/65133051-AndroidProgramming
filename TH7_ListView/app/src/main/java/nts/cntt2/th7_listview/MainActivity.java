package nts.cntt2.th7_listview;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        // Hiển thị dữ liệu lên ListView
        //B1+: Cần có dữ liệu
        //??: Từ đâu có: Từ cơ sở dữ liệu
        // Ở bài này chúng ta hard-code dữ liệu trực tiếp
        // Cần biến phù hợp để chứa dữ liệu
        ArrayList<String> dsTenTinhThanhVN; //Khai báo
        dsTenTinhThanhVN = new ArrayList<>(); //Tạo thể hiện cụ thể
        //Thêm dữ liệu tại đây (đúng ra, ta phải đọc từ 1 nguồn )
        //Nhưng ta hard-code (cho sẵn demo)
        dsTenTinhThanhVN.add("Nha Trang");
        dsTenTinhThanhVN.add("TP HCM");
        dsTenTinhThanhVN.add("Đà Nẵng");
        dsTenTinhThanhVN.add("Phú Yên");
        //B2. Tạo adapter
        ArrayAdapter<String> adapterTinhThanh;
        adapterTinhThanh = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,dsTenTinhThanhVN);
        //B3: Gắn vào điều khiển hiển thị list view
        //3.1 Tìm
        ListView lvtenTinhThanh = findViewById(R.id.lvDanhSachTT);
        //3.2 Gắn
        lvtenTinhThanh.setAdapter(adapterTinhThanh);
        //3.3 Lắng nghe và xử lý sự kiện người dùng tương tác

    }
}