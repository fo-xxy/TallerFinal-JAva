package opciones.calcular_salario;

import clases.salarios.SalarioDao;
import menu.Menu;

import javax.swing.*;
import java.awt.*;

import java.text.DecimalFormat;

import static clases.constantes.MatematicasInt.CERO;
import static clases.constantes.MatematicasInt.QUINIENTOS;
import static clases.constantes.MatematicasInt.SEISIENTOS;

import static clases.constantes.salario.SalarioString.*;


public class Salarios extends Frame {


    private JTextField txtnombre;
    private JComboBox cbdiaLaborado;
    private JComboBox cbturno;
    private JTextField txthorasLaboradas;
    private JButton btncalcular;
    private JLabel lblresultado;
    private JPanel calcularSalario;
    private JButton btnsalir;


    DecimalFormat formato = new DecimalFormat("###,###.##");
    transient SalarioDao salarioDao = new SalarioDao();

    /*2.9: Se crea un constructor*/
    public Salarios(){

        /*2.10: Se agregan las propiedades, en este caso se agrega el nombre del Jpanel en este caso es calcular_saalrio */
        add(calcularSalario);
        /*2.11: titulo a la ventana*/
        setTitle(NOMBRE_VENTANA.getMensaje());
        /*2.12: El tamaño ancho y alto*/
        setSize(QUINIENTOS.getValor(),SEISIENTOS.getValor());


        /*2.13: Se cre el listener del boton, en este caso es el boton calcular, de la ventana de salarios y nos vamos a salarioDao para hacer la logica */

        /*2.16: Al regresar instanciamos la clase hija, en este caso SalariosDao*/
        btncalcular.addActionListener(e -> {
            validar();
            lblresultado.setText(MENSAJE_RESULTADO1.getMensaje() + salarioDao.getNombre()+" " + MENSAJE_RESULTADO2.getMensaje() + formato.format(salarioDao.calcularSalario()));
        });
        btnsalir.addActionListener(e -> {
            menu.Menu menu = new Menu();
            menu.setVisible(true);
            esconderVentana();
        });
    }
    /*2.17: Crearé un método para validar que cada cambo tenga datos, al crealo solo lo llamo desde el boton y listo*/
    public void validar(){
        /*2.18: Iniciamos la asignacion en cada siclo, este ciclo se hace para validar que esten llenos*/

        if(txtnombre.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, MENSAJE_PETICION1.getMensaje() );
        }
        else if(cbdiaLaborado.getSelectedIndex() == CERO.getValor()){
            JOptionPane.showMessageDialog(null, MENSAJE_PETICION2.getMensaje());
        }
        else if(cbturno.getSelectedIndex() == CERO.getValor()){
            JOptionPane.showMessageDialog(null, MENSAJE_PETICION3.getMensaje());
        }
        else if(txthorasLaboradas.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, MENSAJE_PETICION4.getMensaje());
        }
        else {
            salarioDao.setNombre(txtnombre.getText());
            salarioDao.setDia(cbdiaLaborado.getSelectedItem().toString());
            salarioDao.setTurno(cbturno.getSelectedItem().toString());
            salarioDao.setHoras(Integer.parseInt(txthorasLaboradas.getText()));
            lblresultado.setVisible(true);

        }
    }
    private void esconderVentana(){
        this.dispose();
    }
}
