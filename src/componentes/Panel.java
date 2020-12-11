package componentes;

import java.awt.Color;
import javax.swing.JComponent;
import javax.swing.JPanel;

/**
 *Componente Panel que sirve para insertar más componentes sobre este.
 * @author https://github.com/RodolfoZamora999
 */
public class Panel extends JPanel implements GraphicsComponent
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
        this.repaint();
    }

    @Override
    public void color(int r, int g, int b) 
    {
        Color color = new Color(r, g, b);
        
        this.setBackground(color);
    }
}
