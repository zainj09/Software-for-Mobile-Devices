package com.example.joinz.db_assign;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface MyDataAccessObject {

    @Insert
    public void addUser(User u);

    @Query("select * from  user_info")
    public List<User> getUsers();

    @Delete
    public void delete(User u);

    @Update
    public void update(User u);
}
