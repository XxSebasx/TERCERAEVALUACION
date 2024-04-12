public enum VacunaPerro implements Vacuna {
    MOQUILLO("Moquillo canino",true,36),PARVOVIRUS("Parvovirus canino",true,36),RABIA("Rabia",true,12),
    ADENOVIRUS("Adenovirus canino tipo I y II",true,36),CCORONAVIRUS("Coronavirus",false,0),
    LEPTOSPIRA("Leptopirosis", false, 12);
    
    private String nombreVacuna;
    private boolean esencial;
    private int revacunacion;
    
    private VacunaPerro(String nombreVacuna, boolean esencial, int revacunacion) {
        this.nombreVacuna = nombreVacuna;
        this.esencial = esencial;
        this.revacunacion = revacunacion;
    }

    @Override
    public String nombre() {
        return nombreVacuna;
    }

    @Override
    public boolean esEsencial() {
        return esencial;
    }
    
}
