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
	    
	    
	 // Metodo contrutor 
		
		public ControlePrincipal(){
			// instanciar o objeto BDSimulado
			this.bds = new BDSimulado();
			
			//Instanciar a ViewPrincipal
			this.vp = new  ViewPrincipal();
			
		// Criar controles 
			this.cpc = new ControlePesquisaCliente(bds);
			this.cc = new ControleCliente(bds);
			
			//Exibir a janela de opçoes pela primeira vez 
			
			tratarOpcao(this.vp.getPpcao());
			
		}
		
		// Metodo para tratar a opçao do usuario
		
		public void tratarOpcao ( String opcao){
			while (true) {
				switch (opcao) {
				case "1": this.cpc.pesquisarCliente();	
					break;
					
			/*	case "2": this.cl.exibirLigacoes();	
					break;*/
					
				case "2": JOptionPane.showMessageDialog(null, "Até breve!" );	
					return;
					
				default: JOptionPane.showMessageDialog(null, "Favor digitar um valor válido! ");
					break;
				}
				
				// Exibir a janela de opçoes 
				
				opcao = this.vp.getPpcao();
				
				
				
			}
		}

}
