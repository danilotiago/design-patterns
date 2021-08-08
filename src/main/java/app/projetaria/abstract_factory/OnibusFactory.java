package app.projetaria.abstract_factory;

import app.projetaria.models.OnibusGrande;
import app.projetaria.models.OnibusPequeno;
import app.projetaria.models.Veiculo;

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
