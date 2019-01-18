package com.qianxia.number;
import android.app.*;
import android.os.*;
import android.content.pm.*;

public class BaseActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		ActionBar actionBar = getActionBar();
		if (actionBar != null) {
			actionBar.hide();
		}
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
	}
	
}
