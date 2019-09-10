package com.example.tugas6_keterampilan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {
    Button pembelian;
    RecyclerView rvData;
    private ArrayList<DataMobil> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        rvData = findViewById(R.id.id_mobil);
        rvData.setHasFixedSize(true);

        list.addAll(DataMobil2.getListData());
        showRecyclerList();
    }
    private void showRecyclerList() {
        rvData.setLayoutManager(new LinearLayoutManager(this));
        ListMobilAdapter listMobilAdapter = new ListMobilAdapter(list) {
        };
        rvData.setAdapter(listMobilAdapter);
    }
}
