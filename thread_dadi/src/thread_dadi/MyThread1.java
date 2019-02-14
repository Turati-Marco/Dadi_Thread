package thread_dadi;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Marco
 */
public class MyThread1 extends Thread {

    boolean delay, yield;
    String nome;
    DatiCondivisi ptrDatiC = new DatiCondivisi();

    public MyThread1(boolean delay, boolean yield, DatiCondivisi dati) {
        this.yield = yield;
        this.delay = delay;
        //this.nome = nome;
        this.ptrDatiC = dati;
    }

    public void run() {

        Random rn = new Random();
        int n = rn.nextInt(3) + 1;
        try {

            if (yield) {
                Thread.yield();
            }
            if (delay) {
                Thread.sleep(1000);
            }
           
            ptrDatiC.mutex1.Wait();
            ptrDatiC.push(n);
            ptrDatiC.mutex1.Signal();

        } catch (InterruptedException e) {
            System.out.println("Thread " + nome + " Interrotto");
        }
    }
}
