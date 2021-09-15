package com.example.veritabani.projesi;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.sql.SQLException;

public class Veritabani {
    private static final String DATABASE_ISIM = "Kisiler";
    private static final String DATABASE_TABLO = "Rehber";
    private static final int DATABASE_VERSION = 1;

    private final Context contextim;
    private VeritabaniHelper veritabanihelper;
    private SQLiteDatabase veritabanim;

    public static final String KEY_ROW_ID = "_id";
    public static final String KEY_AD = "ad";
    public static final String KEY_SOYAD = "soyad";
    public static final String KEY_OGRENIM_DURUMU = "öğrenim durumu";
    public static final String KEY_YAS = "yaş";

    public Veritabani(Context c) {
        this.contextim = c;
    }

    public Veritabani baglantiyiAc() throws SQLException {
        veritabanihelper = new VeritabaniHelper(contextim);
        veritabanim = veritabanihelper.getWritableDatabase();
        return this;
    }

    public void baglantiyiKapat() {
        veritabanihelper.close();
    }

    private static class VeritabaniHelper extends SQLiteOpenHelper {
        public VeritabaniHelper(Context contextim) {
            super(contextim, DATABASE_ISIM, null, DATABASE_VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            // TODO Auto-generated method stub
            db.execSQL("CREATE TABLE " + DATABASE_TABLO + " (" + KEY_ROW_ID
                    + " INTEGER PRIMARY KEY AUTOINCREMENT , " + KEY_AD
                    + " TEXT NOT NULL, " + KEY_SOYAD + " TEXT NOT NULL, " + KEY_OGRENIM_DURUMU + " TEXT NOT NULL, " + KEY_YAS + " TEXT NOT NULL);");
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            // TODO Auto-generated method stub
            db.execSQL("DROP TABLE IF EXISTS " + DATABASE_TABLO);
            onCreate(db);
        }
    }
}