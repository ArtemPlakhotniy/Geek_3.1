package com.aplakhotniy.geek_30.hw_6;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.aplakhotniy.geek_30.R;
import com.aplakhotniy.geek_30.hw_6.fragments.pict0;
import com.aplakhotniy.geek_30.hw_6.fragments.pict1;
import com.aplakhotniy.geek_30.hw_6.fragments.pict2;
import com.aplakhotniy.geek_30.hw_6.fragments.pict3;
import com.aplakhotniy.geek_30.hw_6.fragments.pict4;
import com.aplakhotniy.geek_30.hw_6.fragments.pict5;

public class HW_6_main extends AppCompatActivity{

    pict0 p0;
    pict1 p1;
    pict2 p2;
    pict3 p3;
    pict4 p4;
    pict5 p5;

    FragmentManager fm;
    ListView mainList;

    String[] list = {"Rachel Green", "Ross Geller","Joey Tribbiani", "Monica Geller", "Phoebe Buffay", "Chandler Bing"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hw6_layout_main);

        //final View listconteiner = findViewById(R.id.mainList);

        final ListView mainList = (ListView) findViewById(R.id.mainList);
        mainList.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list));

        fm = getFragmentManager();

        p0 = new pict0();
        p1 = new pict1();
        p2 = new pict2();
        p3 = new pict3();
        p4 = new pict4();
        p5 = new pict5();

        mainList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                FragmentTransaction fm = getFragmentManager().beginTransaction();
                switch (position) {
                    case 0:
                        fm.replace(R.id.buffer, p0).commit();
                        break;
                    case 1:
                        fm.replace(R.id.buffer, p1).commit();
                        break;
                    case 2:
                        fm.replace(R.id.buffer, p2).commit();
                        break;
                    case 3:
                        fm.replace(R.id.buffer, p3).commit();
                        break;
                    case 4:
                        fm.replace(R.id.buffer, p4).commit();
                        break;
                    case 5:
                        fm.replace(R.id.buffer, p5).commit();
                        break;
                }
            }
        });

        int screenOrientation = getResources().getConfiguration().orientation;

        if (screenOrientation == Configuration.ORIENTATION_PORTRAIT) {
            hideSidePanel();
            mainList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    FragmentTransaction transaction = fm.beginTransaction();
                    switch (position) {
                        case 0:
                            mainList.setVisibility(View.GONE);
                            transaction.replace(R.id.buffer2, p0);
                            break;
                        case 1:
                            mainList.setVisibility(View.GONE);
                            transaction.replace(R.id.buffer2, p1);
                            break;
                        case 2:
                            mainList.setVisibility(View.GONE);
                            transaction.replace(R.id.buffer2, p2);
                            break;
                        case 3:
                            mainList.setVisibility(View.GONE);
                            transaction.replace(R.id.buffer2, p3);
                            break;
                        case 4:
                            mainList.setVisibility(View.GONE);
                            transaction.replace(R.id.buffer2, p4);
                            break;
                        case 5:
                            mainList.setVisibility(View.GONE);
                            transaction.replace(R.id.buffer2, p5);
                            break;
                    }
                    transaction.addToBackStack(null).commit();;
                }
            });
        }
    }

    private void hideSidePanel() {
        View dataconteiner = findViewById(R.id.dataconteiner);
        if (dataconteiner.getVisibility() == View.VISIBLE) {
            dataconteiner.setVisibility(View.GONE);
        }
    }

}

