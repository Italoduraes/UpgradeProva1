package view;

import javax.swing.JOptionPane;

public class ViewSolicitaCadastro {
	
	

	//Atributos
	private String cadastro;
	
	public ViewSolicitaCadastro() {
		this.cadastro = 	
				JOptionPane.showInputDialog("Digite o nome do cliente");
		
	}

	public String getCadastro() {
		return cadastro;
	}

}
