package app.projetaria.models;

public class SantaCatarinaEmplacamento implements Emplacamento {

    @Override
    public Boolean emplacar() {
        System.out.println("Emplacando veículo em Santa Catarina");
        return Boolean.TRUE;
    }
}
