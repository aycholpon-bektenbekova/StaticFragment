package com.example.staticfragment;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class MainFragment extends Fragment {

    private Button buttonPlus;
    private Button buttonMinus;
    private TextView textViewZero;
    Integer number;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        buttonPlus = view.findViewById(R.id.btn_sum1);
        buttonMinus = view.findViewById(R.id.btn_minus1);
        textViewZero = view.findViewById(R.id.textViewZero);

        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number = Integer.parseInt(textViewZero.getText().toString());
                Integer result = number + 1;
                textViewZero.setText(result.toString());
            }

        });


        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number = Integer.parseInt(textViewZero.getText().toString());
                Integer result = number - 1;
                textViewZero.setText(result.toString());
            }
        });

    }

    }


