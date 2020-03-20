
package proyecto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class BD {
        private ArrayList<Usuario> usuarios = new ArrayList<>();
        private ArrayList<Usuario> peliculas = new ArrayList<>();
        
    private void Mostrar(){
        usuarios.forEach(u->
        {
            System.out.println(u.toString());
        }
        );
    }
    
    public BD() {
        LeerUsuarios();
        Mostrar();
        GuardarUsuarios();
    }
        
    private void LeerUsuarios(){
        try {
            String linea;
            BufferedReader lector = new BufferedReader(new FileReader("Usuarios.txt"));
            while ((linea=lector.readLine())!=null) { 
                
                String arg[]= linea.split("#");
                Usuario us = new Usuario(Integer.parseInt(arg[0]), arg[1], arg[2], arg[3], Integer.parseInt(arg[4]), arg[5], arg[6], arg[7]);
                usuarios.add(us);
            }
                    
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Blockbuster.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Blockbuster.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
    private void GuardarUsuarios(){
            try {
                File datos = new File("Usuarios.txt");
                FileWriter fw = new FileWriter(datos, false);
                BufferedWriter bw = new BufferedWriter(fw);

                bw.write("");
                //datos.createNewFile();
                usuarios.forEach(u->{
                        System.out.println(u.toString());
                        try{
                            u.save();
                        }catch (IOException ex) {
                            Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                );                
            } catch (IOException ex) {
                Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
   
    private void LeerPeliculas(){
        try {
            String linea;
            BufferedReader lector = new BufferedReader(new FileReader("Peliculas.txt"));
            while ((linea=lector.readLine())!=null) { 
                
                String arg[]= linea.split("#");
                Usuario us = new Usuario(Integer.parseInt(arg[0]), arg[1], arg[2], arg[3], Integer.parseInt(arg[4]), arg[5], arg[6], arg[7]);
                peliculas.add(us);
            }
                    
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Blockbuster.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Blockbuster.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
    private void GuardarPeliculas(){
            try {
                File datos = new File("Peliculas.txt");
                FileWriter fw = new FileWriter(datos, false);
                BufferedWriter bw = new BufferedWriter(fw);

                bw.write("");
                //datos.createNewFile();
                peliculas.forEach(u->{
                        System.out.println(u.toString());
                        try{
                            u.save();
                        }catch (IOException ex) {
                            Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                );                
            } catch (IOException ex) {
                Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    
    public Usuario Login(String user, String pass){
        for (int i=0; i<usuarios.size(); i++) {
            Usuario us = usuarios.get(i);
            if(us.getUser().equals(user)&&us.getPass().equals(pass)){
                return us;
            }
        }
        return null;
    }

    
}
