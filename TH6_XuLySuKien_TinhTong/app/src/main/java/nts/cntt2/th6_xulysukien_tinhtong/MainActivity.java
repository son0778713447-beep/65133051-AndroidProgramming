package nts.cntt2.th6_xulysukien_tinhtong;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        //Gắn layout tương ứng với file này

        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    //Đây là bộ lắng nghe và xử lý sự kiện nút Tính tổng
    public void XuLyCong(View view){
        //Tim, tham chiếu đến điều khiển trên XML
        EditText soA = findViewById(R.id.edtA);
        EditText soB = findViewById(R.id.edtB);
        EditText KQ = findViewById(R.id.edtKQ);
        //Lấy dữ liệu
        String strA = soA.getText().toString();
        String strB = soB.getText().toString();
        //Chuyển dữ liệu sang dạng số
        int a = Integer.parseInt(strA);
        int b = Integer.parseInt(strB);
        //Tính toán
        int kq = a+b;
        String strKq = String.valueOf(kq);
        //Hiện ra màn hình
        KQ.setText(strKq);
    }
}