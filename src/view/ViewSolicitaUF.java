package view;

import javax.swing.JOptionPane;

public class ViewSolicitaUF {

	// Atributos 
	private String cadastroUf;
	
	public ViewSolicitaUF(){
		this.cadastroUf =
				JOptionPane.showInputDialog("Digite o UF do destino");
	}
	
	public String getCadastroUf() {
		return cadastroUf;
	}
	
}
