package com.example.myexamen;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;

public class BlankFragment2 extends Fragment {
    TextView textView;
    CharSequence charSequence;
    View viewFrag2;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getParentFragmentManager().setFragmentResultListener("requestKeynxc", this, new FragmentResultListener() {
            @Override
            public void onFragmentResult(@NonNull String key, @NonNull Bundle bundle) {
                // We use a String here, but any type that can be put in a Bundle is supported
                charSequence = bundle.getString("bundleKey");
            }
        });

////        textView = viewFrag2.findViewById(R.id.text2);
//        if (getArguments() != null) {
//            charSequence = getArguments().getCharSequence("line");
//            System.out.println(charSequence);
//        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        viewFrag2 = inflater.inflate(R.layout.fragment_blank2, container, false);
        textView = viewFrag2.findViewById(R.id.text2);
        System.out.println(charSequence);

        return viewFrag2;
    }


}