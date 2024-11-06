package br.com.anac;

public class SemContratoFabrica extends Fabrica {

	@Override
	Carro retirarCarro(String notaSolicitada1) {
		if ("A".equals(notaSolicitada1)) {
			return new OnixCarro("200 cv", "Vermelho", "Diesel");
		} else {
		return null;
	}

}
}