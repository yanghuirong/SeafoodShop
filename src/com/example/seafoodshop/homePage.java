package com.example.seafoodshop;

import com.example.seafoodshop.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;


public class homePage extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.homepage_layout);
		Button button1 = (Button) findViewById(R.id.home_button_1);
		Button button2 = (Button) findViewById(R.id.home_button_2);
		Button button3 = (Button) findViewById(R.id.home_button_3);

		button1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(homePage.this,
						icedSeafood.class);
				startActivity(intent);
			}
		});
		
		button2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(homePage.this,
						freshSeafood.class);
				startActivity(intent);
			}
		});
		
		button3.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(homePage.this,
						drySeafood.class);
				startActivity(intent);
			}
		});
	}
}
