package nts.cntt2.baith5_xulysukien1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    //Khai bao cac doi tuong gan voi cac dieu khien tuong ung
    EditText editTextSo1;
    EditText editTextSo2;
    EditText editTextKQ;
    Button nutCong,nutTru,nutNhan,nutChia;
    void TimDieuKhien(){
        EditText editTextSo1 = (EditText) findViewById(R.id.edtSo1);
        EditText editTextSo2 = (EditText) findViewById(R.id.edtSo2);
        EditText editTextKQ = (EditText) findViewById(R.id.edtKQ);
        nutCong = (Button) findViewById(R.id.btnCong);
        nutTru = (Button) findViewById(R.id.btnTru);
        nutNhan = (Button) findViewById(R.id.btnNhan);
        nutChia = (Button) findViewById(R.id.btnChia);
    }
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
        TimDieuKhien();
        //Gắn bộ lắng nghe sự kiện và code xử lý cho từng nút
        View.OnClickListener boLangNgheCong = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Gọi hàm xử lý cộng
                XULY_CONG();

            }
        };
        nutCong.setOnClickListener(boLangNgheCong);
        nutTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Xử lý trừ
                XULY_TRU();

            }
        });
        nutNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Xử lý nhân
                XULY_NHAN();

            }
        });
        nutChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Xử lý chia
                XULY_CHIA();


            }
        });

    }
    void XULY_CONG(){
        //Code xu ly
        //b1. Lay du lieu 2 so
        //b1.1. Tim edit Text so 1 va 2
        EditText editTextSo1 = (EditText) findViewById(R.id.edtSo1);
        EditText editTextSo2 = (EditText) findViewById(R.id.edtSo2);
        //b1.2 Lay du lieu tu  2 dieu khien do
        String so1 = editTextSo1.getText().toString();
        String so2 = editTextSo2.getText().toString();
        //b1.3 Chuyen du lieu tu chuoi sang so
        float a = Float.parseFloat(so1);
        float b = Float.parseFloat(so2);
        //b2.Tinh toan
        float tong = a+b;
        //b3. Hien ket qua len man hinh
        //b3.1 Tim edit Tect kq
        EditText editTextKQ = (EditText) findViewById(R.id.edtKQ);
        //b3.2 Chuan bi di lieu xuat, bien thanh dang chuoi
        String chuoiKQ = String.valueOf(tong);
        //b3.3 Gan ket qua len dieu khien
        editTextKQ.setText(chuoiKQ);
    }
    void XULY_TRU(){
        //Code xu ly
        //b1. Lay du lieu 2 so
        //b1.1. Tim edit Text so 1 va 2
        EditText editTextSo1 = (EditText) findViewById(R.id.edtSo1);
        EditText editTextSo2 = (EditText) findViewById(R.id.edtSo2);
        //b1.2 Lay du lieu tu  2 dieu khien do
        String so1 = editTextSo1.getText().toString();
        String so2 = editTextSo2.getText().toString();
        //b1.3 Chuyen du lieu tu chuoi sang so
        float a = Float.parseFloat(so1);
        float b = Float.parseFloat(so2);
        //b2.Tinh toan
        float hieu = a-b;
        //b3. Hien ket qua len man hinh
        //b3.1 Tim edit Tect kq
        EditText editTextKQ = (EditText) findViewById(R.id.edtKQ);
        //b3.2 Chuan bi di lieu xuat, bien thanh dang chuoi
        String chuoiKQ = String.valueOf(hieu);
        //b3.3 Gan ket qua len dieu khien
        editTextKQ.setText(chuoiKQ);
    }
    void XULY_NHAN(){
        //Code xu ly
        //b1. Lay du lieu 2 so
        //b1.1. Tim edit Text so 1 va 2
        EditText editTextSo1 = (EditText) findViewById(R.id.edtSo1);
        EditText editTextSo2 = (EditText) findViewById(R.id.edtSo2);
        //b1.2 Lay du lieu tu  2 dieu khien do
        String so1 = editTextSo1.getText().toString();
        String so2 = editTextSo2.getText().toString();
        //b1.3 Chuyen du lieu tu chuoi sang so
        float a = Float.parseFloat(so1);
        float b = Float.parseFloat(so2);
        //b2.Tinh toan
        float tich = a*b;
        //b3. Hien ket qua len man hinh
        //b3.1 Tim edit Tect kq
        EditText editTextKQ = (EditText) findViewById(R.id.edtKQ);
        //b3.2 Chuan bi di lieu xuat, bien thanh dang chuoi
        String chuoiKQ = String.valueOf(tich);
        //b3.3 Gan ket qua len dieu khien
        editTextKQ.setText(chuoiKQ);
    }
    void XULY_CHIA(){
        //Code xu ly
        //b1. Lay du lieu 2 so
        //b1.1. Tim edit Text so 1 va 2
        EditText editTextSo1 = (EditText) findViewById(R.id.edtSo1);
        EditText editTextSo2 = (EditText) findViewById(R.id.edtSo2);
        //b1.2 Lay du lieu tu  2 dieu khien do
        String so1 = editTextSo1.getText().toString();
        String so2 = editTextSo2.getText().toString();
        //b1.3 Chuyen du lieu tu chuoi sang so
        float a = Float.parseFloat(so1);
        float b = Float.parseFloat(so2);
        //b2.Tinh toan
        float thuong = a/b;
        //b3. Hien ket qua len man hinh
        //b3.1 Tim edit Tect kq
        EditText editTextKQ = (EditText) findViewById(R.id.edtKQ);
        //b3.2 Chuan bi di lieu xuat, bien thanh dang chuoi
        String chuoiKQ = String.valueOf(thuong);
        //b3.3 Gan ket qua len dieu khien
        editTextKQ.setText(chuoiKQ);
    }
}