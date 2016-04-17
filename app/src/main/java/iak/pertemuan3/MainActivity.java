package iak.pertemuan3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Orang orangPertama = new Orang();
            Log.e("Jenis kelamin cewek", orangPertama.getJenis_kelamin());

        Cowok cowokPertama = new Cowok();
            Log.e("jenis Kelamin Cowok", cowokPertama.getJenis_Kelamin());

        Cowok co1 = new Cowok();
        co1.setNama("nur Hidayat");
        co1.setJenis_Kelamin("Laki-Laki");
        co1.setIsganteng(false);


        Log.e("Nama co1", co1.getNama());
        Log.e("Jenis Kelamin co1", co1.getJenis_Kelamin());
        Log.e("co1 ganteng", co1.isGanteng()+ "");


    }


    String name = "nur hidayat";

    if () {
        Log.e("Conditional Coe", "masuk if")
    } else if (name.equals("Kuda")) {
        Log.e("conditional code", "masuk else if");
    } else{
        Log.e("conditional code", "masuk else");
    }


}
