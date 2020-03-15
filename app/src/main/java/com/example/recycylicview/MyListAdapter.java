package com.example.recycylicview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import androidx.recyclerview.widget.RecyclerView;


public class MyListAdapter extends RecyclerView.Adapter<MyListAdapter.ViewHolder>
{
    private Context context;

    // RecyclerView recyclerView;

    public MyListAdapter(Context context) {
        this.context = context;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.list_item, parent, true);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {


        holder.mRelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,chat.class);
                context.startActivity(intent);
            }
        });
    }


    @Override
    public int getItemCount()
    {
        return 5;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        RelativeLayout mRelativeLayout;

        public ViewHolder(View itemView) {
            super(itemView);
            mRelativeLayout=(RelativeLayout)itemView.findViewById(R.id.relativeLayout3);
        }
    }
}
