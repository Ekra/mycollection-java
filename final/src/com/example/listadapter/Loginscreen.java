package com.example.listadapter;



import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.Toast;
import android.os.Build;

public class Loginscreen extends ActionBarActivity implements OnClickListener {
	
	EditText etusername, etpassword;
	String stretusername, stretpassword;
	
	Button btnback;
	CheckBox cb;
	  
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.loginscreen);
		cb = (CheckBox) findViewById(R.id.cblog);
		cb.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				if (!isChecked) {
					etpassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
					
				}else{
					etpassword.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
					
				}
			
				
			}
		});
		
		etusername = (EditText) findViewById(R.id.etlog_username);
		etpassword = (EditText) findViewById(R.id.etlog_pwd);
		
		btnback = (Button) findViewById(R.id.btnlog_back);
		btnback.setOnClickListener(this);
		
		
		}



	@Override
	public void onClick(View v) {
		StringBuffer result = new StringBuffer();
		result.append("cb check").append(cb.isChecked());
		Toast.makeText(getApplicationContext(), "password error", Toast.LENGTH_LONG).show();
		switch (v.getId()) {
		case R.id.btnlog_back:
			startActivity(new Intent(getApplicationContext(),ListActivity.class));
			break;

		default:
			break;
		}
		
	}
	}

	