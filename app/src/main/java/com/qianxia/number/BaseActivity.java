package com.qianxia.number;
import android.app.*;
import android.os.*;
import android.content.pm.*;
import android.media.*;

public class BaseActivity extends Activity {

	protected MediaPlayer player = new MediaPlayer();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		ActionBar actionBar = getActionBar();
		if (actionBar != null) {
			actionBar.hide();
		}
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
	}

	@Override
	protected void onPause() {
		player.pause();
		super.onPause();
	}

	@Override
	protected void onResume() {
		player.start();
		super.onResume();
	}
    
	@Override
	protected void onDestroy() {
		player.stop();
		super.onDestroy();
	}
	
}
