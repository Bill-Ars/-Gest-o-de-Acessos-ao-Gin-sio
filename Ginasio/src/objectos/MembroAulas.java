package objectos;
import java.util.Vector;
import interfaces.Mensalidade;

public class MembroAulas extends Membro implements Mensalidade{
   Vector <String> nomeAula;
	Vector <Integer> numeroSala;
	
	
	public MembroAulas(int ID, String nome, double mensalidade, Vector <String> nomeAula,Vector <Integer> numeroSala) {
		super( ID,  nome,  mensalidade);
		this.nomeAula = new Vector<>();
		this.numeroSala=new Vector<>();
	}




	public Vector<String> getNomeAula() {
		return nomeAula;
	}


	public void setNomeAula(Vector<String> nomeAula) {
		this.nomeAula = nomeAula;
	}


	public Vector<Integer> getNumeroSala() {
		return numeroSala;
	}


	public void setNumeroSala(Vector<Integer> numeroSala) {
		this.numeroSala = numeroSala;
	}
	
	
	
	//Metodos para fazer as listas   de aula e respectivo nome;
	
	 
	public void adicionaNome(String nome) {
		nomeAula.add(nome);
	}
	
	
	
	public void numeroSala(int n) {
		numeroSala.add(n);
	}
	
	
	@Override
	public double calculaMensal() {
		double mensalidade= 2000;
       return mensalidade + (mensalidade*5/100) * nomeAula.size();
	}
	
	
	public void listaAulas() {
		for(int i=0; i<nomeAula.size(); i++) {
              System.out.println("Membro Aulas[  Nome da aula: "+nomeAula.get(i)+" | Numero da sala: "+numeroSala.get(i)+" | Valor a pagar: "+calculaMensal()+"]");
             }
	}
	
	
	
	

}
