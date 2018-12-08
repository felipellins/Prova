package prova;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import prova.Professor;
public class main {
	
	 //static Professor p =new Professor(null, 0);
	
	public static void main(String[] args) {
		
		
		 Professor p =new Professor();
		
		 ArrayList<Professor>professores = new ArrayList<>();
		
		 
	     int op;
		 
		 
		        do {
		        	
		        op= Integer.parseInt(JOptionPane.showInputDialog("digite 1 para cadastra \n 2 para listar \n 3 para remover \n 0 para sair"));
		        
		        switch (op  ) {
		        
		        case 1 :
               boolean tem=false;
		        	
		        	String pnome= JOptionPane.showInputDialog("digite o nome");
		   		   int pcodigo = Integer.parseInt(JOptionPane.showInputDialog("digite o codigo"));
					
		   		   for(Professor pr : professores) {
		   		   
				   		     if(pr.getCodigo() ==pcodigo) {
				   			   
				   		        tem=true;
							
				   		    op=0;
							
				   		    break;
					   		
				   		      } 
		   		   } 
		   		   
					   		   if(tem==false) {
					   			   
					   			   p= new Professor(pnome,pcodigo);
					   			   professores.add(p);
					   			   
					   		   }else {
					   			   
					   			   System.out.print("Ja existe esse codigo");
					   			   op=0;
					   		   }
					   		   
					   		   
		         break;
		    
		        case 2 :

		        	 for(Professor pr : professores) {
		     			
		 			    System.out.println("nome: "+pr.getNome()+"\ncodigo: "+pr.getCodigo());
		 			
		 		          }
		        	
		         break;
		       
		        case 3 :
                
			        	
		        	
		        	
		        	for(int i=0;i<professores.size();i++) {
						 
			        	 professores.remove(i);
			        	}
		         break;
		        
		        
		        }
		
		        } while(op !=0);
		        
		        
		        
	}

}
