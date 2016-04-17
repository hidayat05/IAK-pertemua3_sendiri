package iak.pertemuan3;

import android.util.Log;

/**
 * Created by hidayat on 4/17/16.
 */
public class Orang {


    private int berat;
    private int tinggi;
    private String jenis_kelamin = "Belum Tau";
    private String nama;

    public String getNama () {return nama;}

    public void setNama(String nama) {
        this.nama = "nur aja" ;
    }


    public Orang() {
        Log.v("orang", "oramg di create"); }

    public int getBerat (){
        return berat;
    }

    public int getTinggi (){
        return  tinggi;
    }

    public String getJenis_kelamin(){
        return jenis_kelamin;
    }

    public void setJenis_kelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }

    public void setBerat(int berat) {
        this.berat = berat ;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }



}
