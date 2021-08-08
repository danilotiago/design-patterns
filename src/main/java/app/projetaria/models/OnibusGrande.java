package app.projetaria.models;

import app.projetaria.abstract_factory.RegularizacaoAbstractFactory;

public class OnibusGrande extends Veiculo {

    public OnibusGrande(RegularizacaoAbstractFactory regularizador) {
        super(regularizador);
    }

    @Override
    public void obterTamanho() {
        System.out.println("Ônibus grande");
    }
}
