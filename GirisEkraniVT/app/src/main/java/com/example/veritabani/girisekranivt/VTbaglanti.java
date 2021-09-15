package com.example.veritabani.girisekranivt;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.TextView;

public class VTbaglanti extends SQLiteOpenHelper {

    public VTbaglanti(MainActivityVt context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, "kisiler.db", factory, version);  }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE kisiler(ID INTEGER PRIMARY KEY AUTOINCREMENT, adi TEXT UNIQUE, soyadi TEXT, telefon TEXT);");  }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS kisiler;");
        onCreate(sqLiteDatabase);  }

    public void yeniKayit (String adi, String soyadi, String telefon){
        ContentValues contentValues=new ContentValues();
        contentValues.put("adi",adi);
        contentValues.put("soyadi",soyadi);
        contentValues.put("telefon",telefon);
        this.getWritableDatabase().insertOrThrow("kisiler","",contentValues); }

    public void silKayit (String adi) {
        this.getWritableDatabase().delete("kisiler","adi='"+adi+"'",null);  }

    public void güncelleKayit(String eski_adi, String yeni_adi) {
        this.getWritableDatabase().execSQL("UPDATE kisiler SET adi='"+yeni_adi+"' where adi='"+eski_adi+"'");  }

    public void listeleKayit (TextView kisiBilgi) {
        Cursor cursor=this.getReadableDatabase().rawQuery("select * from kisiler",null);
        kisiBilgi.setText("");
        while (cursor.moveToNext()) {
            kisiBilgi.append("AD:"+ cursor.getString(1) + "  " + "SOYAD:" +  cursor.getString(2) + "  " + "TELEFON:" + cursor.getString(3) + "\n");} }


}

