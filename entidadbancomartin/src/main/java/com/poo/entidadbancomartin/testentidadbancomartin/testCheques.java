package com.poo.entidadbancomartin.testentidadbancomartin;
 
import com.poo.entidadbancomartin.entidades.Cheques;
import com.poo.entidadbancomartin.entidades.Cliente;
import com.poo.entidadbancomartin.entidades.ClientesIndividuales;
import com.poo.entidadbancomartin.entidades.CuentaCorriente;

public class testCheques {
    public static void main(String[] args) {
        System.out.println("--- INICIANDO PRUEBA DE CHEQUES ---");

    // 1. Primero creas un cliente7y la cuenta2
        Cliente cliente7 = new ClientesIndividuales(3, null, null, null);

        CuentaCorriente cuenta2 = new CuentaCorriente(1020, "Martin", 0.0, cliente7, 5000.0, 2000.0);

        System.out.println("Saldo inicial de cuenta2: $" + cuenta2.getSaldocc());

        // 2. Creas el cheque tal como lo hiciste
        Cheques miCheques = new Cheques("X", 200, "01/01/2027");

        // 3. Ahora sí, depositas el cheque en la cuenta2
        cuenta2.depositarCheques(miCheques);

        // 4. Imprimes el saldo para verificar que sumó los 200
        System.out.println("Saldo final de cuenta2: $" + cuenta2.getSaldocc());
        miCheques.imprimirCheque(); // utilizamos el metodo imprimir cheque

    }
}