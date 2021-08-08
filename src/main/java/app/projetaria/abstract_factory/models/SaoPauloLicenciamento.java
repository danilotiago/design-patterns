package app.projetaria.abstract_factory.models;

public class SaoPauloLicenciamento implements Licenciamento {

    @Override
    public Boolean licenciar() {
        System.out.println("Licenciando veículo em São Paulo");
        return Boolean.TRUE;
    }
}
