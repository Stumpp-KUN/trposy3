package com.company;
import com.accessories.CPU.amd.*;
import com.accessories.CPU.intel.*;
import com.accessories.memory.hyperx.model5.hx1000;
import com.accessories.memory.hyperx.model5.hx2500;
import com.accessories.memory.hyperx.modelTEN.hv6300;
import com.accessories.memory.hyperx.modelTEN.hx7400;
import com.accessories.videocard.amd.*;
import com.accessories.videocard.nvidia.RTX1090;
import com.accessories.videocard.nvidia.RTX2090;
import com.accessories.videocard.nvidia.RTX3090;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String[] pk=new String[3];
        int money=0;
        int amount=0;
        System.out.println(" Выберите действие: ");
        System.out.println("1-Собрать Вам ПК, 2-Найти комплектующие под ваши запросы");
        int kfd= scan.nextInt();
        switch (kfd) {
            case 1: {
                while (amount < 3) {
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
                            System.out.println("Выберите видеокарту 1-AMD, 2-NVIDIA");
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
                                int fs = scan.nextInt();
                                switch (fs) {
                                    case 1: {
                                        pk[1] = a1.getName();
                                        money += a1.getCost();
                                    }
                                    break;
                                    case 2: {
                                        pk[1] = a2.getName();
                                        money += a2.getCost();
                                    }
                                    break;
                                    case 3: {
                                        pk[1] = a3.getName();
                                        money += a3.getCost();
                                    }
                                    break;
                                    default:
                                        System.out.println("Видеокарта не выбрана!");
                                }
                            } else if (g == 2) {
                                RTX1090 n1 = new RTX1090();
                                RTX2090 n2 = new RTX2090();
                                RTX3090 n3 = new RTX3090();
                                System.out.println("Цена    Название    Память  Скорость");
                                System.out.println(n1.getCost() + "     " + n1.getName() + "         " + n1.getAmountOfMemory() + "          " + n1.getFillRate());
                                System.out.println(n2.getCost() + "     " + n2.getName() + "         " + n2.getAmountOfMemory() + "          " + n2.getFillRate());
                                System.out.println(n3.getCost() + "     " + n3.getName() + "         " + n3.getAmountOfMemory() + "          " + n3.getFillRate());
                                System.out.println("Выберите модель: 1, 2, 3");
                                int fsI = scan.nextInt();
                                switch (fsI) {
                                    case 1: {
                                        pk[1] = n1.getName();
                                        money += n1.getCost();
                                    }
                                    break;
                                    case 2: {
                                        pk[1] = n2.getName();
                                        money += n2.getCost();
                                    }
                                    break;
                                    case 3: {
                                        pk[1] = n3.getName();
                                        money += n3.getCost();
                                    }
                                    break;
                                    default:
                                        System.out.println("Процессор не выбран!");
                                }


                            } else
                                System.out.println("Цифра выбрана неверна");
                        }
                        break;
                        case 2: {
                            System.out.println("Выберите память");
                            hx1000 m1 = new hx1000();
                            hx2500 m2 = new hx2500();
                            hv6300 m3 = new hv6300();
                            hx7400 m4 = new hx7400();
                            System.out.println("Выбеирите модель 0-model5, 1-modelTEN");
                            int lf = scan.nextInt();
                            switch (lf) {
                                case 0: {
                                    System.out.println("Выберите модель:");
                                    System.out.println("Цена    Скорость    Память  Название");
                                    System.out.println(m1.getCost() + "       " + m1.getFillRate() + "          " + m1.getMemory() + "      " + m1.getName());
                                    System.out.println(m2.getCost() + "       " + m2.getFillRate() + "          " + m2.getMemory() + "      " + m2.getName());
                                    System.out.println("Выберите 0 или 1");
                                    int kfd1 = scan.nextInt();
                                    switch (kfd1) {
                                        case 0: {
                                            pk[2] = m1.getName();
                                            money += m1.getCost();
                                        }
                                        break;
                                        case 1: {
                                            pk[2] = m2.getName();
                                            money += m2.getCost();
                                        }
                                        break;
                                    }
                                }
                                break;
                                case 1: {
                                    System.out.println("Выберите модель:");
                                    System.out.println("Цена    Скорость    Память  Название");
                                    System.out.println(m3.getCost() + "       " + m3.getFillRate() + "          " + m3.getMemory() + "      " + m3.getName());
                                    System.out.println(m4.getCost() + "       " + m4.getFillRate() + "          " + m4.getMemory() + "      " + m4.getName());
                                    System.out.println("Выберите 0 или 1");
                                    int kfd0 = scan.nextInt();
                                    switch (kfd0) {
                                        case 0: {
                                            pk[2] = m3.getName();
                                            money += m3.getCost();
                                        }
                                        break;
                                        case 1: {
                                            pk[2] = m4.getName();
                                            money += m4.getCost();
                                        }
                                        break;
                                    }
                                }
                                break;
                                default:
                                    System.out.println("Модель не выбрана");
                            }

                        }


                    }
                    amount++;
                }

                String pkf="";
                for (int i = 0; i < pk.length; i++) pkf+=pk[i]+" ";

                try(FileWriter writer = new FileWriter("C:\\Users\\Asus\\Desktop\\zxc.txt"))
                {
                    writer.write("Ваш компьютер собран, ваши комплектующие: ");
                    writer.write(pkf);
                    writer.write("Цена "+money);
                }
                catch(IOException ex){
                    System.out.println(ex.getMessage());
                }
                scan.close();
            }
            break;
            case 2:{
                System.out.println("Что бы вы хотели посмотреть? 1-Процессоры, 2-Память, 3-Видеокарты");
                int kt1=scan.nextInt();
                switch (kt1){
                    case 1:{
                        int[] weights=new int[6];
                        int[] costs=new int[6];
                        String[] name=new String[6];
                        ryzenPro3000 q1=new ryzenPro3000();
                        weights[0]= q1.getWeight();
                        costs[0]= q1.getCost();
                        name[0]=q1.getName();
                        ryzenPro2000 q2=new ryzenPro2000();
                        weights[1]= q2.getWeight();
                        costs[1]= q2.getCost();
                        name[1]=q2.getName();
                        ryzenPro1000 q3=new ryzenPro1000();
                        weights[2]= q3.getWeight();
                        costs[2]= q3.getCost();
                        name[2]=q3.getName();
                        intel7 w1=new intel7();
                        weights[3]= w1.getWeight();
                        costs[3]= w1.getCost();
                        name[3]=w1.getName();
                        intel8 w2=new intel8();
                        weights[4]= w2.getWeight();
                        costs[4]= w2.getCost();
                        name[4]=w2.getName();
                        intel9 w3=new intel9();
                        weights[5]= w3.getWeight();
                        costs[5]= w3.getCost();
                        name[5]=w3.getName();
                        System.out.println("Выберите компанию 1-AMD, 2-INTEL, и допишите к цифре характиристику по которой вы выбираете 1-вес, 2-цена");
                        int kt2=scan.nextInt();
                        switch (kt2){
                            case 11:{
                                System.out.println("Впишите средний вес");
                                int wei=scan.nextInt();
                                int weim=wei-10;
                                int weiu=wei+10;
                                for(int i=0;i<weights.length-3;i++){
                                    if(weights[i]>weim&&weights[i]<weiu){
                                        System.out.println(name[i]);
                                    }
                                }
                            }
                            break;
                            case 12:{
                                System.out.println("Впишите макс цену");
                                int coi=scan.nextInt();
                                for(int i=0;i<costs.length-3;i++){
                                    if(costs[i]<coi){
                                        System.out.println(name[i]);
                                    }
                                }
                            }
                            break;
                            case 21:{
                                System.out.println("Впишите средний вес!");
                                int wei2=scan.nextInt();
                                int weim2=wei2-10;
                                int weiu2=wei2+10;
                                for(int i=3;i<weights.length;i++){
                                    if(weights[i]>weim2&&weights[i]<weiu2){
                                        System.out.println(name[i]);
                                    }
                                }
                            }
                            break;
                            case 22:{
                                System.out.println("Впишите среднюю цену");
                                int coi2=scan.nextInt();
                                for(int i=3;i<costs.length;i++){
                                    if(costs[i]<coi2){
                                        System.out.println(name[i]);
                                    }
                                }
                            }
                            break;
                            }
                        }
                        break;
                    case 2:{
                        int[] memorys=new int[4];
                        int[] costs=new int[4];
                        String[] names=new String[4];
                        hx1000 t1=new hx1000();
                        memorys[0]=t1.getMemory();
                        costs[0]=t1.getCost();
                        names[0]=t1.getName();
                        hx2500 t2=new hx2500();
                        memorys[1]=t2.getMemory();
                        costs[1]=t2.getCost();
                        names[1]=t2.getName();
                        hv6300 t3=new hv6300();
                        memorys[2]=t3.getMemory();
                        costs[2]=t3.getCost();
                        names[2]=t3.getName();
                        hx7400 t4=new hx7400();
                        memorys[3]=t4.getMemory();
                        costs[3]=t4.getCost();
                        names[3]=t4.getName();
                        System.out.println("Выберите модель 1-model5, 2-modelTEN, и по какой характеристике 1-память 2-цена");
                        int kfds=scan.nextInt();
                        switch (kfds){
                            case 11:{
                                System.out.println("Введите максимальную память");
                                int mn=scan.nextInt();
                                for(int i=0;i< memorys.length-2;i++){
                                    if(memorys[i]<mn){
                                        System.out.println(names[i]);
                                    }
                                }
                            }
                            break;
                            case 12:{
                                System.out.println("Выберите максимальную цену");
                                int mmax=scan.nextInt();
                                for(int i=0;i<costs.length-2;i++){
                                    if(costs[i]<mmax){
                                        System.out.println(names[i]);
                                    }
                                }
                            }
                            break;
                            case 21:{
                                System.out.println("Введите максимальную память");
                                int mn1=scan.nextInt();
                                for(int i=2;i< memorys.length;i++){
                                    if(memorys[i]<mn1){
                                        System.out.println(names[i]);
                                    }
                                }
                            }
                            break;
                            case 22:{
                                System.out.println("Введите цену");
                                int mco=scan.nextInt();
                                for(int i=2;i<costs.length;i++){
                                    if(costs[i]<mco){
                                        System.out.println(names[i]);
                                    }
                                }
                            }
                            break;
                        }
                    }
                    break;
                    case 3:{
                        int[] fill=new int[6];
                        int[] costs=new int[6];
                        String[] names=new String[6];
                        AMD6 v1=new AMD6();
                        fill[0]=v1.getFillRate();
                        costs[0]=v1.getCost();
                        names[0]=v1.getName();
                        AMD7 v2=new AMD7();
                        fill[1]=v2.getFillRate();
                        costs[1]=v2.getCost();
                        names[1]=v2.getName();
                        AMD8 v3=new AMD8();
                        fill[2]=v3.getFillRate();
                        costs[2]=v3.getCost();
                        names[2]=v3.getName();
                        RTX1090 v4=new RTX1090();
                        fill[3]=v4.getFillRate();
                        costs[3]=v4.getCost();
                        names[3]=v4.getName();
                        RTX2090 v5=new RTX2090();
                        fill[4]=v5.getFillRate();
                        costs[4]=v5.getCost();
                        names[4]=v5.getName();
                        RTX3090 v6=new RTX3090();
                        fill[5]=v6.getFillRate();
                        costs[5]=v6.getCost();
                        names[5]=v6.getName();
                        System.out.println("Выберите компанию 1-AMD, 2-NVIDIA и характеристику 1-FillRate 2-Cost");
                        int lo=scan.nextInt();
                        switch (lo){
                            case 11:{
                                System.out.println("Введите максимальную скорость заполнения");
                                int mn=scan.nextInt();
                                for(int i=0;i< fill.length-3;i++){
                                    if(fill[i]<mn){
                                        System.out.println(names[i]);
                                    }
                                }
                            }
                            break;
                            case 12:{
                                System.out.println("Введите максимальную цену");
                                int mn1=scan.nextInt();
                                for(int i=0;i< costs.length-3;i++){
                                    if(costs[i]<mn1){
                                        System.out.println(names[i]);
                                    }
                                }
                            }
                            break;
                            case 21:{
                                System.out.println("Введите максимальную скорость заполнения");
                                int mn2=scan.nextInt();
                                for(int i=3;i< fill.length;i++){
                                    if(fill[i]<mn2){
                                        System.out.println(names[i]);
                                    }
                                }
                            }
                            break;
                            case 22:{
                                System.out.println("Введите максимальную цену");
                                int mn3=scan.nextInt();
                                for(int i=3;i< costs.length;i++){
                                    if(costs[i]<mn3){
                                        System.out.println(names[i]);
                                    }
                                }
                            }
                            break;

                        }
                    }
                    break;
                    }
                }
            }
        }}

