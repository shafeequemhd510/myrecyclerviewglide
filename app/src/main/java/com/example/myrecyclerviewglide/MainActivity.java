package com.example.myrecyclerviewglide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final String TAG="vw";
    ArrayList<String>mNames= new ArrayList<>();
    ArrayList<String>mimageUrls=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: started");

        initImageBitmap();
    }








    private void initImageBitmap() {
        Log.d(TAG, "image bitmap is loading");

        mimageUrls.add("https://cdn.lifehack.org/wp-content/uploads/2015/05/rsz_taj_mahal_india.jpg");
        mNames.add("Taj Mahal");
        mimageUrls.add("https://www.planetware.com/photos-large/MEX/mexico-top-places-cancun-mayan-riviera.jpg");
        mNames.add("Mexico");
        mimageUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT2Jf_HEThmStMJTtRVZH7yhDrVcoKoOCWbmnfsFnh-HYJ9T6qD&s");
        mNames.add("Switzerland");
        mimageUrls.add("https://www.thelalit.com/wp-content/uploads/2017/01/City-Attraction1-New-Delhi-e1493635162496-760-320.jpg");
        mNames.add("NewDelhi");
        mimageUrls.add("https://www.planetware.com/photos-large/USNY/usa-best-places-new-york.jpg");
        mNames.add("NewYork");
        mimageUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQmB6HML7aI_tm30ayntolrVWhn72sn61uohWKHP_ae5JUMkn45&s");
        mNames.add("Goa");
        mimageUrls.add("http://blog.railyatri.in/wp-content/uploads/2018/11/Best-places-to-visit-in-Mysore.png");
        mNames.add("Mysore");
        mimageUrls.add("http://media1.santabanta.com/full1/Countries/Places/places-39d.jpg");
        mNames.add("Paris");

        initRecyclerView();

    }
    private void initRecyclerView(){
        RecyclerView recyclerView=findViewById(R.id.rv);
        Adapter adapter=new Adapter(this,mimageUrls,mNames);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));}
    }





