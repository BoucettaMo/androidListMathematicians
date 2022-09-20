package com.boucetta.famousscientist;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class MyListAdapter extends BaseAdapter {
    ArrayList<MyListDataModel> listDataModels = new ArrayList<>();
    Activity activity;
    LayoutInflater layoutInflater = null;

    public MyListAdapter(Activity activity, ArrayList arrayList) {
        this.activity = activity;
        this.listDataModels = arrayList;
        layoutInflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return listDataModels.size();
    }

    @Override
    public Object getItem(int position) {
        return listDataModels.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    private  static class ViewHolder {
        TextView textViewName, textViewNationality;
        ImageView imageView;
        Button  buttonBiography;

    }

    ViewHolder viewHolder = null;

    @Override
    public View getView(int position, View view, ViewGroup parent) {

        if (view == null) {
             viewHolder = new ViewHolder();
            view = layoutInflater.inflate(R.layout.layout_model,null);
            viewHolder.imageView = (ImageView) view.findViewById(R.id.scientistImage);
            viewHolder.textViewName = (TextView) view.findViewById(R.id.scientistName);
            viewHolder.textViewNationality = (TextView) view.findViewById(R.id.scientistNationality);
            viewHolder.buttonBiography = view.findViewById(R.id.scientistBiography);
             view.setTag(viewHolder);

        }
        else {

          viewHolder =  (ViewHolder) view.getTag();

        }

        viewHolder.imageView.setImageResource(listDataModels.get(position).getImageIdentity());
        viewHolder.textViewName.setText(listDataModels.get(position).getImageName());
     //   viewHolder.textViewNationality.setText(listDataModels.get(position).getNationality());
        viewHolder.textViewName.setTextSize(25f);
        viewHolder.textViewNationality.setTextSize(20f);
        viewHolder.buttonBiography.setTextSize(20f);
        viewHolder.buttonBiography.setGravity(Gravity.RIGHT);
        viewHolder.buttonBiography.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listDataModels.get(position).onClick(activity);


            }
        });


        return view;
    }
}
