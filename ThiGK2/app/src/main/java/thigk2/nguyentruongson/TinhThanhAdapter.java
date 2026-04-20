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

public class TinhThanhAdapter extends BaseAdapter {
    //
    private ArrayList<TinhThanh> dsTinhThanh;
    private LayoutInflater layoutInflater;
    private Context context;
    //Hàm tạo

    public TinhThanhAdapter(ArrayList<TinhThanh> dsTinhThanh, Context _context) {
        this.dsTinhThanh = dsTinhThanh;
        this.context = _context;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return dsTinhThanh.size();
    }

    @Override
    public Object getItem(int i) {
        return dsTinhThanh.get(i);
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
            viewHienHanh = layoutInflater.inflate(R.layout.item_tinhthanh,null);
        }
        //Lấy dữ liệu
        TinhThanh tinhThanhHienTai = dsTinhThanh.get(i);
        //Gán lên các điều khiển
        //Tìm điều khiển
        TextView textView_tenTinh = (TextView) viewHienHanh.findViewById(R.id.tvTenTinhThanh);
        //Set lên
        textView_tenTinh.setText(tinhThanhHienTai.getTenTinhThanh());
        return viewHienHanh;
    }
}
