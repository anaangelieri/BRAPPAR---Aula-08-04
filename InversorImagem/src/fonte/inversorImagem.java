package fonte;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.LocalTime;

import javax.imageio.ImageIO;

public class inversorImagem {

    public static void main(String[] args) throws Throwable {
        BufferedImage original = null;
        try {
        		original = ImageIO.read(new File("iguana.jpg"));

        } catch (IOException e) {
        	System.out.println("Não leu a imagem");
        }
    	
    	 //constroi threads
        Thread1 thread1 = new Thread1(original);
        Thread2 thread2 = new Thread2(original);
        Thread3 thread3 = new Thread3(original);
        Thread4 thread4 = new Thread4(original);
        
        //executa a thread
        System.out.println("Inicio = " + LocalTime.now().getHour() +":" +LocalTime.now().getMinute() 
                + ":" +LocalTime.now().getSecond() );
               
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        System.out.println("Fim = " +LocalTime.now().getHour() +":" +LocalTime.now().getMinute() 
                + ":" +LocalTime.now().getSecond() );
               

    }

   }