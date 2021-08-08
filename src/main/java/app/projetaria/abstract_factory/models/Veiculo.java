package app.projetaria.abstract_factory.models;

import app.projetaria.abstract_factory.factory.RegularizacaoAbstractFactory;

public abstract class Veiculo {

    RegularizacaoAbstractFactory regularizador;

    public Veiculo(RegularizacaoAbstractFactory regularizador) {
        this.regularizador = regularizador;
    }

    public void licenciar() {
        System.out.println("Licenciando veículo");
        this.regularizador.obterLicenciamento().licenciar();
    }

    public void emplacar() {
        System.out.println("Emplacando veículo");
        this.regularizador.obterEmplacamento().emplacar();
    }

    public abstract void obterTamanho();
}
