package es.cliente.datautil;

import java.util.Scanner;

import es.datautil.Data;
import es.datautil.Meses;

public class Principal {

	public static void main(String[] args) {
		
		/*
		   IMPLEMENTAR 
		   
		   
		   Acrescente uns Prints para Feeedback e para mostrar os resultados
		  
		   LER numero do m�s
		   Converte numero do m�s para um objecto do enumerado Meses e guarda na vari�vel mes
		   
		   Se mes igual a MESES.FEVEREIRO
		     ent�o
		        LER ano
		        Invocar m�todo classe Data para obter o n�mero de dias do m�s
		     sen�o
		        Invocar m�todo classe Data para obter o n�mero de dias do m�s
		        
		   Fim_SE
		   
		
	    */ 
		System.out.println("Introduza o numero do m�s");
		Scanner key = new Scanner(System.in);
		int numeroMes = key.nextInt();
		Meses mes = Meses.mesFromInt(numeroMes);
		if(mes==Meses.FEVEREIRO) {
			System.out.println("Introduza o ano");
			int ano = key.nextInt();
			System.out.println("O m�s "+numeroMes+" tem "+Data.diasMes(mes, ano)+" dias.");
		}else {
			System.out.println("O m�s "+numeroMes+" tem "+Data.diasMes(mes)+" dias.");
		}
		key.close();
		
		
		
	}

}
