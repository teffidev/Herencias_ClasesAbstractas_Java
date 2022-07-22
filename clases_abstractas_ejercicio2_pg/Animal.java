package semana_4.clases_abstractas_ejercicio2_pg;

public abstract class Animal {
    //atributos
    private String nombre;
    private Integer edad;


    //constructor
    public Animal(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //metodos
    public abstract void hacerRuido();
}
