package ejemplo_inicial;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hola mundo!!!");

        //Realizo la serialización
        BagOfPrimitives bop = new BagOfPrimitives();
        Gson gson = new Gson();

        String json = gson.toJson(bop);

        System.out.println(json);

        System.out.println("\n\n\n");

        Alumno alumno1 = new Alumno("Pepe", "Perez", "Aquí", 30);

        String alumno_json = gson.toJson(alumno1);

        System.out.println(alumno_json);

        Alumno alumno2 = gson.fromJson(alumno_json, Alumno.class);

        System.out.println(alumno2);
    }
}