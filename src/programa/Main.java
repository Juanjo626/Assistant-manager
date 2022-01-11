package programa;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);       
        char[] arregloTituloT = new char[25];
        char[] arregloDescipcionT = new char[100];
        char[] arregloMateria = new char[30];
        
        Materias ma =new Materias();
        int op=0;
       
        
        do{
            System.out.println("M E M O R Y   A S S I S T A N T"//agregar la fecha actual
                    + "\n1.-CREAR TAREAS / ELIMINAR TAREAS"
                    + "\n2.-REVISAR TAREAS POR FECHA"//dentro las tareas completadas, por completar y las tareas totales
                    + "\n3.-REVISAR LAS TAREAS" //dentro las tareas completadas, por completar y las tareas totales
                    + "\n4.-AGREGAR MATERIAS / ELIMINAR MATERIAS");
            System.out.println("5.-SALIR");
            op=sc.nextInt();
            switch (op){
                case 1:
                    //CREAR TAREAS //ELIMINAR TAREAS
                    int materia,mat=0;
                    
                    System.out.println("Seleccione la materia"); //llamamos al objeto de clase materias
                    do{   
                    ma.Materia();
                    mat=sc.nextInt();//guardar la materia 
                    
                    }while(mat!=ma.numeroMaterias());    
                    System.out.println("Ingrese un titulo para la tarea");
                    
                    System.out.println("Ingrese la descripcion de la tarea");//recive el string 
                    
                    System.out.println("Ingrese la fecha donde quiere ");
                    
                break;
                case 2:
                    int op2=0;
                    
                    do{
                        System.out.println("R E V I S I O N   D E   T A R E A S  P O R  F E C H A"
                                + "\n1.-TAREAS COMPLETADAS POR FECHA"
                                + "\n2.-TAREAS POR COMPLETAR POR FECHA"
                                + "\n3.-TODAS LAS TAREAS POR FECHA"
                                + "\n4.-REGRESAR AL MENÚ PRINCIPAL");
                        op2=sc.nextInt();
                        switch (op2){
                            case 1:
                            break;
                            case 2:
                            break;
                            case 3:
                            break;
                            case 4:
                                /*regresar*/
                            break;
                            default:
                                System.out.println("LA OPCION SELECCIONADA NO ES VALIDA"
                                        + "\nPORFAVOR ESCOJA UNA OPCION VALIDA DEL 1 AL 4");
                        }
                    }while(op2!=4); 
                    
                break;
                case 3:
                    int op3=0;
                    
                    do{
                        System.out.println("R E V I S I O N   D E   T A R E A S"
                                + "\n1.-TAREAS COMPLETADAS"
                                + "\n2.-TAREAS POR COMPLETAR"
                                + "\n3.-TAREAS TOTALES");
                        op3=sc.nextInt();
                        switch (op3){
                            case 1:
                            break;
                            case 2:
                            break;
                            case 3:
                            break;
                            case 4:
                                /*SALIR*/
                            break;
                            default:
                                System.out.println("LA OPCION SELECCIONADA NO ES VALIDA"
                                        + "\nPORFAVOR ESCOJA UNA OPCION VALIDA DEL 1 AL 4");
                        }
                    }while(op3!=4); 
                    
                break;
                case 4:                       
                   //AGREGAR  MATERIAS //ELIMINAR MATERIAS 
                    System.out.println("Ingrese el nombre de la materia");
                    String s=sc.next();
                    char [] materiasc;//esta mal el array solo es prueba
                    materiasc = s.toCharArray();
                    arregloMateria=materiasc;
                    System.out.println("\n\n"+arregloMateria);
                break;
                case 5:
                    /*SALIR*/
                break;    
                default:
                    System.out.println("LA OPCION SELECCIONADA NO ES VALIDA"
                            + "\nPORFAVOR ESCOJA UNA OPCION VALIDA DEL 1 AL 5");
                break;    
            }
        }while(op!=5); 

}
