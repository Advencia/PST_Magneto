package com.example.magneto;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.ActionBar.TabListener;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
//import android.widget.Toast;


public class HomeActivity extends Activity implements TabListener {
	
	private GalaActivity frag1 = new GalaActivity("Gala", 1);
	private ProfilActivity frag2 = new ProfilActivity("Profil", 2); 
	private ParticipantsActivity frag3 = new ParticipantsActivity("Participants", 3); 
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
		setContentView(R.layout.home);

	//Configuration de la barre d'onglet       
    getActionBar().setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);       
    getActionBar().addTab(getActionBar().newTab().setText(frag1.getName()).setTabListener(this));         
    getActionBar().addTab(getActionBar().newTab().setText(frag2.getName()).setTabListener(this));  
    getActionBar().addTab(getActionBar().newTab().setText(frag3.getName()).setTabListener(this));  
	}
		
	@Override 
	public void onTabSelected(Tab tab, android.app.FragmentTransaction ft) {
		//Toast.makeText(this, tab.getText() + " selected", Toast.LENGTH_SHORT).show();       

	      if(tab.getText().equals(frag1.getName())){              
	         ft.replace(R.id.fragmentContainer, frag1);
	      }
	      else if(tab.getText().equals(frag2.getName())){
	         ft.replace(R.id.fragmentContainer, frag2);
	      }
	      else if(tab.getText().equals(frag3.getName())){ 
	         ft.replace(R.id.fragmentContainer, frag3);
	      }
	 } 

	@Override
	public void onTabUnselected(Tab tab, android.app.FragmentTransaction ft) {
	     // Toast.makeText(this, tab.getText() + " unselected", Toast.LENGTH_SHORT).show();       

	      if(tab.getText().equals(frag1.getName())){
	         ft.remove(frag1);
	      }
	      else if(tab.getText().equals(frag2.getName())){
	         ft.remove(frag2);
	      }
	      else if(tab.getText().equals(frag3.getName())){
	         ft.remove(frag3);
	      }
	} 
	
	@Override
	public void onTabReselected(Tab tab, android.app.FragmentTransaction ft) {
	     // Toast.makeText(this, tab.getText() + " unselected", Toast.LENGTH_SHORT).show();
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
	
