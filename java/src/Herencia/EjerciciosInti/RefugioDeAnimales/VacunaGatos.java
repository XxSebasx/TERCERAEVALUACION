public enum VacunaGatos implements Vacuna {
    HERPES("Herpes Felino Tipo 1",true,36),CALICIVIRUS("Calicivirus Felino",true,36),
    PANLEUCOPENIA("Panleucopenia Felina",true,36),FCORONAVIRUS("Coronavirus",false,0),
    PERITONITIS("Peritonitis Infecciosa Felina",false,12);
    
    private String nombreVacuna;
    private boolean esencial;
    private int revacunacion;
    
    private VacunaGatos(String nombreVacuna, boolean esencial, int revacunacion) {
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

    public static void main(String[] args) {
        Dosis dosis = new Dosis(CALICIVIRUS);
        System.out.println(dosis);
    }
}
