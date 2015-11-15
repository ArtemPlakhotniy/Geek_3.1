package com.aplakhotniy.geek_30.hw_2;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.aplakhotniy.geek_30.R;

/**
 * Created by Кицюня on 11.11.2015.
 */
public class HW_2 extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.hw2_layout, container,false);
    }

    @Override
    public void onStart() {
        super.onStart();
        final TextView resTxt = (TextView)getView().findViewById(R.id.resTxt);
        final Button prcFactBtn = (Button)getView().findViewById(R.id.prcFactBtn);
        final EditText editText = (EditText)getView().findViewById(R.id.editText);

        final TextView resFibTxt = (TextView)getView().findViewById(R.id.resFibTxt);
        final Button prcFibBtn = (Button)getView().findViewById(R.id.prcFibBtn);
        final EditText editText2 = (EditText)getView().findViewById(R.id.editText2);

        prcFactBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    if(editText.getText().toString().length() > 0){
                        int b = Integer.valueOf(editText.getText().toString());
                        if(factorial(b) >= 0){
                            resTxt.setText(""+factorial(b));
                        }
                        else if(factorial(b) < 0){
                            Toast r = Toast.makeText(getActivity(), "Число привысило допустимый тип", Toast.LENGTH_SHORT);
                            r.show();
                        }
                    }
                    else {
                        Toast t = Toast.makeText(getActivity(), "Введите число!!!", Toast.LENGTH_SHORT);
                        t.show();
                    }
                }
                catch (Exception e){
                    Toast t = Toast.makeText(getActivity(), "Введите число!!!", Toast.LENGTH_SHORT);
                    t.show();
                }
            }
        });

        prcFibBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try{
                    if(editText2.getText().toString().length() > 0){
                        int k = Integer.valueOf(editText2.getText().toString());
                        if (fibonachi(k) >= 0){
                            resFibTxt.setText(""+fibonachi(k));
                        }
                        else if(fibonachi(k) < 0){
                            Toast l = Toast.makeText(getActivity(), "Число привысило допустимый тип", Toast.LENGTH_SHORT);
                            l.show();
                        }
                    }
                    else {
                        Toast t = Toast.makeText(getActivity(), "Введите число!!!", Toast.LENGTH_SHORT);
                        t.show();
                    }
                }
                catch (Exception e){
                    Toast t = Toast.makeText(getActivity(), "Неизвестная ошибка", Toast.LENGTH_SHORT);
                }
            }
        });

    }

    static public int factorial(int a){
        if (a == 0){
            return 0;
        }
        else {
            int res = 1;
            for(int i = 1; i <= a; i++){
                boolean maxInt = ((long)res * i) <= Integer.MAX_VALUE;
                if(maxInt){
                    res = res * i;
                }
                else {
                    return -1;
                }
            }
            return res;
        }
    }

    static public int fibonachi(int k){

        if(k == 0){
            return 0;
        }
        else {
            int x = 0;
            int y = 1;
            int res = 1;
            for(int i = 0; i < k; i++){
                boolean maxInt = ((long)res + y) <= Integer.MAX_VALUE;
                if(maxInt){
                    res = x + y;
                    x = y;
                    y = res;
                }
                else {
                    return -1;
                }
            }
            return res;
        }
    }
}
