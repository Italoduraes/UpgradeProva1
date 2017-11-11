package control;

import java.util.ArrayList;

import model.BDSimulado;
import model.Ligacao;
import view.ViewExibeLigacao;
import view.ViewExibeUF;
import view.ViewSolicitaCadastro;
import view.ViewSolicitaUF;

public class ControlePesquisaUF {

	private BDSimulado bds;
	
	public ControlePesquisaUF(BDSimulado bds){
		this.bds = bds;
	}
	
	public void pesquisarUF(){
		
		ViewSolicitaUF vsc = new ViewSolicitaUF();
		String uf = vsc.getCadastroUf();
		int  lig= this.bds.ligacoesPorUF(uf);
		ViewExibeUF vel = new ViewExibeUF(lig);
	}
}
