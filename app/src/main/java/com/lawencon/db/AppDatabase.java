package com.lawencon.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.lawencon.model.Barang;

@Database(entities = {Barang.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract BarangDao barangDao();
}
