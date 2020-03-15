package com.example.recycylicview;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class Upcoming_Fragement extends Fragment {
    private RecyclerView mRecyclerView;
    private LinearLayoutManager mLinerLayoutManager;
    private ImageView mImageView;
    public Upcoming_Fragement()
    {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View mView=inflater.inflate(R.layout.fragment_upcoming__fragement, container, false);
        initView(mView);
//        gameAdapter(mView);
        return mView;
    }

//    private void gameAdapter(View mView) {
//        RecyclerView mRecyclerView1=mView.findViewById(R.id.GameList_Recyler);
//        LinearLayoutManager mLinerLayoutManager1=new LinearLayoutManager(getActivity());
//        mRecyclerView1.setLayoutManager(mLinerLayoutManager1);
//        GameList_Adapter gameList_adapter=new GameList_Adapter(getContext());
//        mRecyclerView1.setAdapter(gameList_adapter);
//    }

    private void initView(View mView) {

        mRecyclerView=mView.findViewById(R.id.upc_recyclerview);
        mLinerLayoutManager=new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(mLinerLayoutManager);

        Upcoming_Adapter mAdapter=new Upcoming_Adapter(getContext());
        mRecyclerView.setAdapter(mAdapter);

        mImageView=mView.findViewById(R.id.upcoming_arrow_imageView);
        mImageView.setOnClickListener(new View.OnClickListener() {
            int  flage=1;
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



/*
imageView = (ImageView) findViewById(R.id.imageView);
Bitmap myImg = BitmapFactory.decodeResource(getResources(), R.drawable.image);

Matrix matrix = new Matrix();
matrix.postRotate(30);

Bitmap rotated = Bitmap.createBitmap(myImg, 0, 0, myImg.getWidth(), myImg.getHeight(),
        matrix, true);

imageView.setImageBitmap(rotated);
 */