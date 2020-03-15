package com.example.recycylicview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Upcoming_Adapter extends RecyclerView.Adapter<Upcoming_Adapter.ViewHolder> {
private Context mContext;

public Upcoming_Adapter(Context mContext)
        {
        this.mContext=mContext;
        }

@NonNull
@Override
public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater mLayoutInflater=LayoutInflater.from(parent.getContext());
        View mView=mLayoutInflater.inflate(R.layout.upcoming_datalist,parent,false);

        Upcoming_Adapter.ViewHolder mViewHolder=new Upcoming_Adapter.ViewHolder(mView);
        return mViewHolder;
        }


    @Override
     public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

         holder.mRelativeLayout.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent mIntent=new Intent(mContext,LiveMatchDetails1.class);
                 mContext.startActivity(mIntent);
             }
         });
        }

   @Override
   public int getItemCount() {
        return 10;
        }

  public static class ViewHolder extends RecyclerView.ViewHolder {

    RelativeLayout mRelativeLayout;
      public ViewHolder(@NonNull View itemView) {
        super(itemView);
         mRelativeLayout=(RelativeLayout)itemView.findViewById(R.id.upc_datalist);
      }
}
}