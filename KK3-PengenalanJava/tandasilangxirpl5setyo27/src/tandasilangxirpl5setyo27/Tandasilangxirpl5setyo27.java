/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tandasilangxirpl5setyo27;

/**
 *
 * @author Seth
 */
public class Tandasilangxirpl5setyo27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int panjang = 5;
        int lebar = 5;
        
        for (int i = 0; i < lebar; i++ ){
            for(int j = 0 ; j < panjang ; j++){
                if(i == j || (i+j)%lebar == lebar-1){
                    System.out.print("@");
                }else{
                    System.out.print("=");
                }
            }
            System.out.println();
        }
    }
    
}