package prova;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import prova.Professor;
public class main {
	
	 //static Professor p =new Professor(null, 0);
	
	public static void main(String[] args) {
		
		
		 Professor p =new Professor();
		
		 ArrayList<Professor>professores = new ArrayList<>();
		
		 String pnome= JOptionPane.showInputDialog("digite o nome");
		 int pcodigo = Integer.parseInt(JOptionPane.showInputDialog("digite o codigo"));
		 
		 
		 p =new Professor(pnome,pcodigo);
		professores.add(p);
		
		

	}

}
