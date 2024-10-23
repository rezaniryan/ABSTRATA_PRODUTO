package produto;

public class Main {
	
	// classes que exibiram o resultado
	    public static void main(String[] args) {
	        
	        ProdutoAlimenticio pa = new ProdutoAlimenticio("Frango", 7.00, 9.00, "2025-12-31", "Carboidratos");
	        ProdutoVestuario pv = new ProdutoVestuario("Camiseta", 10.00, 15.00, "G", "Azul", "TackTell");

	        System.out.println("Lucro do Produto Alimentício: " + pa.calcularLucro());
	        System.out.println("Lucro do Produto de Vestuário: " + pv.calcularLucro());
	    }
	}



