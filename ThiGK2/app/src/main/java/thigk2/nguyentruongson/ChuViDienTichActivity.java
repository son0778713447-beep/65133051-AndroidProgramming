package thigk2.nguyentruongson;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ChuViDienTichActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_chu_vi_dien_tich);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    //Đây là bộ lắng nghe và xử lý sự kiện click lên nút Tính Tổng
    public void XuLyChuViDienTich(View view){
        // Tìm tham chiếu đến điều khiển trên tập XML
        EditText editTextChieDai = findViewById(R.id.edtChieuDai);
        EditText editTextChieuRong = findViewById(R.id.edtChieuRong);
        EditText editTextKQCV = findViewById(R.id.edtKQCV);
        EditText editTextKQDT = findViewById(R.id.edtKQDT);
        //Lấy dữ liệu về ở điều khiển số a
        String strA = editTextChieDai.getText().toString();
        //Lấy dữ liệu về ở điều khiển số b
        String strB = editTextChieuRong.getText().toString();
        //Chuyển dữ liệu sang số
        double soA = Double.parseDouble(strA);
        double soB = Double.parseDouble(strB);
        //Tính toán
        double kqcv = (soA+soB)*2;
        double kqdt = soA*soB;
        String strTongCV = String.valueOf(kqcv);
        String strTongDT = String.valueOf(kqdt);
        //Xuất kết quả ra màn hình
        editTextKQCV.setText(strTongCV);
        editTextKQDT.setText(strTongDT);
    }
    public void QuayVe (View v) {
        //tao doi tuong intent
        //Tham số thứ 2 của ham tạo này, là tên Activity ( màn hình ) ta muốn chuyển sang
        Intent iManHinhCHINH = new Intent(this, MainActivity.class);
        //Thuc hien chuyen
        startActivity(iManHinhCHINH);
    }
}