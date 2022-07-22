package semana_4.clases_abstractas_ejercicio2_pg;

public class Perro extends Animal {

    public Perro(String nombre, Integer edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerRuido() {
        System.out.println("woof");
    }
}
