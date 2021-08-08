package app.projetaria.models;

public class SantaCatarinaLicenciamento implements Licenciamento {

    @Override
    public Boolean licenciar() {
        System.out.println("Licenciando veículo em Santa Catarina");
        return Boolean.TRUE;
    }
}
