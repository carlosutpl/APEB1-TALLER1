/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mapashash;

/**
 *
 * @author utpl
 */
public class Nodo {

    int Id;
    String nombre;
    Nodo sig;

    public Nodo(int _Id, String _nombre) {
        this.Id = _Id;
        this.nombre = _nombre;
        this.sig = null;
    }
}
