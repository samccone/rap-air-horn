package com.example.rapairhorn;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		AudioManager audioManager = (AudioManager)getSystemService(Context.AUDIO_SERVICE);
		audioManager.setStreamVolume(AudioManager.STREAM_MUSIC, audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC), 0);
		Button btn1 = (Button)findViewById(R.id.button1);	
		btn1.setSoundEffectsEnabled(false);
		
		btn1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				final MediaPlayer mp1 = MediaPlayer.create(getBaseContext(), R.raw.rap_air_horn);  
		        mp1.start();
			}
		});
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
