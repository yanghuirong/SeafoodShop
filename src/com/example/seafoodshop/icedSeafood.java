package com.example.seafoodshop;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.app.Activity;
import android.content.Intent;

public class icedSeafood extends Activity {
    private List<seafood> seafoodList = new ArrayList<seafood>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.icedseafood_layout);
		initSeafoods();//相当于getdata
		Button iced_button1 = (Button) findViewById(R.id.iced_button_1);

		iced_button1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(icedSeafood.this,
						homePage.class);
				startActivity(intent);
			}
		});
		seafoodAdapter adapter = new seafoodAdapter(icedSeafood.this,
			    R.layout.seafood_item, seafoodList);
		ListView listView = (ListView) findViewById(R.id.list_view_icedseafood);
		listView.setAdapter(adapter);
	}
	private void initSeafoods() {
		seafood apple = new seafood("Apple", "11"); 
		seafoodList.add(apple);
		seafood banana = new seafood("lobster", "22"); 
		seafoodList.add(banana);
		}
}
