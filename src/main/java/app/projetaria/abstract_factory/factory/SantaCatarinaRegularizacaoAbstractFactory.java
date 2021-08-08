package app.projetaria.abstract_factory.factory;

import app.projetaria.abstract_factory.models.Emplacamento;
import app.projetaria.abstract_factory.models.Licenciamento;
import app.projetaria.abstract_factory.models.SantaCatarinaEmplacamento;
import app.projetaria.abstract_factory.models.SantaCatarinaLicenciamento;

public class SantaCatarinaRegularizacaoAbstractFactory implements RegularizacaoAbstractFactory {

    @Override
    public Licenciamento obterLicenciamento() {
        return new SantaCatarinaLicenciamento();
    }

    @Override
    public Emplacamento obterEmplacamento() {
        return new SantaCatarinaEmplacamento();
    }
}
