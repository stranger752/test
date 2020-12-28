/**
 * @author Jes&uacute;s Alberto S&aacute;nchez Mendieta
 * N&uacute;mero de cuenta: 0912365
 */

public class Artista {
    
    private String nombre;
    private String nacionalidad;

    public Artista(){
    }

    public String getNacionalidad(){
        return this.nacionalidad;
    }

    public void setNacionalidad(String nacionalidad){
        this.nacionalidad = nacionalidad;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
}
