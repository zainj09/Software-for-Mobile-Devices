package com.example.joinz.db_assign;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.migration.Migration;

@Database(entities = {User.class},version=3)
public abstract class MyDatabase extends RoomDatabase {

    public abstract MyDataAccessObject myDao();

   // static final Migration MIGRATION_1_2 = new Migration(1, 2) {
     //   @Override
       // public void migrate(SupportSQLiteDatabase database) {
            // Since we didn't alter the table, there's nothing else to do here.
        //}
    //};
}
