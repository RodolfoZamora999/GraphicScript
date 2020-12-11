package main;

import componentes.GraphicsComponent;
import componentes.GraphicsFactory;
import java.util.HashMap;

/**
 *Interprete del programa, interpreta una entrada de matriz de Strings línea 
 * por línea.
 * Se da por hecho que el código está en orden.
 * @author https://github.com/RodolfoZamora999
 */
public class Interprete 
{
    //Estructura de datos que mantiene las referencias 
    private final HashMap<String, GraphicsComponent> id_components;
    
    public Interprete()
    {
         id_components = new HashMap<>();
    }
    
    /**
     * Método que inicia la interpretación del código propocionado.
     * Se asume que todo está comprobado hasta este punto.
     * @param code Array con todas las líneas del código que se va a interpretar
     */
    public void interpretar(String[] code)
    {
        //Iteración por cada linea del array
        for(String line : code)
            Interpretar_linea(line);
    }
    
    private void Interpretar_linea(String line)
    {
        //Identificación de comentarios. Los ignora
        if(line.contains("//"))
            return;
        
        //Objeto a crear
        GraphicsComponent component = null;
        
        String[] tokens = line.split(" ");
        
        for(int i = 0; i < tokens.length; i++)
        {
            //Identificación de refencias
            if(tokens[i].contains("!") && i == 0)
            {
                component = id_components.get(tokens[i].substring(1));     
            }
            
            //Identificación de los atributos del objeto
            else if(tokens[i].contains("#"))
            {  
                switch(tokens[i])
                {
                    case "#id":
                        
                        id_components.put(tokens[i + 1], component);
                        
                        break;
                    
                    case "#dimension":
                        
                        //Obtención de los datos
                        String[] dimen = tokens[i + 1].split(",");
                        int ancho = Integer.parseInt(dimen[0]);
                        int alto = Integer.parseInt(dimen[1]);
                        component.tamano(ancho, alto);
                        component.refrescar();
                        
                        break;
     
                    case "#posicion": 
                        
                        //Obtención de los datos
                        String[] pos = tokens[i + 1].split(",");
                        int x = Integer.parseInt(pos[0]);
                        int y = Integer.parseInt(pos[1]);
                        component.posicion(x, y);
                        component.refrescar();
                         
                        break;
 
                    case "#color":
                      
                        //Obtención de los datos
                        String[] color = tokens[i + 1].split(",");
                        int r = Integer.parseInt(color[0]);
                        int g = Integer.parseInt(color[1]);
                        int b =  Integer.parseInt(color[2]);
                        component.color(r, g, b);
                        component.refrescar();
                        break;
                    
                    case "#texto":
                      
                        String text = "";
                        
                        //Obtención de los datos
                        String[] texto = tokens[i + 1].split("_");
                                                
                        for(String value : texto)
                            text += value + " "; 
                        
                        component.texto(text.trim());
                        break;
                    
                    case "#texto_tamano":
                        
                        int tamano = Integer.parseInt(tokens[i + 1]);
                        
                        component.texto_tamano(tamano);
                        
                        break;  
                        
                        
                    case "#imagen":
                        
                        String src = tokens[i + 1];
                        component.imagen(src);
                        
                        break;
                          
                    case "#insertar": 
                        
                       //Variable de apoyo para ser insertada
                       GraphicsComponent component1 = id_components.get( tokens[i + 1].substring(1));
                       component.insertar(component1); 
                       component.refrescar();
                       break;
                        
                    default:
                        System.err.println("Error con la identificación...");
                            break;
                }
                
                i++;
            }
           
            else if(i == 0)
            { 
               //Asignación de referencia temporal y uso de la clase de fábrica.
               component = GraphicsFactory.factoryComponent(tokens[i]);
            }  
        }
    }   
}
