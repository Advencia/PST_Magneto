package com.example.magneto;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;


public class HomeActivity extends Activity {
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        
        TabHost tabHost = (TabHost)findViewById(android.R.id.tabhost);


        TabSpec tab1 = tabHost.newTabSpec("First Tab");
        TabSpec tab2 = tabHost.newTabSpec("Second Tab");
        TabSpec tab3 = tabHost.newTabSpec("Third tab");

       // Set the Tab name and Activity
       // that will be opened when particular Tab will be selected
        tab1.setIndicator("Gala");
        tab1.setContent(new Intent(this,GalaActivity.class));
       
        tab2.setIndicator("Profil");
        tab2.setContent(new Intent(this,ProfilActivity.class));

        tab3.setIndicator("Participants");
        tab3.setContent(new Intent(this,ParticipantsActivity.class));
       
        /** Add the tabs  to the TabHost to display. */
        tabHost.addTab(tab1);
        tabHost.addTab(tab2);
        tabHost.addTab(tab3);

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
