package com.company;
import com.accessories.CPU.amd.mainAMD;
import com.accessories.CPU.amd.*;
import com.accessories.CPU.intel.*;
import com.accessories.videocard.amd.*;
import com.accessories.videocard.nvidia.RTX1090;
import com.accessories.videocard.nvidia.RTX2090;
import com.accessories.videocard.nvidia.RTX3090;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(" Выберите действие: ");
        Scanner scan=new Scanner(System.in);
        String[] pk=new String[3];
        int money=0;
        int amount=0;
        while(amount<3) {
            switch (amount) {

                case 0: {
                    System.out.println("Выберите фирму процессора: 1-AMD, 2-INTEL");
                    int k = scan.nextInt();
                    switch (k) {
                        case 1: {
                            ryzenPro3000 r3 = new ryzenPro3000();
                            ryzenPro2000 r2 = new ryzenPro2000();
                            ryzenPro1000 r1 = new ryzenPro1000();
                            System.out.println("Варианты процессоров от компании: ");
                            System.out.println("Цена    Название        Вес    Количество ядер");
                            System.out.println(r1.getCost() + "   " + r1.getName() + "      " + r1.getWeight() + "         " + r1.getAmountOfCore());
                            System.out.println(r2.getCost() + "   " + r2.getName() + "      " + r2.getWeight() + "         " + r2.getAmountOfCore());
                            System.out.println(r3.getCost() + "   " + r3.getName() + "      " + r3.getWeight() + "         " + r3.getAmountOfCore());
                            System.out.println("Выберите процессор: ");
                            int cpu = scan.nextInt();
                            switch (cpu) {
                                case 1:
                                    pk[0] = r1.getName();
                                    money += r1.getCost();
                                    break;
                                case 2:
                                    pk[0] = r2.getName();
                                    money += r2.getCost();
                                    break;
                                case 3:
                                    pk[0] = r3.getName();
                                    money += r3.getCost();
                                    break;
                            }
                        }
                        break;
                        case 2: {
                            intel9 i1 = new intel9();
                            intel8 i2 = new intel8();
                            intel7 i3 = new intel7();
                            System.out.println("Варианты процессоров от компании:1, 2, 3 ");
                            System.out.println("Цена    Название        Вес    Количество ядер");
                            System.out.println(i1.getCost() + "   " + i1.getName() + "      " + i1.getWeight() + "         " + i1.getAmountOfCore());
                            System.out.println(i2.getCost() + "   " + i2.getName() + "      " + i2.getWeight() + "         " + i2.getAmountOfCore());
                            System.out.println(i3.getCost() + "   " + i3.getName() + "      " + i3.getWeight() + "         " + i3.getAmountOfCore());
                            System.out.println("Выберите процессор: ");
                            int cpu = scan.nextInt();
                            switch (cpu) {
                                case 1:
                                    pk[0] = i1.getName();
                                    money += i1.getCost();
                                    break;
                                case 2:
                                    pk[0] = i2.getName();
                                    money += i2.getCost();
                                    break;
                                case 3:
                                    pk[0] = i3.getName();
                                    money += i3.getCost();
                                    break;
                            }
                        }
                        break;
                    }
                }
                break;
                case 1: {
                    System.out.println("Выберите процессор 1-AMD, 2-NVIDIA");
                    int g = scan.nextInt();
                    if (g == 1) {
                        System.out.println("Выберите модель: 1, 2, 3");
                        AMD6 a1 = new AMD6();
                        AMD7 a2 = new AMD7();
                        AMD8 a3 = new AMD8();
                        System.out.println("Цена    Название    Память  Скорость");
                        System.out.println(a1.getCost() + "     " + a1.getName() + "         " + a1.getAmountOfMemory() + "          " + a1.getFillRate());
                        System.out.println(a2.getCost() + "     " + a2.getName() + "         " + a2.getAmountOfMemory() + "          " + a2.getFillRate());
                        System.out.println(a3.getCost() + "     " + a3.getName() + "         " + a3.getAmountOfMemory() + "          " + a3.getFillRate());
                        System.out.println("Выберите модель: 1, 2, 3");
                        int fs=scan.nextInt();
                        switch(fs){
                            case 1:{
                                pk[1]=a1.getName();
                                money+=a1.getCost();
                            }
                            break;
                            case 2:{
                                pk[1]=a2.getName();
                                money+=a2.getCost();
                            }
                            break;
                            case 3:{
                                pk[1]=a3.getName();
                                money+=a3.getCost();
                            }
                            break;
                            default:
                                System.out.println("Видеокарта не выбрана!");
                        }
                    } else if (g == 2) {
                        RTX1090 n1=new RTX1090();
                        RTX2090 n2=new RTX2090();
                        RTX3090 n3=new RTX3090();
                        System.out.println("Цена    Название    Память  Скорость");
                        System.out.println(n1.getCost() + "     " + n1.getName() + "         " + n1.getAmountOfMemory() + "          " + n1.getFillRate());
                        System.out.println(n2.getCost() + "     " + n2.getName() + "         " + n2.getAmountOfMemory() + "          " + n2.getFillRate());
                        System.out.println(n3.getCost() + "     " + n3.getName() + "         " + n3.getAmountOfMemory() + "          " + n3.getFillRate());
                        System.out.println("Выберите модель: 1, 2, 3");
                        int fsI=scan.nextInt();
                        switch(fsI){
                            case 1:{
                                pk[1]=n1.getName();
                                money+=n1.getCost();
                            }
                            break;
                            case 2:{
                                pk[1]=n2.getName();
                                money+=n2.getCost();
                            }
                            break;
                            case 3:{
                                pk[1]=n3.getName();
                                money+=n3.getCost();
                            }
                            break;
                            default:
                                System.out.println("Процессор не выбран!");
                        }


                    } else
                        System.out.println("Цифра выбрана неверна");
                }
                break;
                case 2:{

                }


            }
            amount++;
        }
    }
}
