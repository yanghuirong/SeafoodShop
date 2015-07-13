package com.example.seafoodshop;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class seafoodAdapter extends ArrayAdapter<seafood>{
	private int resourceId;
	public seafoodAdapter(Context context, int textViewResourceId, List<seafood> objects){
//		￼public seafoodAdapter(Context context, int textViewResourceId,
//				List<seafood> objects) {
		super(context, textViewResourceId, objects);
		resourceId = textViewResourceId;
	}
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		seafood Seafood = getItem(position); // 获取当前项的Fruit实例
		View view = LayoutInflater.from(getContext()).inflate(resourceId, null);  
		TextView seafoodName = (TextView) view.findViewById(R.id.seafood_name); 
		TextView seafoodPrice = (TextView) view.findViewById(R.id.seafood_price); 
		seafoodName.setText(Seafood.getName());
		seafoodPrice.setText(Seafood.getPrice());
		return view;
	}
}
