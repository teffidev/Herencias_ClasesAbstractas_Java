package semana_4.juego_de_naves;

public class Asteroide extends Objeto{
    //atributos
    private Integer lesion;


    //constructor
    public Asteroide(Integer posx, Integer posy, String direccion, Integer lesion) {
        super(posx, posy, direccion);
        this.lesion = lesion;
    }


    //metodos
    @Override
    public String irA() {
        return "El Asteroide: " + getPosy();
    }
}
