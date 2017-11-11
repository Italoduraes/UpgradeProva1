package view;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.Ligacao;

public class ViewExibeUF {


	public ViewExibeUF(int uf){
		//Verificar se tem uf para mostrar 
		if (uf== 0) {
			JOptionPane.showMessageDialog(null, "UF não existe");
		}else {
		//Exibir com JOptionPane
		JOptionPane.showMessageDialog(null, uf);
		}

}
}
