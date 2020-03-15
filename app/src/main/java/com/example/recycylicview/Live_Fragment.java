package com.example.recycylicview;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class Live_Fragment extends Fragment{

    private RecyclerView mRecyclerView;
    private LinearLayoutManager mLinearLayoutManager;
    private ImageView mImageView;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("Live","live_fragement");

    }

    public Live_Fragment()
    {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        final FragmentActivity mFragmentActivity =getActivity();


        View view =   inflater.inflate(R.layout.fragment_live_, container, false);

        initView(view);
        return view;
    }

    private void initView(View mView) {



        mRecyclerView = mView.findViewById(R.id.live_recyclerview);
        mLinearLayoutManager=new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(mLinearLayoutManager);
        Live_Adapter mAdapter1=new Live_Adapter(getContext());
        mRecyclerView.setAdapter(mAdapter1);

        mImageView=mView.findViewById(R.id.live_arrow_ImageView);


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
