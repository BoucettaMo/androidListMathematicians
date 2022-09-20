package com.boucetta.famousscientist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class BiographyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biography);
        setTitle("Biography");
        LinearLayout linearLayout = new LinearLayout(this);
        ScrollView scrollView = new ScrollView(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        TextView textView = new TextView(this);
        Button button = new Button(this);
        linearLayout.addView(textView);
        linearLayout.addView(button);
        scrollView.addView(linearLayout);

         scrollView.setBackground(getResources().getDrawable(R.color.teal_200));
        textView.setText(getIntent().getExtras().getString("biography"));
        textView.setTextSize(25f);
        textView.setPadding(40,40,5,40);
        button.setText("Wikipedia Biography");
        button.setPadding(20,80,20,100);
        button.setTextSize(20f);
        button.setBackground(getResources().getDrawable(R.color.teal_700));
        linearLayout.setBackground(getResources().getDrawable(R.color.teal_200));
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri uri = Uri.parse(getIntent().getExtras().getString("url"));
                Intent anIntent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(anIntent );
            }
        });
        setContentView(scrollView);

    }
}