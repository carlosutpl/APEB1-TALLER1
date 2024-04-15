package javaproject69420;

public class maincla {

    public static void main(String[] args) {
        metodo objMetodo = new metodo();

        int option;
        do {
            option = objMetodo.menu();

            switch (option) {
                case 1:
                    objMetodo.escribir();
                    break;
                case 2:
                    objMetodo.traer();
                    break;

                default:
                    throw new AssertionError();
            }
        } while (option != 0);

    }

}
