package com.harmonicTable;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Welcome extends Activity {  

	@Override  
    protected void onCreate(Bundle savedInstanceState) {  
        super.onCreate(savedInstanceState);  
        setContentView(R.layout.welcome);  
  
        Button start = (Button) findViewById(R.id.welcome_start);
  
        start.setOnClickListener(new View.OnClickListener() {  
            public void onClick(View v) {  
                finish();  
            }  
        });
        
        Button credits = (Button) findViewById(R.id.welcome_credits);
        
        credits.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				setContentView(R.layout.credits);
			}
		});
    }
	/*
	@Override
	public void onResume(){
		super.onResume();
		
		setContentView(R.layout.welcome);
	}*/
}