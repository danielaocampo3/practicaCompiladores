/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automata;

/**
 *
 * @author Daniela Ocampo
 */
public class Automata {

  boolean aceptar=false;
   int numeroEstados=4;
   int numeroEntradas=2;
   
   String[][] matri = {{" ","a","b"," "},{"lo","l1","l2","1"},{"l1","l1","l3","1"},{"l2","l3","err","0"},{"l3","l3","err","1"}};// tabla de transiciones
  
   static char[] hilera;
    public static void main(String[] args) {
        Automata aut = new Automata(); // instanciar la clase
        String cadena="a.b.c/";//cadena a evaluar
        aut.hilera=cadena.toCharArray(); // separa cada caracter
        boolean esCorrecta= aut.valida();
        if(esCorrecta==true){
        boolean funciona= aut.inicio();
        if(funciona==true){
            System.out.println("LA HLERA ES VALIDA");
        }else{
            System.out.println("la hilera no es valida");
        }
    }}

    public boolean inicio() {
        
       if (hilera[0]=='/'){
       if (matri[1][numeroEntradas+1]=="1"){
        aceptar=true;
       }
       return aceptar;
       }
       boolean encontro= false;
       int k=0;
       String estado=matri[1][0];
        for (int i = 0; i < hilera.length-1; i++) {
            k= buscaK(i,estado);
            if(k==0){
                System.out.println("no enontro k");
                return aceptar;
            }
            for (int j = 1; j <= numeroEntradas+1 ; j++) {
                String hile=String.valueOf(hilera[i]);
                if(hile.equals(matri[0][j])){
                    encontro=true;
                    estado=matri[k][j];
                    j=numeroEntradas+2;
                }
            }
            if (encontro==false){
            return aceptar;
            }
            encontro=false;
        }
      
     if("1".equals(matri[k][numeroEntradas+1])){
     aceptar=true;
     }
     return aceptar;



    }

    private boolean valida() {
        
        if (hilera[hilera.length-1]!='/'){
            System.out.println("hilera no se escribio bien");
        return false;
        }
        return true;
    }

    private int buscaK(int h,String estado) {
        int indi=0;
        
        if(h==0){
        indi=1;
        return indi;
        }
        for (int i =1; i < numeroEstados+1; i++) {
            if (matri[i][0]==estado) {
                indi=i;
            }
        }
        return indi;
    }
    
}
