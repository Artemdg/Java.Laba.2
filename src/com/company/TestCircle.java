package com.company;

import java.util.Scanner;
public class TestCircle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите радиус окружности: ");
        int i=sc.nextInt();
        Circle circle=new Circle();
        circle.setRadius(i);
        circle.setDiametr(i);
        circle.setLength(i);
        circle.setArea(i);
        System.out.println("Радиус: "+circle.getRadius()+" Диаметр: "+circle.getDiametr()+
                " Длина: "+  circle.getLength()+" Площадь: "+circle.getArea());
    }
}