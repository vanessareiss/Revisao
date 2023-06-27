/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Impressora;


public class ImpresoraLocal {
    
    //varieavel 
    private Impressora impressora;
    
    public void instalar(Impressora impressora){
    this.impressora = impressora;

}
 public void imprimir(){

     this.impressora.imprimir();
 }   
}
