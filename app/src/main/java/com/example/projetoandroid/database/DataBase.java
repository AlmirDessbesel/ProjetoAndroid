package com.example.projetoandroid.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {com.example.projetoandroid.database.Category.class, Itens.class},  version = 1)
public abstract class DataBase extends RoomDatabase {


    public abstract RoteiroEstudos roteiroEstudos();

    public static DataBase INSTANCE;

    public static DataBase getDBInstance(Context context) {
        if(INSTANCE == null) {
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(), DataBase.class,"AppDB")
                    .allowMainThreadQueries()
                    .build();
        }

        return INSTANCE;
    }
}
