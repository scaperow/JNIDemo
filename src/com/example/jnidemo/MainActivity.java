package com.example.jnidemo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {

	TextView text_message;
	Button button1;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		text_message = (TextView) findViewById(R.id.textview_message);
		button1 = (Button) findViewById(R.id.button1);
		button1.setOnClickListener(this);
		System.loadLibrary("sub");
	}



	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	public native String GetString();
	public native String GetCString();

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v == button1){
			//text_message.setText(GetString());	
			text_message.setText(GetCString());
		}
	}
}
