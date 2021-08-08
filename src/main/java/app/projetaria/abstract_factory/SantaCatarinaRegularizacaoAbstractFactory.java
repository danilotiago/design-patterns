package app.projetaria.abstract_factory;

import app.projetaria.models.Emplacamento;
import app.projetaria.models.Licenciamento;
import app.projetaria.models.SantaCatarinaEmplacamento;
import app.projetaria.models.SantaCatarinaLicenciamento;

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
