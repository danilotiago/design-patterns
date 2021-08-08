package app.projetaria.abstract_factory.models;

import app.projetaria.abstract_factory.factory.RegularizacaoAbstractFactory;

public class OnibusPequeno extends Veiculo {

    public OnibusPequeno(RegularizacaoAbstractFactory regularizador) {
        super(regularizador);
    }

    @Override
    public void obterTamanho() {
        System.out.println("Ônibus pequeno");
    }
}
