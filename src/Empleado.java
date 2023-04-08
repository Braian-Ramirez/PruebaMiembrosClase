public class Empleado {
    private String primerNombre;
    private String primerApellido;
    private static  int cuenta = 0;

    public Empleado( String nombre, String apellido){
        primerNombre = nombre;
        primerApellido = apellido;
        cuenta ++;
        System.out.printf("Constructor de Empleado: %s %s; cuenta = %d\n ", primerNombre, primerApellido, cuenta);
    }

    protected void finalize(){
        cuenta --;
        System.out.printf("Finalizador de Empleado: %s %s; cuenta = %d\n", primerNombre, primerApellido,cuenta);
    }
    public String getPrimerNombre(){
        return primerNombre;
    }
    public String getPrimerApellido(){
        return primerApellido;
    }
    public static  int getCuenta(){
        return cuenta;
    }
}
