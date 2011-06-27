package com.harmonicTable;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.Toast;

public class HarmonicTable extends Activity {
    
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        this.setContentView(R.layout.main);
        
        ImageView image = (ImageView) findViewById(R.id.L1H1);
        image.setOnClickListener(this.imageListener);
    }
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
	    MenuInflater inflater = getMenuInflater();
	    inflater.inflate(R.layout.menu, menu);
	    return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    
		switch (item.getItemId()) {
	        case R.id.icon:     
	        	Toast.makeText(this, "You pressed the icon!", Toast.LENGTH_LONG).show();
	        	break;
	        
	        case R.id.text:     
	        	Toast.makeText(this, "You pressed the text!", Toast.LENGTH_LONG).show();
	        	break;
	       
	        case R.id.icontext: 
	        	Toast.makeText(this, "You pressed the icon and text!", Toast.LENGTH_LONG).show();
	        	break;
	        
	        default:
	        	Log.v("BRUNO COELHO", "ENTROU NO DEFAULT DO SWITCH");
	    }
	    return true;
	}
	
	private OnClickListener imageListener = new OnClickListener() {
	    public void onClick(View image) {
			/*String saida = "Entrou aqui: ID da view = " + image.getId();
			Log.e("BRUNO COELHO", saida);
			//image.setVisibility(4);
			// Toolkit.getDefaultToolkit().getImage(URL or file path);
			Drawable newImage = Drawable.createFromPath("./hexagono");
			if(newImage == null)
				Log.v("BRUNO COELHO", "IMAGEM EH NULL");
			
			Log.e("BRUNO COELHO", "Imagem" + newImage.toString());
			image.setBackgroundDrawable(newImage);*/
	    }
	};
}
