package app.projetaria.abstract_factory.models;

import app.projetaria.abstract_factory.factory.RegularizacaoAbstractFactory;

public class CarroGrande extends Veiculo {

    public CarroGrande(RegularizacaoAbstractFactory regularizador) {
        super(regularizador);
    }

    @Override
    public void obterTamanho() {
        System.out.println("Carro grande");
    }
}
