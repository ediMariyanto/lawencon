package com.lawencon.db;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.lawencon.model.Barang;

import java.util.List;

@Dao
public interface BarangDao {


    @Query("SELECT * FROM barang")
    List<Barang> getAll();

    @Insert
    void insertAll(Barang... barangs);

    @Delete
    public void deleteBarang(Barang... barangs);

    @Update
    public void updateBarang(Barang... barangs);
}

