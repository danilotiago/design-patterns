package app.projetaria.abstract_factory;

import app.projetaria.abstract_factory.factory.CarroFactory;
import app.projetaria.abstract_factory.factory.RegularizacaoAbstractFactory;
import app.projetaria.abstract_factory.factory.SantaCatarinaRegularizacaoAbstractFactory;
import app.projetaria.abstract_factory.factory.SaoPauloRegularizacaoAbstractFactory;
import app.projetaria.abstract_factory.factory.OnibusFactory;
import app.projetaria.abstract_factory.models.Veiculo;

public class Cliente {

    public static void main(String[] args) {

        RegularizacaoAbstractFactory regularizacaoSp = new SaoPauloRegularizacaoAbstractFactory();
        RegularizacaoAbstractFactory regularizacaoSc = new SantaCatarinaRegularizacaoAbstractFactory();

        CarroFactory carroFactory = new CarroFactory(regularizacaoSc);
        OnibusFactory onibusFactory = new OnibusFactory(regularizacaoSc);

        System.out.println("Gerando pedido de carro");
        Veiculo carro = carroFactory.gerarPedidoVeiculo("pequeno");
        System.out.println(carro);

        System.out.println("Gerando pedido de ônibus");
        Veiculo onibus = onibusFactory.gerarPedidoVeiculo("grande");
        System.out.println(onibus);
    }
}
