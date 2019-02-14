/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread_dadi;

/**
 *
 * @author turati_marco
 */
public class Schermo {
    private static final int MAXEL = 999;
    private final String[] vect;
    private int numEl;
    
   
    public Schermo() {
        vect = new String[MAXEL];
        numEl = 0;
    }
    
    
    public void push(String msg) {
        if(numEl >= MAXEL)
            throw new RuntimeException("MAXEL superato");
        
        vect[numEl++] = msg;
    }
    
    
    public int size() {
        return numEl;
    }
    
    
    public String get(int index) {
        return vect[index];
    }
    
    
    public void pulisciSchermo() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                Runtime.getRuntime().exec("clear");
            }
            
        } catch (final Exception e) {
            System.err.println("Eccezione durante il tentativo di pulire lo schermo");
            e.printStackTrace();
        }
    }
}
