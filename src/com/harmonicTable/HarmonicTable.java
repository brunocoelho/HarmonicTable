package com.harmonicTable;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class HarmonicTable extends Activity {

	public int idComand;
	public boolean functionClicked;
	public boolean empty;
	public List<Integer> ids;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		this.setContentView(R.layout.main);

		this.idComand = 0;
		this.functionClicked = false;
		this.empty = true;
		this.ids = new ArrayList<Integer>();

		this.loadListener();
	}

	public void loadListener(){

		ImageView image1 = (ImageView) findViewById(R.id.L1H1);
		image1.setOnClickListener(this.imageListener);
		ImageView image2 = (ImageView) findViewById(R.id.L1H2);
		image2.setOnClickListener(this.imageListener);
		ImageView image3 = (ImageView) findViewById(R.id.L1H3);
		image3.setOnClickListener(this.imageListener);
		ImageView image4 = (ImageView) findViewById(R.id.L1H4);
		image4.setOnClickListener(this.imageListener);
		ImageView image5 = (ImageView) findViewById(R.id.L1H5);
		image5.setOnClickListener(this.imageListener);
		ImageView image7 = (ImageView) findViewById(R.id.L2H1);
		image7.setOnClickListener(this.imageListener);
		ImageView image8 = (ImageView) findViewById(R.id.L2H2);
		image8.setOnClickListener(this.imageListener);
		ImageView image9 = (ImageView) findViewById(R.id.L2H3);
		image9.setOnClickListener(this.imageListener);
		ImageView image10 = (ImageView) findViewById(R.id.L2H4);
		image10.setOnClickListener(this.imageListener);
		ImageView image11 = (ImageView) findViewById(R.id.L2H5);
		image11.setOnClickListener(this.imageListener);
		ImageView image12 = (ImageView) findViewById(R.id.L2H6);
		image12.setOnClickListener(this.imageListener);
		ImageView image13 = (ImageView) findViewById(R.id.L3H1);
		image13.setOnClickListener(this.imageListener);
		ImageView image14 = (ImageView) findViewById(R.id.L3H2);
		image14.setOnClickListener(this.imageListener);
		ImageView image15 = (ImageView) findViewById(R.id.L3H3);
		image15.setOnClickListener(this.imageListener);
		ImageView image16 = (ImageView) findViewById(R.id.L3H4);
		image16.setOnClickListener(this.imageListener);
		ImageView image17 = (ImageView) findViewById(R.id.L3H5);
		image17.setOnClickListener(this.imageListener);
		ImageView image19 = (ImageView) findViewById(R.id.L4H1);
		image19.setOnClickListener(this.imageListener);
		ImageView image20 = (ImageView) findViewById(R.id.L4H2);
		image20.setOnClickListener(this.imageListener);
		ImageView image21 = (ImageView) findViewById(R.id.L4H3);
		image21.setOnClickListener(this.imageListener);
		ImageView image22 = (ImageView) findViewById(R.id.L4H4);
		image22.setOnClickListener(this.imageListener);
		ImageView image23 = (ImageView) findViewById(R.id.L4H5);
		image23.setOnClickListener(this.imageListener);
		ImageView image24 = (ImageView) findViewById(R.id.L4H6);
		image24.setOnClickListener(this.imageListener);
		ImageView image25 = (ImageView) findViewById(R.id.L5H1);
		image25.setOnClickListener(this.imageListener);
		ImageView image26 = (ImageView) findViewById(R.id.L5H2);
		image26.setOnClickListener(this.imageListener);
		ImageView image27 = (ImageView) findViewById(R.id.L5H3);
		image27.setOnClickListener(this.imageListener);
		ImageView image28 = (ImageView) findViewById(R.id.L5H4);
		image28.setOnClickListener(this.imageListener);
		ImageView image29 = (ImageView) findViewById(R.id.L5H5);
		image29.setOnClickListener(this.imageListener);
		ImageView image31 = (ImageView) findViewById(R.id.L6H1);
		image31.setOnClickListener(this.imageListener);
		ImageView image32 = (ImageView) findViewById(R.id.L6H2);
		image32.setOnClickListener(this.imageListener);
		ImageView image33 = (ImageView) findViewById(R.id.L6H3);
		image33.setOnClickListener(this.imageListener);
		ImageView image34 = (ImageView) findViewById(R.id.L6H4);
		image34.setOnClickListener(this.imageListener);
		ImageView image35 = (ImageView) findViewById(R.id.L6H5);
		image35.setOnClickListener(this.imageListener);
		ImageView image36 = (ImageView) findViewById(R.id.L6H6);
		image36.setOnClickListener(this.imageListener);
		ImageView image37 = (ImageView) findViewById(R.id.L7H1);
		image37.setOnClickListener(this.imageListener);
		ImageView image38 = (ImageView) findViewById(R.id.L7H2);
		image38.setOnClickListener(this.imageListener);
		ImageView image39 = (ImageView) findViewById(R.id.L7H3);
		image39.setOnClickListener(this.imageListener);
		ImageView image40 = (ImageView) findViewById(R.id.L7H4);
		image40.setOnClickListener(this.imageListener);
		ImageView image41 = (ImageView) findViewById(R.id.L7H5);
		image41.setOnClickListener(this.imageListener);
		ImageView image43 = (ImageView) findViewById(R.id.L8H1);
		image43.setOnClickListener(this.imageListener);
		ImageView image44 = (ImageView) findViewById(R.id.L8H2);
		image44.setOnClickListener(this.imageListener);
		ImageView image45 = (ImageView) findViewById(R.id.L8H3);
		image45.setOnClickListener(this.imageListener);
		ImageView image46 = (ImageView) findViewById(R.id.L8H4);
		image46.setOnClickListener(this.imageListener);
		ImageView image47 = (ImageView) findViewById(R.id.L8H5);
		image47.setOnClickListener(this.imageListener);
		ImageView image48 = (ImageView) findViewById(R.id.L8H6);
		image48.setOnClickListener(this.imageListener);
		ImageView image49 = (ImageView) findViewById(R.id.L9H1);
		image49.setOnClickListener(this.imageListener);
		ImageView image50 = (ImageView) findViewById(R.id.L9H2);
		image50.setOnClickListener(this.imageListener);
		ImageView image51 = (ImageView) findViewById(R.id.L9H3);
		image51.setOnClickListener(this.imageListener);
		ImageView image52 = (ImageView) findViewById(R.id.L9H4);
		image52.setOnClickListener(this.imageListener);
		ImageView image53 = (ImageView) findViewById(R.id.L9H5);
		image53.setOnClickListener(this.imageListener);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.layout.menu, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {

		this.idComand = item.getItemId();

		if(this.idComand == R.id.play)
			this.play();

		else if(this.idComand == R.id.stop)
			this.stop();

		else
			this.functionClicked = true;

		return true;
	}

	private OnClickListener imageListener = new OnClickListener() {
		public void onClick(View image) {

			if(functionClicked){
				ImageView temp = (ImageView) image;

				switch(idComand){
				
					case R.id.norte:
						temp.setImageResource(R.drawable.norte);
						break;
					
					case R.id.sul:
						temp.setImageResource(R.drawable.sul);
						break;
						
					case R.id.nordeste:
						temp.setImageResource(R.drawable.nordeste);
						break;
						
					case R.id.sudeste:
						temp.setImageResource(R.drawable.sudeste);
						break;
					
					case R.id.noroeste:
						temp.setImageResource(R.drawable.noroeste);
						break;
					
					case R.id.sudoeste:
						temp.setImageResource(R.drawable.sudoeste);
						break;
					
					default:
						Log.e("BRUNO COELHO", "Entrou no default");
						
				}
				ids.add(idComand);
				Log.i("BRUNO COELHO", "Configuração das funções: " + ids.toString());
				functionClicked = false;
			}
			// se nenhuma função foi escolhida, toda a nota do hexagono.
			else{
				Log.v("BRUNO COELHO", "Entrou no ELSE");
				int id = image.getId();
				switch(id){
					case R.id.L1H1:
						Log.v("COELHO", "click no hexa 1");
						break;
					case R.id.L1H2:
						Log.v("COELHO", "click no hexa 2");
						break;
					case R.id.L1H3:
						Log.v("COELHO", "click no hexa 3");
						break;
					case R.id.L1H4:
						Log.v("COELHO", "click no hexa 4");
						break;
					case R.id.L1H5:
						Log.v("COELHO", "click no hexa 5");
						break;
					case R.id.L2H1:
						break;
					case R.id.L2H2:
						break;
					case R.id.L2H3:
						break;
					case R.id.L2H4:
						break;
					case R.id.L2H5:
						break;
					case R.id.L2H6:
						break;
					case R.id.L3H1:
						break;
					case R.id.L3H2:
						break;
					case R.id.L3H3:
						break;
					case R.id.L3H4:
						break;
					case R.id.L3H5:
						break;
					case R.id.L4H1:
						break;
					case R.id.L4H2:
						break;
					case R.id.L4H3:
						break;
					case R.id.L4H4:
						break;
					case R.id.L4H5:
						break;
					case R.id.L4H6:
						break;
					case R.id.L5H1:
						break;
					case R.id.L5H2:
						break;
					case R.id.L5H3:
						break;
					case R.id.L5H4:
						break;
					case R.id.L5H5:
						break;
					case R.id.L6H1:
						break;
					case R.id.L6H2:
						break;
					case R.id.L6H3:
						break;
					case R.id.L6H4:
						break;
					case R.id.L6H5:
						break;
					case R.id.L6H6:
						break;
					case R.id.L7H1:
						break;
					case R.id.L7H2:
						break;
					case R.id.L7H3:
						break;
					case R.id.L7H4:
						break;
					case R.id.L7H5:
						break;
					case R.id.L8H1:
						break;
					case R.id.L8H2:
						break;
					case R.id.L8H3:
						break;
					case R.id.L8H4:
						break;
					case R.id.L8H5:
						break;
					case R.id.L8H6:
						break;
					case R.id.L9H1:
						break;
					case R.id.L9H2:
						break;
					case R.id.L9H3:
						break;
					case R.id.L9H4:
						break;
					case R.id.L9H5:
						break;
				}
				/*String saida = "Entrou aqui: ID da view = " + image.getId();
				Log.e("BRUNO COELHO", saida);
				//image.setVisibility(4);
				// Toolkit.getDefaultToolkit().getImage(URL or file path);
				Drawable newImage = Drawable.createFromPath("./res/drawable-mdpi/hexagono");
				if(newImage == null)
					Log.v("BRUNO COELHO", "IMAGEM EH NULL");

				Log.e("BRUNO COELHO", "Imagem" + newImage.toString());
				image.setBackgroundDrawable(newImage);*/
			}
		}
	};

	private void play(){

		if(!this.ids.isEmpty()){
			Log.d("BRUNO COELHO", "Entrou no PLAY");
		}
	}

	private void stop(){

		if(!this.ids.isEmpty()){
			this.ids.clear();
			Log.d("BRUNO COELHO", "Entrou no STOP");
		}
	}
}