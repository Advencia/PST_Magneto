package com.example.magneto;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
 
public class ProfilActivity extends Fragment {
 
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        return (LinearLayout) inflater.inflate(R.layout.profil_frag, container, false);
    }
 
}
