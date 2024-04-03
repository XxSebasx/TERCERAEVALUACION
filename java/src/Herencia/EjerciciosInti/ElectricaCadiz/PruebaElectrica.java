package Herencia.EjerciciosInti.ElectricaCadiz;

public class PruebaElectrica {
    public static void main(String[] args) {
        Electrica eCadiz = new Electrica();
        Cliente cliente = new Cliente("12345678A", 3.0);
        Cliente cliente2 = new ClientePaneles("98765432B", 5.5);
        Cliente cliente3 = new ClienteSmart("54321678C", 4.0, 10.0); 
        eCadiz.agregarCliente(cliente);
        eCadiz.agregarCliente(cliente2);
        eCadiz.agregarCliente(cliente3);
        System.out.println("Número de clientes con paneles: " + eCadiz.getCantidadClientesPaneles());
        System.out.println("Facturación total de la compañía: " + eCadiz.getFacturacionTotal());
    }
}