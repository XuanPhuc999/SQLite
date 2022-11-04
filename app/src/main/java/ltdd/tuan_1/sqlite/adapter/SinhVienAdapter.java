package ltdd.tuan_1.sqlite.adapter;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import ltdd.tuan_1.sqlite.R;
import ltdd.tuan_1.sqlite.model.SinhVien;

public class SinhVienAdapter extends BaseAdapter {
    private List<SinhVien> sinhVienList_251;
    private Context context;
    public SinhVienAdapter(Context context, List<SinhVien> listList)
    {
        this.context = context;
        this.sinhVienList_251 = listList;
    }
    @Override
    public int getCount() {
        return sinhVienList_251.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if(view == null)
        {
            viewHolder = new ViewHolder();

            LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.list_item_sinhvien, null);

            viewHolder.tvMaSinhVien_251 = view.findViewById(R.id.tv_masv);
            viewHolder.tvHoTen = view.findViewById(R.id.tv_hoten);
            viewHolder.tvDienThoai = view.findViewById(R.id.tv_sodienthoai);
            viewHolder.tvEmail = view.findViewById(R.id.tv_email);
            viewHolder.ivGioiTinh = view.findViewById(R.id.iv_gioitinh);

            view.setTag(viewHolder);
        }
        else
        {
            viewHolder = (ViewHolder) view.getTag();
        }
        SinhVien sv = sinhVienList_251.get(i);
        viewHolder.tvMaSinhVien_251.setText("Ma sinh vien: " + sv.getMaSinhVien_251());
        viewHolder.tvHoTen.setText("Ho ten: " + sv.getHoTen_251());
        viewHolder.tvDienThoai.setText("Dien thoai: " + sv.getDienThoai_251());
        viewHolder.tvEmail.setText("Email: " + sv.getEmail_251());
        if(sv.getGioiTinh_251() == 1)
            viewHolder.ivGioiTinh.setImageResource(R.drawable.man);
        else
            viewHolder.ivGioiTinh.setImageResource(R.drawable.girl);
        return view;
    }
    class ViewHolder
    {
        ImageView ivGioiTinh;
        TextView tvMaSinhVien_251, tvHoTen, tvDienThoai, tvEmail;
    }
}
