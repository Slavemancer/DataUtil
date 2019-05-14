package es.cliente.datautil;

import java.util.Scanner;

import es.datautil.Data;
import es.datautil.Meses;

public class Principal {

	public static void main(String[] args) {
		
		/*
		   IMPLEMENTAR 
		   
		   
		   Acrescente uns Prints para Feeedback e para mostrar os resultados
		  
		   LER numero do mês
		   Converte numero do mês para um objecto do enumerado Meses e guarda na variável mes
		   
		   Se mes igual a MESES.FEVEREIRO
		     então
		        LER ano
		        Invocar método classe Data para obter o número de dias do mês
		     senão
		        Invocar método classe Data para obter o número de dias do mês
		        
		   Fim_SE
		   
		
	    */ 
		System.out.println("Introduza o numero do mês");
		Scanner key = new Scanner(System.in);
		int numeroMes = key.nextInt();
		Meses mes = Meses.mesFromInt(numeroMes);
		if(mes==Meses.FEVEREIRO) {
			System.out.println("Introduza o ano");
			int ano = key.nextInt();
			System.out.println("O mês "+numeroMes+" tem "+Data.diasMes(mes, ano)+" dias.");
		}else {
			System.out.println("O mês "+numeroMes+" tem "+Data.diasMes(mes)+" dias.");
		}
		key.close();
		
		
		
	}

}
