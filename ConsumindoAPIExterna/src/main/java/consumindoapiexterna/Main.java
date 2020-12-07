package consumindoapiexterna;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        String cod = "7898422747237";
        Produto produto;
		try {
			produto = ServicoDeProduto.buscarProdutoPeloCodigoBarras(cod);
			System.out.println("Descri��o: " + produto.description);
			System.out.println("Pre�o M�nimo: " + produto.min_price);
			System.out.println("Pre�o M�ximo: " + produto.max_price);
			System.out.println("Imagem: " + produto.thumbnail);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        

	}

}
