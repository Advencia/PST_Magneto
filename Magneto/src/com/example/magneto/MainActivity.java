package com.example.magneto;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		//Bouton d'inscription
				final Button loginButton = (Button) findViewById(R.id.button2);
				  loginButton.setOnClickListener(new View.OnClickListener() {

				  public void onClick(View v) {
					Intent intent = new Intent(MainActivity.this, InscriptionActivity.class);
					startActivity(intent);
					}
				});
				  
				//Bouton de connexion
				Button connexionButton  = (Button) findViewById(R.id.button1);
				connexionButton.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						Toast.makeText(getApplicationContext(), "bouh", Toast.LENGTH_LONG).show();
						Intent intent = new Intent(MainActivity.this, HomeActivity.class);
						startActivity(intent);
					}
				});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
