/**
 * @author Jes&uacute;s Alberto S&aacute;nchez Mendieta
 * N&uacute;mero de cuenta: 0912365
 */

public class Disco{
    private String nombre;
    private String genero;
    private Artista artista;
    private int anio;

    public Disco(){
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre; 
    }

    public String getGenero(){
        return this.genero;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public Artista getArtista(){
        return this.artista;
    }

    public void setArtista(Artista artista){
        this.artista = artista;
    }
    
    public int getAnio(){
        return this.anio;
    }

    public void setAnio(int anio){
        this.anio = anio;
    }

}