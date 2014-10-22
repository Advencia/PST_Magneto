package com.example.onglet;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class frag2_Interface extends Fragment { 
	    private String name; 
	    private int id;     

	    public frag2_Interface(String name, int id) { 
	        super();         
	        this.name = name;
	        this.id = id;
	    }
	   
	    @Override 
	    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) { 
	        // Inflate the layout for this fragment 
	        return inflater.inflate( R.layout.frag2, container, false); 
	    }     

	     public String getName() { 
	        return name;
	    } 
}

