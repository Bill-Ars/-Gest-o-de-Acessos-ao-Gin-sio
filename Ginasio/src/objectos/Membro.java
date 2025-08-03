package objectos;

public class Membro {
	private int ID;
	private String nome;
	private double mensalidade;
	
	public Membro(int ID, String nome, double mensalidade) {
       this.ID=ID;
       this.nome=nome;
       this.mensalidade=mensalidade;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getMensalidade() {
		return mensalidade;
	}

	public void setMensalidade(double mensalidade) {
		this.mensalidade = mensalidade;
	}
	
	

	@Override
	public String toString() {
		return "ID=" + ID + ", nome=" + nome + ", mensalidade=" + mensalidade;
	}
	
	
	
	
	
	

}
