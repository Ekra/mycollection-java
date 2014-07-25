package com.example.listadapter;


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

public class Operations extends ActionBarActivity implements OnClickListener {
	
	EditText etoperno1, etoperno2;
	TextView tvoperesult;
	String stroperno1,stroperno2;
	Button opbtn_add, opbtn_sub;
	
	Calculation calc;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.operations);
		
		
		
		etoperno1 = (EditText) findViewById(R.id.et_num1);
		etoperno2 = (EditText) findViewById(R.id.et_num2);
		
		tvoperesult = (TextView) findViewById(R.id.tv_result);
	
		
		opbtn_add = (Button) findViewById(R.id.opbtn_add);
		opbtn_add.setOnClickListener(this);
		opbtn_sub = (Button) findViewById(R.id.opbtn_sub);
		opbtn_sub.setOnClickListener(this);
		

		}


	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.opbtn_add:
			stroperno1= etoperno1.getText().toString();
			stroperno2 = etoperno2.getText().toString();
			
			
			int addone = Integer.parseInt(stroperno1);
			int addtwo = Integer.parseInt(stroperno2);
			int ansadd = calc.addition(addone, addtwo);
			
			String resultadd =String.valueOf(ansadd);
			tvoperesult.setText(resultadd);
			
			
		
			
			break;
		case R.id.opbtn_sub:
			stroperno1 = etoperno2.getText().toString();
			stroperno2 = etoperno2.getText().toString();
			
			int subone = Integer.parseInt(stroperno1);
			int subtwo = Integer.parseInt(stroperno2);
			int anssub = calc.subtraction(subone, subtwo);
			
			String resultsub = String.valueOf(anssub);
			tvoperesult.setText(resultsub);
			

		default:
			break;
		}
		
	}
	}

