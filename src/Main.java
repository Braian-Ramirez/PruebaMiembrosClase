public class Main {
    public static void main(String[] args) {

        System.out.printf("Empleados antes de instanciar: %d\n", Empleado.getCuenta());

        Empleado contratacion1 = new Empleado("Tatiana","Quilindo");
        Empleado contratacion2 = new Empleado("Braian","Ramírez");

        System.out.println("\nEmpleados después de instanciar: ");
        System.out.println(contratacion1.getCuenta());
        System.out.println(contratacion2.getCuenta());
        System.out.println(Empleado.getCuenta());

        System.out.printf("\nEmpleado 1: %s %s\nEmpleado 2: %s %s\n\n", contratacion1.getPrimerNombre(), contratacion1.getPrimerApellido(), contratacion2.getPrimerNombre(), contratacion2.getPrimerApellido());

        contratacion1 = null;
        contratacion2 = null;

        System.gc();

        System.out.printf("\nEmpleados después de system.gc(): %d\n", Empleado.getCuenta());



    }
}