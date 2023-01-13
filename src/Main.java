public class Main {
    public static void main(String[] args) {
        System.out.println("CLIENTE");
        Cliente cliente = new Cliente();
        cliente.nombre = "Matias";
        cliente.edad = 35;
        cliente.telefono = 123456789;
        cliente.credito = "apto";

        cliente.datos();
        cliente.aptoCredito();

        System.out.println("TRABAJADOR");
        Trabajador trabajador = new Trabajador();
        trabajador.nombre = "Carlos";
        trabajador.edad = 40;
        trabajador.telefono = 987654321;
        trabajador.salario = 2000;

        trabajador.datos();
        trabajador.salarioMensual();
    }
}