package Gestion_votos;


import Gestion_votos.GestionElecciones;
import java.io.Serializable;
import java.io.*;

public class Datos {
    public static GestionElecciones data = new GestionElecciones();
    public static Gestioncontrasena data1 = new Gestioncontrasena();
    private static final String archivo = "C:/Users/sherlock/Documents/fichero.txt";
    
    
       public static void main(String[] args) {
           cargarDatos(); 
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            guardarDatos(); 
            System.out.println("Datos guardados automáticamente al cerrar el programa.");
        }));

    }
    public static void guardarDatos() {
        try {
            try (FileOutputStream fileOutputStream = new FileOutputStream(archivo);
                 ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {

                objectOutputStream.writeObject(data);
                objectOutputStream.writeObject(data1);

                System.out.println("Datos guardados correctamente en: " + archivo);
            }
        } catch (IOException e) {
            System.err.println("Error al guardar los datos: " + e.getMessage());
        }
    }

 public static void cargarDatos() {
    File archivo2 = new File(archivo);
   try {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(archivo2));

        // Leer los objetos del archivo
        data = (GestionElecciones) objectInputStream.readObject();
        data1 = (Gestioncontrasena) objectInputStream.readObject();

        System.out.println("Datos cargados correctamente desde: " + archivo);

        objectInputStream.close();
    } catch (Exception e) {
        
    }
    
}
}