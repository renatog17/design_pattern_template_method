package loja.desconto;

import loja.CarrinhoDeCompras;

public class DescontoCompraComMaisDe10Itens extends Desconto{

	public DescontoCompraComMaisDe10Itens(Desconto proximo) {
		super(proximo);
	}

	@Override
	public double efetuarCalculo(CarrinhoDeCompras carrinhoDeCompras) {
		return 0.2;
	}

	@Override
	public boolean deveAplicar(CarrinhoDeCompras carrinhoDeCompras) {
		return carrinhoDeCompras.getProdutos().size()>10;
	}

}
