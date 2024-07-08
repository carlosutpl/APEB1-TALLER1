
package mapashash;

/**
 *
 * @author utpl
 */
public class MapasHash {

  
    public static void main(String[] args) {
        int opc;
        MapaHash obj = new MapaHash(16);
        
        do {            
            opc = obj.menu();
            switch (opc) {
                case 1:
                    obj.add();
                    break;
                case 2:
                    int key;
                    key = obj.sc.nextInt();
                    obj.listar();
                    break;
            }
            
        } while (opc != 0);
    }
    
}
