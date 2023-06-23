package com.example.projetoandroid.database;


import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface RoteiroEstudos {

    @Query("Select * from Category")
    List<com.example.projetoandroid.database.Category> pegarTodasCategorias();

    @Insert
    void insertCategory(com.example.projetoandroid.database.Category...categories);

    @Update
    void updateCategory(com.example.projetoandroid.database.Category category);

    @Delete
    void deleteCategory(com.example.projetoandroid.database.Category category);

    @Query("Select * from Itens where IdCategoria = :catId")
    List<com.example.projetoandroid.database.Itens> pegarTodosItens(int catId);

    @Insert
    void insertItens (com.example.projetoandroid.database.Itens itens);

    @Update
    void updateItens (com.example.projetoandroid.database.Itens itens);

    @Delete
    void deleteItens (com.example.projetoandroid.database.Itens itens);



}
