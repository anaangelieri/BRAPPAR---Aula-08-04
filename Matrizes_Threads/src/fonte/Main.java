package fonte;

import java.util.Random;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) throws Throwable {
        
        //Matriz tamanho 1000;
    	int size = 1000;
    	int  [][] vetor = new int [size][size];
    	Random rand = new Random();
    	long inicio, fim;
    	
//    	inicio = System.currentTimeMillis ( ) ;
        System.out.printf("%n%n");
        System.out.println("Matriz Original");
        for(int i=0; i< size; i++) {
        	for(int j=0; j< size; j++) {
        	     vetor[i][j] = rand.nextInt(10);
        	     System.out.print( vetor[i][j] + " ");
        	}
        	System.out.println();
        }
        
//        
//        fim = System.currentTimeMillis( ) ;
        
       // System.out.println ( "Duração: " + ( fim - inicio )/1000.0 ) ;
        
    	 //constroi thread para multiplicar uma linha
        Thread1 thread1 = new Thread1(vetor, 0, size);
        Thread1 thread2 = new Thread1(vetor, 1, size);
        Thread1 thread3 = new Thread1(vetor, 2, size);
        Thread1 thread4 = new Thread1(vetor, 3, size);
        Thread1 thread5 = new Thread1(vetor, 4, size);
        
        //executa a thread
//        System.out.println("Inicio = " + LocalTime.now().getHour() +":" +LocalTime.now().getMinute() 
//                + ":" +LocalTime.now().getSecond() );
               
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
       
//        System.out.println("Fim = " +LocalTime.now().getHour() +":" +LocalTime.now().getMinute() 
//                + ":" +LocalTime.now().getSecond() );
        System.out.printf("%n%n");
        System.out.println("Matriz multiplicada");
        for(int i=0; i< size; i++) {
        	for(int j=0; j< size; j++) {
        	     System.out.print( vetor[i][j] + " ");
        	}
        	System.out.println();
        }
               
    }
}