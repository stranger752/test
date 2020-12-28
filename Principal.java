/**
 * @author Jes&uacute;s Alberto S&aacute;nchez Mendieta
 * N&uacute;mero de cuenta: 0912365
 */

public class Principal {
    
    public static void main(String args[]){

        //---------------------------------------------------------------------------------------------------------//
        // VARIABLES
        int seleccion = 0;
        int total = 0;
        boolean flag = true;
        int anio = 0;
        int seleccionArtista;
        String name, genre;
        String nameCompare;
        // Informaci&oacute;n de los artistas:
        String[] ArtistasNombre = {"Bruno Mars","Katy Perry","Natalia Lafourcade","Harry Styles",
        "La Rosalía","Julio Iglesias","The weeknd","Will.I.am","Justin Bieber","Shaum Mendez",
        "Shakira", "Ed Sheeran","Camila Cabello","Dua Lipa","Billie Eilish"};
        String[] ArtistasNacionalidad = {"Estados Unidos", "Estados Unidos","México", "Inglaterra", "España","España", 
        "Canada","Estados Unidos","Canada","Canada","Colombia","Inglaterra","Cuba","Inglaterra","Estados Unidos"};
        // Opciones del men&uacute; principal
        String[] menuOpciones = {"Crear discos","Consultar discos","Consultar un disco",
        "Modificar la información de un disco","Borrar un disco","Salir"};
        //----------------------------------------------------------------------------------------------------------//
        
        Artista[] famosos = new Artista[15];

        famosos[0] = new Artista();
        famosos[0].setNombre(ArtistasNombre[0]);
        famosos[0].setNacionalidad(ArtistasNacionalidad[0]);

        famosos[1] = new Artista();
        famosos[1].setNombre(ArtistasNombre[1]);
        famosos[1].setNacionalidad(ArtistasNacionalidad[1]);

        famosos[2] = new Artista();
        famosos[2].setNombre(ArtistasNombre[2]);
        famosos[2].setNacionalidad(ArtistasNacionalidad[2]);

        famosos[3] = new Artista();
        famosos[3].setNombre(ArtistasNombre[3]);
        famosos[3].setNacionalidad(ArtistasNacionalidad[3]);

        famosos[4] = new Artista();
        famosos[4].setNombre(ArtistasNombre[4]);
        famosos[4].setNacionalidad(ArtistasNacionalidad[4]);

        famosos[5] = new Artista();
        famosos[5].setNombre(ArtistasNombre[5]);
        famosos[5].setNacionalidad(ArtistasNacionalidad[5]);

        famosos[6] = new Artista();
        famosos[6].setNombre(ArtistasNombre[6]);
        famosos[6].setNacionalidad(ArtistasNacionalidad[6]);

        famosos[7] = new Artista();
        famosos[7].setNombre(ArtistasNombre[7]);
        famosos[7].setNacionalidad(ArtistasNacionalidad[7]);

        famosos[8] = new Artista();
        famosos[8].setNombre(ArtistasNombre[8]);
        famosos[8].setNacionalidad(ArtistasNacionalidad[8]);

        famosos[9] = new Artista();
        famosos[9].setNombre(ArtistasNombre[9]);
        famosos[9].setNacionalidad(ArtistasNacionalidad[9]);

        famosos[10] = new Artista();
        famosos[10].setNombre(ArtistasNombre[10]);
        famosos[10].setNacionalidad(ArtistasNacionalidad[10]);

        famosos[11] = new Artista();
        famosos[11].setNombre(ArtistasNombre[11]);
        famosos[11].setNacionalidad(ArtistasNacionalidad[11]);

        famosos[12] = new Artista();
        famosos[12].setNombre(ArtistasNombre[12]);
        famosos[12].setNacionalidad(ArtistasNacionalidad[12]);

        famosos[13] = new Artista();
        famosos[13].setNombre(ArtistasNombre[13]);
        famosos[13].setNacionalidad(ArtistasNacionalidad[13]);

        famosos[14] = new Artista();
        famosos[14].setNombre(ArtistasNombre[14]);
        famosos[14].setNacionalidad(ArtistasNacionalidad[14]);

        Disco CD[] = new Disco[100];

        // Menus
        Menu menuPrincipal = new Menu();
        menuPrincipal.setTitulo("VIRGIN RECORDS: MENÚ PRINCIPAL");
        menuPrincipal.setOpciones(menuOpciones);

        Menu menuArtistas = new Menu(ArtistasNombre,"Artistas");

        // Vista
        Vista vista = new Vista();

        do {
            menuPrincipal.muestraMenu();
            seleccion =  menuPrincipal.getOpcion();
            switch(seleccion){
            case 1: // Creación de discos
                if(total < 100){
                    System.out.println("Crear disco. Ingrese los datos del disco:");
                    Disco disco = new Disco();
                    name = vista.askName();
                    disco.setNombre(name);
                    genre = vista.askGenre();
                    disco.setGenero(genre);
                    anio = vista.askAnio();
                    disco.setAnio(anio);

                    menuArtistas.muestraMenu();
                    seleccionArtista = menuArtistas.getOpcion() - 1;
                    disco.setArtista(famosos[seleccionArtista]);
                    // Incluirlo en el arreglo
                    for(int i=0 ; i<CD.length ; i++){
                        if(CD[i]==null){
                            CD[i] = disco;
                            total++;
                            break;
                        }                            
                    }
                } else{
                    System.out.println("Catalogo lleno");
                }
                break;
            case 2: // Consultar discos
                System.out.println("Discos en el catalogo:");
                for(int i=0 ; i<total ; i++){
                    if(CD[i] != null){
                        System.out.println(CD[i].getNombre());
                    }
                }
                break;
            case 3: // Consultar la informaci&oacute;n de un disco
                System.out.println("Escriba el nombre del disco a consultar:");
                name = vista.askName();
                for(int i=0 ;  i<total ; i++){
                    nameCompare = CD[i].getNombre();
                    if(name.compareTo(nameCompare)==0){
                        System.out.println("Informacion del disco:");
                        System.out.println("Nombre del disco: " + CD[i].getNombre());
                        System.out.println("Artista: " + CD[i].getArtista().getNombre());
                        System.out.println("Anio:" + CD[i].getAnio());
                        System.out.println("Nacionalidad: " + CD[i].getArtista().getNacionalidad());
                        System.out.println("Genero:" + CD[i].getGenero());
                        break;
                    }else{
                        if( i == total - 1){
                            System.out.println("No existe un disco con ese nombre.");
                            System.out.println("Consulte la lista de discos registrados e intentelo nuevamente.");
                        }
                    }
                }
                break;
            case 4: // Modificar la informaci&oacute;n de un disco
                System.out.println("Escriba el nombre del disco a modificar:");
                name = vista.askName();
                for(int i=0 ;  i<total ; i++){
                    nameCompare = CD[i].getNombre();
                    if(name.compareTo(nameCompare)==0){
                        System.out.println("Registre los nuevos datos del disco:");
                        Disco disco = new Disco();
                        name = vista.askName();
                        disco.setNombre(name);
                        genre = vista.askGenre();
                        disco.setGenero(genre);
                        anio = vista.askAnio();
                        disco.setAnio(anio);

                        menuArtistas.muestraMenu();
                        seleccionArtista = menuArtistas.getOpcion() - 1;
                        disco.setArtista(famosos[seleccionArtista]);
                        CD[i] = disco;
                        System.out.println("Disco modificado.");
                        break;
                    }else{
                        if( i == total - 1){
                            System.out.println("No existe un disco con ese nombre.");
                            System.out.println("Consulte la lista de discos registrados e intentelo nuevamente.");
                        }
                    }
                }
                break;
            case 5: // Borrar disco
                System.out.println("¿Qué disco desea borrar?");
                name = vista.askName();
                for(int i=0 ;  i<total ; i++){
                    nameCompare = CD[i].getNombre();
                    if(name.compareTo(nameCompare)==0){
                        CD[i] = null;
                        System.out.println("Disco borrado con exito.");
                        break;
                    }else{
                        if( i == total - 1){
                            System.out.println("No existe un disco con ese nombre.");
                            System.out.println("Consulte la lista de discos registrados e intentelo nuevamente.");
                        }
                    }
                }
                break;
            case 6: // Salir
                System.out.println("Fin del programa");
                flag = false;
                System.exit(0);
                break;
            default: System.out.println("Seleccione nuevamente."); 
                break;
            }
        }while(flag);
    }
}
