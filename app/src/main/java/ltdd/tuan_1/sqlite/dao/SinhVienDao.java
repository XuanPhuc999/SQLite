package ltdd.tuan_1.sqlite.dao;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

import ltdd.tuan_1.sqlite.database.DbHelper;
import ltdd.tuan_1.sqlite.model.SinhVien;

public class SinhVienDao {
    private DbHelper csdl_251;
    public SinhVienDao(Context context)
    {
        csdl_251 = new DbHelper(context);
    }

    public List<SinhVien> TatCaSinhVien()
    {
        String sql = "SELECT * FROM SinhVien";
        List<SinhVien> sinhVienList = new ArrayList<SinhVien>();
        SQLiteDatabase database = csdl_251.getReadableDatabase();
        Cursor cursor = database.rawQuery(sql, null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast())
        {
            int masv = cursor.getInt(0);
            int gioitinh = cursor.getInt(1);
            String hoten = cursor.getString(2);
            String dienthoai = cursor.getString(3);
            String email = cursor.getString(4);
            SinhVien sv = new SinhVien(masv, gioitinh, hoten, dienthoai, email);
            sinhVienList.add(sv);
            cursor.moveToNext();
        }
        return sinhVienList;
    }
}
