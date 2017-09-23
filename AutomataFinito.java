/************************************************
/*  Universidad Politecnica de San Luis Potosi  *
/*  Codigo Automata Finito No Deterministico    *
/*  ------ Carlos Ernesto Campuzano De la Rosa  *
/*  ------ Matricula:140066                     *
/*  ------ Teorica Computacional                *
/*  ------ Expresión: b*(a+b)*                  *
/*  ------ 22 de Septiembre del 2017            *
/********************************************** */

/************************************************/
public class AutomataFinito{ //Declaracion de la clase 
    int contador;  // Contador de pasos
    boolean permitida; /*para guardar los caracteresatcteres y los va ir separando*/ 
    char [] caracteres;  //Cadena de caracteres a comparar

     public static void main(String[]args){  // Metodo principal main
        AutomataFinito aut= new AutomataFinito(); // Declaracion de la instancia del objeto 
        String cadena_entrada = "b*(a+b)*";  // Cadena de entrada
        aut.caracteres=cadena_entrada.toCharArray();  // Tomar indices del arreglo
        aut.comienzo();// LLamada de metodo de estado inicial
    } 
     public void comienzo (){ /*metodo*/ 
         contador = 0; //Bandera
         permitida = false; // Comprobacion de estado valido
         q0();/*irnos al codigo 0 */ 
     } 
     public void q0(){ // Para el primer estado
         System.out.println("En q0";/*imprimimos y decimos que estamos en q0*/ 
         if(contador < caracteres.length){/*cuantos espacios tiene mi arreglo*/ 
             if(caracteres[contador]=='a'){/*el arreglo caracteres en el contadorador 0 lo vamos a comparar si es = a*/ 
             contador++;/*incrememnto mi contadorador*/ 
             q0();/*si no lo dejo en 0*/ 
             }else if (caracteres[contador]=='b'){/*si es una b me muevo al q1*/ 
                 contador++; 
                 q1();/*nos va a mover al estado uno*/ 
             } 
             } 
     } 
     public void q1(){  // Para el segundo estado sea a o b 
     System.out.println("En q1"; 
         if(contador < caracteres.length){/*cuantos espacios tiene mi arreglo*/ 
             if(caracteres[contador]=='a'){/*el arreglo caracteres en el contadorador 0 lo vamos a comparar si es = a*/ 
             contador++; // Bandera a incrementar segun el caso
             q1(); // llamado del otro caso 
             }else if (caracteres[contador]=='b'){ 
                 contador++; 
                 q2();/*nos va a mover al estado uno*/ 
             } 
             } 
     } 
     public void q2(){ 
     System.out.println("En q2"; 
         if(contador < caracteres.length){/*cuantos espacios tiene mi arreglo*/ 
             if(caracteres[contador]=='a'){/*el arreglo caracteres en el contadorador 0 lo vamos a comparar si es = a*/ 

             contador++; 
             q2(); 
             }else if (caracteres[contador]=='b'){ 
                 contador++; 
                 q3();/*nos va a mover al estado uno*/ 
             } 
             } 
     } 
     public void q3(){  // Para la compracion de las cadenas validas
     System.out.println("En q3 cadena_entrada permitida"; 
     permitida = true;/*que es permitida*/ 
         if(contador < caracteres.length){/*cuantos espacios tiene mi arreglo*/ 
             if(caracteres[contador]=='a'){/*el arreglo caracteres en el contadorador 0 lo vamos a comparar si es = a*/ 

             contador++; 
             q3(); 
             }else if (caracteres[contador]=='b'){ 
                 contador++; 
                 qError();/*nos va a mover al estado uno*/ 
             } 
             } 
     }

/*******************************************************/
/**** Restablecer bandera*/
     public void qError(){ 
     System.out.println("Error"; 
     permitida = false; 
     return; 
     } 
     // Para casos no validos 

} 

