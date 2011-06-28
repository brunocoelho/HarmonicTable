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
	public ImageView image1,
					 image2,
					 image3,
					 image4,
					 image5,
					 image6,
					 image7,
					 image8,
					 image9,
					 image10,
					 image11,
					 image12,
					 image13,
					 image14,
					 image15,
					 image16,
					 image17,
					 image18,
					 image19,
					 image20,
					 image21,
					 image22,
					 image23,
					 image24,
					 image25,
					 image26,
					 image27,
					 image28,
					 image29,
					 image30,
					 image31,
					 image32,
					 image33,
					 image34,
				 	 image35,
					 image36,
					 image37,
					 image38,
					 image39,
					 image40,
					 image41,
					 image42,
					 image43,
					 image44,
					 image45,
					 image46,
					 image47,
					 image48,
					 image49,
					 image50,
					 image51,
					 image52,
					 image53;

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

		this.image1 = (ImageView) findViewById(R.id.L1H1);
		this.image1.setOnClickListener(this.imageListener);
		this.image2 = (ImageView) findViewById(R.id.L1H2);
		this.image2.setOnClickListener(this.imageListener);
		this.image3 = (ImageView) findViewById(R.id.L1H3);
		this.image3.setOnClickListener(this.imageListener);
		this.image4 = (ImageView) findViewById(R.id.L1H4);
		this.image4.setOnClickListener(this.imageListener);
		this.image5 = (ImageView) findViewById(R.id.L1H5);
		this.image5.setOnClickListener(this.imageListener);
		this.image6 = (ImageView) findViewById(R.id.L2H1);
		this.image6.setOnClickListener(this.imageListener);
		this.image7 = (ImageView) findViewById(R.id.L2H2);
		this.image7.setOnClickListener(this.imageListener);
		this.image8 = (ImageView) findViewById(R.id.L2H3);
		this.image8.setOnClickListener(this.imageListener);
		this.image9 = (ImageView) findViewById(R.id.L2H4);
		this.image9.setOnClickListener(this.imageListener);
		this.image10 = (ImageView) findViewById(R.id.L2H5);
		this.image10.setOnClickListener(this.imageListener);
		this.image11 = (ImageView) findViewById(R.id.L2H6);
		this.image11.setOnClickListener(this.imageListener);
		this.image12 = (ImageView) findViewById(R.id.L3H1);
		this.image12.setOnClickListener(this.imageListener);
		this.image13 = (ImageView) findViewById(R.id.L3H2);
		this.image13.setOnClickListener(this.imageListener);
		this.image14 = (ImageView) findViewById(R.id.L3H3);
		this.image14.setOnClickListener(this.imageListener);
		this.image15 = (ImageView) findViewById(R.id.L3H4);
		this.image15.setOnClickListener(this.imageListener);
		this.image16 = (ImageView) findViewById(R.id.L3H5);
		this.image16.setOnClickListener(this.imageListener);
		this.image17 = (ImageView) findViewById(R.id.L4H1);
		this.image17.setOnClickListener(this.imageListener);
		this.image18 = (ImageView) findViewById(R.id.L4H2);
		this.image18.setOnClickListener(this.imageListener);
		this.image19 = (ImageView) findViewById(R.id.L4H3);
		this.image19.setOnClickListener(this.imageListener);
		this.image20 = (ImageView) findViewById(R.id.L4H4);
		this.image20.setOnClickListener(this.imageListener);
		this.image21 = (ImageView) findViewById(R.id.L4H5);
		this.image21.setOnClickListener(this.imageListener);
		this.image22 = (ImageView) findViewById(R.id.L4H6);
		this.image22.setOnClickListener(this.imageListener);
		this.image23 = (ImageView) findViewById(R.id.L5H1);
		this.image23.setOnClickListener(this.imageListener);
		this.image24 = (ImageView) findViewById(R.id.L5H2);
		this.image24.setOnClickListener(this.imageListener);
		this.image25 = (ImageView) findViewById(R.id.L5H3);
		this.image25.setOnClickListener(this.imageListener);
		this.image26 = (ImageView) findViewById(R.id.L5H4);
		this.image26.setOnClickListener(this.imageListener);
		this.image27 = (ImageView) findViewById(R.id.L5H5);
		this.image27.setOnClickListener(this.imageListener);
		this.image28 = (ImageView) findViewById(R.id.L6H1);
		this.image28.setOnClickListener(this.imageListener);
		this.image29 = (ImageView) findViewById(R.id.L6H2);
		this.image29.setOnClickListener(this.imageListener);
		this.image30 = (ImageView) findViewById(R.id.L6H3);
		this.image30.setOnClickListener(this.imageListener);
		this.image31 = (ImageView) findViewById(R.id.L6H4);
		this.image31.setOnClickListener(this.imageListener);
		this.image32 = (ImageView) findViewById(R.id.L6H5);
		this.image32.setOnClickListener(this.imageListener);
		this.image33 = (ImageView) findViewById(R.id.L6H6);
		this.image33.setOnClickListener(this.imageListener);
		this.image34 = (ImageView) findViewById(R.id.L7H1);
		this.image34.setOnClickListener(this.imageListener);
		this.image35 = (ImageView) findViewById(R.id.L7H2);
		this.image35.setOnClickListener(this.imageListener);
		this.image36 = (ImageView) findViewById(R.id.L7H3);
		this.image36.setOnClickListener(this.imageListener);
		this.image37 = (ImageView) findViewById(R.id.L7H4);
		this.image37.setOnClickListener(this.imageListener);
		this.image38 = (ImageView) findViewById(R.id.L7H5);
		this.image38.setOnClickListener(this.imageListener);
		this.image39 = (ImageView) findViewById(R.id.L8H1);
		this.image39.setOnClickListener(this.imageListener);
		this.image40 = (ImageView) findViewById(R.id.L8H2);
		this.image40.setOnClickListener(this.imageListener);
		this.image41 = (ImageView) findViewById(R.id.L8H3);
		this.image41.setOnClickListener(this.imageListener);
		this.image42 = (ImageView) findViewById(R.id.L8H4);
		this.image42.setOnClickListener(this.imageListener);
		this.image43 = (ImageView) findViewById(R.id.L8H5);
		this.image43.setOnClickListener(this.imageListener);
		this.image44 = (ImageView) findViewById(R.id.L8H6);
		this.image44.setOnClickListener(this.imageListener);
		this.image45 = (ImageView) findViewById(R.id.L9H1);
		this.image45.setOnClickListener(this.imageListener);
		this.image46 = (ImageView) findViewById(R.id.L9H2);
		this.image46.setOnClickListener(this.imageListener);
		this.image47 = (ImageView) findViewById(R.id.L9H3);
		this.image47.setOnClickListener(this.imageListener);
		this.image48 = (ImageView) findViewById(R.id.L9H4);
		this.image48.setOnClickListener(this.imageListener);
		this.image49 = (ImageView) findViewById(R.id.L9H5);
		this.image49.setOnClickListener(this.imageListener);
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

	// Falta apenas colocar as orientações corretas.
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

	// Falta função do play.
	private void play(){

		if(!this.ids.isEmpty()){
			Log.d("BRUNO COELHO", "Entrou no PLAY");
		}
	}

	// Falta apenas parar de tocar o som.
	private void stop(){

		if(!this.ids.isEmpty()){
			this.ids.clear();
			Log.d("BRUNO COELHO", "Entrou no STOP");
			this.image1.setImageResource(R.drawable.hexablue);
			this.image2.setImageResource(R.drawable.hexablue);
			this.image3.setImageResource(R.drawable.hexablue);
			this.image4.setImageResource(R.drawable.hexablue);
			this.image5.setImageResource(R.drawable.hexablue);
			this.image6.setImageResource(R.drawable.hexablue);
			this.image7.setImageResource(R.drawable.hexablue);
			this.image8.setImageResource(R.drawable.hexablue);
			this.image9.setImageResource(R.drawable.hexablue);
			this.image10.setImageResource(R.drawable.hexablue);
			this.image11.setImageResource(R.drawable.hexablue);
			this.image12.setImageResource(R.drawable.hexablue);
			this.image13.setImageResource(R.drawable.hexablue);
			this.image14.setImageResource(R.drawable.hexablue);
			this.image15.setImageResource(R.drawable.hexablue);
			this.image16.setImageResource(R.drawable.hexablue);
			this.image17.setImageResource(R.drawable.hexablue);
			this.image18.setImageResource(R.drawable.hexablue);
			this.image19.setImageResource(R.drawable.hexablue);
			this.image20.setImageResource(R.drawable.hexablue);
			this.image21.setImageResource(R.drawable.hexablue);
			this.image22.setImageResource(R.drawable.hexablue);
			this.image23.setImageResource(R.drawable.hexablue);
			this.image24.setImageResource(R.drawable.hexablue);
			this.image25.setImageResource(R.drawable.hexablue);
			this.image26.setImageResource(R.drawable.hexablue);
			this.image27.setImageResource(R.drawable.hexablue);
			this.image28.setImageResource(R.drawable.hexablue);
			this.image29.setImageResource(R.drawable.hexablue);
			this.image30.setImageResource(R.drawable.hexablue);
			this.image31.setImageResource(R.drawable.hexablue);
			this.image32.setImageResource(R.drawable.hexablue);
			this.image33.setImageResource(R.drawable.hexablue);
			this.image34.setImageResource(R.drawable.hexablue);
			this.image35.setImageResource(R.drawable.hexablue);
			this.image36.setImageResource(R.drawable.hexablue);
			this.image37.setImageResource(R.drawable.hexablue);
			this.image38.setImageResource(R.drawable.hexablue);
			this.image39.setImageResource(R.drawable.hexablue);
			this.image40.setImageResource(R.drawable.hexablue);
			this.image41.setImageResource(R.drawable.hexablue);
			this.image42.setImageResource(R.drawable.hexablue);
			this.image43.setImageResource(R.drawable.hexablue);
			this.image44.setImageResource(R.drawable.hexablue);
			this.image45.setImageResource(R.drawable.hexablue);
			this.image46.setImageResource(R.drawable.hexablue);
			this.image47.setImageResource(R.drawable.hexablue);
			this.image48.setImageResource(R.drawable.hexablue);
			this.image49.setImageResource(R.drawable.hexablue);
		}
	}
}