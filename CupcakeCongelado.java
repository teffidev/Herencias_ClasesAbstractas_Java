package semana_4;

public class CupcakeCongelado extends Cupcake {
    //atributos
    private String envoltorio;


    //constructor
    public CupcakeCongelado(String sabor, String envoltorio) {
        super(sabor);
        this.envoltorio = envoltorio;
    }


    //metodos
    public void serGuardado(){
        System.out.println("El cupcake debe ser guardado para su conservacion!");
    }



}
