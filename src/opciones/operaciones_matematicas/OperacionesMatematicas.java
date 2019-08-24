package opciones.operaciones_matematicas;

import clases.operaciones.MatematicasDao;
import static clases.constantes.MatematicasString.TITULO_OPCION_MATEMATICA;
import static clases.constantes.MatematicasInt.QUINIENTOS;
import static clases.constantes.MatematicasInt.SEISIENTOS;
import menu.Menu;

import javax.swing.*;
import java.awt.*;


public class OperacionesMatematicas extends Frame {
    transient MatematicasDao matematicasDao = new MatematicasDao();
    private JPanel operaciones;
    private JTextField txtnumero1;
    private JTextField txtnumero2;
    private JButton btnsumar;
    private JButton btnrestar;
    private JButton btnmultiplicar;
    private JButton btndividir;
    private JButton btnsalir;
    private JLabel lblresultado;

    public OperacionesMatematicas(){

            /*8: se agregan las propiedades, que lo agregue en la ejecucion*/
            add(operaciones);
            /*9: titulo a la ventana*/
            setTitle(TITULO_OPCION_MATEMATICA.getTexto());
            /*10: El tamaño ancho y alto*/
            setSize(QUINIENTOS.getValor(),SEISIENTOS.getValor());
            /*11: sigue el diseño, la parte grafica*/

        btnsalir.addActionListener(e -> {
                /*12: Se instancia la clase de las operaciones*/
                Menu menu = new Menu();
                /*13: para que se vea el munu*/
                menu.setVisible(true);
                esconderVentana();
        });

        /*22: Se crea un listener para el boton sumar, proximo paso mas abajo, en el metodo datos*/
        btnsumar.addActionListener(e -> {
            /*23.1: Se asigna el dato sigue los pasos en el metodo datos*/
            datos(txtnumero1.getText(), txtnumero2.getText());
            lblresultado.setText(String.valueOf(matematicasDao.calcularSuma()));

        });

        /*24: el boton de restar*/
        btnrestar.addActionListener(e -> {
            datos(txtnumero1.getText(), txtnumero2.getText());
            lblresultado.setText(String.valueOf(matematicasDao.calcularResta()));
        });

        /*25: el boton de multiplicar*/
        btnmultiplicar.addActionListener(e -> {
            datos(txtnumero1.getText(), txtnumero2.getText());
            lblresultado.setText(String.valueOf(matematicasDao.calcularMultiplicacion()));
        });

        /*26: el boton de division*/
        btndividir.addActionListener(e -> {
            datos(txtnumero1.getText(), txtnumero2.getText());
            lblresultado.setText(String.valueOf(matematicasDao.calcularDivision()));
        });

        /*27 las constantes*/
    }
    private void esconderVentana(){
        this.dispose();
    }

    /*23 Este metodo es para no tener que asignar todos los valores en los diferentes metodos, sino que se llama nada mas a este metodo*/
    private void datos(String valor1, String valor2){

        matematicasDao.setNumero1(Double.parseDouble(valor1));
        matematicasDao.setNumero2(Double.parseDouble(valor2));


        lblresultado.setVisible(true);


    }
}
