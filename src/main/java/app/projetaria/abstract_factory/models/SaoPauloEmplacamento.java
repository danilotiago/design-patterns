package app.projetaria.abstract_factory.models;

public class SaoPauloEmplacamento implements Emplacamento {

    @Override
    public Boolean emplacar() {
        System.out.println("Emplacando veículo em São Paulo");
        return Boolean.TRUE;
    }
}
