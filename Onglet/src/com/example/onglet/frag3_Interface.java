package com.example.onglet;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class frag3_Interface extends Fragment {
	private String name;    

    public frag3_Interface(String name, int id) { 
        super();         
        this.name = name;
    }
   
    @Override 
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) { 
        // Inflate the layout for this fragment 
        return inflater.inflate(R.layout.frag3, container, false); 
    }     

     public String getName() { 
        return name;
    } 
}
