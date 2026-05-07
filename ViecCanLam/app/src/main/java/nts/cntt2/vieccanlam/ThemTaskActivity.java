package nts.cntt2.vieccanlam;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class ThemTaskActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_them_task);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        FloatingActionButton floatingActionButton = findViewById(R.id.floatingActionButton2);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Lấy dữ liệu
                EditText editTextName = findViewById(R.id.editTextTextTenCV);
                EditText editTextMessage = findViewById(R.id.editTextTextMessage);
                EditText editTextDate = findViewById(R.id.editTextTextDate);
                EditText editTextPriority = findViewById(R.id.editTextTextPriority);
                String tenCV = editTextName.getText().toString();
                String mess = editTextMessage.getText().toString();
                String date = editTextDate.getText().toString();
                String priority = editTextPriority.getText().toString();
                //Gói vào đối tượng TASK
                TASKS task = new TASKS(tenCV,mess,date,priority);
                // Kết nối DB và thêm
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("TASKS");
                String key = myRef.push().getKey();
                HashMap<String,Object> item = new HashMap<String, Object>();
                item.put(key,task.toFirebaseObject()  );
                myRef.updateChildren(item, new DatabaseReference.CompletionListener() {
                    @Override
                    public void onComplete(@Nullable DatabaseError error, @NonNull DatabaseReference ref) {
                        if(error==null){
                            finish();
                        }
                    }
                });
            }
        });
    }
}