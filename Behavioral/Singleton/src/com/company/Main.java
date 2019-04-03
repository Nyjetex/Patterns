package com.company;

public class Main {

    public static void main(String[] args) {
        Thread thread1 = new Thread(createDataBaseConnection());
        Thread thread2 = new Thread(createDataBaseConnection());
        thread1.start();
        thread2.start();
    }

    private static Runnable createDataBaseConnection() {
        return new Runnable() {
            @Override
            public void run() {
                System.out.println(DataBaseConnection.getDataBaseConnection());
            }
        };
    }
}
