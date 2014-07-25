package com.example.listadapter;

import java.util.ArrayList;
import java.util.Arrays;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;

public class ListActivity extends ActionBarActivity implements
		OnItemClickListener {

	String[] listArray = { "Operations", "Login", "Counters", "Countries","tabs Activity","call screen" };

	private ListView generaListView;

	private ArrayAdapter arrayAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.listscreen);

		generaListView = (ListView) findViewById(R.id.list_View);

		// ArrayList<String> array = new ArrayList<>();
		// array.addAll(Arrays.asList(listArray));

		arrayAdapter = new ArrayAdapter(this,
				android.R.layout.simple_list_item_1, listArray);
		Toast.makeText(getApplicationContext(), "It works", Toast.LENGTH_LONG)
				.show();
		generaListView.setAdapter(arrayAdapter);
		generaListView.setOnItemClickListener(this);
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id) {
		String listArray = generaListView.getItemAtPosition(position)
				.toString();
		switch (position) {
		case 0:
			startActivity(new Intent(getApplicationContext(), Operations.class));
			break;

		case 1:
			startActivity(new Intent(getApplicationContext(), Loginscreen.class));
			break;

		case 2:
			startActivity(new Intent(getApplicationContext(), Counters.class));
			break;

		case 3:
			startActivity(new Intent(getApplicationContext(), Countries.class));
			break;
		case 4:
			startActivity(new Intent(getApplicationContext(),TabActivity.class));
			break;
		case 5:
			startActivity(new Intent(getApplicationContext(),CallActivity.class));
			break;


		default:
			break;
		}
	}

}
