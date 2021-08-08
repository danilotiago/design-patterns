package app.projetaria.abstract_factory;

import app.projetaria.models.Emplacamento;
import app.projetaria.models.Licenciamento;
import app.projetaria.models.SaoPauloEmplacamento;
import app.projetaria.models.SaoPauloLicenciamento;

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
