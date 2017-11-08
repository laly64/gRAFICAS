/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
//PASO 1 - IMPORTAR LIBRERIA GRAFICA
import graficas.*;
import javax.swing.*; //Librria gráfica estandar multiplataforma
import java.awt.*; //Libreria gráfica del Sistema Operativo
/**
 *
 * @author LAB02
 */
//PASO 2 - HEREDAR MI CLASE DESDE JFRAME
public class Miventana extends JFrame 
{

  //PASO 3 - DECLARAR LOS ELEMENTOS QUE VAMOS A UTILIZAR
    JPanel mipanel; //creación de objeto JPanel
    JLabel milabel;
    JTextField mitexto;
    JButton miboton;
    
    //PAASO 4 - DEFINICION DEL CONSTRUCTOR DE LA CLASE
    public Miventana() //Tiene el mismo nombre de la clase
    {
      //PASO 5 - CREAR E INICIALIZAR LOS OBJETOS QUE UTILIZAREMOS
      mipanel = new JPanel(); //Creamos el objeto
      milabel = new JLabel();
      mitexto = new JTextField(10);//10 son los Scaracteres
      miboton = new JButton();
      
      //PASO 6 - AGREGAR LOS ELEMENTOS AL JFAMER
      this.add(mipanel); //agrego el JPanel al JFrame
      mipanel.add(milabel);//egrego los elemento al JPanel
      mipanel.add(mitexto);
      mipanel.add(miboton);
      //paso 7 -PROPIEDADES DE LOS ELEMENTOS
     milabel.setText("campo");
     miboton.setText("presioname");
    }
    
   /* public static void main(String[] args)
    {
  JFrame miventana = new JFrame(); // Creamos un objeto tipo JFrame
miventana.setVisible(true); //Esta sentencia muestra la ventana 
miventana.setBounds(0, 0,400, 400); //Le asignamos tamaño a la ventana
miventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Esta sentencia cierra la ventana
    }*/
    
}

