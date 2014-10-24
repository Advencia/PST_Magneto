package com.example.magneto;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ParticipantsActivity extends Fragment {
	 private String name; 
	    
	    public ParticipantsActivity(String name, int id) { 
	        super();         
	        this.name = name;
	    }
	   
	    @Override 
	    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) { 
	        // Inflate the layout for this fragment 

	        return inflater.inflate( R.layout.participants_frag, container, false); 


	    }     

	     public String getName() { 
	        return name;
	    } 
	
	/*@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gala_frag);
        
        //recupere list view du fichier xml
       ListView list = (ListView) findViewById(R.id.listParticipants);
       
       //Defini les valeurs de la liste
       String[] values = new String[] { "Zack Soudi", 
               "Wendy Doan",
               "Eray Kaya",
               "Pierre Coanet", 
               "Alexis Rousset", 
               "Marine Mesnage", 
               "Maxime Perrault"
              };
       //creation de Adapter
       ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, values);
     
       // Assigne adapter à ListView
       list.setAdapter(adapter); 
     
	}*/
}
