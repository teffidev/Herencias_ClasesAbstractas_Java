package semana_4;

public class CupcakeListo extends Cupcake {
    //atributos
    private String topping;


    //constructor
    public CupcakeListo(String sabor, String topping) {
        super(sabor); //Se invoca el constructor del Padre.
        this.topping = topping;
    }


    //métodos
    public void serServidoEnLaTienda(){
        System.out.println("Servir el cupcake al cliente para su deleite");
    }

    public void serVendido(String cupon){
        System.out.println("Se vende este cupcake con descuento");
    } //sobrecargar
}
