package com.javabasic.lesson11.homework;

public class PasswordGenerator {

    private int passwordLen;

    private String[] password;

    private int[] patern;

    public PasswordGenerator(int passwordLen) {
        this.passwordLen = passwordLen;
    }

    private void passwordGenerator() {
        patern = new int[passwordLen];
        patternGenerator();
        suffle();
        setPassword();
    }

    private void patternGenerator() {
        for (int i = 0; i<passwordLen; i++) {
            if (passwordLen-5>=i) {
                int num = (int) (Math.random() * 10);
                if (num <= 3 && num >= 1) {
                    patern[i] = 3;
                } else if (num <= 6 && num >= 4) {
                    patern[i] = 2;
                } else if (num >=7) {
                    patern[i] = 1;
                }else {
                    patern[i] = 0;
                }
            }else {
                patern[i] = i%4;
            }
        }
    }


    private void suffle() {
        for (int i=0; i<passwordLen; i++) {
            int rnum = (int) (Math.random() * passwordLen);
            int nm = patern[rnum];
            patern[rnum] = patern[i];
            patern[i] = nm;
        }
    }
    
    private void setPassword() {
        password = new String[passwordLen];
        for (int i = 0; i<passwordLen; i++) {
            if (patern[i] == 0) {
                password[i] = "_";
            } else if (patern[i]==1) {
                password[i] = String.valueOf((int) (Math.random() * 10));
            } else if (patern[i]==2) {
                password[i] = String.valueOf((char) (Math.random() * (91 - 65) + 65));
            } else if (patern[i]==3) {
                password[i] = String.valueOf((char) (Math.random() * (123 - 97) + 97));
            }
        }
    }

    public void printPassword() {
        passwordGenerator();
        for (int i=0; i<passwordLen; i++) {
            System.out.print(password[i]);
        }
        System.out.println();
    }

    public String toString() {
        return"password consists of "+ passwordLen +" characters";
    }

    public static void main(String[] args) {
        PasswordGenerator pg = new PasswordGenerator(8);
        System.out.println(pg);
        pg.printPassword();
    }
}
