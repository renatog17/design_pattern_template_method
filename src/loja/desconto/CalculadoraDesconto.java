package loja.desconto;

import loja.CarrinhoDeCompras;

public class CalculadoraDesconto {

	public double calcular(CarrinhoDeCompras carrinhoDeCompras) {
		System.out.println("entrou no método calcular");
		Desconto desconto = 
				new DescontoClienteFidelidadeIgualOuMaiorADezAnos(
				new DescontoCompraComMaisDe10Itens(
				new DescontoValorMaiorQueQuinhetos(
				new SemDesconto(
				)
				)
				)
				);
				
				new SemDesconto();
		return desconto.calcular(carrinhoDeCompras);
	}
}
