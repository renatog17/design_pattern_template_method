package loja.desconto;

import loja.CarrinhoDeCompras;

public abstract class Desconto {

	protected Desconto proximo;

	public Desconto(Desconto proximo) {
		this.proximo = proximo;
	}
	
	public double calcular(CarrinhoDeCompras carrinhoDeCompras) {
		if(deveAplicar(carrinhoDeCompras)) {
			return efetuarCalculo(carrinhoDeCompras);
		}
		return proximo.calcular(carrinhoDeCompras);
	}
	
	public abstract double efetuarCalculo(CarrinhoDeCompras carrinhoDeCompras);
	public abstract boolean deveAplicar(CarrinhoDeCompras carrinhoDeCompras);
}
