package app.projetaria.abstract_factory;

import app.projetaria.models.Veiculo;

public abstract class VeiculoFactory {

    RegularizacaoAbstractFactory regularizador;

    public VeiculoFactory(RegularizacaoAbstractFactory regularizador) {
        this.regularizador = regularizador;
    }

    public Veiculo gerarPedidoVeiculo(String tamanho) {
        Veiculo veiculo = criarVeiculo(tamanho);

        veiculo.obterTamanho();
        veiculo.emplacar();
        veiculo.licenciar();

        return veiculo;
    }

    protected abstract Veiculo criarVeiculo(String tamanho);
}
