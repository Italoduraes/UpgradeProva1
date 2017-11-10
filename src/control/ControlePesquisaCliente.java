package control;

import model.BDSimulado;
import model.Cliente;
import view.ViewExibeCliente;
import view.ViewExibeListaCliente;
import view.ViewSolicitaCadastro;

public class ControlePesquisaCliente {
	
	private BDSimulado bds;
	
	public ControlePesquisaCliente(BDSimulado bds){
		this.bds = bds;
	}
	public void pesquisarCliente(){
	
		ViewSolicitaCadastro vsc = new ViewSolicitaCadastro();
		String nome = vsc.getCadastro();
		Cliente cli = this.bds.getInfoCliente(nome);
		ViewExibeCliente vec = new ViewExibeCliente(cli);
	}
	
	
	

}
