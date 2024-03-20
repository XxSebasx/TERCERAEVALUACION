package Herencia.Extras.RefugioDeAnimales;

public enum VacunaGato implements Vacuna {
    HERPES("Herpes Felino Tipo 1",true,36),CALICIVIRUS("Calicivirus Felino",true,36),
    PANLEUCOPENIA("Panleucopenia Felina",true,36),FCORONAVIRUS("Coronavirus",false,0),
    PERITONITIS("Peritonitis Infecciosa Felina",false,12);

    private String nombre;
    private boolean esEsensial;
    private int revacunacion;

    private VacunaGato(String nombre, boolean esEsensial, int revacunacion) {
        this.nombre = nombre;
        this.esEsensial = esEsensial;
        this.revacunacion = revacunacion;
    }

    @Override
    public String nombre() {
        return nombre;
    }

    @Override
    public boolean esEsensial() {
        return esEsensial;
    }


    

    
}
