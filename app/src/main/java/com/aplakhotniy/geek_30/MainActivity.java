package com.aplakhotniy.geek_30;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.ListView;

import com.aplakhotniy.geek_30.hw_1.HW_1;
import com.aplakhotniy.geek_30.hw_2.HW_2;
import com.aplakhotniy.geek_30.hw_3.HW_3;
import com.aplakhotniy.geek_30.hw_4.HW_4;
import com.aplakhotniy.geek_30.hw_4.HW_4_pr;
import com.aplakhotniy.geek_30.hw_6.HW_6_main;

public class MainActivity extends AppCompatActivity {

    private HW_1 work_1;
    private HW_2 work_2;
    private HW_3 work_3;
    private HW_4 work_4;

    private FrameLayout main_frame;
    private ListView list_view;
    private String[] list = {"1", "2", "3", "4", "Multi-pane Layouts"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        work_1 = new HW_1();
        work_2 = new HW_2();
        work_3 = new HW_3();
        work_4 = new HW_4();

        list_view = (ListView)findViewById(R.id.list_view);
        list_view.setAdapter(new ArrayAdapter<String>(this, R.layout.drawer_list, list));

        list_view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                FragmentTransaction fm = getFragmentManager().beginTransaction();
                switch (position) {
                    case 0:
                        fm.replace(R.id.main_frame, work_1).addToBackStack(null).commit();
                        break;
                    case 1:
                        fm.replace(R.id.main_frame, work_2).addToBackStack(null).commit();
                        break;
                    case 2:
                        fm.replace(R.id.main_frame, work_3).addToBackStack(null).commit();
                        break;
                    case 3:
                        //fm.beginTransaction().replace(R.id.main_frame, work_4).commit();
                        Intent i = new Intent(getApplicationContext(), HW_4_pr.class);
                        startActivity(i);
                        break;
                    case 4:
                        //fm.beginTransaction().replace(R.id.main_frame, work_4).commit();
                        Intent k = new Intent(getApplicationContext(), HW_6_main.class);
                        startActivity(k);
                        break;
//                    case 5:
//                        //fm.beginTransaction().replace(R.id.main_frame, work_4).commit();
//                        Intent j = new Intent(getApplicationContext(), HW_6beta.class);
//                        startActivity(j);
//                        break;
                }

            }
        });
    }
}
