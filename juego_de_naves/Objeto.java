package semana_4.juego_de_naves;

public abstract class Objeto {
    //atributos
    private Integer posx;
    private Integer posy;
    private String direccion;


    //constructor
    public Objeto(Integer posx, Integer posy, String direccion) {
        this.posx = posx;
        this.posy = posy;
        this.direccion = direccion;
    }

    //metodos
    public abstract String irA ();

    public Integer getPosx() {
        return posx;
    }

    public void setPosx(Integer posx) {
        this.posx = posx;
    }

    public Integer getPosy() {
        return posy;
    }

    public void setPosy(Integer posy) {
        this.posy = posy;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
