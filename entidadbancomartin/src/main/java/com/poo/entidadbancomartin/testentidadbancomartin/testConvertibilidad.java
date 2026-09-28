package com.poo.entidadbancomartin.testentidadbancomartin;

import com.poo.entidadbancomartin.entidades.Cliente;
import com.poo.entidadbancomartin.entidades.ClientesEmpresa;
import com.poo.entidadbancomartin.entidades.CuentaConvertibilidad;

public class testConvertibilidad {
    public static void main(String[] args) {
        System.out.println("--- INICIANDO PRUEBA DE CONVERTIBILIDAD---");
        // creamos un cliente de tipo ClientesEmpresa para poder crear una cuenta de
        // tipo CuentaConvertibilidad
        Cliente cliente9 = new ClientesEmpresa(1, "McDonalls", "33-22");
        // creamos una cuenta de tipo CuentaConvertibilidad para el cliente1

        CuentaConvertibilidad cuenta9 = new CuentaConvertibilidad(1, "McDonalls", "33-22");
        System.out.println("el nuevo cliente empresa es:" + cliente9);
        System.out.println("la nueva cuenta de convertibilidad es:" + cuenta9);
        // depositamos 1000 dolares en la cuenta de convertibilidad
        // aca podemos ver que el metodo depositarDolares de la clase
        // CuentaConvertibilidad funciona correctamente
        cuenta9.depositarDolares(1000);
        System.out.println("el saldo en dolares de la cuenta de convertibilidad es:" + cuenta9.getSaldoDolares());
        // extraemos 500 dolares de la cuenta de convertibilidad

        boolean extraccionExitosa = cuenta9.extraerDolares(500);
        System.out.println("extracción de 500 dolares exitosa: " + extraccionExitosa);
        System.out.println("el saldo en dolares de la cuenta de convertibilidad es:" + cuenta9.getSaldoDolares());
        // intentamos extraer 600 dolares de la cuenta de convertibilidad, pero no hay
        // suficiente saldo
        boolean extraccionExitosa2 = cuenta9.extraerDolares(600);
        System.out.println("extracción de 600 dolares exitosa: " + extraccionExitosa2);
        System.out.println("el saldo en dolares de la cuenta de convertibilidad es:" + cuenta9.getSaldoDolares());

        // ------------------------------------------------------------------------------------------

        // nuestra cuenta9 ya tenia previamente depositado 600 usd a continuacion vamos
        // a testear
        // los metodos de conversion de dolares a pesos y pesos a dolares:
        System.out.println(cuenta9.getSaldoDolares()); // visualizamos el saldoDolares
        cuenta9.convertirDolaresAPesos(250, 1500);
        cuenta9.convertirDolaresAPesos(400, 1500); // supera nuestro saldo de dolares , no se realiza la accion
        System.out.println(cuenta9.getSaldoPesos());
        cuenta9.convertirPesosADolares(300000, 1480); // convertimos 202 usd

    }

}
