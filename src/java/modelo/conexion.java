package modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {
    public Connection cnbd;
    //jdbc:mysql://localhost:3306/?user=root
    private final String puerto = "3306";
    private final String bd = "db_empresa";
    // jdbc:mysql://localhost:%s/%s?serverTimezone=UTC
    private final String urlcn = String.format("jdbc:mysql://localhost:%s/%s?serverTimezone=UTC", puerto,bd);
    private final String user = "root";
    private final String pass = "Beto19$$";
    private final String jdbc = "com.mysql.cj.jdbc.Driver";
    
    public void abrir_cn(){
    
        try{
            Class.forName(jdbc);
            cnbd = DriverManager.getConnection(urlcn, user, pass);
            System.out.println("Conexion Exitosa... ");
        }catch(ClassNotFoundException | SQLException ex){
            System.out.println("EROR " + ex.getMessage());
    
        }
    
    }
    
    public void cerrar_cn(){
        try{
            
            cnbd.close();
        
        }catch(SQLException ex){
            
            System.out.println("EROR " + ex.getMessage());
    
        }
    }
    
}
    

