package control;

import javax.swing.JOptionPane;

import model.BDSimulado;
import view.ViewPrincipal;

public class ControlePrincipal {
	
	//Atributos 
	
		private BDSimulado bds;
		private ViewPrincipal vp;
		private ControlePesquisaCliente cpc;
	    private ControleCliente cc;
	    private ControleLigacao cl;
	    private ControlePesquisaLigacao cpl;
	    private ControlePesquisaUF cpuf;
	    private ControleUF cuf;
	    
	 // Metodo contrutor 
		
		public ControlePrincipal(){
			// instanciar o objeto BDSimulado
			this.bds = new BDSimulado();
			
			//Instanciar a ViewPrincipal
			this.vp = new  ViewPrincipal();
			
		// Criar controles 
			this.cpc = new ControlePesquisaCliente(bds);
			this.cc = new ControleCliente(bds);
			this.cl = new ControleLigacao(bds);
			this.cpl = new ControlePesquisaLigacao(bds);
			this.cpuf = new ControlePesquisaUF(bds);
			this.cuf = new ControleUF(bds);
			
			//Exibir a janela de opçoes pela primeira vez 
			
			tratarOpcao(this.vp.getPpcao());
			
		}
		
		// Metodo para tratar a opçao do usuario
		
		public void tratarOpcao ( String opcao){
			while (true) {
				switch (opcao) {
				case "1": this.cpc.pesquisarCliente();	
					break;
					
				case "2": this.cpl.pesquisarLigacao();	
					break;
					
				case "3": this.cpuf.pesquisarUF();
					
				case "4": JOptionPane.showMessageDialog(null, "Até breve!" );	
					return;
					
				default: JOptionPane.showMessageDialog(null, "Favor digitar um valor válido! ");
					break;
				}
				
				// Exibir a janela de opçoes 
				
				opcao = this.vp.getPpcao();
				
				
				
			}
		}

}
