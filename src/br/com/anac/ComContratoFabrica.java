package br.com.anac;

public class ComContratoFabrica extends Fabrica {

	@Override
	Carro retirarCarro(String notaSolicitada) {
		if ("A".equals(notaSolicitada)) {
			return new FiatCarro("100 cv", "Gasolina", "Prata");
		} else {
		return null;
	}

}
}
