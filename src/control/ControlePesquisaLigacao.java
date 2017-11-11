package control;

import java.util.ArrayList;

import model.BDSimulado;
import model.Cliente;
import model.Ligacao;
import view.ViewExibeCliente;
import view.ViewExibeLigacao;
import view.ViewSolicitaCadastro;

public class ControlePesquisaLigacao {
	
	private BDSimulado bds;
	
	public ControlePesquisaLigacao(BDSimulado bds){
		this.bds = bds;
	}
	
	public void pesquisarLigacao(){
		
		ViewSolicitaCadastro vsc = new ViewSolicitaCadastro();
		String nome = vsc.getCadastro();
		ArrayList<Ligacao>  lig= this.bds.ligacoesPorCliente(nome);
		ViewExibeLigacao vel = new ViewExibeLigacao(lig);
	}
	

}
