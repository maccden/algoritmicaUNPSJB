import operaciones.CuentaCorriente;
import operaciones.CuentaBancaria;
import operaciones.Banco;
import operaciones.CajaAhorro;
import operaciones.Cliente;

public class punto08 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Pedro", "Jota 12", "pedro@gmial.com", "23332");
        CuentaBancaria cuentaBancaria1 = new CuentaBancaria("001", 1000.0, cliente1);
        Banco banco = new Banco();

        cliente1.agregarCuenta(cuentaBancaria1);
        banco.agregarCliente(cliente1);
        banco.agregarCuenta(cuentaBancaria1);

        cuentaBancaria1.depositar(500.0);
        cuentaBancaria1.extraer(200.0);

        CajaAhorro cajaAhorro1 = new CajaAhorro("002", 2000.0, cliente1);

        cajaAhorro1.depositar(100.0);
        cajaAhorro1.extraer(300.0);

        CuentaCorriente cuentaCorriente1 = new CuentaCorriente("003", 3000.0, cliente1, -10000);

        cuentaCorriente1.depositar(200.0);
        cuentaCorriente1.extraer(4000.0);

        double saldoTotalCliente1 = cliente1.getSaldoTotalCuentas();
        System.out.println("El saldo total del cliente " + cliente1.getNombre() + " es $" + saldoTotalCliente1);

        Double sumaTotalSaldoClientes = banco.saldoTotalDeClientes();
        System.out.println("Suma total de los saldos de los clientes es $" + sumaTotalSaldoClientes);

        double sumaTotalDeSaldoNegativo = banco.saldoNegaticoTotalDeCuentas();
        System.out.println("Suma total de los saldos negativos de los clientes es $" + sumaTotalDeSaldoNegativo);
    }
}