package com.rchab.ant.helloworld;

/**
 * @author rchab, UA
 */
public class App {

    public static void main(String[] args) {
        if (args.length != 0) {
            System.out.println("Hello " + args[0]);
        } else {
            System.out.println("No args were specified !!!");
        }

    }
}
