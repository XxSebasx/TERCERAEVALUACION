package Herencia.Extras.RefugioDeAnimales;

public enum VacunaPerro implements Vacuna{
    MOQUILLO("Moquillo canino",true,36),PARVOVIRUS("Parvovirus canino",true,36),
    RABIA("Rabia",true,12),ADENOVIRUS("Adenovirus canino tipo I y II",true,36),
    CCORONAVIRUS("Coronavirus",false,0),LEPTOSPIRA("Leptopirosis",false,12);
    private String nombre;
    private boolean esEsensial;
    private int revacunacion;
    private VacunaPerro(String nombre, boolean esEsensial, int revacunacion) {
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
