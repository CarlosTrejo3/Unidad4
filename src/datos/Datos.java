package datos;

public class Datos {
   
    public static void main(String[] args) {
        // Instanciar objeto y asignar argumentos o valores.
        Informacion info = new Informacion("Carlos","Inf",2);
        // Encapsular
        String NumCon = info.getNombre()+""+info.getCarrera()+""+info.getSemestre()+"";
        System.out.println("Datos del alumno:"+NumCon);
        
        System.out.println("TEC 2");
    }
    
}
