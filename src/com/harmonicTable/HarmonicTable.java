package com.harmonicTable;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class HarmonicTable extends Activity {
    /** Called when the activity is first created. */
    
	@Override
    public void onCreate(Bundle savedInstanceState) {
		System.out.println("ENTROU NO CONSTRUTOR");
        super.onCreate(savedInstanceState);
        
        // Use method "findViewById" to interact (retrieve) with Views from resources.
        // Button button = (Button) findViewById(R.id.button_id);
      
        setContentView(R.layout.main);
    }
	
	/**
	 * 
	 * @author Coelho
	 * @param The view that was clicked.
	 * @references: http://developer.android.com/guide/topics/media/index.html
	 */
	/*public void buttonClick(View view){
		int height = view.getHeight();
		TextView tx = (TextView) findViewById(R.id.textview);
		tx.setText("The height of the button is: " + height);
		
		<!--android:onClick="buttonClick"-->
	}*/
	
	/**
	 * 
	 * @author Coelho
	 */
	public void imageClick(View view){
		System.out.println("Entrou aqui: ID da view = " + view.getId());
		view.setBackgroundColor(000000);
		view.setVisibility(0);
		//Mudar a cor do hexágono qnd ele for clicado
		//Método que mudar a cor do ImageView -> XML (android:tint) 		Related Method (setColorFilter(int,PorterDuff.Mode))
	}
}
