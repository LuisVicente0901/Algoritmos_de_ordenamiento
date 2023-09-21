
import java.util.Scanner;
import java.util.*;
public class Ordenar
{
   int[] arreglo;
   
   public Ordenar(){
       Scanner in = new Scanner(System.in);
       System.out.println("Ingresa la dimensión del arreglo");
       int dimension= in.nextInt();
       arreglo=new int[dimension];
       for(int i=0;i<dimension;i++){
           System.out.println("Ingresa el número que ocupará la posición " + (i+1));
           int numero = in.nextInt();
           arreglo[i]=numero;
       }
   }
   
   public int[] ordenar_burbuja_menor_mayor(){
       int auxiliar;
       System.out.println("Arreglo original= "+ Arrays.toString(arreglo));
       for(int i=0;i<arreglo.length-1;i++){
           System.out.println("i= "+ i);
           for(int j=0;j<arreglo.length-1-i;j++){
               System.out.println("j= "+j +", "+"Comparación: "+"¿"+arreglo[j]+">"+arreglo[j+1]+"?");
               if(arreglo[j]>arreglo[j+1]){
                   auxiliar=arreglo[j];
                   arreglo[j]=arreglo[j+1];
                   arreglo[j+1]=auxiliar;
               }
               System.out.println("Arreglo modificado= "+ Arrays.toString(arreglo));
               System.out.println("******************************");
           }
       }
       System.out.println("Arreglo final= "+ Arrays.toString(arreglo));
       System.out.println("------------------------------");
       return arreglo;
   }
   
   public int[] ordenar_insercion_menor_mayor(){
       int auxiliar,j;
       for(int i=1;i<arreglo.length;i++){
           auxiliar=arreglo[i];
           j=i-1;
           while(j>=0 && arreglo[j]>auxiliar){
               arreglo[j+1]=arreglo[j];
               j--;
            }
           arreglo[j+1]=auxiliar;
       }
       return arreglo;
   }
   
   
   public int[] ordenar_seleccion_menor_mayor(){
       int indice_minimo,i,j, temporal;
       // for sobre todo el arreglo
       for(i=0;i<arreglo.length-1;i++){
           indice_minimo=i;
           // for para encontrar el número más pequeño
           for(j=i+1;j<arreglo.length;j++){
               if(arreglo[j]<arreglo[indice_minimo]){
                   indice_minimo=j;
               }
           }
           // cambiar elementos
           if(indice_minimo!=i){
               temporal=arreglo[indice_minimo];
               arreglo[indice_minimo]=arreglo[i];
               arreglo[i]=temporal;
           }
       }
       return arreglo;
   }

}