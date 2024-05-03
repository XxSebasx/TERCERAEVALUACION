package Ficheros.CochesFicheros;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<Coche> coches = new LinkedList<>();

        while (true) {
            System.out.println("1.Añadir coche");
            System.out.println("2.Mostrar coches");
            String opcion = entrada.nextLine();

            if (opcion.equals("1")) {
                System.out.println("Dime los atributos (matricula, marca, modelo, cilindrada)");
                String[] atributosCoche = entrada.nextLine().split(" ");
                Coche nuevoCoche = new Coche(atributosCoche[0], atributosCoche[1], atributosCoche[2], Double.parseDouble(atributosCoche[3]));
                coches.add(nuevoCoche);

                try (ObjectInputStream fis = new ObjectInputStream(new FileInputStream("coches.dat"))){
                    Coche coche;
                    while ((coche = (Coche) fis.readObject()) != null) {
                        coches.add(coche);
                    }
                } catch (EOFException e) {
                }catch(IOException | ClassNotFoundException e){
                    e.printStackTrace();
                }

                try (ObjectOutputStream fos = new ObjectOutputStream(new FileOutputStream("coches.dat"))) {

                    for (Coche c : coches) {
                        fos.writeObject(c);
                    }
                }catch(IOException e){
                    e.printStackTrace();
                }
            } else if (opcion.equals("2")) {
                try (ObjectInputStream fis2 = new ObjectInputStream(new FileInputStream("coches.dat"))) {
                    Coche coche;
                    while ((coche = (Coche) fis2.readObject()) != null) {
                        System.out.println(coche);
                    }
                } catch (EOFException e) {
                } catch (IOException | ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

