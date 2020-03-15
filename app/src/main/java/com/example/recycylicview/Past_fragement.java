package com.example.recycylicview;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class Past_fragement extends Fragment {
    private RecyclerView mRecyclerView;
    private LinearLayoutManager mLinearLayoutManager;
    private ImageView mImageView;



    public Past_fragement() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View mView=inflater.inflate(R.layout.fragment_past_fragement, container, false);
        initView(mView);
        return mView;
    }

    private void initView(View mView) {
        mRecyclerView=mView.findViewById(R.id.past_recyclerview);
        mLinearLayoutManager=new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(mLinearLayoutManager);
        Past_Adapter mAdapter=new Past_Adapter(getContext());
        mRecyclerView.setAdapter(mAdapter);

        mImageView=mView.findViewById(R.id.past_arrow_imageView);
        mImageView.setOnClickListener(new View.OnClickListener() {
            int flage;
            @Override
            public void onClick(View v) {

                if (flage!=0) {
                    mRecyclerView.setVisibility(View.GONE);
                    Log.e("laxman", "imageView");
                    mImageView.setRotation(0);
                    flage=0;
                }
                else {
                    mRecyclerView.setVisibility(View.VISIBLE);
                    mImageView.setRotation(180);
                    flage = 1;
                }
            }
        });

    }
}
