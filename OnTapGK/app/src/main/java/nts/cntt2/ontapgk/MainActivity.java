package nts.cntt2.ontapgk;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<String> ketQuaList;
    ArrayAdapter<String> adapter;
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
        // Tham chiếu đến ListView
        listView = findViewById(R.id.listView);
        // Khởi tạo danh sách và adapter
        ketQuaList = new ArrayList<>();
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, ketQuaList);
        listView.setAdapter(adapter);
    }
    //Đây là bộ lắng nghe và xử lý sự kiện click lên nút Tính Tổng
    public void ChuyenXuong(View view) {
        // Tìm tham chiếu đến điều khiển trên tập XML
        EditText editTextSoA = findViewById(R.id.edtA);
        EditText editTextSoB = findViewById(R.id.edtB);
        //Lấy dữ liệu về ở điều khiển số a
        String strA = editTextSoA.getText().toString();
        //Chuyển dữ liệu sang số
        double soA = Double.parseDouble(strA);
        //Tính toán
        double kq = soA / 2.54;
        String strXuong = String.valueOf(kq);
        //Xuất kết quả ra màn hình
        editTextSoB.setText(strXuong);
        // Thêm kết quả vào đầu danh sách
        ketQuaList.add(0, strA + " cm = " + strXuong + " inches");
        adapter.notifyDataSetChanged();
    }
    public void ChuyenLen(View view) {
        // Tìm tham chiếu đến điều khiển trên tập XML
        EditText editTextSoA = findViewById(R.id.edtA);
        EditText editTextSoB = findViewById(R.id.edtB);
        //Lấy dữ liệu về ở điều khiển số a
        String strB = editTextSoB.getText().toString();
        //Chuyển dữ liệu sang số
        double soB = Double.parseDouble(strB);
        //Tính toán
        double kq = soB * 2.54;
        String strLen = String.valueOf(kq);
        //Xuất kết quả ra màn hình
        editTextSoA.setText(strLen);
        // Thêm kết quả vào đầu danh sách
        ketQuaList.add(0, strB + " inches = " + strLen + " cm");
        adapter.notifyDataSetChanged();
    }
}