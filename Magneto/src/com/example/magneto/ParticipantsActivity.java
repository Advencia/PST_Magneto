package com.example.magneto;

import android.os.Bundle;
import android.app.Activity;
import android.widget.ArrayAdapter;  
import android.widget.ListView;  

public class ParticipantsActivity extends Activity {
	@Override
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
     
	}
}
