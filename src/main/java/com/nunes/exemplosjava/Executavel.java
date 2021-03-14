package com.nunes.exemplosjava;

public class Executavel {
    public static void main(String[] args){
        Runnable task1  = new Runnable() {
            @Override
            public void run() {
                System.out.println("task #1 esta rodando");
                try {
                    long sleep = (long) (Math.random() * 10 * 1000);
                    System.out.println("Pausando  task #1 por " + (sleep / 1000) + " segundos");
                    Thread.sleep(sleep);
                    System.out.println("task #1 finalizada!");
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };
        new Thread(task1).start();

        Runnable task2 = () -> {
            System.out.println("task #2 esta rodando...");
            try {
                long sleep = (long) (Math.random() * 10 * 1000);
                System.out.println("Pausando task #2 por  " + (sleep / 1000) + " segundos.");
                Thread.sleep(sleep);
                System.out.println("task #2 finalizada!");
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        };
        new  Thread(task2).start();

    }
}
