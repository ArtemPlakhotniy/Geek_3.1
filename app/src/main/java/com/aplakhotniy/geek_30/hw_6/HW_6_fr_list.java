package com.aplakhotniy.geek_30.hw_6;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aplakhotniy.geek_30.R;

public class HW_6_fr_list extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.hw6_multi_pane_list, container, false);
        return view;
    }
}
