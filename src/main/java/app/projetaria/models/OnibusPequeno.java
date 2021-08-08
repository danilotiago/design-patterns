package app.projetaria.models;

import app.projetaria.abstract_factory.RegularizacaoAbstractFactory;

public class OnibusPequeno extends Veiculo {

    public OnibusPequeno(RegularizacaoAbstractFactory regularizador) {
        super(regularizador);
    }

    @Override
    public void obterTamanho() {
        System.out.println("Ônibus pequeno");
    }
}
