package com.example.recycylicview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MAdapter extends RecyclerView.Adapter<MAdapter.ViewHolder> {

    private Context mContext;

    public MAdapter(Context mContext)
    {
        this.mContext = mContext;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.item_fanstar_scroll, parent, false);
        MAdapter.ViewHolder viewHolder = new MAdapter.ViewHolder(listItem);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 5;
    }


    public static  class ViewHolder extends RecyclerView.ViewHolder
    {
        RelativeLayout mRelativeLayout;
        public ViewHolder(@NonNull View itemView)
        {
            super(itemView);
            mRelativeLayout=(RelativeLayout)itemView.findViewById(R.id.fanStar_relLayout1);
        }
    }
}
