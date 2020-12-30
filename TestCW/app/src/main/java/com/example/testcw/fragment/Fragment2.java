package com.example.testcw.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.testcw.R;


public class Fragment2 extends Fragment {



    public Fragment2() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_2, container, false);

        //Toast.makeText(getActivity(),"fragment 2",Toast.LENGTH_SHORT).show();
        return v;
    }
}