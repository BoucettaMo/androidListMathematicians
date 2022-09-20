package com.boucetta.famousscientist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {
    ListView list;
    MyListAdapter adapter;
    ArrayList<MyListDataModel> myListDataArray = new ArrayList();
    ArrayList<Integer> listImage;
    ArrayList<String> listNames;
    ArrayList<String> listNationality;
    ArrayList<String> listBiography;
    ArrayList<String> listUrl;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        setTitle("Famous Mathematicians");
        list = findViewById(R.id.nam);
        listImage = getIntent().getIntegerArrayListExtra("listImages");
        listNames = getIntent().getStringArrayListExtra("listNames");
        listNationality = getIntent().getStringArrayListExtra("listNationality");
        listBiography =getIntent().getStringArrayListExtra("listBiography");
        listUrl =getIntent().getStringArrayListExtra("listUrl");

        adapter = new MyListAdapter(this,myListDataArray);
        fillListData();
       list.setAdapter(adapter);





    }

    public void fillListData() {

        int n = listNames.size();

        for (int i=0;i<n;++i) {
            MyListDataModel customListDataModel = new MyListDataModel();
            customListDataModel.setImageName(listNames.get(i));
            customListDataModel.setImageIdentity(listImage.get(i));
            customListDataModel.setNationality(listNationality.get(i));
            customListDataModel.setBiography(listBiography.get(i));
            customListDataModel.setUrl(listUrl.get(i));
            myListDataArray.add(customListDataModel);
        }


    }
}