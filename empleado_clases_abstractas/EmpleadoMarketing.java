package semana_4.empleado_clases_abstractas;

public class EmpleadoMarketing extends Empleado{
    //atributos
    private String area;

    //constructor
    public EmpleadoMarketing(String nombre, String apellido, String dni, String area) {
        super(nombre, apellido, dni);
        this.area = area;
    }

    //metodos
    @Override
    public void trabajar() {
        System.out.println("Empleado de Marketing " + getNombre() + " trabajando en " + area);
    }

    public void trabajar(int horasExtras){
        System.out.println("Empleado de Marketing " + getNombre() + " trabajando en " + area + " con " + horasExtras + " horas extra.");
    }
}
