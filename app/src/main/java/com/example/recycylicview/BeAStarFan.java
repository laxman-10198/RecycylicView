package com.example.recycylicview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class BeAStarFan extends AppCompatActivity {
    private RecyclerView recyclerView1;

    private GridLayoutManager gridLayoutManager;

    private ImageView  mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_be_astar_fan);

        recyclerView1=(RecyclerView)findViewById(R.id.recylerView1);
        mImageView=(ImageView)findViewById(R.id.fanStar_calender);

        gridLayoutManager = new GridLayoutManager(this,1,GridLayoutManager.HORIZONTAL,false);
        // Set LayoutManager on Recycler View
        recyclerView1.setLayoutManager(gridLayoutManager);
        MAdapter mAdapter = new MAdapter(this);
        recyclerView1.setAdapter(mAdapter);

        mImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
