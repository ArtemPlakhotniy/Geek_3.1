package com.aplakhotniy.geek_30.hw_1;

import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.aplakhotniy.geek_30.R;


public class HW_1 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.hw1_layout, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();

        final TextView textView = (TextView)getView().findViewById(R.id.textView);
        TextView greenBtn = (TextView)getView().findViewById(R.id.greenBtn);
        TextView redBtn = (TextView)getView().findViewById(R.id.redBtn);
        TextView blueBtn = (TextView)getView().findViewById(R.id.blueBtn);

        greenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setTextColor(Color.GREEN);
            }
        });

        redBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setTextColor(Color.RED);
            }
        });

        blueBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setTextColor(Color.BLUE);
            }
        });
    }
}
