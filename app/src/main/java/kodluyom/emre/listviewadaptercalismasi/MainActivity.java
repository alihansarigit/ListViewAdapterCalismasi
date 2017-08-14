package kodluyom.emre.listviewadaptercalismasi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

import kodluyom.emre.KendiAdapterim.MyAdapter;
import kodluyom.emre.KendiAdapterim.Urunler;
import kodluyom.emre.KendiAdapterim.UrunleriDoldur;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Urunler> CallProduct = UrunleriDoldur.VerilerleDoldur();

        MyAdapter myAdapter = new MyAdapter(this,R.layout.adapter_model_layout,CallProduct);
        ListView lst1 = (ListView) findViewById(R.id.lst1);
        lst1.setAdapter(myAdapter);
    }
}
