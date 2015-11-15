package com.aplakhotniy.geek_30.hw_4;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.aplakhotniy.geek_30.R;

/**
 * Created by Кицюня on 11.11.2015.
 */
public class HW_4_pr extends BaseActivity {

    HW_4_fr1 hw_1;
    HW_4_fr2 hw_2;

    FrameLayout conteinerforhw4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hw4_layout);

        conteinerforhw4 = (FrameLayout)findViewById(R.id.conteinerforhw4);

        hw_1 = new HW_4_fr1();
        hw_2 = new HW_4_fr2();

        isAddFragment();
        addFragment();
    }

    public void addFragment(){
        if (isAddFragment() == true){
            FragmentManager fm = getFragmentManager();
            fm.beginTransaction()
                    .remove(hw_2)
                    .add(R.id.conteinerforhw4, hw_1).commit();
        }else {
            FragmentManager fm = getFragmentManager();
            fm.beginTransaction()
                    .remove(hw_1)
                    .add(R.id.conteinerforhw4, hw_2).commit();
        }
    }

    @Override

    public boolean isAddFragment() {
        return true;
    }
}
