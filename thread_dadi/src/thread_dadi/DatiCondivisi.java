/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author turati_marco
 */
package thread_dadi;

public class DatiCondivisi {

    int v[];
    int numEl = 0;
    int MAXEL = 3;
     Semaforo mutex1;
     Semaforo mutex2;
    private Schermo schermo;

    public DatiCondivisi() {
        v = new int[3];
        mutex1 = new Semaforo(1);
        mutex2 = new Semaforo(1);
        schermo = new Schermo();
    }

    synchronized public void push(int num) {
        if (numEl < MAXEL) {
            v[numEl] = num;
            numEl++;
        }
    }

    synchronized public int getNum(int index) {
        int value = 0;

        value = v[index];

        return value;
    }
    
    synchronized public Schermo getSchermo() {
        return schermo;
    }
}
