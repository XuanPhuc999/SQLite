package ltdd.tuan_1.sqlite;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import ltdd.tuan_1.sqlite.adapter.SinhVienAdapter;
import ltdd.tuan_1.sqlite.dao.SinhVienDao;
import ltdd.tuan_1.sqlite.model.SinhVien;

public class MainActivity extends AppCompatActivity {
    private ListView lvSinhVien_251;
    private List<SinhVien> sinhVienList_251;
    private SinhVienAdapter adapter_251;
    private SinhVienDao svDao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvSinhVien_251 = (ListView) findViewById(R.id.lv_sinhvien);

        sinhVienList_251 = new ArrayList<SinhVien>();
        svDao = new SinhVienDao(MainActivity.this);
        sinhVienList_251 = svDao.TatCaSinhVien();



        adapter_251 = new SinhVienAdapter(getApplicationContext(), sinhVienList_251);
        lvSinhVien_251.setAdapter(adapter_251);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_option, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.menu_them)
        {
            Intent intent = new Intent(MainActivity.this, AddActivity.class);
            startActivity(intent);
        }
        if(id == R.id.menu_thoat)
        {
            finish();
        }
        return true;
    }
}