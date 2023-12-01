package main;

import cargo.Cargo;
import cargo.CargoJunior;
import cargo.CargoPleno;
import cargo.CargoSenior;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        ArrayList<Cargo>cargos= new ArrayList<>();
        int opcao=0;

        do{
            System.out.print("Qual cargo de senioridade deseja inserir? \nDigite 1(junior) 2(pleno) 3(Sênior). " +
                    "Ou digite outro número para sair das opções: ");
            opcao= scan.nextInt();
            switch(opcao){
                case 1:
                    cargos.add(new CargoJunior());
                    System.out.println("Cargo Junior adicionado");
                    break;
                case 2:
                    cargos.add(new CargoPleno());
                    System.out.println("Cargo Pleno adicionado");
                    break;
                case 3:
                    cargos.add(new CargoSenior());
                    System.out.println("Cargo Senior adicionado");
                    break;
                default:
                    System.out.println("Fim da execução");
                    break;
            }
        }while (opcao>0 && opcao<4);

        System.out.println("----------------");

        for(Cargo x: cargos){
            System.out.println(x.toString());
        }
    }
}