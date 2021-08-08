package app.projetaria.abstract_factory.factory;

import app.projetaria.abstract_factory.models.Emplacamento;
import app.projetaria.abstract_factory.models.Licenciamento;
import app.projetaria.abstract_factory.models.SaoPauloEmplacamento;
import app.projetaria.abstract_factory.models.SaoPauloLicenciamento;

public class SaoPauloRegularizacaoAbstractFactory implements RegularizacaoAbstractFactory {

    @Override
    public Licenciamento obterLicenciamento() {
        return new SaoPauloLicenciamento();
    }

    @Override
    public Emplacamento obterEmplacamento() {
        return new SaoPauloEmplacamento();
    }
}
