/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;

/**
 *
 * @author rodol
 */
public class Imagen extends JLabel implements GraphicsComponent
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
    
    @Override
    public void imagen(String src)
    {
        ImageIcon image = new ImageIcon(src);
        
        this.setIcon(image);
    }
}
