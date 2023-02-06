package loja.desconto;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import loja.CarrinhoDeCompras;

public class DescontoClienteFidelidadeIgualOuMaiorADezAnos extends Desconto{

	public DescontoClienteFidelidadeIgualOuMaiorADezAnos(Desconto proximo) {
		super(proximo);
	}

	@Override
	public double efetuarCalculo(CarrinhoDeCompras carrinhoDeCompras) {
		return 0.4;
	}

	@Override
	public boolean deveAplicar(CarrinhoDeCompras carrinhoDeCompras) {
		LocalDate dataAtual = LocalDate.now();
		return carrinhoDeCompras.getCliente().getFidelidade().until(dataAtual, ChronoUnit.YEARS) > 10;
	}

}
