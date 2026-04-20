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

public class ActivityDuLich extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_du_lich);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //Tìm List view
        ListView lvDSDuLich = (ListView) findViewById(R.id.lvDSDuLich);
        // Chuẩn bị nguồn dữ liệu
        ArrayList<DuLich> dsDuLich = new ArrayList<DuLich>();
        dsDuLich.add(new DuLich("Hồ Gươm", "ABC HÀ NỘI", R.drawable.it));
        dsDuLich.add(new DuLich("Hồ Gươm", "ABC HÀ NỘI", R.drawable.it));
        dsDuLich.add(new DuLich("Hồ Gươm", "ABC HÀ NỘI", R.drawable.it));
        dsDuLich.add(new DuLich("Hồ Gươm", "ABC HÀ NỘI", R.drawable.it));
        dsDuLich.add(new DuLich("Hồ Gươm", "ABC HÀ NỘI", R.drawable.it));

        //
        DuLichAdapter adapter = new DuLichAdapter(dsDuLich,this);
        lvDSDuLich.setAdapter(adapter);
        //Bật xử lý sự kiện
        lvDSDuLich.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                //Lấy phần tử đc chạm
                DuLich monAnChon = dsDuLich.get(i);
                //Làm gì đó
                Toast.makeText(ActivityDuLich.this,monAnChon.getTenDuLich(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}