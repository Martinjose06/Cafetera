/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author LUCYLEONOR
 */
public class Cafetera {
    private int capacidadMaxima;
    private int cantidadactual;

    public Cafetera() {
        this.capacidadMaxima = 1000;
        this.cantidadactual = 0;
    }
    
    public Cafetera (int capacidadMaxima,int cantidadactual){
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadactual = cantidadactual;
        if (this.cantidadactual > this.capacidadMaxima) {
            this.cantidadactual = this.capacidadMaxima;
            Helper.mensaje(null, "La capacidad actual se ha ajustado a la capacidad maxima","Ajuste",1);
        }
        
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadactual() {
        return cantidadactual ;
    }

    public void setCantidadactual(int cantidadactual) {
        this.cantidadactual = cantidadactual;
    }
    
   public void LlenarCafetera(){
    this.cantidadactual = this.capacidadMaxima;
}
    
   public void ServirTaza(int numTazas, int cantidadC){
       int aux;
       aux = cantidadC * numTazas;
       this.cantidadactual = this.getCantidadactual() - aux;
       if (this.cantidadactual < 0) {
           this.cantidadactual = 0;
       }
       
   }
   
   public void Vaciar(){
       this.cantidadactual = 0;
       this.capacidadMaxima = this.getCapacidadMaxima();
   }
   
   public void AgregarCafe(int cantidad){
        int aux;
        if (cantidad > getCapacidadMaxima()) {
            this.cantidadactual = this.capacidadMaxima;
        } else {
            aux = getCantidadactual() + cantidad;
            if (aux > getCapacidadMaxima()) {
                Helper.mensaje(null, "No puede ingresar mas café", "Error", 1);
            } else {
                this.cantidadactual = aux;
            }
        }
    }
    
}
