package view;

import javax.swing.JOptionPane;

public class ViewSolicitaLigacao {
	

	//Atributos
	private String cadastro;
	
	public ViewSolicitaLigacao() {
		this.cadastro = 	
				JOptionPane.showInputDialog("Digite o nome do cliente");
		
	}

	public String getCadastro() {
		return cadastro;
	}

}
