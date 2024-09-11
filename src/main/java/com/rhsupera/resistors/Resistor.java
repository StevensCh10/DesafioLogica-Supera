package com.rhsupera.resistors;

import java.util.Scanner;

public class Resistor {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        VerifyString verifier = new VerifyString();

        System.out.print("Informe a quantidade de Ohms: ");
        String qtdOhmds = in.nextLine();

        if(verifier.validateString(qtdOhmds)){
            ResistorColors resistor = new ResistorColors();
            System.out.println("\n" + resistor.getColors(qtdOhmds) + "\n");
        }else{
            System.out.println("Informações inválidas.");
        }

        in.close();
    }
}
