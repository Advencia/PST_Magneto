package com.example.magneto;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class InscriptionActivity extends Activity{
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inscription);
        
        Button enregistrementButton  = (Button) findViewById(R.id.buttonInscription1);
		enregistrementButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//EditText mdp1 = (EditText) findViewById(R.id.editTextInscription3);
				//EditText mdp2 = (EditText) findViewById(R.id.editTextInscription4);
				
				//if(mdp1 == mdp2) {
					Intent intent = new Intent(InscriptionActivity.this, HomeActivity.class);
					startActivity(intent);
				//}
				//else {
					//Toast.makeText(getApplicationContext(), "mot de passe different", Toast.LENGTH_LONG).show();
			//	}
				}
		});
        
    } 

}
