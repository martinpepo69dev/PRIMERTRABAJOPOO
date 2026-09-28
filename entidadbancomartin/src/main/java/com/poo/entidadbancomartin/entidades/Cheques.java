package com.poo.entidadbancomartin.entidades;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString

// los cheques permiten a los clientes de la entidad bancaria realizar pagos a
// terceros, s decir, a otras personas o empresas, in necesidad de utilizar dinero en efectivo.

// A' para fecha de pago podriamos usar la clase LocalDate de java.time, pero
// para simplificar el ejemplo,
// utilizaremos un String para representar la fecha de pago del cheque.

public class Cheques {
    
    private double monto;
    private String bancoemisor;
    private String fechadepago;
    

    public Cheques(int nrocuenta, String clienteasociado, double saldo, Cliente cliente, String bancoemisor,
            double monto, String fechadepago) {
        this.bancoemisor = bancoemisor; 
        this.monto = monto;
        this.fechadepago = fechadepago; // A'

    }   

  

    public Cheques(String bancoemisor, double monto, String fechadepago) {
        this.bancoemisor = bancoemisor;
        this.monto = monto;
        this.fechadepago = fechadepago;
    }
    
    public void imprimirCheque() {
        System.out.println("Cheque del banco: " + bancoemisor);
        System.out.println("Monto: $" + monto);
        System.out.println("Fecha de pago: " + fechadepago);
    }
 
}




