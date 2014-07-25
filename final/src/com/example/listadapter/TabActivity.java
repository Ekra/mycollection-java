package com.example.listadapter;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.os.Build;

public class TabActivity extends android.app.TabActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tab);
		
		
				TabHost tabhost= getTabHost();
				Resources resources = getResources();
				
				Intent homeActivity=new Intent().setClass(getApplicationContext(),HomeActivity.class);
				TabSpec hometabspec= tabhost.newTabSpec("Home").setIndicator("Home",resources.getDrawable(R.drawable.ic_launcher))//setting UI for a specific tab
		        .setContent(homeActivity);
		        
		        
		        Intent contactsActivity=new Intent().setClass(getApplicationContext(),ContactActivity.class);
				TabSpec contactstabspec= tabhost.newTabSpec("Contact").setIndicator("Contact",resources.getDrawable(R.drawable.ic_launcher))//setting UI for a specific tab
		        .setContent(contactsActivity);
				
				Intent aboutActivity= new Intent().setClass(getApplicationContext(),AboutActivity.class);
				TabSpec abouttabspec=tabhost.newTabSpec("About").setIndicator("About",resources.getDrawable(R.drawable.ic_launcher))
						.setContent(aboutActivity);
				
				tabhost.addTab(contactstabspec);
				tabhost.addTab(hometabspec);
				tabhost.addTab(abouttabspec);

		
		}

}

	