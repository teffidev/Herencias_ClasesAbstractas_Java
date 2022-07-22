package semana_4;

public class ProgramCupcake {
    public static void main(String[] args) {

        CupcakeListo cupcakeParaJuanito = new CupcakeListo("Chocolate", "Chocolate");

        cupcakeParaJuanito.serVendido();
        cupcakeParaJuanito.serServidoEnLaTienda();

        CupcakeCongelado cupcakeParaJuana = new CupcakeCongelado("fresa", "Papel Chicle");

        cupcakeParaJuana.serVendido();
        cupcakeParaJuana.serGuardado();

        cupcakeParaJuanito.serVendido("Cupon1");

        CupcakeCrypto cambalache = new CupcakeCrypto("Chocolate", 230);
        cambalache.serVendido();

    }

}
