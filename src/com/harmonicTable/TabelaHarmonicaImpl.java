package com.harmonicTable;


import android.content.Context;

//import javax.sound.midi.Instrument;
//import javax.sound.midi.MidiSystem;
//import javax.sound.midi.Sequence;
//import javax.sound.midi.Sequencer;
//import javax.sound.midi.Soundbank;
//import javax.sound.midi.Synthesizer;

public class TabelaHarmonicaImpl  {

	/*
	private final int PROGRAM = 192;
	private final int NOTEON = 144;
	private final int NOTEOFF = 128;
	private final int SUSTAIN = 64;
	private final int REVERB = 91;
	private final int ON = 0, OFF = 1;
	 */
	/*public Sequencer sequencer;
	public Sequence sequence;
	public Synthesizer synthesizer;
	public Instrument instruments[];*/
	public Celula pecaInicial;
	 
	public TabelaHarmonicaImpl(Context contexto) {

		open(contexto);
		instanciarTable();
		//Parametros.velocidade = 127;//m�ximo 127
		//Parametros.duracao = 100;

		/*final int i = 86;
		//synthesizer.loadInstrument(instruments[i]);
		System.out.println("instrumento: " + instruments[i].getName());
		//acrescentar aki: os instrumentos carregados para cada canal
		Parametros.channels[0].programChange(i);
		synthesizer.loadInstrument(instruments[101]);
		Parametros.channels[1].programChange(101);*/

	}

	public void toqueUnico(final int i, final int j)
	{
		if(i >= 0 && i <= 7 && j >= 0 && j <= 14 )
			Parametros.table[i][j].tocarUnico();
		else
			throw new RuntimeException("Fora dos limites");
	}

	
	public void iniciar()
	{
		pecaInicial.tocarSequencia(pecaInicial.comando);
	}

	public void open(Context contexto) {
		
		
		SoundManager.initSounds(contexto);

		/*try {
			//inicializa o sintetizador
			if (synthesizer == null)
				if ((synthesizer = MidiSystem.getSynthesizer()) == null) {
					System.out.println("getSynthesizer() failed!");
					return;
				}
			//abre o sintetizador
			synthesizer.open();
			//inicializa uma sequencia
			sequencer = MidiSystem.getSequencer();
			sequence = new Sequence(Sequence.PPQ, 10);//10 � a resolu��o e PPQ o tipo de divis�o

		} catch (final Exception ex) { ex.printStackTrace(); return; }
		//inicializa um banco padr�o. Soundbank � um reposit�rio de Instruments

		final Soundbank sb = synthesizer.getDefaultSoundbank();

		//pega os instrumentos
		if (sb != null) {
			instruments = synthesizer.getDefaultSoundbank().getInstruments();
			synthesizer.loadInstrument(instruments[0]);
		}

		Parametros.channels = synthesizer.getChannels();
		 	*/
	}

	public void close() {
		
		
		SoundManager.cleanup();
		/*if (synthesizer != null)
			synthesizer.close();
		if (sequencer != null)
			sequencer.close();
		sequencer = null;
		synthesizer = null;
		instruments = null;
		Parametros.channels = null;*/

	}

