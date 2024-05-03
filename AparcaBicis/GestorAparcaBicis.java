package Ficheros.AparcaBicis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class GestorAparcaBicis {

    private String lineaComandos;

    public GestorAparcaBicis(String lineaComandos) throws LineaComandosException {
        if(!lineaComandos.equals("Aparcabicicletas.csv")){
            throw new LineaComandosException("Nombre de fichero incorrecto");
        }
        this.lineaComandos = lineaComandos;
        
        
    }

    public void ordenarBarrios(){
        try(BufferedReader bbfr = new BufferedReader(new FileReader(lineaComandos));
        BufferedReader abfr = new BufferedReader(new FileReader(lineaComandos))) {
            Set<Barrio> barrios = new TreeSet<>();
            String linea = bbfr.readLine();

            while (linea != null) {
                String[] partes = linea.split(",");
                Barrio barrio = new Barrio(partes[3]);
                barrios.add(barrio);
                linea = bbfr.readLine();
            }

            linea = abfr.readLine();
            while (linea != null) {
                String[] partes = linea.split(",");
                double x = Double.parseDouble(partes[0]);
                double y = Double.parseDouble(partes[1]);
                int id = Integer.parseInt(partes[2]);
                String nombreBarrio = partes[3];
                int aros = Integer.parseInt(partes[4]);
                boolean instalado = true;
                if(partes[5].equals("NO")){
                    instalado = false;
                }
                AparcaBicicleta aparcaBicicleta = new AparcaBicicleta(x, y, id, nombreBarrio, aros, instalado);
                for (Barrio barrio : barrios) {
                    if(barrio.getNombre().equals(nombreBarrio)){
                        barrio.aniadirAparcabicicleta(aparcaBicicleta);
                        barrio.incrementarCantidad();
                        if(aparcaBicicleta.isInstalado()){
                            barrio.incrementarInstalados();
                        }
                    }
                }
                linea = abfr.readLine();
            }

            for (Barrio barrio : barrios) {
                System.out.println();
                System.out.println("Barrio: " + barrio.getNombre());
                System.out.println("Cantidad de aparcabicicletas: " + barrio.getCantidadAparcabicis());
                System.out.println("Aparcabicicletas instalados: " + barrio.getInstalados());
                for (AparcaBicicleta aparcaBicicleta : barrio.getAparcaBicicletas()) {
                    String instalado = "NO";
                    System.out.println("Aparcababicicleta id" + aparcaBicicleta.getId());
                    System.out.println("coordenadaX: " + aparcaBicicleta.getX());
                    System.out.println("coordenadaY: " + aparcaBicicleta.getY());
                    System.out.println("aros: "+ aparcaBicicleta.getAros());
                    if(aparcaBicicleta.isInstalado()){
                        instalado = "SI";
                    }
                    System.out.println("Instalado: " + instalado);
                }
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void ordenarId(){
        Set<AparcaBicicleta> aparcabicis = new TreeSet<>();
        try (BufferedReader bf = new BufferedReader(new FileReader(lineaComandos))){
            String linea = bf.readLine();
            while (linea != null) {
                String[] partes = linea.split(",");
                double x = Double.parseDouble(partes[0]);
                double y = Double.parseDouble(partes[1]);
                int id = Integer.parseInt(partes[2]);
                String nombreBarrio = partes[3];
                int aros = Integer.parseInt(partes[4]);
                boolean instalado = true;
                if(partes[5].equals("NO")){
                    instalado = false;
                }
                AparcaBicicleta aparcaBicicleta = new AparcaBicicleta(x, y, id, nombreBarrio, aros, instalado);
                aparcabicis.add(aparcaBicicleta);
                linea = bf.readLine();
            }

            for (AparcaBicicleta aparcaBicicleta : aparcabicis) {
                System.out.println();
                String instalado = "NO";
                System.out.println("Aparcababicicleta id" + aparcaBicicleta.getId());
                System.out.println("coordenadaX: " + aparcaBicicleta.getX());
                System.out.println("coordenadaY: " + aparcaBicicleta.getY());
                System.out.println("aros: "+ aparcaBicicleta.getAros());
                if(aparcaBicicleta.isInstalado()){
                    instalado = "SI";
                }
                System.out.println("Instalado: " + instalado);
            }

            
            
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String lineaComandos = entrada.nextLine();
        try {
            GestorAparcaBicis gestorAparcaBicis = new GestorAparcaBicis(lineaComandos);
            gestorAparcaBicis.ordenarBarrios();
            System.out.println("================================================================================================");
            gestorAparcaBicis.ordenarId();
        } catch (LineaComandosException e) {
            e.printStackTrace();
        }
    }
}
