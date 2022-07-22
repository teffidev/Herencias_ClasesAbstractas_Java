package semana_4.juego_de_naves;

public class Nave extends Objeto{
    //atributos
    private double velocidad;
    private Integer vida;


    //constructor
    public Nave(Integer posx, Integer posy, String direccion, double velocidad, Integer vida) {
        super(posx, posy, direccion);
        this.velocidad = velocidad;
        this.vida = vida;
    }


    //metodos
    @Override
    public String irA() {
        return "El objeto tiene una posicion en y: " + getPosy();
    }

    public String girar(String direccion) {
        if (getDireccion() == direccion) {
            return "Hacer un giro";
        }
        return "Ir a la posicion";
    }

    public int restaVida(int valor){
        if (getPosx() == valor) {
            return getPosx() - restaVida(8);
        }
        return getPosy() - restaVida(8);
    }
}
