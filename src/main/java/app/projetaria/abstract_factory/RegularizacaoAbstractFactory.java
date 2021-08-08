package app.projetaria.abstract_factory;

import app.projetaria.models.Emplacamento;
import app.projetaria.models.Licenciamento;

public interface RegularizacaoAbstractFactory {

    Licenciamento obterLicenciamento();

    Emplacamento obterEmplacamento();
}
