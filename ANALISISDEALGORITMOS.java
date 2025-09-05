package analisisdealgoritmos;
import java.util.Scanner;
public class ANALISISDEALGORITMOS {
    
    public static void main(String[] args) {
        Scanner Lector = new Scanner(System.in);
        System.out.println("Ingrese cuantas filas y columnas quiere");
        int numero =  Lector.nextInt();
    for (int i = 0; i < numero ;i++){
    for (int j=0 ; j < numero ; j++){
        if (i==j){
        System.out.print(" 1 ");
        }  else {
            System.out.print(" 0 ");
        }
    }
    System.out.println("");  //ES O N^2, YA QUE POSEE 2 FOR aumentandole el tiempo;
        // se usara para mostrar patrones en la apps
        
    }
    }
     
}

