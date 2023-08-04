package fıtnat_sena.task27.Ornek3;

import task27.Ornek3.TechnoCafe;

import java.util.Scanner;

import static fıtnat_sena.task27.Ornek3.TechnoCafe.sec;

public class TechnoKitchen {
    public static  void main(String[] args) {


        Scanner str = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("1. Adana Kebab");
        System.out.println("2. Lahmacun");
        System.out.println("3. Borsh");
        System.out.println("4. Palov");
        System.out.println("0. Exit");

        System.out.print("Yemeğinizi seçiniz: ");

        int choice = str.nextInt();


        switch (choice){
            case 1:
               AdanaKebap adanaKebap=new AdanaKebap();
                sec(adanaKebap);
                  break;
                case 2:
                Lahmacun lahmacun=new Lahmacun();
                   sec(lahmacun);

                   break;
            case 3:
                Borsh borsh=new Borsh();
                sec(borsh);
                break;
            case 4:
                Palov palov=new Palov();
                sec(palov);
                break;
            case 0:
                System.out.println("Exıt");
        }



            }

        }



