/**
 * @author Jes&uacute;s Alberto S&aacute;nchez Mendieta
 * N&uacute;mero de cuenta: 0912365
 */

import java.util.Scanner;

public class Vista {
    
    Scanner entrada = new Scanner(System.in);

    public int askAnio(){
        Scanner entrada;
        boolean bandera=false;
        int val=0;
        do{
            try{
                entrada = new Scanner(System.in);
                System.out.println("Escriba el anio del disco: ");
                val = entrada.nextInt();
                if(val < 1930 || val > 2020){
                    System.out.println("Opcion incorrecta, debe estar entre 1930 y 2020");
                    bandera = true;
                } else {
                    bandera = false;
                }
            }catch(Exception e){
                System.out.println("Debes proporcionar un numero entero entre 1930 y 2020");
                bandera=true;
            }
        }while(bandera);
        return val;
    }

    public String askName(){
        Scanner entrada;
        boolean bandera=false;
        String nom = null;
        do{
            entrada = new Scanner(System.in);
            System.out.println("Dame el nombre del disco: ");
            nom = entrada.next();
            if(nom == null || nom.length()==0){
                System.out.println("Debes proporcionar un nombre");
                bandera = true;
            } else {
                bandera = false;
            }
        }while(bandera);
        return nom;
    }
    
    public String askGenre(){
        Scanner entrada;
        boolean bandera=false;
        String nom = null;
        do{
            entrada = new Scanner(System.in);
            System.out.println("Dame el genero del disco: ");
            nom = entrada.next();
            if(nom == null || nom.length()==0){
                System.out.println("Debes proporcionar un genero");
                bandera = true;
            } else {
                bandera = false;
            }
        }while(bandera);
        return nom;
    }

}
