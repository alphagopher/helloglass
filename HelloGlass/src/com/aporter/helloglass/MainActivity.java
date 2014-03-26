package com.aporter.helloglass;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.google.android.glass.app.Card;

public class MainActivity extends Activity {

	
	private static final String TAG = "HelloGlass";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		try {
			
			Card card = new Card(this);
			card.setText(R.string.text_main);
		    card.setFootnote(R.string.text_footer);
		    
			setContentView(card.toView());

		} catch (Exception e) {
			
			Log.d(TAG, e.getMessage());
			System.exit(0);
		}

	}

}
