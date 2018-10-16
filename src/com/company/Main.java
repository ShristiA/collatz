package com.company;
import java.util.Scanner;
public class Main {

              public static void main(String[] args) {
                  String userAns;
                  Scanner sc = new Scanner(System.in);


                  do {
                      System.out.println("Enter a number");
                      int num = sc.nextInt();
                      do {
                          if (num % 2 == 0) {
                              num = even(num);
                          } else {
                              num = odd(num);
                          }
                          System.out.println(num);

                      } while (num > 1);
                      System.out.println("enter another number.or enter n to quit");
                      userAns = sc.next();
                  }while(!userAns .equalsIgnoreCase("n"));
              }

                public static int even(int num){
                  num= num/2;
                  return num;
                }

                public static int odd(int num){
                  num = num*3+1;
                  return num;
                }


            }


