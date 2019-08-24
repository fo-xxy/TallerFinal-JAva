package main;

import menu.Menu;

public class Main {
    /*1: Se cre el metodo principal*/
    public static void main(String[] args){
        /*2:por fuera del main se creará, en el src menu y se crea el guiform y se le da el nombre al jpanel*/

        /*4: se hace una instania a la clase de la apertura*/
        Menu menu = new Menu();

        /*5: para que muestre ese menu*/
        menu.setVisible(true);

        /*6: nos vamos al menu*/
    }
}
