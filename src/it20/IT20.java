/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it20;


public class IT20 {

   
    public static void main(String[] args) {
        
        //Using Double Array
        String [][] names = {
        {"justine", "katelyn", "oscar"},   
        {"skibedi","kien","sam" },                  
                };       

    for (int i = 0; i < names.length; i++){
    for (int j = 0; j<names[i].length; j++){
        System.out.print(names[i][j] + " ");
    }
    System.out.println(" ");
    
}
    System.out.println("-------------------- ");
    
    
    //Printing single array inside the Array
      String [] name = 
          {"justine", "katelyn", "oscar"};
      String [] lastName = {"catingan", "coming", "ellevera"};
        
      System.out.println(name[0] + " " + lastName[0]);
      
    System.out.println("-------------------- ");
    
    //Printing the numbers inside the double array in horizontal
    int [] [] num= {
        {90,98,70,76,45},
        {87,56,79,34,20},
    };
    for (int i = 0; i < num.length; i++){
    for (int j = 0; j< num[i].length; j++){
        System.out.print(num[0][1] + " ");
    }
    
      
    }
    }
}



    

    

