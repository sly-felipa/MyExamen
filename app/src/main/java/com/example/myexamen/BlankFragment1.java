package com.example.myexamen;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class BlankFragment1 extends Fragment {
    EditText editTextf1;
    Button buttonf1;
    View viewFrag1;
    Bundle bundle = new Bundle();
    FragmentManager fragmentManager;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        getParentFragmentManager().setFragmentFactory();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        viewFrag1 = inflater.inflate(R.layout.fragment_blank1, container, false);
        editTextf1 = viewFrag1.findViewById(R.id.text);

        buttonf1 = viewFrag1.findViewById(R.id.button);
        buttonf1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bundle.putCharSequence("bundleKey", editTextf1.getText());
                getParentFragmentManager().setFragmentResult("requestKey",bundle);

            }
        });

        return viewFrag1;
    }

//    public Bundle saveString(CharSequence word) {
//        bundle.putCharSequence("line", word);
//        return bundle;
//    }

}