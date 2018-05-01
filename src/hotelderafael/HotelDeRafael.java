/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelderafael;

import java.util.Scanner;

/**
 *
 * @author Lucho
 */
public class HotelDeRafael {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fecha.asignar_fecha();
        
        
        
        //LUISA YO HE ESTADO PROBANDO EN EL MAIN
       //ACA VA MI CODIGO.
       Habitacion[] habitaciones= new Habitacion[60];
       int num=habitaciones.length;
       int conth=1;
       Scanner input = new Scanner(System.in);
      
       
    
    
    for (int i=0;i<10;i++){
            
            habitaciones[i]=new Habitacion();
            habitaciones[i].setEstado("Disponible");
            habitaciones[i].setNpiso("A");
            habitaciones[i].setNombre(conth++);  
            if(i%2==0){
                habitaciones[i].setTipo("Doble");
            }
            else{
                habitaciones[i].setTipo("Sencilla");
            }
            
    
}
    conth=1;
    for (int i=0;i<10;i++){
       
            habitaciones[i+10]=new Habitacion();
            habitaciones[i+10].setEstado("Disponible");
            habitaciones[i+10].setNpiso("B");
            habitaciones[i+10].setNombre(conth++);
            if(i%2==0){
                habitaciones[i+10].setTipo("Doble");
            }
            else{
                habitaciones[i+10].setTipo("Sencilla");
            }
    
}
    conth=1;
    for (int i=0;i<10;i++){
       
            habitaciones[i+20]=new Habitacion();
            habitaciones[i+20].setEstado("Disponible");
            habitaciones[i+20].setNpiso("C");
            habitaciones[i+20].setNombre(conth++);
            if(i%2==0){
                habitaciones[i+20].setTipo("Doble");
            }
            else{
                habitaciones[i+20].setTipo("Sencilla");
            }
    
}
    conth=1;
    for (int i=0;i<10;i++){
        
            habitaciones[i+30]=new Habitacion();
            habitaciones[i+30].setEstado("Disponible");
            habitaciones[i+30].setNpiso("D");
            habitaciones[i+30].setNombre(conth++);
            if(i%2==0){
                habitaciones[i+30].setTipo("Doble");
            }
            else{
                habitaciones[i+30].setTipo("Sencilla");
            }
    
}
    conth=1;
    for (int i=0;i<10;i++){
       
            habitaciones[i+40]=new Habitacion();
            habitaciones[i+40].setEstado("Disponible");
            habitaciones[i+40].setNpiso("E");
            habitaciones[i+40].setNombre(conth++);
            if(i%2==0){
                habitaciones[i+40].setTipo("Doble");
            }
            else{
                habitaciones[i+40].setTipo("Sencilla");
            }
    
}
    conth=1;
    for (int i=0;i<10;i++){
       
            habitaciones[i+50]=new Habitacion();
            habitaciones[i+50].setEstado("Disponible");
            habitaciones[i+50].setNpiso("F");
            habitaciones[i+50].setNombre(conth++);
            if(i%2==0){
                habitaciones[i+50].setTipo("Doble");
            }
            else{
                habitaciones[i+50].setTipo("Sencilla");
            }
    
}
    conth=1;
        System.out.println("*****************menu**********");
        System.out.println("1.ver habitaciones");
        System.out.println("2. cambiar precio");
        System.out.println("2. cambiar estado");
        int opcion,opcion2;
        double opcion3;
        Scanner entrada = new Scanner(System.in);
        opcion = entrada.nextInt();
        switch (opcion){
            case 1:
                for (int j=0;j<habitaciones.length;j++){
                     if(habitaciones[j].getNombre()%2==0){
                        System.out.println("habitaciones par");
                        System.out.println(habitaciones[j].getNpiso()+habitaciones[j].getNombre());
                }
                else{
                    System.out.println("habitaciones impar");
                    System.out.println(habitaciones[j].getNpiso()+habitaciones[j].getNombre());
                }
        
                }
                break;
            case 2:
                System.out.println("A que precio cambiara?");
                Scanner entradaprecio = new Scanner(System.in);
                opcion2 = entradaprecio.nextInt();
                 for (int j=0;j<habitaciones.length;j++){}
                
                
                
                
                
        }

    
    int cont=0;
    //encontrando habitaciones de tipo 1 y disponible
    System.out.println("Habitación  par  y disponibles encontradas encontrada");
    while(cont<1){
        for (int j=0;j<habitaciones.length;j++){
        if(habitaciones[j].getTipo()=="Sencilla" && habitaciones[j].getEstado()=="Disponible" ){
            System.out.println(habitaciones[j].getNpiso()+habitaciones[j].getNombre());
            ++cont;
        }    
        }
        
    }
    }
    
}
