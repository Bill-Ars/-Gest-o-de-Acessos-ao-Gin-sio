package objectos;
import interfaces.Mensalidade;
public class MembroPiscina extends Membro implements Mensalidade{
	
	private boolean temToalha;
	
	public MembroPiscina(int ID, String nome, double mensalidade, boolean temToalha) {
		super( ID,  nome,  mensalidade);
		this.temToalha=temToalha;
	}

	public boolean isTemToalha() {
		return temToalha;
	}

	public void setTemToalha(boolean temToalha) {
		this.temToalha = temToalha;
	}
	
	
	@Override
	public double calculaMensal() {
		double mensalidade= 2000;
       return mensalidade + mensalidade*10/100 ;					
	}

	@Override
	public String toString() {
		return "Membro piscina[ Dados: "+super.toString()+ ", Tem Toalha? " + temToalha +" Mensalidade a pagar: "+calculaMensal()+"]";
	}

	
	
	
	
	
}
