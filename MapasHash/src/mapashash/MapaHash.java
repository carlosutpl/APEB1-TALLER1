/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mapashash;

import java.util.Scanner;

/**
 *
 * @author utpl
 */
public class MapaHash {

    
    Scanner sc;
    Nodo[] claves;
    int size;
    
    public MapaHash(int size){
        this.sc = new Scanner(System.in);
        this.size = size;
        this.claves = new Nodo[size];
        
        //Inicializar todos los punteros del HashMap a null (each head to null)
        
        for(int i = 0; i < size; i++){
            claves[i] = null;
        }
    }
    
    public int menu(){
        System.out.println("1. Insertar");
        System.out.println("2. Listar");
        System.out.println("0. Salir");
        return sc.nextInt();
    }
    
    
    public boolean emptyNode(Nodo actual){
        return actual == null;
    }
    
    //This one returns the number from the ASCII code based on the key and then converts it into a HashCode
    public int getHash(String key){
        int sum=0;
        
        for(int i = 0; i < key.length(); i++){
            sum += (int) key.charAt(i);
        }
        
        
        
        return sum % size; //Hash Code
    }
    
    
   
    
    public void add(){
        int _Id, key;
        String nombre;
        
        System.out.println("Digite el ID");
        _Id = sc.nextInt();
        sc.nextLine(); //Limpiar Scanner
        
        System.out.println("Digite nombre");
        nombre = sc.nextLine();
        key = getHash(nombre);
        
        
        insertarHash(key, _Id, nombre);
        
        
    }

    private void insertarHash(int key, int _Id, String nombre) {
         Nodo nuevo = new Nodo(_Id, nombre);
         
         
         if(emptyNode(claves[key])){
             claves[key] = nuevo;
         }else{
           Nodo actual = claves[key];
           
           while(!emptyNode(actual.sig)){
               actual = actual.sig;
           }
           
           actual.sig = nuevo;
         }
    }
    
    
    public void listar(){
        for(int i = 0; i < size; i++){
            if(!emptyNode(claves[i])){
                Nodo actual = claves[i];
                System.out.println(i + "");
                while(!emptyNode(actual)){
                    System.out.println(actual.Id + "\t" + actual.nombre + " -> ");
                    actual = actual.sig;
                }
                
                
            }
        }
    }
    
    
    
}
