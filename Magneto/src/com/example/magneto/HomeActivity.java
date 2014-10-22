package com.example.magneto;
import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;

public class HomeActivity extends Activity {
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.home);
        
        ActionBar actionBar = getActionBar();
        
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
 
        String label1 = getResources().getString(R.string.label1);
        Tab tab = actionBar.newTab();
        tab.setText(label1);
        TabListener<GalaActivity> tl = new TabListener<GalaActivity>(this,label1, GalaActivity.class);
        tab.setTabListener(tl);
        actionBar.addTab(tab);
 
        String label2 = getResources().getString(R.string.label2);
        tab = actionBar.newTab();
        tab.setText(label2);
        TabListener<ProfilActivity> tl2 = new TabListener<ProfilActivity>(this,
                label2, ProfilActivity.class);
        tab.setTabListener(tl2);
        actionBar.addTab(tab);
 
    }

	private class TabListener<T extends Fragment> implements ActionBar.TabListener {
		private Fragment mFragment;
		private final Activity mActivity;
		private final String mTag;
		private final Class<T> mClass;


	public TabListener(Activity activity, String tag, Class<T> clz) {
		mActivity = activity;
		mTag = tag;
		mClass = clz;
	}	
	
	public void onTabSelected(Tab tab, FragmentTransaction ft) {
		// Check if the fragment is already initialized
		if (mFragment == null) {
			// If not, instantiate and add it to the activity
			mFragment = Fragment.instantiate(mActivity, mClass.getName());
			ft.add(android.R.id.content, mFragment, mTag);
		}
		
		else {
			// If it exists, simply attach it in order to show it
			ft.attach(mFragment);
		}
}

	public void onTabUnselected(Tab tab, FragmentTransaction ft) {
		if (mFragment != null) {
			// Detach the fragment, because another one is being attached
			ft.detach(mFragment);
		}
	}

	public void onTabReselected(Tab tab, FragmentTransaction ft) {
		// User selected the already selected tab. Usually do nothing.
	}
}
}
	
