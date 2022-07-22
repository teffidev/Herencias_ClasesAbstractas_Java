package semana_4;

public class CupcakeCrypto extends Cupcake {
    //atributos
    private double valorEnCrypto;


    //constructor
    public CupcakeCrypto(String sabor, double valorEnCrypto) {
        super(sabor);
        this.valorEnCrypto = valorEnCrypto;
    }


    //metodos
    @Override
    public void serVendido(){
        System.out.println("Se vende en Crypto");
    }
}
