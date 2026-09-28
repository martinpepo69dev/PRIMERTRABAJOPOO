package com.poo.entidadbancomartin.testentidadbancomartin;

import com.poo.entidadbancomartin.entidades.CajaAhorro;
import com.poo.entidadbancomartin.entidades.Cliente;
import com.poo.entidadbancomartin.entidades.ClientesEmpresa;
import com.poo.entidadbancomartin.entidades.ClientesIndividuales;
import com.poo.entidadbancomartin.entidades.CuentaCorriente;
import com.poo.entidadbancomartin.entidades.Cuentas;

public class testcuentas {
    public static void main(String[] args) {

        // aca creamos un nuevo cliente empresa - denominado primerclienteempresa con id
        // 1, nombre kentucy y cuit 33-22
        // primero la clase padre Cliente y luego la clase hija ClientesEmpresa
        Cliente primerclienteempresa = new ClientesEmpresa(1, "kentucy", "33-22");
        System.out.println("el nuevo cliente empresa es:" + primerclienteempresa);

        // aca creamos un nuevo cliente2 - cliente individual - demonidado maxi perez
        // con id 2, nombre maxi y apellido perez y dni 42334222
        // id 2 hace referencia a que es el segundo cliente creado, ya que el primer
        // cliente creado fue el primerclienteempresa con id 1
        Cliente cliente2 = new ClientesIndividuales(2, "Maxi", "Perez", "42334222");
        System.out.println("el nuevo cliente individual es:" + cliente2);

        System.out.println();

        // cliente2 = id 2, nombre maxi, apellido perez, dni 42334222
        // numero de cuenta 101
        // saldo 0, descubierto 1000
        // ahora maxi perez tiene una cuenta corriente con numero de cuenta 101, saldo 0
        // y descubierto 1000
        Cuentas cuenta1 = new CuentaCorriente(101, "Maxi Perez", 0, cliente2, 0, 1000);
        System.out.println(cuenta1);

        System.out.println();// hasta esta instancia tenemos creado un cliente empresa y un cliente
                             // individual, y una cuenta corriente para el cliente individual

        // creamos una cuenta2 es decir una nueva cuenta corriente para el cliente2, con
        // numero de cuenta 202, saldo 0 y descubierto 1500
        // ahora maxi perez tiene dos cuentas corrientes, una con numero de cuenta 101 y
        // otra con numero de cuenta 202

        Cuentas cuenta2 = new CuentaCorriente(202, "Maxi Perez", 0, cliente2, 0, 1500);
        System.out.println(cuenta2);
        cuenta2.depositareft(200);
        System.out.println(cuenta2.getSaldo());
        System.out.println(cuenta2.getClienteasociado()); // se puede obtener el cliente asociado a la cuenta
        cuenta2.depositareft(800);
        System.out.println(cuenta2.getSaldo());
        cuenta2.extraereft(125);
        System.out.println(cuenta2.getSaldo());
        System.out.println(cuenta2.getNrocuenta()); // se puede obtener el número de cuenta (202)
        System.out.println(cuenta2.getCliente());

        System.out.println();

        cuenta1.depositareft(-1000); // no se puede depositar un monto negativo
        cuenta1.extraereft(-10000); // no se puede extraer un monto negativo
        cuenta1.extraereft(10); // se puede extraer un monto positivo
        cuenta1.depositareft(100); // se puede depositar un monto positivo
        System.out.println(cuenta1.getSaldo()); // se puede obtener el saldo de la cuenta
        System.out.println(cuenta1.getCliente()); // se puede obtener el cliente asociado a la cuenta
        System.out.println(cuenta1.getNrocuenta()); // se puede obtener el número de cuenta (101)

        System.out.println();

        // aca creamos una nueva caja de ahorro para el cliente2 , ya tenia 2 cuenta
        // corrientes
        // y ahora tiene una caja de ahorro con numero de cuenta 303, saldo 200 y tasa
        // de interes 10%
        CajaAhorro cuenta3 = new CajaAhorro(303, "Javier Rodriguez", 0, cliente2, 00, 10.0f);
        System.out.println("Cliente asociado: " + cuenta3.getCliente()); // se puede obtener el cliente asociado a la
                                                                         // cuenta
        System.out.println("Número de cuenta: " + cuenta3.getNrocuenta()); // se puede obtener el número
        System.out.println("Saldo de la caja de ahorro: " + cuenta3.getSaldo()); // se puede obtener el saldo de la
                                                                                 // cuenta
        System.out.println("Tasa de interés: " + cuenta3.getTasainteres()); // se puede obtener la tasa de interés de la
                                                                            // caja de ahorro
        System.out.println("Cliente asociado: " + cuenta3.getClienteasociado()); // se puede obtener el cliente asociado
                                                                                 // a la cuenta
        // testeamos cobrar interes de la caja de ahorro, el saldo inicial es 200 y la
        // tasa de interes es 10%, por lo que el interes a cobrar es 20, entonces el
        // saldo final debe ser 220
        cuenta3.cobrarInteres();
        System.out.println("Saldo de la caja de ahorro después de cobrar interés: " + cuenta3.getSaldo()); // se puede
                                                                                                           // obtener el
                                                                                                           // saldo de
                                                                                                           // la cuenta

        // no habia saldo en la caja de ahorro, entonces el interes a cobrar es 0, por
        // lo que el saldo final debe ser 0
        cuenta3.extraereft(220); // no se puede extraer un monto mayor al saldo
        System.out.println("Saldo de la caja de ahorro después de extraer: " + cuenta3.getSaldo()); // se puede obtener
                                                                                                    // el saldo de la
                                                                                                    // cuenta
        // depositamos saldo en nrocuenta 303, es decir en la caja de ahorro,
        // depositamos 1000
        cuenta3.depositareft(1000);
        System.out.println("Saldo de la caja de ahorro después de depositar: " + cuenta3.getSaldo()); // se puede
                                                                                                      // obtener el
                                                                                                      // saldo de la
                                                                                                      // cuenta
        // cobramos intereses
        cuenta3.cobrarInteres();
        System.out.println("Saldo de la caja de ahorro después de cobrar interés: " + cuenta3.getSaldo()); // se puede
                                                                                                           // obtener el
                                                                                                           // saldo de
        cuenta3.depositareft(135000);
        System.out.println(cuenta3.getSaldocaja());   
        cuenta3.cobrarInteres();
          System.out.println(cuenta3.getSaldocaja());   // acumulo intereses
          cuenta3.cobrarInteres();
          System.out.println(cuenta3.getSaldocaja());   // acumulo intereses se ve el saldo final
           System.out.println(cuenta3.getSaldo());
    }


}
