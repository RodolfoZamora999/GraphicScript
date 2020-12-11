package componentes;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JComponent;
import javax.swing.JLabel;

/**
 *Componente Etiqueta que sirve para crear interfaces de etiqueta en el programa.
 * @author https://github.com/RodolfoZamora999
 */
public class Etiqueta extends JLabel implements GraphicsComponent
{
    @Override
    public void posicion(int x, int y) 
    {
        this.setLocation(x, y);
    }
    
    @Override
    public void insertar(GraphicsComponent graphicsComponent) 
    {
        //Hacemos una comprobación de herencia y hacemos el casteo
        if(graphicsComponent instanceof JComponent)
            this.add((JComponent)graphicsComponent);
            
    }

    @Override
    public void tamano(int ancho, int alto)
    {
        this.setSize(ancho, alto);
    }

    @Override
    public void refrescar() 
    {
        this.revalidate();
    }

    @Override
    public void color(int r, int g, int b) 
    {
        Color color = new Color(r, g, b);
        
        this.setForeground(color);
    }
    
    @Override
    public void texto(String texto)
    {
        this.setText(texto);
    }
    
    @Override
    public void texto_tamano(int tamano)
    {
        this.setFont(new Font("arial", Font.BOLD, tamano));
    }
}