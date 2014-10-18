package com.example.magneto;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.app.Activity;

public class HomeActivity extends TabActivity{
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        
        TabHost tabHost = getTabHost();
        
        // Tab for Gala
        TabSpec galaspec = tabHost.newTabSpec("Gala");
        // setting Title and Icon for the Tab
        //photospec.setIndicator("Gala", getResources().getDrawable(R.drawable.icon_photos_tab));
        Intent GalaIntent = new Intent(this, GalaActivity.class);
        galaspec.setContent(GalaIntent);
         
        // Tab for Songs
        TabSpec profilspec = tabHost.newTabSpec("Profil");       
        //songspec.setIndicator("Songs", getResources().getDrawable(R.drawable.icon_songs_tab));
        Intent ProfilIntent = new Intent(this, ProfilActivity.class);
        profilspec.setContent(ProfilIntent);
         
        // Tab for Videos
        TabSpec infosspec = tabHost.newTabSpec("Infos");
        //infosspec.setIndicator("Videos", getResources().getDrawable(R.drawable.icon_videos_tab));
        Intent InfosIntent = new Intent(this, InfosActivity.class);
        infosspec.setContent(InfosIntent);
         
        // Adding all TabSpec to TabHost
        tabHost.addTab(galaspec); // Adding photos tab
        tabHost.addTab(profilspec); // Adding songs tab
        tabHost.addTab(infosspec); // Adding videos tab
    }

	/*private TabHost getTabHost() {
		// TODO Auto-generated method stub
		return null;
	}   */
}
