package com.example.syfch.test;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

import java.text.DateFormat;
import java.util.Calendar;

public class FragmentJam extends Fragment {
    View view;
    Calendar calendar = Calendar.getInstance();

    String currentdate = DateFormat.getDateInstance(DateFormat.FULL).format(calendar.getTime());


    TextView textViewDate;


    public FragmentJam() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.jam_fragment,container,false);

        TextView textViewDate = view.findViewById(R.id.clockk);
        textViewDate.setText(currentdate);


        return view;
    }


}
