package fonte;

public class Thread1 extends Thread {
    
	private int  [][] vetor;
	private int linha;
	private int coluna;
    
    public Thread1(int [][] vetor, int linha, int coluna ){        
        this.vetor = vetor;
        this.linha = linha;
        this.coluna = coluna;
    
    }
    
    public void run(){
    
    	for (int y = 0; y < this.coluna; y++){
    		this.vetor[this.linha][y] = this.vetor[this.linha][y]*2;
    	}

    }
}
