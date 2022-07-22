package semana_4.clases_abstractas_ejercicio2_pg;

public class ProgramAnimal {

    public static void main(String[] args) {
        //write your code here

        Animal animal = new Perro("firulais", 5);

        //En el caso de reasignar la variable
        animal = new Gato("Garfield", 9);

        animal.hacerRuido(); //El sistema sabe el sonido del perro por el polimorfismo.

        //El dia de mañana no importa cuantos hijos de animal tengamos
        //Cada uno va a recibir el mensaje hacer ruido
        //Y cada uno lo va a ejecutar de manera diferente.
        //Gracias al polimorfismo.

    }

}
