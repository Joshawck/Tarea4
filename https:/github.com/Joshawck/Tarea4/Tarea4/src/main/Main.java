package main;

import cuentas.CCuenta;

public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            operativa_cuenta(cuenta1);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            operativa_cuenta2(cuenta1);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }

	private static void operativa_cuenta(CCuenta cuenta1) throws Exception {
		float cantidad = 695;
		cuenta1.ingresar(cantidad);
	}

	private static void operativa_cuenta2(CCuenta cuenta1) throws Exception {
		float cantidad2 = 2300;
		cuenta1.retirar(cantidad2);
	}
}
