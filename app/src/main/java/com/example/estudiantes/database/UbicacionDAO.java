package com.example.estudiantes.database;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;

@Dao
public interface UbicacionDAO {
    @Insert
    public void insertUbicacion(Ubicacion miUbicacion);
}
