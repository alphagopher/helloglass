package com.aporter.helloglass;

//import android.accounts.Account;
//import android.accounts.AccountManager;
import android.app.Activity;
import android.os.Bundle;
import com.google.android.glass.app.Card;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		//AccountManager mAccountManager = AccountManager.get(this);
	    //Account[] accounts = mAccountManager.getAccountsByType(null);
		//accounts.toString();
		Card card = new Card(this);
		card.setText(R.string.text_main);
	    card.setFootnote(R.string.text_footer);
	    //setContentView(R.layout.activity_main);
		setContentView(card.toView());
	}

}
