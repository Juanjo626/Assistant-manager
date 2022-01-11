package programa;
public class Materias {
    int materia=0;
    private String clase;
    private String nombreMateria;
    private String descripcion;
    
    public Materias(){
        nombreMateria="";
        descripcion="";
    }
//get y set para los arreglos de nombre materia y descripcion
    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public Materias(String clase){
        nombreMateria=clase;
        
    }
    public void Materia(){
        
        System.out.println(clase);
        char matematicas, lenguaje;
        
    }
    public int darNumeroMaterias( )
    {
        return materia;
    }
    public void numeroMaterias(){
        
        materia = materia+1;
    }
}

    
  
