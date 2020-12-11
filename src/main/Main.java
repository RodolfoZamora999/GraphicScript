package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileNameExtensionFilter;


/**
 *Entrada del archivo que se va interpretar.
 * @author https://github.com/RodolfoZamora999
 */
public class Main 
{
    public static void main(String... args) throws FileNotFoundException,
            ClassNotFoundException, InstantiationException,
            IllegalAccessException, UnsupportedLookAndFeelException
    {
        //Test borrar
        //args = new String[1]; args[0] = System.getProperty("user.dir") + "\\build\\classes\\main" + File.separator + "codigo.gs";
        //Test borrar
        
       
        //Bienvenida al programa
        System.out.println("|GraphicsScript 1.0|");
        System.out.println("");
        
        //Archivo pasado por parametro
        if(args.length > 0)
        {
            File file = new File(args[0]); 
            init_scanner(file);
        }
        
        //Selección de archivo de manera manual
        else
        {
            //Estilo de los gráficos
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            
            JFileChooser chooser = new JFileChooser();
            chooser.setFileFilter(new FileNameExtensionFilter("gs", "gs"));
            int status = chooser.showOpenDialog(null);
            
            if(status == JFileChooser.APPROVE_OPTION)
            {
                File file = chooser.getSelectedFile();
                init_scanner(file);
            }
        }
        
        System.out.println("");
        System.out.println("Finalización con exito...");
    }
    
    
    /**
     * Método de entrada al escaneo del archivo
     * @param file
     * @throws FileNotFoundException 
     */
    private static void init_scanner(File file) throws FileNotFoundException
    {
        if(file.exists() && file.isFile())
        {
            Scanner scanner = new Scanner(file);
            ArrayList<String> lineas = new ArrayList<>();
            
            //Lectura del archivo y carga al string
            while(scanner.hasNext())
            {
                String variable = scanner.nextLine();
                
                //Se ignoran los espacios en blanco
                if(variable.isBlank())
                    continue;
            
                lineas.add(variable);
            }

                //cierre del fljo de datos
                scanner.close();

               //Analisis Lexico
               //Lexico lexico = new Lexico();
               //lexico.analizar_lexico(code.toString());
                
                
               //Analisis Semantico

                
               //Analisis Sintactico
                
               //Creación de la instancia Interprete
               Interprete interprete = new Interprete();
                
               //Se pasa el array con el código verificado
               interprete.interpretar(lineas.toArray(new String[lineas.size()]));
            }   
    }
}
