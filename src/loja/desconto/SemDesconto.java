package loja.desconto;
import loja.CarrinhoDeCompras;

public class SemDesconto extends Desconto{

	public SemDesconto() {
		super(null);
	}

	@Override
	public double efetuarCalculo(CarrinhoDeCompras carrinhoDeCompras) {
		return 0;
	}

	@Override
	public boolean deveAplicar(CarrinhoDeCompras carrinhoDeCompras) {
		return true;
	}

}
