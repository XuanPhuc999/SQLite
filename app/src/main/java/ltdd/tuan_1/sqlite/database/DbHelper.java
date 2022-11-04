package ltdd.tuan_1.sqlite.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbHelper extends SQLiteOpenHelper {
    public DbHelper(@Nullable Context context) {
        super(context, "QLSinhVien.sqlite", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String sqlSVCreate = "CREATE TABLE IF NOT EXISTS " +
                "SinhVien(maSinhVien_251 INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "gioiTinh_251 INTEGER, " +
                "hoTen_251 VARCHAR(200), " +
                "dienThoai_251 VARCHAR(13), " +
                "email_251 VARCHAR(200))";
        sqLiteDatabase.execSQL(sqlSVCreate);

        String SqlInsert1 = "INSERT INTO SinhVien(gioiTinh_251, hoTen_251, dienThoai_251, email_251) VALUES('2050531200251', 'Bui Xuan Phuc', '0235', 'mail@gmail.com')";
        String SqlInsert2 = "INSERT INTO SinhVien(gioiTinh_251, hoTen_251, dienThoai_251, email_251) VALUES('2', 'Sy', '0335', 'mail@gmail.com')";
        String SqlInsert3 = "INSERT INTO SinhVien(gioiTinh_251, hoTen_251, dienThoai_251, email_251) VALUES('2', 'To', '0254', 'mail@gmail.com')";
        sqLiteDatabase.execSQL(SqlInsert1);
        sqLiteDatabase.execSQL(SqlInsert2);
        sqLiteDatabase.execSQL(SqlInsert3);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
