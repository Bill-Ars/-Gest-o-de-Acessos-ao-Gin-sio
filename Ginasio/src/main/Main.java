package main;
import java.util.Vector;

import objectos.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		    
		    
		    
		
		MembroLivre livre = new MembroLivre (12," Valentim Nadyisaba", 2000, true );
		livre.calculaMensal();
		
		MembroPiscina pisc = new MembroPiscina (34, "Benjamim Ndayisaba", 2000, false);
		pisc.calculaMensal();
		
		MembroAulas aula = new MembroAulas (3542, "Bill Ndayisaba", 2000, new Vector <>(), new Vector <>());
		
		aula.adicionaNome("Biologia");
		aula.adicionaNome("Maths");
		
		aula.numeroSala(124);
		aula.numeroSala(4);
		
		aula.calculaMensal();
		
		
		
		System.out.println("Lista de aulas: ");
		aula.listaAulas();
		
		
		
		Vector <Object>  membros = new Vector <>();
		membros.add(livre);
		membros.add(pisc);
		membros.add(aula);
		
		
		// Imprimindo os dados:
		
		System.out.println("Imprimindo os dados: ");
		for (int i=0;i<membros.size(); i++) {
			System.out.println(membros.get(i));
		}
		
		
		
		
		
		
		
	
	}

}
