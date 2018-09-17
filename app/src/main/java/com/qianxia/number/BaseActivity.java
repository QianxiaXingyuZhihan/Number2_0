package com.qianxia.number;
import android.app.*;
import android.os.*;

public class BaseActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		ActionBar actionBar = getActionBar();
		if (actionBar != null) {
			actionBar.hide();
		}
	}
	
}
