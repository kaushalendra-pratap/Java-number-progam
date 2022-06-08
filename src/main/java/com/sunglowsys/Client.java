package com.sunglowsys;

import java.util.Scanner;

public interface Client {
    void input();
    void output();
}
class Raju implements Client                  {
    String name ; double sal;
    public void input(){
        Scanner r = new Scanner(System.in);
        System.out.println("enter username: ");
        name = r.nextLine();
        System.out.println("Enter the salry:");
        name = r.nextLine();

    }
    public void output(){
        System.out.println(name+ " " +sal);

    }

    public static void main(String[] args) {
        Client c = new Raju();
        c.input();c.output();
    }


}
