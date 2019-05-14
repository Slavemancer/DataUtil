package es;

import es.datautil.Data;
import es.datautil.Meses;

public class Testes {

	public static void main(String[] args) {
		Meses mes = Meses.mesFromInt(3);
		System.out.println(mes.getNumeroMes());
		System.out.println(Data.diasMes(mes));
	}

}
