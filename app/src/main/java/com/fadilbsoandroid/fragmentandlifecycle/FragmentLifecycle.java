package com.fadilbsoandroid.fragmentandlifecycle;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentLifecycle extends Fragment {


    public FragmentLifecycle() {
        // Required empty public constructor
    }

    Button fragmentMove;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View fragmentView = inflater.inflate(R.layout.fragment_fragment_lifecycle,container,false);
        // Inflate the layout for this fragment
        fragmentMove = fragmentView.findViewById(R.id.btn_lifecycle);

        fragmentMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(),Lifecycle.class);
                startActivity(i);
            }
        });

        return fragmentView;
    }
}
