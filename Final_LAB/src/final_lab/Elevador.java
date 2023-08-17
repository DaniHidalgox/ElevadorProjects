package final_lab;


public class Elevador {
    private int primerpiso=1;

    public int getPrimerpiso() {
        return primerpiso;
    }
    

    public void setPrimerpiso(int primerpiso) {
        this.primerpiso = primerpiso;
    }
    
     public Elevador() {
        primerpiso = 1; 
    }
     
      public void MoveraPiso(int pisoDestino) {
        if (pisoDestino >= 1 && pisoDestino <= 10) {
            System.out.println("Moviendo el ascensor desde el piso " + pisoDestino + " al piso " + pisoDestino);
            primerpiso = pisoDestino;
        } else {
            System.out.println("Piso inválido. Debe ser un número entre 1 y 10.");
        }
    }
         public int getCurrentFloor() {
        return primerpiso;
    }
         

}