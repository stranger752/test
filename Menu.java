
/**
 * @author Jes&uacute;s Alberto S&aacute;nchez Mendieta
 * N&uacute;mero de cuenta: 0912365
 */

import java.util.Scanner;

public class Menu{
    String[] opciones;
    String titulo;
    
    public Menu(String[] ops){
        opciones = ops;
    }

    public Menu(String[] ops, String t){
        opciones = ops;
        titulo = t;
    }

    public Menu(){
    }
      
    public void setTitulo(String t){
        titulo = t;
    }
    
    public void setOpciones(String[] ops){
        opciones = ops;
    }
    
    public int getOpcion(){
        Scanner entrada;
        boolean bandera=false;
        int val=0;
        do{
            try{
                entrada = new Scanner(System.in);
                System.out.println("Selecciona una opcion: ");
                val = entrada.nextInt();
                if(val < 1 || val > opciones.length){
                    System.out.println("Opcion incorrecta, las opciones van de 1 a "+opciones.length);
                    bandera = true;
                } else {
                    bandera = false;
                }
            }catch(Exception e){
                System.out.println("Debes proporcionar un numero entero");
                bandera=true;
            }
        }while(bandera);
        return val;
    }
    
    public void muestraMenu(){
        if(titulo != null){
            System.out.println("=============================================");
            System.out.println(titulo);
            System.out.println("=============================================");
        }
        if(opciones !=null){
            for(int i=0;i<opciones.length;i++){
                System.out.println((i+1)+") "+opciones[i]);
            }
        }
    }
}
