package view;

import javax.swing.JOptionPane;

import model.Cliente;



public class ViewExibeCliente {

	public ViewExibeCliente(Cliente cliente){
		//Verificar se tem usuario para mostrar 
		if (cliente==null) {
			JOptionPane.showMessageDialog(null, "Cliente n�o existe");
		}else {
		//Exibir com JOptionPane
		JOptionPane.showMessageDialog(null, cliente);
		}
}
}