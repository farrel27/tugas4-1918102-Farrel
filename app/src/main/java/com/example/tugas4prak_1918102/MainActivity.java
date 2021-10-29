package com.example.tugas4prak_1918102;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private AplikasiAdapter adapter;
    private ArrayList<Aplikasi> AplikasiArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        recyclerView = (RecyclerView)findViewById(R.id.recycleview);

        adapter = new AplikasiAdapter(AplikasiArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);

    }

    private void addData() {
        AplikasiArrayList = new ArrayList<>();
        AplikasiArrayList.add(new Aplikasi(R.drawable.wa,"WhatsApp ", "Pesan instan dan Media Sosial", "2009"));
        AplikasiArrayList.add(new Aplikasi(R.drawable.ig,"Instagram", "Media Sosial", "2010"));
        AplikasiArrayList.add(new Aplikasi(R.drawable.fb,"Facebook ", "Media Sosial", "2004"));
        AplikasiArrayList.add(new Aplikasi(R.drawable.dragoncity,"Dragon City", "Game Media Sosial", "2012"));
        AplikasiArrayList.add(new Aplikasi(R.drawable.ninjasaga,"Ninja Saga", "Game RPG", "2009"));
        AplikasiArrayList.add(new Aplikasi(R.drawable.subwaysurfer,"Subway Surfers", "Game Pemain Tunggal", "2012"));
    }
}