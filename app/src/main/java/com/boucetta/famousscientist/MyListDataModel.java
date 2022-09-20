package com.boucetta.famousscientist;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MyListDataModel {


        private String imageName;
        private String nationality;
        private int imageIdentity;
        private String biography;
        private  String url;

        public void onClick(Activity activity) {
            Intent intent = new Intent(activity, BiographyActivity.class );
            intent.putExtra("url",url);
            intent.putExtra("biography",biography);

             activity.startActivity(intent);
        }


        public int getImageIdentity() {
            return imageIdentity;
        }

        public String getImageName() {
            return imageName;
        }

        public String getNationality() {
            return nationality;
        }
        public String getBiography() {
            return biography;
        } public String getUrl() {
            return url;
        }

        public void setImageIdentity(int imageIdentity) {
            this.imageIdentity = imageIdentity;
        }
        public void setImageName(String imageName) {
            this.imageName = imageName;
        }
        public void setNationality(String nationality) {
            this.nationality = nationality;
        }
        public void setBiography(String biography) {
            this.biography = biography;
        }
        public void setUrl(String url) {
            this.url = url;
        }

        public void onClick(Activity activity, String string) {
            Toast.makeText(activity, string, Toast.LENGTH_LONG).show();
        }

    }





