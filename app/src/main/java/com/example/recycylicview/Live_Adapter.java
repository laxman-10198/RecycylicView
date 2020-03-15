package com.example.recycylicview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class Live_Adapter extends RecyclerView.Adapter<Live_Adapter.ViewHolder> {
    private Context mContext;

    public Live_Adapter(Context mContext)
    {
        this.mContext=mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater mLayoutInflater=LayoutInflater.from(parent.getContext());
        View mView=mLayoutInflater.inflate(R.layout.live,parent,false);
        ViewHolder mViewHolder=new ViewHolder(mView);
        return mViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position)
    {
       holder.mRelativeLayout.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent mIntent=new Intent(mContext,LivematchDetails.class);
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
            mRelativeLayout=(RelativeLayout)itemView.findViewById(R.id.live_datalist);

        }
    }
}
