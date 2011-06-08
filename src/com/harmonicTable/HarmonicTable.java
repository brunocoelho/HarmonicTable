package com.harmonicTable;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HarmonicTable extends Activity {
    /** Called when the activity is first created. */
    
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // Use method "findViewById" to interact (retrieve) with Views from resources.
        // Button button = (Button) findViewById(R.id.button_id);
      
        setContentView(R.layout.main);
    
    }
	
	/**
	 * 
	 * @param The view that was clicked.
	 * @references: http://developer.android.com/guide/topics/media/index.html
	 */
	public void buttonClick(View view){
		int height = view.getHeight();
		TextView tx = (TextView) findViewById(R.id.textview);
		tx.setText("The height of the button is: " + height);
		
		
	}
}