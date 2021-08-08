package app.projetaria.abstract_factory.factory;

import app.projetaria.abstract_factory.models.CarroGrande;
import app.projetaria.abstract_factory.models.CarroPequeno;
import app.projetaria.abstract_factory.models.Veiculo;

public class CarroFactory extends VeiculoFactory {

    public CarroFactory(RegularizacaoAbstractFactory regularizador) {
        super(regularizador);
    }

    @Override
    protected Veiculo criarVeiculo(String tamanho) {

        if ("pequeno".equals(tamanho)) {
            return new CarroPequeno(this.regularizador);
        } else if ("grande".equals(tamanho)) {
            return new CarroGrande(this.regularizador);
        }

        return null;
    }
}
