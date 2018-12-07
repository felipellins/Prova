package prova;

public class Professor {
    
	  private String nome;
	  private int codigo;
	  
	  
	  Professor(String nome, int codigo){
		  
		  this.nome=nome;
		  this.codigo=codigo;
		  
		  
	  }
     Professor(){
		  
		 
		  
	  }


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
}
