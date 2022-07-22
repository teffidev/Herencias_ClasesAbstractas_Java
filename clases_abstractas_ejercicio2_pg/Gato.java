package semana_4.clases_abstractas_ejercicio2_pg;

public class Gato extends Animal {

    public Gato(String nombre, Integer edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerRuido() {
        System.out.println("miau");
    }
}
