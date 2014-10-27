package com.example.magneto;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
 
public class ProfilActivity extends Fragment {
 
	 private String name; 
	    
	    public ProfilActivity(String name, int id) { 
	        super();         
	        this.name = name;
	    }
	   
	    @Override 
	    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) { 
	        // Inflate the layout for this fragment 

	        return inflater.inflate( R.layout.profil_frag, container, false); 


	    } 
	    
	   /* Button modifButton  = (Button) findViewById(R.id.imageButton_editProfil);
		enregistrementButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
			
					Intent intent = new Intent(ProfilActivity.this, ModificationProfilActivity.class);
					startActivity(intent);
			
				}
		});	*/

	     public String getName() { 
	        return name;
	    } 
}
