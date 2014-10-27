package com.example.magneto;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
 
public class GalaActivity extends Fragment {
 
	 private String name; 
	    
	    public GalaActivity(String name, int id) { 
	        super();         
	        this.name = name;
	    }
	   
	    @Override 
	    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) { 
	        // Inflate the layout for this fragment 

	        return inflater.inflate( R.layout.gala_frag, container, false); 
	    }     

	     public String getName() { 
	        return name;
	    } 
}