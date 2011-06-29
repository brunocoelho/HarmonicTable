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
  
        final Button start = (Button) findViewById(R.id.welcome_start);
  
        start.setOnClickListener(new View.OnClickListener() {  
            public void onClick(View v) {  
                finish();  
            }  
        });
        
        final Button credits = (Button) findViewById(R.id.welcome_credits);
        
        credits.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				setContentView(R.layout.creditos);
			}
		});
    }  
}