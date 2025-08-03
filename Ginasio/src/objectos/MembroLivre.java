package objectos;
import  interfaces.Mensalidade;

public class MembroLivre  extends Membro implements Mensalidade{
	
	private boolean lugarEstaciona;
	
	public MembroLivre(int ID, String nome, double mensalidade, boolean lugarEstaciona) {
		super(ID, nome,  mensalidade);
		this.lugarEstaciona=lugarEstaciona;
	}
	
	

	public boolean isLugarEstaciona() {
		return lugarEstaciona;
	}

	public void setLugarEstaciona(boolean lugarEstaciona) {
		this.lugarEstaciona = lugarEstaciona;
	}
	
	
	@Override
	public double calculaMensal() {
		double mensalidade= 2000;
       return mensalidade + mensalidade*30/100 ;
	}
	



	@Override
	public String toString() {
		return "Membro livre[Dados: "+super.toString()+" Tem lugar de estacionamento? " + lugarEstaciona+", Mensalidade a pagar: "+calculaMensal()+"]";
	}
	
	
	
	
	
	

}
