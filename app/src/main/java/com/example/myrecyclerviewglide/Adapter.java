package com.example.myrecyclerviewglide;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class Adapter extends RecyclerView.Adapter<Adapter.UserHolder> {
    private static final String TAG="vw";
    private List<String>mImages  = new ArrayList<>();
    private List<String>mImageNames  = new ArrayList<>();
    private Context context;

    public Adapter(Context context, List<String> mImages, List<String> mImageNames) {
        this.mImages = mImages;
        this.mImageNames = mImageNames;
        this.context = context;
    }

    @NonNull
    @Override
    public UserHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.layoutlistitems,parent,false);

        return new UserHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserHolder holder, final int position) {
        Log.d(TAG,"onBindViewHolder: Called. ");
        Glide.with(context).asBitmap().load(mImages.get(position)).into(holder.image);
        holder.imageName.setText(mImageNames.get(position));
        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG,"clicked on: "+mImageNames.get(position));
                Toast.makeText(context, mImageNames.get(position), Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(context,Main2Activity.class);
                intent.putExtra("imageUrl",mImages.get(position));
                intent.putExtra("imageNames",mImageNames.get(position));
                context.startActivity(intent);
                

            }
        });
    }

    @Override
    public int getItemCount() {
        return mImageNames.size();
    }

    public class UserHolder extends RecyclerView.ViewHolder{
        CircleImageView image;
        TextView imageName;
        RelativeLayout parentLayout;


        public UserHolder(@NonNull View itemView) {
            super(itemView);
            image=itemView.findViewById(R.id.image);
            imageName=itemView.findViewById(R.id.image_name);
            parentLayout=itemView.findViewById(R.id.parent_layout);



        }
    }
}
