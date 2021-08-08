package app.projetaria.abstract_factory.models;

import app.projetaria.abstract_factory.factory.RegularizacaoAbstractFactory;

public class CarroPequeno extends Veiculo {

    public CarroPequeno(RegularizacaoAbstractFactory regularizador) {
        super(regularizador);
    }

    @Override
    public void obterTamanho() {
        System.out.println("Carro pequeno");
    }
}