	public void instanciarTable()
	{

		
		Parametros.table = new Celula[8][15];
		
		Parametros.table[0][0] = new Celula(0,0);
		SoundManager.addSound(Parametros.table[0][0].getNumeroUnico(), R.raw.nota55); 
		Parametros.table[0][1] = new Celula(0,1);
		SoundManager.addSound(Parametros.table[0][1].getNumeroUnico(), R.raw.nota59); 
		Parametros.table[0][2] = new Celula(0,2);
		SoundManager.addSound(Parametros.table[0][2].getNumeroUnico(), R.raw.nota56); 
		Parametros.table[0][3] = new Celula(0,3);
		SoundManager.addSound(Parametros.table[0][3].getNumeroUnico(), R.raw.nota48); 
		Parametros.table[0][4] = new Celula(0,4);
		SoundManager.addSound(Parametros.table[0][4].getNumeroUnico(), R.raw.nota57); 
		Parametros.table[0][5] = new Celula(0,5);
		SoundManager.addSound(Parametros.table[0][5].getNumeroUnico(), R.raw.nota49); 
		Parametros.table[0][6] = new Celula(0,6);
		SoundManager.addSound(Parametros.table[0][6].getNumeroUnico(), R.raw.nota58); 
		Parametros.table[0][7] = new Celula(0,7);
		SoundManager.addSound(Parametros.table[0][7].getNumeroUnico(), R.raw.nota50); 
		Parametros.table[0][8] = new Celula(0,8);
		SoundManager.addSound(Parametros.table[0][8].getNumeroUnico(), R.raw.nota59); 
		Parametros.table[0][9] = new Celula(0,9);
		SoundManager.addSound(Parametros.table[0][9].getNumeroUnico(), R.raw.nota51); 
		Parametros.table[0][10] = new Celula(0,10);
		SoundManager.addSound(Parametros.table[0][10].getNumeroUnico(), R.raw.nota48); 
		Parametros.table[0][11] = new Celula(0,11);
		SoundManager.addSound(Parametros.table[0][11].getNumeroUnico(), R.raw.nota52); 
		Parametros.table[0][12] = new Celula(0,12);
		SoundManager.addSound(Parametros.table[0][12].getNumeroUnico(), R.raw.nota49); 
		Parametros.table[0][13] = new Celula(0,13);
		SoundManager.addSound(Parametros.table[0][13].getNumeroUnico(), R.raw.nota53); 
		Parametros.table[0][14] = new Celula(0,14);
		SoundManager.addSound(Parametros.table[0][14].getNumeroUnico(), R.raw.nota50); 
		Parametros.table[1][0] = new Celula(1,0);
		SoundManager.addSound(Parametros.table[1][0].getNumeroUnico(), R.raw.nota60); 
		Parametros.table[2][0] = new Celula(2,0);
		SoundManager.addSound(Parametros.table[2][0].getNumeroUnico(), R.raw.nota65); 
		Parametros.table[1][1] = new Celula(1,1);
		SoundManager.addSound(Parametros.table[1][1].getNumeroUnico(), R.raw.nota64); 
		Parametros.table[2][1] = new Celula(2,1);
		SoundManager.addSound(Parametros.table[2][1].getNumeroUnico(), R.raw.nota69); 
		Parametros.table[1][2] = new Celula(1,2);
		SoundManager.addSound(Parametros.table[1][2].getNumeroUnico(), R.raw.nota61); 
		Parametros.table[2][2] = new Celula(2,2);
		SoundManager.addSound(Parametros.table[2][2].getNumeroUnico(), R.raw.nota66); 
		Parametros.table[1][3] = new Celula(1,3);
		SoundManager.addSound(Parametros.table[1][3].getNumeroUnico(), R.raw.nota65); 
		Parametros.table[2][3] = new Celula(2,3);
		SoundManager.addSound(Parametros.table[2][3].getNumeroUnico(), R.raw.nota70); 
		Parametros.table[1][4] = new Celula(1,4);
		SoundManager.addSound(Parametros.table[1][4].getNumeroUnico(), R.raw.nota62); 
		Parametros.table[2][4] = new Celula(2,4);
		SoundManager.addSound(Parametros.table[2][4].getNumeroUnico(), R.raw.nota67); 
		Parametros.table[1][5] = new Celula(1,5);
		SoundManager.addSound(Parametros.table[1][5].getNumeroUnico(), R.raw.nota66); 
		Parametros.table[2][5] = new Celula(2,5);
		SoundManager.addSound(Parametros.table[2][5].getNumeroUnico(), R.raw.nota71); 
		Parametros.table[1][6] = new Celula(1,6);
		SoundManager.addSound(Parametros.table[1][6].getNumeroUnico(), R.raw.nota63); 
		Parametros.table[2][6] = new Celula(2,6);
		SoundManager.addSound(Parametros.table[2][6].getNumeroUnico(), R.raw.nota68); 
		Parametros.table[1][7] = new Celula(1,7);
		SoundManager.addSound(Parametros.table[1][7].getNumeroUnico(), R.raw.nota67); 
		Parametros.table[2][7] = new Celula(2,7);
		SoundManager.addSound(Parametros.table[2][7].getNumeroUnico(), R.raw.nota60); 
		Parametros.table[1][8] = new Celula(1,8);
		SoundManager.addSound(Parametros.table[1][8].getNumeroUnico(), R.raw.nota64); 
		Parametros.table[2][8] = new Celula(2,8);
		SoundManager.addSound(Parametros.table[2][8].getNumeroUnico(), R.raw.nota69); 
		Parametros.table[1][9] = new Celula(1,9);
		SoundManager.addSound(Parametros.table[1][9].getNumeroUnico(), R.raw.nota68); 
		Parametros.table[2][9] = new Celula(2,9);
		SoundManager.addSound(Parametros.table[2][9].getNumeroUnico(), R.raw.nota61); 
		Parametros.table[1][10] = new Celula(1,10);
		SoundManager.addSound(Parametros.table[1][10].getNumeroUnico(), R.raw.nota65); 
		Parametros.table[2][10] = new Celula(2,10);
		SoundManager.addSound(Parametros.table[2][10].getNumeroUnico(), R.raw.nota70); 
		Parametros.table[1][11] = new Celula(1,11);
		SoundManager.addSound(Parametros.table[1][11].getNumeroUnico(), R.raw.nota69); 
		Parametros.table[2][11] = new Celula(2,11);
		SoundManager.addSound(Parametros.table[2][11].getNumeroUnico(), R.raw.nota62); 
		Parametros.table[1][12] = new Celula(1,12);
		SoundManager.addSound(Parametros.table[1][12].getNumeroUnico(), R.raw.nota66); 
		Parametros.table[2][12] = new Celula(2,12);
		SoundManager.addSound(Parametros.table[2][12].getNumeroUnico(), R.raw.nota71); 
		Parametros.table[1][13] = new Celula(1,13);
		SoundManager.addSound(Parametros.table[1][13].getNumeroUnico(), R.raw.nota70); 
		Parametros.table[2][13] = new Celula(2,13);
		SoundManager.addSound(Parametros.table[2][13].getNumeroUnico(), R.raw.nota63); 
		Parametros.table[1][14] = new Celula(1,14);
		SoundManager.addSound(Parametros.table[1][14].getNumeroUnico(), R.raw.nota67); 
		Parametros.table[2][14] = new Celula(2,14);
		SoundManager.addSound(Parametros.table[2][14].getNumeroUnico(), R.raw.nota60); 
		Parametros.table[3][0] = new Celula(3,0);
		SoundManager.addSound(Parametros.table[3][0].getNumeroUnico(), R.raw.nota82); 
		Parametros.table[4][0] = new Celula(4,0);
		SoundManager.addSound(Parametros.table[4][0].getNumeroUnico(), R.raw.nota75); 
		Parametros.table[3][1] = new Celula(3,1);
		SoundManager.addSound(Parametros.table[3][1].getNumeroUnico(), R.raw.nota74); 
		Parametros.table[4][1] = new Celula(4,1);
		SoundManager.addSound(Parametros.table[4][1].getNumeroUnico(), R.raw.nota79); 
		Parametros.table[3][2] = new Celula(3,2);
		SoundManager.addSound(Parametros.table[3][2].getNumeroUnico(), R.raw.nota83); 
		Parametros.table[4][2] = new Celula(4,2);
		SoundManager.addSound(Parametros.table[4][2].getNumeroUnico(), R.raw.nota76); 
		Parametros.table[3][3] = new Celula(3,3);
		SoundManager.addSound(Parametros.table[3][3].getNumeroUnico(), R.raw.nota75); 
		Parametros.table[4][3] = new Celula(4,3);
		SoundManager.addSound(Parametros.table[4][3].getNumeroUnico(), R.raw.nota80); 
		Parametros.table[3][4] = new Celula(3,4);
		SoundManager.addSound(Parametros.table[3][4].getNumeroUnico(), R.raw.nota72); 
		Parametros.table[4][4] = new Celula(4,4);
		SoundManager.addSound(Parametros.table[4][4].getNumeroUnico(), R.raw.nota77); 
		Parametros.table[3][5] = new Celula(3,5);
		SoundManager.addSound(Parametros.table[3][5].getNumeroUnico(), R.raw.nota76); 
		Parametros.table[4][5] = new Celula(4,5);
		SoundManager.addSound(Parametros.table[4][5].getNumeroUnico(), R.raw.nota81); 
		Parametros.table[3][6] = new Celula(3,6);
		SoundManager.addSound(Parametros.table[3][6].getNumeroUnico(), R.raw.nota73); 
		Parametros.table[4][6] = new Celula(4,6);
		SoundManager.addSound(Parametros.table[4][6].getNumeroUnico(), R.raw.nota78); 
		Parametros.table[3][7] = new Celula(3,7);
		SoundManager.addSound(Parametros.table[3][7].getNumeroUnico(), R.raw.nota77); 
		Parametros.table[4][7] = new Celula(4,7);
		SoundManager.addSound(Parametros.table[4][7].getNumeroUnico(), R.raw.nota82); 
		Parametros.table[3][8] = new Celula(3,8);
		SoundManager.addSound(Parametros.table[3][8].getNumeroUnico(), R.raw.nota74); 
		Parametros.table[4][8] = new Celula(4,8);
		SoundManager.addSound(Parametros.table[4][8].getNumeroUnico(), R.raw.nota79); 
		Parametros.table[3][9] = new Celula(3,9);
		SoundManager.addSound(Parametros.table[3][9].getNumeroUnico(), R.raw.nota78); 
		Parametros.table[4][9] = new Celula(4,9);
		SoundManager.addSound(Parametros.table[4][9].getNumeroUnico(), R.raw.nota83); 
		Parametros.table[3][10] = new Celula(3,10);
		SoundManager.addSound(Parametros.table[3][10].getNumeroUnico(), R.raw.nota75); 
		Parametros.table[4][10] = new Celula(4,10);
		SoundManager.addSound(Parametros.table[4][10].getNumeroUnico(), R.raw.nota80); 
		Parametros.table[3][11] = new Celula(3,11);
		SoundManager.addSound(Parametros.table[3][11].getNumeroUnico(), R.raw.nota79); 
		Parametros.table[4][11] = new Celula(4,11);
		SoundManager.addSound(Parametros.table[4][11].getNumeroUnico(), R.raw.nota72); 
		Parametros.table[3][12] = new Celula(3,12);
		SoundManager.addSound(Parametros.table[3][12].getNumeroUnico(), R.raw.nota76); 
		Parametros.table[4][12] = new Celula(4,12);
		SoundManager.addSound(Parametros.table[4][12].getNumeroUnico(), R.raw.nota81); 
		Parametros.table[3][13] = new Celula(3,13);
		SoundManager.addSound(Parametros.table[3][13].getNumeroUnico(), R.raw.nota80); 
		Parametros.table[4][13] = new Celula(4,13);
		SoundManager.addSound(Parametros.table[4][13].getNumeroUnico(), R.raw.nota73); 
		Parametros.table[3][14] = new Celula(3,14);
		SoundManager.addSound(Parametros.table[3][14].getNumeroUnico(), R.raw.nota77); 
		Parametros.table[4][14] = new Celula(4,14);
		SoundManager.addSound(Parametros.table[4][14].getNumeroUnico(), R.raw.nota82); 
		Parametros.table[5][0] = new Celula(5,0);
		SoundManager.addSound(Parametros.table[5][0].getNumeroUnico(), R.raw.nota92); 
		Parametros.table[6][0] = new Celula(6,0);
		SoundManager.addSound(Parametros.table[6][0].getNumeroUnico(), R.raw.nota85); 
		Parametros.table[5][1] = new Celula(5,1);
		SoundManager.addSound(Parametros.table[5][1].getNumeroUnico(), R.raw.nota84); 
		Parametros.table[6][1] = new Celula(6,1);
		SoundManager.addSound(Parametros.table[6][1].getNumeroUnico(), R.raw.nota89); 
		Parametros.table[5][2] = new Celula(5,2);
		SoundManager.addSound(Parametros.table[5][2].getNumeroUnico(), R.raw.nota93); 
		Parametros.table[6][2] = new Celula(6,2);
		SoundManager.addSound(Parametros.table[6][2].getNumeroUnico(), R.raw.nota86); 
		Parametros.table[5][3] = new Celula(5,3);
		SoundManager.addSound(Parametros.table[5][3].getNumeroUnico(), R.raw.nota85); 
		Parametros.table[6][3] = new Celula(6,3);
		SoundManager.addSound(Parametros.table[6][3].getNumeroUnico(), R.raw.nota90); 
		Parametros.table[5][4] = new Celula(5,4);
		SoundManager.addSound(Parametros.table[5][4].getNumeroUnico(), R.raw.nota94); 
		Parametros.table[6][4] = new Celula(6,4);
		SoundManager.addSound(Parametros.table[6][4].getNumeroUnico(), R.raw.nota87); 
		Parametros.table[5][5] = new Celula(5,5);
		SoundManager.addSound(Parametros.table[5][5].getNumeroUnico(), R.raw.nota86); 
		Parametros.table[6][5] = new Celula(6,5);
		SoundManager.addSound(Parametros.table[6][5].getNumeroUnico(), R.raw.nota91); 
		Parametros.table[5][6] = new Celula(5,6);
		SoundManager.addSound(Parametros.table[5][6].getNumeroUnico(), R.raw.nota95); 
		Parametros.table[6][6] = new Celula(6,6);
		SoundManager.addSound(Parametros.table[6][6].getNumeroUnico(), R.raw.nota88); 
		Parametros.table[5][7] = new Celula(5,7);
		SoundManager.addSound(Parametros.table[5][7].getNumeroUnico(), R.raw.nota87); 
		Parametros.table[6][7] = new Celula(6,7);
		SoundManager.addSound(Parametros.table[6][7].getNumeroUnico(), R.raw.nota92); 
		Parametros.table[5][8] = new Celula(5,8);
		SoundManager.addSound(Parametros.table[5][8].getNumeroUnico(), R.raw.nota84); 
		Parametros.table[6][8] = new Celula(6,8);
		SoundManager.addSound(Parametros.table[6][8].getNumeroUnico(), R.raw.nota89); 
		Parametros.table[5][9] = new Celula(5,9);
		SoundManager.addSound(Parametros.table[5][9].getNumeroUnico(), R.raw.nota88); 
		Parametros.table[6][9] = new Celula(6,9);
		SoundManager.addSound(Parametros.table[6][9].getNumeroUnico(), R.raw.nota93); 
		Parametros.table[5][10] = new Celula(5,10);
		SoundManager.addSound(Parametros.table[5][10].getNumeroUnico(), R.raw.nota85); 
		Parametros.table[6][10] = new Celula(6,10);
		SoundManager.addSound(Parametros.table[6][10].getNumeroUnico(), R.raw.nota90); 
		Parametros.table[5][11] = new Celula(5,11);
		SoundManager.addSound(Parametros.table[5][11].getNumeroUnico(), R.raw.nota89); 
		Parametros.table[6][11] = new Celula(6,11);
		SoundManager.addSound(Parametros.table[6][11].getNumeroUnico(), R.raw.nota94); 
		Parametros.table[5][12] = new Celula(5,12);
		SoundManager.addSound(Parametros.table[5][12].getNumeroUnico(), R.raw.nota86); 
		Parametros.table[6][12] = new Celula(6,12);
		SoundManager.addSound(Parametros.table[6][12].getNumeroUnico(), R.raw.nota91); 
		Parametros.table[5][13] = new Celula(5,13);
		SoundManager.addSound(Parametros.table[5][13].getNumeroUnico(), R.raw.nota90); 
		Parametros.table[6][13] = new Celula(6,13);
		SoundManager.addSound(Parametros.table[6][13].getNumeroUnico(), R.raw.nota95); 
		Parametros.table[5][14] = new Celula(5,14);
		SoundManager.addSound(Parametros.table[5][14].getNumeroUnico(), R.raw.nota87); 
		Parametros.table[6][14] = new Celula(6,14);
		SoundManager.addSound(Parametros.table[6][14].getNumeroUnico(), R.raw.nota92); 
		Parametros.table[7][0] = null;
		Parametros.table[7][1] = new Celula(7,1);
		SoundManager.addSound(Parametros.table[7][1].getNumeroUnico(), R.raw.nota106); 
		Parametros.table[7][2] = null;
		Parametros.table[7][3] = new Celula(7,3);
		SoundManager.addSound(Parametros.table[7][3].getNumeroUnico(), R.raw.nota107); 
		Parametros.table[7][4] = null;
		Parametros.table[7][5] = new Celula(7,5);
		SoundManager.addSound(Parametros.table[7][5].getNumeroUnico(), R.raw.nota96); 
		Parametros.table[7][6] = null;
		Parametros.table[7][7] = new Celula(7,7);
		SoundManager.addSound(Parametros.table[7][7].getNumeroUnico(), R.raw.nota97); 
		Parametros.table[7][8] = null;
		Parametros.table[7][9] = new Celula(7,9);
		SoundManager.addSound(Parametros.table[7][9].getNumeroUnico(), R.raw.nota98); 
		Parametros.table[7][10] = null;
		Parametros.table[7][11] = new Celula(7,11);
		SoundManager.addSound(Parametros.table[7][11].getNumeroUnico(), R.raw.nota99); 
		Parametros.table[7][12] = null;
		Parametros.table[7][13] = new Celula(7,13);
		SoundManager.addSound(Parametros.table[7][13].getNumeroUnico(), R.raw.nota100); 
		Parametros.table[7][14] = null;



	}

	
	public void adicionarPeca(final int x, final int y, final Direcao direcao) {
		Parametros.table[x][y].colocarPeca(direcao);
	}

	
	public void removerPeca(final int x, final int y) {
		if (Parametros.table[x][y] == pecaInicial)
			pecaInicial = null;
		Parametros.table[x][y].comando = null;
	}

	
	public void alterarDuracao(final int duracao) {
		Parametros.duracao = duracao;
	}

	
	public void adicionarPecaInicial(final int x, final int y, final Direcao direcao) {
		if (pecaInicial != null)
			throw new RuntimeException("Já existe peça inicial");
		adicionarPeca(x, y, direcao);
		pecaInicial = Parametros.table[x][y];
	}

	
	public void parar() {
		// TODO Auto-generated method stub

	}

}
