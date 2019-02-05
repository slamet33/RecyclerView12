package co.idn.recyclerview1;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // Todo #1 Create Variable Recyclerview
    RecyclerView rvListBuah, rvJenisBuah;

    // Todo #4 Create Adapter Recycelrview
    JenisBuahAdapter jenisBuahAdapter;
    ListBuahAdapter listBuahAdapter;
    CustomAdapter adapter;

    // Todo #5 Create Resource
    String[] namaJenisBuah = {"Berry", "Umbi", "Biji", "Meranggas", "Berair", "Hijau"};
    int[] gambarJenisBuah = {R.drawable.alpukat, R.drawable.apel, R.drawable.ceri, R.drawable.durian, R.drawable.jambuair, R.drawable.manggis};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("IU33");
        Toast.makeText(this, getSupportActionBar().getTitle(), Toast.LENGTH_SHORT).show();
//        getSupportActionBar().hide();
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.ceri);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        // Todo #2 Initialize between Variable and ID Recyclerview
        rvJenisBuah = findViewById(R.id.rv_jenisbuah);
        rvListBuah = findViewById(R.id.rv_listbuah);

        // Todo #3 Create Layouting Manager of all recyclerview
        rvJenisBuah.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, true));
        rvListBuah.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, true));

        // Todo #6 Initialize adapter and give a parameter
        jenisBuahAdapter = new JenisBuahAdapter(this, namaJenisBuah, gambarJenisBuah);
        adapter = new CustomAdapter(MainActivity.this, namaJenisBuah, gambarJenisBuah);

        // Todo #14 Set adapter to recyclerview
        rvJenisBuah.setAdapter(jenisBuahAdapter);
        rvListBuah.setAdapter(adapter);
    }

    // #1 Todo-Action Bar : Create method/function to implement action bar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Todo #2 : Inflate layout to menu action bar
        getMenuInflater().inflate(R.menu.menu_example, menu);
        return super.onCreateOptionsMenu(menu);
    }

    // Todo #3 : Create method for handle action when item selected
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        // Todo #4 : Create Switch case to handle when selected by id
        switch (item.getItemId()) {
            case R.id.mn_about:
                Toast.makeText(this, "Ini About", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mn_profile:
                Toast.makeText(this, "Ini Profile", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mn_settings:
                Toast.makeText(this, "Ini Settings", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
