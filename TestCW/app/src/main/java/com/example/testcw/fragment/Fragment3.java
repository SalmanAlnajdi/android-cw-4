package com.example.testcw.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.testcw.R;


public class Fragment3 extends Fragment {


    public Fragment3() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_3, container, false);

       // Toast.makeText(getActivity(),"fragment 3",Toast.LENGTH_SHORT).show();

        return v;
    }
}