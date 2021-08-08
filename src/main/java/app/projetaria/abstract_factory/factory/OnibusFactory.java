package app.projetaria.abstract_factory.factory;

import app.projetaria.abstract_factory.models.OnibusGrande;
import app.projetaria.abstract_factory.models.OnibusPequeno;
import app.projetaria.abstract_factory.models.Veiculo;

public class OnibusFactory extends VeiculoFactory {

    public OnibusFactory(RegularizacaoAbstractFactory regularizador) {
        super(regularizador);
    }

    @Override
    protected Veiculo criarVeiculo(String tamanho) {

        if ("pequeno".equals(tamanho)) {
            return new OnibusPequeno(this.regularizador);
        } else if ("grande".equals(tamanho)) {
            return new OnibusGrande(this.regularizador);
        }

        return null;
    }
}
