package loja.desconto;

import loja.CarrinhoDeCompras;
import loja.Produto;

public class DescontoValorMaiorQueQuinhetos extends Desconto {

	public DescontoValorMaiorQueQuinhetos(Desconto proximo) {
		super(proximo);
	}

	@Override
	public double efetuarCalculo(CarrinhoDeCompras carrinhoDeCompras) {

		return 0.1;

	}

	@Override
	public boolean deveAplicar(CarrinhoDeCompras carrinhoDeCompras) {
		double precoTotal = 0;
		for (Produto produto : carrinhoDeCompras.getProdutos()) {
			precoTotal = produto.getPreco();
			if (precoTotal > 500.0)
				return true;
		}
		return false;
	}

}
