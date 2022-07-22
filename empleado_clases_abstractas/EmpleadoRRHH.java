package semana_4.empleado_clases_abstractas;

public class EmpleadoRRHH extends Empleado{
    //atributos
    private Integer altasLogradas;

    //constructor
    public EmpleadoRRHH(String nombre, String apellido, String dni, Integer altasLogradas) {
        super(nombre, apellido, dni);
        this.altasLogradas = altasLogradas;
    }

    //metodos
    @Override
    public void trabajar() {
        System.out.println("Empleado de RRHH " + getNombre() + " trabajando");
    }
}
