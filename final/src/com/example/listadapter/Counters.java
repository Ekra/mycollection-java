package com.example.listadapter;

import android.R.integer;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Build;

public class Counters extends ActionBarActivity implements OnClickListener {
	EditText etsinglenum;
	String stretsinglenum;
	TextView tv_result;
	
	
	Button btn_increament,btn_decreament;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.counters);
		
		etsinglenum = (EditText) findViewById(R.id.etcounter_number);
		tv_result =(TextView) findViewById(R.id.tv_result);
		btn_increament = (Button) findViewById(R.id.btn_increament);
		btn_increament.setOnClickListener(this);
		
		btn_decreament = (Button) findViewById(R.id.btn_decreament);
		btn_decreament.setOnClickListener(this);


		}

	@Override
	public void onClick(View v) {
		
		int value = 0;
		switch (v.getId()) {
		case R.id.btn_increament:
			value = Integer.parseInt(etsinglenum.getText().toString());
			++value; 
			etsinglenum.setText("" + value); 
			tv_result.setText("The increment is:" + value); 
			break;
		case R.id.btn_decreament:
			value = Integer.parseInt(etsinglenum.getText().toString());
			--value;
			etsinglenum.setText("" + value); 
			tv_result.setText("The decrement is:" + value); 
			break;

		default:
			break;
		}
		
	}
	}

	