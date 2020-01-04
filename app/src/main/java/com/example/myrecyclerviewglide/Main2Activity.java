package com.example.myrecyclerviewglide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        getComingIntent();







    }
    public void getComingIntent(){
        if (getIntent().hasExtra("imageUrl")&& getIntent().hasExtra("imageNames")){

            String imageUrl=getIntent().getStringExtra("imageUrl");
            String imageNames=getIntent().getStringExtra("imageNames");

            setImage(imageUrl,imageNames);


        }


    }
    public void setImage(String imageUrl,String imageNames){

        TextView name=findViewById(R.id.image_discription);
        name.setText(imageNames);
        ImageView image=findViewById(R.id.imageView);
        Glide.with(this).asBitmap().load(imageUrl).into(image);



    }
}
