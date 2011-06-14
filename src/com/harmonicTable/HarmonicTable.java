package com.harmonicTable;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class HarmonicTable extends Activity {
    
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.main);
        
        ImageView image = (ImageView) findViewById(R.id.L1H1);
        image.setOnClickListener(imageListener);
    }
	
	private OnClickListener imageListener = new OnClickListener() {
	    public void onClick(View image) {
			String saida = "Entrou aqui: ID da view = " + image.getId();
			Log.e("BRUNO COELHO", saida);
			image.setVisibility(4);
	    }
	};
}
