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
			
			//Exibir a janela de op�oes pela primeira vez 
			
			tratarOpcao(this.vp.getPpcao());
			
		}
		
		// Metodo para tratar a op�ao do usuario
		
		public void tratarOpcao ( String opcao){
			while (true) {
				switch (opcao) {
				case "1": this.cpc.pesquisarCliente();	
					break;
					
			/*	case "2": this.cl.exibirLigacoes();	
					break;*/
					
				case "2": JOptionPane.showMessageDialog(null, "At� breve!" );	
					return;
					
				default: JOptionPane.showMessageDialog(null, "Favor digitar um valor v�lido! ");
					break;
				}
				
				// Exibir a janela de op�oes 
				
				opcao = this.vp.getPpcao();
				
				
				
			}
		}

}
