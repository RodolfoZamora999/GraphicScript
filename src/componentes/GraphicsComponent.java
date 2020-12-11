package componentes;

/**
 *Interfaz que todos los componentes tienen que aplicar.
 * @author https://github.com/RodolfoZamora999
 */
public interface GraphicsComponent 
{
    /**
     * Especificación de la posición del objeto
     * @param x Especificación en X
     * @param y Especificación en Y
     */
    public void posicion(int x, int y);
    
    /**
     * Especificación del tamaño del objeto
     * @param ancho
     * @param alto 
     */
    public void tamano(int ancho, int alto);
    
   
    /**
     * Especificación del color
     * @param r Rojo
     * @param g Verde
     * @param b Azul
     */
    public void color(int r, int g, int b);
    
    /**
     * Especificación del texto del objeto, se hace una implementación por default. 
     * @param texto Que se escribe.
     */
    public default void texto(String texto)
    {
        
    }
    
    /**
     * Especificación para el tamño de letra de los componentes
     * @param tamano Tamaño de leta de los componentes
     */
    public default void texto_tamano(int tamano)
    {
        
    }
    
    /**
     * Especificación para la implementación de una imagen
     * @param src 
     */
    public default void imagen(String src)
    {
        
    }
    
    /**
     * Método que añade un objeto al objeto actual.
     * @param graphicsComponent Componenente que se desea insertar.
     */
     void insertar(GraphicsComponent graphicsComponent);  
     
     /**
      * Método que recarga la clase.
      */
     void refrescar();
}
