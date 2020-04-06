package jogo;

import java.util.Random;

public class Tabuleiro extends Jogador {
	
	private int navios;
	int atualizacaoNavios;
	
	public static int tabuleiroJogador1[][]; 
	public static int tabuleiroJogador2[][];
	public int tabuleiros[][]; 
	
	
	
	Tabuleiro(){
		this.navios = (10*10)/3;
		this.atualizacaoNavios = this.navios;
	}
	
	public int getNavios() {
		return navios;
	}

	public void setNavios(int navios) {
		this.navios = navios;
	}

	
	public void criarTabuleiro(String nomeJogador){
		  tabuleiroJogador1 = new int[10][10]; 
		  tabuleiroJogador2 = new int[10][10]; 
		 
		  System.out.println("-------Tabuleiro Jogador 1--------");
		 
		  boolean seuTabuleiro = false;
		  String linhaDoTabuleiro = "";
		  int numeroLinha = 1;
		  
		  for(int[] linha : tabuleiroJogador1){
			  linhaDoTabuleiro = (numeroLinha++) + ""+"  | ";
			  for(int coluna: linha){
		        switch(coluna){
		        	case 0 :
		        	case 1 :
		        		
		        		if(seuTabuleiro ){
		        			linhaDoTabuleiro += " N|";
		        			break;
		        		} else {
		        			linhaDoTabuleiro += " |";
		        			break;
		        		}
		        		
		        	case 2 :
		        		linhaDoTabuleiro += " X|";
		        		break;
		        	case 3 :
		        		linhaDoTabuleiro += " D|";
		        		break;
		        }
			  } 
			  System.out.println(linhaDoTabuleiro);
		  }
		 
	}
	

	public void inserirNaviosjogador1(){
		  Random rand = new Random();
		  int  eixoX = 0, eixoY = 0;
		  
		  do{ 
			  eixoX = 0;
			  eixoY = 0; 
			  for(int[] linha : tabuleiroJogador1){
				  for(int coluna: linha){
					  if(rand.nextInt(100) <= 10){
						  if(coluna == 0){
							  coluna= 1;
							  this.atualizacaoNavios--;
						  }
						  if(this.atualizacaoNavios <= 0){
							  break;
						  }
						   eixoY++;
					  }
					   eixoY = 0;
					   eixoX++;
				  }	if(this.atualizacaoNavios <= 0){
					  break;
				     }	  	
			  }
		 }while(this.atualizacaoNavios <= 0);
	}
	
	
	public void inserirNaviosjogador2(){
		  Random rand = new Random();
		  int  eixoX = 0, eixoY = 0;
		  
		  do{ 
			  eixoX = 0;
			  eixoY = 0; 
			  for(int[] linha : tabuleiroJogador2){
				  for(int coluna: linha){
					  if(rand.nextInt(100) <= 10){
						  if(coluna == 0){
							  this.tabuleiros[eixoX][eixoY]= 1;
							  this.atualizacaoNavios--;
						  }
						  if(this.atualizacaoNavios <= 0){
							  break;
						  }
						   eixoY++;
					  }
					   eixoY = 0;
					   eixoX++;
				  }	if(this.atualizacaoNavios <= 0){
					  break;
				     }	  	
			  }
		 }while(this.atualizacaoNavios <= 0);
	}
	 
	
	public void zerarTabuleiro(){
		int eixoX = 0, eixoY = 0;
		
		for(int[] linha : tabuleiroJogador1){
			for(int coluna: linha){
			   if(coluna == 1){
			      this.tabuleiros[eixoX][eixoY] = 0;
				}
			   eixoX++;
			 }
			eixoY++;
		}
		
		eixoX = 0;
		eixoY = 0;
		
		for(int[] linha : tabuleiroJogador2){
			for(int coluna: linha){
			   if(coluna == 1){
			      this.tabuleiros[eixoX][eixoY] = 0;
				}
			   eixoX++;
			 }
			eixoY++;
		}
	
	
	}
	
	public void verificarTiro(){
		
		String linhaDoTabuleiro = "";
		String navioAtigindo = "x";
		
		int x = Integer.parseInt(navioAtigindo);
		int numeroLinha = 1;
		
		for(int[] linha : tabuleiroJogador1){
			  for(int coluna : linha){
				   if(coluna == x){
				     System.out.println("Navio foi atigindo nessa posição [" + linha + "]" + "[" + coluna + "]");
				    }						 
				 
			  }
	       }
	


    }
	}
