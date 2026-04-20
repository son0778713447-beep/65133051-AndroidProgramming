package thigk2.nguyentruongson;

import android.content.Context;
import android.content.pm.LabeledIntent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DuLichAdapter extends BaseAdapter {
    //
    private ArrayList<DuLich> dsDuLich;
    private LayoutInflater layoutInflater;
    private Context context;
    //Hàm tạo

    public DuLichAdapter(ArrayList<DuLich> dsDuLich, Context _context) {
        this.dsDuLich = dsDuLich;
        this.context = _context;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return dsDuLich.size();
    }

    @Override
    public Object getItem(int i) {
        return dsDuLich.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        //View item hiện hành
        View viewHienHanh = view;
        if(viewHienHanh==null){
            viewHienHanh = layoutInflater.inflate(R.layout.item_dulich,null);
        }
        //Lấy dữ liệu
        DuLich duLichHienTai = dsDuLich.get(i);
        //Gán lên các điều khiển
        //Tìm điều khiển
        TextView textView_tenDuLich = (TextView) viewHienHanh.findViewById(R.id.tvTenDuLich);
        TextView textView_diaChi = (TextView) viewHienHanh.findViewById(R.id.tvDiaChi);
        ImageView imageView_Anh = (ImageView) viewHienHanh.findViewById(R.id.imAnhDaiDien);
        //Set lên
        textView_tenDuLich.setText(duLichHienTai.getTenDuLich());
        textView_diaChi.setText(duLichHienTai.getTenDiaChi());
        imageView_Anh.setImageResource(duLichHienTai.getIdAnhMinhHoa());
        return viewHienHanh;
    }
}
