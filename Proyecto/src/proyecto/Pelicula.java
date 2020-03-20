
package proyecto;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Pelicula {
    private int id;
    private String titulo;
    private String director;
    private String genero;
    private String clasificacion;
    private int precio;
    private int stock;

    public Pelicula() {
    }

    public Pelicula(int id, String titulo, String director, String genero, String clasificacion, int precio, int stock) {
        this.id = id;
        this.titulo = titulo;
        this.director = director;
        this.genero = genero;
        this.clasificacion = clasificacion;
        this.precio = precio;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    public boolean save() throws IOException{
        boolean res = false;
        File datos = new File("Peliculas.txt");
        FileWriter fw = new FileWriter(datos, true);
        BufferedWriter bw = new BufferedWriter(fw);
        String cad = id+"#"+titulo+"#"+director+"#"+genero+"#"+clasificacion+"#"+precio+"#"+stock;
        
        bw.write(cad);
        bw.newLine();
        res=true;
        bw.close();
        fw.close();
        return res;
    }
}
