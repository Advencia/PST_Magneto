package com.example.magneto;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class ModificationProfilActivity extends Activity{
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modification_profil); 
        
        Button enregistrementButton  = (Button) findViewById(R.id.buttonInscription1);
		enregistrementButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
			
					Intent intent = new Intent(ModificationProfilActivity.this, ProfilActivity.class);
					startActivity(intent);
			
				}
		});
        
    } 
}
