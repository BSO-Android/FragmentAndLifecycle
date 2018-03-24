package com.fadilbsoandroid.fragmentandlifecycle;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class RumusPersegi extends Fragment {


    public RumusPersegi() {
        // Required empty public constructor
    }

    String mPanjang,mLebar,Shasil;
    double mPan,mLeb,hasil;
    Button hitung;
    EditText panjang,lebar;
    TextView tv_hasil;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View fragmentView = inflater.inflate(R.layout.fragment_rumus_persegi,container,false);
        hitung = fragmentView.findViewById(R.id.btn_hitung);
        panjang = fragmentView.findViewById(R.id.et_panjang);
        lebar = fragmentView.findViewById(R.id.et_lebar);
        tv_hasil = fragmentView.findViewById(R.id.tv_hasil);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPanjang=panjang.getText().toString();
                mLebar=lebar.getText().toString();
                mPan = Double.parseDouble(mPanjang);
                mLeb = Double.parseDouble(mLebar);
                hasil = mPan*mLeb;
                Shasil = String.valueOf(hasil);
                tv_hasil.setText(Shasil);
                Toast.makeText(getActivity(),"Menghitung Hasil Di Tekan",Toast.LENGTH_SHORT).show();
            }
        });
        return fragmentView;
    }

}
