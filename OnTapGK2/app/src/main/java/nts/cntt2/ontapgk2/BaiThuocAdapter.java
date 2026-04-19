package nts.cntt2.ontapgk2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BaiThuocAdapter extends RecyclerView.Adapter<BaiThuocAdapter.ItemBaiThuocHolder> {
    Context context;
    ArrayList<BaiThuoc> lstData;

    public BaiThuocAdapter(Context context, ArrayList<BaiThuoc> lstData) {
        this.context = context;
        this.lstData = lstData;
    }

    @NonNull
    @Override
    public ItemBaiThuocHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)  {
        LayoutInflater cai_bom = LayoutInflater.from(context);
        View vItem  = cai_bom.inflate(R.layout.item_thuoc,parent,false);
        ItemBaiThuocHolder viewholderCreated = new ItemBaiThuocHolder(vItem);
        return viewholderCreated;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemBaiThuocHolder holder, int position) {
        //Lay doi tuong hien thi
        BaiThuoc baiThuocHienThi = lstData.get(position);
        //Trich thong tin
        String caption = baiThuocHienThi.getBaiThuocCaption();
        String thoigian = baiThuocHienThi.getBaiThuocThoiGian();
        String tenAnh = baiThuocHienThi.getBaiThuocImageFileName();
        //Dat vao cac truong thong tin cua holder
        holder.tvCaption.setText(caption);
        holder.tvThoiGian.setText(thoigian);
        //Dat anh
        String packageName = holder.itemView.getContext().getPackageName();
        int imageID = holder.itemView.getResources().getIdentifier(tenAnh, "mipmap", packageName);
        holder.ivBaiThuoc.setImageResource(imageID);
    }

    @Override
    public int getItemCount() {
        return lstData.size();
    }

    class ItemBaiThuocHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView tvCaption;
        TextView tvThoiGian;
        ImageView ivBaiThuoc;

        public ItemBaiThuocHolder(@NonNull View itemView) {
            super(itemView);
            tvCaption = itemView.findViewById(R.id.tvCaption);
            tvThoiGian = itemView.findViewById(R.id.tvThoiGian);
            ivBaiThuoc = itemView.findViewById(R.id.imageViewLand);
            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
            //Code o day
            int viTriDuocClick = getAdapterPosition();
            BaiThuoc phanTuDuocClick = lstData.get(viTriDuocClick);
            //boc thong tin
            String ten = phanTuDuocClick.getBaiThuocCaption();
            String thoigian = phanTuDuocClick.getBaiThuocThoiGian();
            String tenFile = phanTuDuocClick.getBaiThuocImageFileName();
            //Toast ten
            String chuoiThongBao = "Ban vua click vao "+ten;
            Toast.makeText(v.getContext(), chuoiThongBao, Toast.LENGTH_SHORT).show();

        }
    }
}