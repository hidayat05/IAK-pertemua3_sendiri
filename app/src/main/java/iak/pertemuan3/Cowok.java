package iak.pertemuan3;

import android.util.Log;

/**
 * Created by hidayat on 4/17/16.
 */
public class Cowok extends Orang {
    public boolean isGanteng(){
        return isGanteng;
    }


    public void setIsganteng(Boolean isganteng){
        this.isGanteng = isGanteng ;
    }

    private boolean isGanteng;
    private String Jenis_Kelamin;

    public Cowok() {
        Log.v("Cowok", "Cowok dipanggil");
    }

    public String getJenis_Kelamin(){
        return "Cowok dari override";
    }


    public String setJenis_Kelamin(){
        return Jenis_Kelamin ;
    }
}
