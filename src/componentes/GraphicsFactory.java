package componentes;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;

/**
 *Clase de fábrica que genera los componentes.
 * @author https://github.com/RodolfoZamora999
 */
public class GraphicsFactory 
{
    /**
     * Método de fábrica que sirve para generar los compoenentes indentificando
     * el tipo apartir de un string.
     * @param componente Referencia del componente a crear.
     * @return Instancia del compoente creado, aplicamos polimorfismo 
     */
    public static GraphicsComponent factoryComponent(String componente)
    {
        GraphicsComponent component = null;
        
        
        switch(componente)
        {
            case "Ventana":
                Ventana ventana = new Ventana();
                ventana.setLocation(0, 0);
                ventana.setSize(0, 0);
                ventana.setResizable(false);
                ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                ventana.setVisible(true);
                ventana.setLayout(null);
                component = ventana;
                break;
             
            case "Panel":
                Panel panel = new Panel();
                panel.setLocation(0, 0);
                panel.setSize(0, 0);
                panel.setVisible(true);
                panel.setLayout(null);
                component = panel;
                break;
                  
            case "Boton":
                Boton boton = new Boton();
                boton.setLocation(0, 0);
                boton.setSize(0, 0);
                boton.setVisible(true);
                boton.setLayout(null);
                boton.setFont(new Font("arial", Font.BOLD, 24));
                component = boton;
                break;
            
            case "Etiqueta":
                Etiqueta etiqueta = new Etiqueta();
                etiqueta.setLocation(0, 0);
                etiqueta.setSize(0, 0);
                etiqueta.setVisible(true);
                etiqueta.setLayout(null);
                etiqueta.setFont(new Font("arial", Font.BOLD, 16));
                component = etiqueta;
                break;
            
            
            case "Imagen":
                Imagen imagen = new Imagen();
                imagen.setLocation(0, 0);
                imagen.setSize(0, 0);
                imagen.setVisible(true);
                imagen.setLayout(null);
                imagen.setBackground(Color.WHITE);
                component = imagen;
                break;
        }
        
        return component;
    }
}
