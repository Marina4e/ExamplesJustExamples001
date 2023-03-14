package org.example.Exceptions;

public class MainThrow {
    public static int main(String[] args) {
     int smth1;
        {
            try {
                System.out.println("jfs");
                return 1;}

            finally {
            System.out.println("this is after it ends");
            return 2;

        }
    }}}
