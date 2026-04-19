package nts.cntt2.ontapgk2;

import android.content.Context;
import android.content.pm.LabeledIntent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ChiTietMonAdapter extends BaseAdapter {
    //
    private ArrayList<ChiTietMonActivity> dsMonAn;
    private LayoutInflater layoutInflater;
    private Context context;
    //Hàm tạo

    public ChiTietMonAdapter(ArrayList<ChiTietMonActivity> dsMonAn, Context _context) {
        this.dsMonAn = dsMonAn;
        this.context = _context;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return dsMonAn.size();
    }

    @Override
    public Object getItem(int i) {
        return dsMonAn.get(i);
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
            viewHienHanh = layoutInflater.inflate(R.layout.item_monan,null);
        }
        //Lấy dữ liệu
        ChiTietMonActivity monAnHienTai = dsMonAn.get(i);
        //Gán lên các điều khiển
        //Tìm điều khiển
        TextView textView_tenMon = (TextView) viewHienHanh.findViewById(R.id.tvTenMonAn);
        TextView textView_donGia = (TextView) viewHienHanh.findViewById(R.id.tvDonGia);
        TextView textView_moTa = (TextView) viewHienHanh.findViewById(R.id.tvMoTa);
        ImageView imageView_Anh = (ImageView) viewHienHanh.findViewById(R.id.imAnhDaiDien);
        //Set lên
        textView_tenMon.setText(monAnHienTai.getTenMonAn());
        textView_donGia.setText(String.valueOf(monAnHienTai.getDonGia()));
        textView_moTa.setText(monAnHienTai.getMoTaMonAn());
        imageView_Anh.setImageResource(monAnHienTai.getIdAnhMinhHoa());
        return viewHienHanh;
    }
}