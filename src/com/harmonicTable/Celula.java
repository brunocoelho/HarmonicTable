package com.harmonicTable;

public class Celula {

	private final int posX, posY,velocidade;
	public Direcao comando;

	public Celula(final int posX, final int posY)
	{
		this.posX = posX;
		this.posY = posY;
		this.velocidade = 1;
		comando = null;
	}

	public void colocarPeca(final Direcao comando)
	{
		this.comando = comando;
	}

	private void sleep(final int duracao) {
		try { Thread.sleep(duracao); } catch (final InterruptedException e) {}
	}

	public void tocarSequencia(Direcao comando)
	{

		sleep(Parametros.duracao);
		System.out.println("nota tocada:  x: "+ posX +" y: "+ posY);

		if(this.comando != null) {
			if (Parametros.ultimaNota > 0)
				SoundManager.stopSound(Parametros.ultimaNota);
			comando = this.comando;
			tocar();
			Parametros.ultimaNota = getNumeroUnico();
		}
		if(comando.equals(Direcao.NORTE))
		{
			if((posX - 1) >= 0)
				Parametros.table[posX - 1][ posY].tocarSequencia(comando);
		}
		else if(comando.equals(Direcao.SUL))
		{
			if( posY % 2 == 0)
			{
				if(posX +1 <= 6)
					Parametros.table[posX + 1][ posY].tocarSequencia(comando);
			}
			else if((posX + 1) <= 7)
				Parametros.table[posX + 1][ posY].tocarSequencia(comando);
		}
		else if(comando.equals(Direcao.NE))
		{

			if(posY % 2 == 0  )
				Parametros.table[posX][posY + 1].tocarSequencia(comando);
			else if(posX - 1 >= 0 && (posY) + 1 <= 13)
				Parametros.table[posX - 1][posY + 1].tocarSequencia(comando);
		}
		else if(comando.equals(Direcao.NO))
		{
			if(posY % 2 == 0  )
			{
				if( (posY) - 1 >= 0)
					Parametros.table[posX][posY - 1].tocarSequencia(comando);
			}
			else if(posX - 1 >= 0 )
				Parametros.table[posX -1 ][posY - 1].tocarSequencia(comando);
		}
		else if(comando.equals(Direcao.SO))
		{
			if(posY % 2 == 0  )
			{
				if(posY - 1 > 0)
					Parametros.table[posX +1 ][posY - 1].tocarSequencia(comando);

			}
			else if(posX < 7 )
				Parametros.table[posX ][posY - 1].tocarSequencia(comando);
		}
		else if(comando.equals(Direcao.SE))
			if(posY % 2 == 0  )
				Parametros.table[posX +1 ][posY + 1].tocarSequencia(comando);
			else if(posY + 1 <= 13  && posX < 7 && posY + 1 <= 13)
				Parametros.table[posX ][posY + 1].tocarSequencia(comando);

	}

	public void tocarUnico()
	{
		tocar();
		sleep(Parametros.duracao * 3);
		parar();
	}

	//acrescentar aki: os canais que ser�o tocados
	private void tocar()
	{
		SoundManager.playSound(getNumeroUnico(), this.velocidade);
		//Parametros.channels[0].noteOn(nota, Parametros.velocidade);
		//Parametros.channels[2].noteOn(nota, Parametros.velocidade);
	}

	//acrescentar aki: os canais para serem parados
	private void parar()
	{
		SoundManager.stopSound(getNumeroUnico());
		//Parametros.channels[0].noteOff(nota);
		//Parametros.channels[2].noteOff(nota);
	}
	
	public int getNumeroUnico()
	{
		return this.posX *100 + this.posY;
	}

}
