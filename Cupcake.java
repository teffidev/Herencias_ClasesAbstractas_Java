package semana_4;

public class Cupcake {
    //atributos
    private String sabor;
    private double precio;


    //constructor
    public Cupcake(String sabor) {
        this.sabor = sabor;
    }


    //metodos
    public void serVendido (){
        System.out.println("Se vendio este cupcake");
    }

}
