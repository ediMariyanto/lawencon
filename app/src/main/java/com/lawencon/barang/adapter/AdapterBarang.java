package com.lawencon.barang.adapter;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.lawencon.model.Barang;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class AdapterBarang extends RecyclerView.Adapter {

    List<Barang> data;

    public AdapterBarang() {
        this.data = new ArrayList<>();
    }

    public List<Barang> getData() {
        return data;
    }

    public void setData(List<Barang> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
