package semana_4.empleado_clases_abstractas;

public class EmpleadoProduccion extends Empleado{
    //atributos
    private Integer tiempoExperiencia;

    //constructor
    public EmpleadoProduccion(String nombre, String apellido, String dni, Integer tiempoExperiencia) {
        super(nombre, apellido, dni);
        this.tiempoExperiencia = tiempoExperiencia;
    }

    //metodos
    @Override
    public void trabajar() {
        System.out.println("Empleado de Produccion " + getNombre() + " trabajando");
    }
}
