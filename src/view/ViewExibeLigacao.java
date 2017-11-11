package view;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.Cliente;
import model.Ligacao;

public class ViewExibeLigacao {
	

	public ViewExibeLigacao(ArrayList<Ligacao> ligacao){
		//Verificar se tem usuario para mostrar 
		if (ligacao==null) {
			JOptionPane.showMessageDialog(null, "Ligação não existe");
		}else {
		//Exibir com JOptionPane
		JOptionPane.showMessageDialog(null, ligacao);
		}

}

}