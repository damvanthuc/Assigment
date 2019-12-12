package com.example.baitest1.fragment.ThongKe;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.baitest1.R;

public class FragmentThonKe extends Fragment {

    private ShowFragmentThongKe showFragmentThongKe;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        showFragmentThongKe = ViewModelProviders.of(this).get(ShowFragmentThongKe.class);
        View root = inflater.inflate(R.layout.fragment_thongke, container, false);
        final TextView textView = root.findViewById(R.id.text_slideshow);
        showFragmentThongKe.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}