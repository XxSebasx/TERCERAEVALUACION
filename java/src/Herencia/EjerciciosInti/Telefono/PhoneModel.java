package Herencia.EjerciciosInti.Telefono;

public enum PhoneModel {
    IPHONE(9999, "Iphone"), HUAWEI(8888, "Huawei"), PIXEL(6666,"Pixel"), SAMSUNG(9399,"Samsung"), LG(5588,"LG");
    private int precio;
    private String nombre;

    private PhoneModel(int precio, String nombre) {
        this.precio = precio;
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }
    
    @Override
    public String toString(){
        return nombre + "   " + "price: " + precio;
    }

    
    
    
}
