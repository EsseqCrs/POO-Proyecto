
package proyecto;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Usuario {
    private int id=0;
    private String user;
    private String nombre;
    private String apellido;
    private int edad;
    private String sexo;
    private String email;
    private String pass;


    @Override
    public String toString() {
        return "Usuario:" + "id=" + id + ", user=" + user + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", sexo=" + sexo + ", email=" + email + ", pass=" + pass + '}';
    }
    
    public Usuario() {
    }

    public Usuario(int id, String user, String nombre, String apellido, int edad, String sexo, String email, String pass) {
        this.id = id;
        this.user = user;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
        this.email = email;
        this.pass = pass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public boolean save() throws IOException{
        boolean res = false;
        File datos = new File("Usuarios.txt");
        FileWriter fw = new FileWriter(datos, true);
        BufferedWriter bw = new BufferedWriter(fw);
        String cad = id+"#"+user+"#"+nombre+"#"+apellido+"#"+edad+"#"+sexo+"#"+email+"#"+pass;
        
        bw.write(cad);
        bw.newLine();
        res=true;
        bw.close();
        fw.close();
        return res;
    }    

    void setId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
