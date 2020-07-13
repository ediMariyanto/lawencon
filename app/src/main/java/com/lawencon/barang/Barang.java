package com.lawencon.barang;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.lawencon.R;

public class Barang extends AppCompatActivity {

    RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barang);

        initComponent();
    }

    void initComponent(){
        mRecyclerView = findViewById(R.id.rcv_barang);
    }

    void tambahData(Barang barang){

    }

    void editData(Barang barang){

    }

    void getAll(){

    }
}