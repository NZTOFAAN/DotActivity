package com.nztofaanapps.dotactivity;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.net.*;
import android.text.method.*;
import android.view.View.*;
import android.view.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		String fileName="video";
		String file="android.resource://" + getPackageName() + "/raw/"+fileName;
		
		final VideoView mVideoView=(VideoView) findViewById(R.id.mainVideoView);
		mVideoView.setVideoURI(Uri.parse(file));
		mVideoView.start();
		
		mVideoView.getKeepScreenOn();
	mVideoView.setMediaController(new MediaController(this));
    }
}
