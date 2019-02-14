/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread_dadi;

import java.util.Scanner;

/**
 *
 * @author Marco
 */
public class Thread_dadi {
    /**
     * @param args the command line arguments
     */
    
   
    
    public static void main(String[] args)  throws InterruptedException{
    
   boolean  delay = false;
   boolean yield = true;
   DatiCondivisi datiC = new DatiCondivisi();
//    try {
//        // TODO code application logic here
       MyThread1 th1 = new MyThread1(delay,yield,datiC);
       MyThread1 th2 = new MyThread1(delay,yield,datiC);
       MyThread1 th3 = new MyThread1(delay,yield,datiC);
//        
//        //Scanner s = new Scanner(System.in);
//        
//                  
      th1.start();
//       
      th2.start();
//        
      th3.start();
//        
//        //s.next();
//        
//        
	th1.interrupt();
	th2.interrupt();
        th3.interrupt();
//
        th1.join();
        th2.join();
        th3.join();
//   
//        }catch (InterruptedException e) {
//            System.out.println(e);       
//        }
//    if(datiC.getNum("1") == datiC.getNum("2") && datiC.getNum("2")== datiC.getNum("3"))
//    System.out.println("HAI VINTO");
//        System.out.println("FINE PROGRAMMA");


    System.out.println(datiC.getNum(0));
    System.out.println(datiC.getNum(1));
    System.out.println(datiC.getNum(2));
    
    if(datiC.getNum(0) == datiC.getNum(1) && datiC.getNum(1)== datiC.getNum(2))
   System.out.println("HAI VINTO");
   System.out.println("FINE PROGRAMMA");

    }
    }
    

