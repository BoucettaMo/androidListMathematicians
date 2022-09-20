package com.boucetta.famousscientist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    ArrayList<Integer>    listImageMathematicians = new ArrayList<>(Arrays.asList(
            R.drawable.kawarismi,R.drawable.euclid,R.drawable.euler,R.drawable.gauss,
            R.drawable.lobatchevski, R.drawable.pascal, R.drawable.grigori, R.drawable.poincare,R.drawable.poisson,R.drawable.riemann,R.drawable.thales,
            R.drawable.villani));
    ArrayList<String> listNameMathematicians = new ArrayList<>(Arrays.asList("Al-Kawarizmi","Euclid","Leonhard Euler",
            "Carl Friedrich Gauss","Nikolaï Ivanovitch Lobatchevski",
            "Blaise pascal",
            "Grigori Perelman", "Henri Poincaré","Siméon Denis Poisson",
            "Bernard Riemann","Thales of Miletus","Cedric Villani"));
    ArrayList<String>  listNationalityMathematicians = new ArrayList<>(Arrays.asList("Persian","Greek","Swiss","Germain",
            "Russian","French","Russian","French","French",
            "Germain","Greek","French"));
    ArrayList<String> listBiographyMathematicians = new ArrayList<>();
    ArrayList<String> listUrlMathematicians = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Famous Mathematicians");
        setContentView(R.layout.activity_main);
        Collections.addAll(listBiographyMathematicians,
                getResources().getStringArray(R.array.biographyMathematicians));
        Collections.addAll(listUrlMathematicians,
                getResources().getStringArray(R.array.urlMathematicians));

    }

    public void goListMathematicians(View v) {

        Intent intent = new Intent(MainActivity.this, ListActivity.class);


        intent.putIntegerArrayListExtra("listImages",listImageMathematicians);
        intent.putStringArrayListExtra("listNames",listNameMathematicians);
       intent.putStringArrayListExtra("listNationality",listNationalityMathematicians);
        intent.putStringArrayListExtra("listBiography",listBiographyMathematicians);
        intent.putStringArrayListExtra("listUrl",listUrlMathematicians);
        startActivity(intent);
    }
}