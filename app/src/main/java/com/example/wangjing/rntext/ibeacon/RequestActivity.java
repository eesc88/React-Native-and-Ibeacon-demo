package com.example.wangjing.rntext.ibeacon;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.wangjing.rntext.R;

public class RequestActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		setContentView(R.layout.activity_request);
		super.onCreate(savedInstanceState);
		init();
	}

	private void init() {
		String string = getIntent().getExtras().getString("string");
		
		TextView tv = (TextView) findViewById(R.id.tv_request);
		
		tv.setText(string);
	}
}
