package com.example.recycylicview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class GameList_Adapter extends RecyclerView.Adapter<GameList_Adapter.ViewHolder>{
    private Context mContex;
    public GameList_Adapter(Context mContex)
    {
        this.mContex=mContex;
    }
    @NonNull
    @Override
    public GameList_Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater mLayOut=LayoutInflater.from(parent.getContext());
        View mView=mLayOut.inflate(R.layout.fragment_upcoming__fragement,parent,false);
        GameList_Adapter.ViewHolder mt=new GameList_Adapter.ViewHolder(mView);

        return mt;
    }

    @Override
    public void onBindViewHolder(@NonNull GameList_Adapter.ViewHolder holder, int position) {
     holder.mReLativLayout.setVisibility(View.VISIBLE);
     holder.mLinearLayout.setVisibility(View.GONE);
    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        RelativeLayout mReLativLayout;
        LinearLayout mLinearLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mReLativLayout=(RelativeLayout)itemView.findViewById(R.id.GameList_ReLyout);
            mLinearLayout=(LinearLayout)itemView.findViewById(R.id.live_linearLayout1);
        }
    }
}
