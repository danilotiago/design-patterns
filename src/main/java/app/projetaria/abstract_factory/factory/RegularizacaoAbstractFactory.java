package app.projetaria.abstract_factory.factory;

import app.projetaria.abstract_factory.models.Emplacamento;
import app.projetaria.abstract_factory.models.Licenciamento;

public interface RegularizacaoAbstractFactory {

    Licenciamento obterLicenciamento();

    Emplacamento obterEmplacamento();
}
