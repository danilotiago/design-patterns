package app.projetaria.models;

import app.projetaria.abstract_factory.RegularizacaoAbstractFactory;

public class CarroPequeno extends Veiculo {

    public CarroPequeno(RegularizacaoAbstractFactory regularizador) {
        super(regularizador);
    }

    @Override
    public void obterTamanho() {
        System.out.println("Carro pequeno");
    }
}
