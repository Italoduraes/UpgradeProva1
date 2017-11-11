package view;

import javax.swing.JOptionPane;

public class ViewPrincipal {
	 //atributos 
		private String opcao;
		
		// Metodo para exibir a lista  de apcoes
		
		public String getPpcao(){
			
			this.opcao =  JOptionPane.showInputDialog("Escolha uma aoção \n" +
			"1 - Pesquisar cliente \n" +
			"2 - Listar ligaçoes por cliente \n" +
			"3 - Listar UF \n" +
			"4 - Sair \n");
			
					
		return this.opcao;			
									
					
					
		}
		
	

}
