
package ec.edu.intsuperior.vista;

import java.util.Random;
import java.util.Scanner;



public class Aplicacion {
    public static void main(String[] args) {  
      sumadosMatrices();
    }
    
    public static void Numniños_niñas(){
        Scanner leer=new Scanner(System.in);
        
        int gen=0,cn=0,cna=0;
        do{
            System.out.println("Ingrese genero 1 niño 2 niña");
        gen=leer.nextInt();
        
        switch(gen)
        {
            case 1:
                cn++;
                break;
            case 2:
                cna++;
            break;
        }       
        }while (gen!=0);
        
        System.out.println("Los niños son"+  cn);
        System.out.println("Las niñas son"+  cna);
    }
    
    public static void intercambioValores(){
        Scanner leer=new Scanner(System.in);
        
        int num1=35;
        int num2=20;
        int aux;
        
        System.out.println("----Antes----");
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);
        
        aux = num2;
        num2 = num1;
        num1 = aux;
        
        System.out.println("----Despues----");
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);
      
    }

    public static void Comparacion(){
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero;
        numero=leer.nextInt();
        if(numero<0){
            System.out.println("Es negativo");
        }
        if(numero>100){
            System.out.println("Es mayor a 100");
            
    }
        if(numero>=0 && numero<=100){
            System.out.println("Esta en el intervalo 0-100");
        }
}
    
    public static void Vector(){
        Scanner leer=new Scanner(System.in);
        int vector[]=new int[15];
        
        for(int i=0; i<15; i++){
            System.out.println("Ingresa un numero para el vector");
            vector[i] = leer.nextInt();
        }
        int con=0;
        for(int i=0; i<15; i++){
            if(vector[i]==3){
                con=con+1;
            }
            
        }
        System.out.println("La cantidad de numeros 3 que hay en el vector son " + con);
    }
    
    public static void NotasdeAlumnos(){
        Scanner leer=new Scanner(System.in);
        double matriz [][]=new double [4][4];
        double suma=0.0;
        
        for(int f=0;f<4;f++){
            for(int c=0;c<3;c++){
                System.out.println("Ingrese la cala}ificacion del alumno N°"+f);
                matriz[f][c]=leer.nextDouble();
                suma=suma + matriz[f][c];                
            }
            matriz[f][3] = suma / 3;
            suma=0.0;    
        }
        for(int f=0;f<4;f++){
            System.out.println("Las notas del alumno N°" + f + " son: ");
            for(int c=0;c<3;c++){
                System.out.println("Nota N°"+c+" "+ matriz[f][c]);
            }
            System.out.println("El promedio de las notas es: " + matriz[f][3]);
        }
    }
    
    public static void productosPresios (){
        Scanner leer=new Scanner(System.in);
        String utiles []={"pelota", "zapatilla","mochila","polo"};
        
        double precios[]={35.5,89.60,45.99,25.70};
        System.out.println("Lista de Productos y sus precios");
        
        for (int u=0;u<utiles.length;u++){
        System.out.println(utiles[u]+ " "+ precios[u]); 
        
      }   
    }
    
    public static void mostrarMayomenor(){
        Scanner leer =new Scanner(System.in);
        int mayor = 0; int menor = 0;
        int[] numeros = new int[11]; 
        
      for (int i = 0+1; i < 11; i++) {
      System.out.print("Ingrese el número " + (i) + " a evaluar :"); numeros[i] = leer.nextInt(); 
 
} 
      for (int i = 1; i < numeros.length; i++) {
      if (mayor < numeros[i]) { 
      mayor = numeros[i];
      
    }
} 
      menor = mayor; 
      for (int i = 1; i < numeros.length; i++) {
      if (menor > numeros[i]) {
      menor = numeros[i]; 
      
    } 
}
      System.out.println(" el numero mayor es " + mayor + " el numero menor es :" + menor);
 
    } 
    
    public static void tiempodeCorredores(){
        Scanner leer = new Scanner(System.in); 
        int c=0; int a; float m =0;
        
        System.out.println("Ingresar la cantidad de atletas");
        c = leer.nextInt(); String atleta[] = new String[c];
        
     float tiempo[] = new float[c];
     for( a=0;a<c;a++){ 
         
     
        System.out.println("Ingrese el nombre del atleta");
        atleta[a] = leer.next();
        System.out.println("Ingrese el tiempo del recorrido");
        tiempo[a] = leer.nextFloat();
        
   } 
     
       for (int i = 1; i < tiempo.length; i++) { 
       if (m > tiempo[i]) { m = tiempo[i]; 
       
       }else{ 
       m = tiempo[i];            
       System.out.println("El ganador es el atleta con el tiempo "+m);  
       }
    }
  }
    
    public static void Pesos(){
        Scanner leer=new Scanner(System.in);
        int i,cont=0; 
        double acu=0, mayor=0, menor=10000,media,contcien=0;
        double [] numeros=new double[5];
 
        for(i=0;i<numeros.length;i++){
            
            System.out.println("Introduce peso en kg");
            numeros[i]=leer.nextDouble();
         }
        for(i=0;i<numeros.length;i++){
            cont=cont+1;
            acu=acu+numeros[i];
            
         if(numeros[i] >mayor){
            mayor=numeros[i];
       }
         if(numeros[i]<menor){
            menor=numeros[i];
       }
         if(numeros[i]>=100){
            contcien=contcien+1;
         }
       }
        
        media=acu/cont;
        
        System.out.println("El numero de pesos es de "+cont);
        System.out.println("La suma de los pesos es de "+acu+"kg");
        System.out.println("El peso mayor es de "+mayor+"kg");
        System.out.println("El peso menor es de "+menor+"kg");
        System.out.println("El peso medio es de "+media+"kg");
        System.out.println("Hay "+contcien+"persona/s de mas de 100kg");
           
    }
    
    public static void bucleAnimado1(){
          int N;
        double factorial;
        Scanner sc = new Scanner(System.in);
       
        do{
            System.out.print("Introduce un número > 0: ");
            N = sc.nextInt();
        }while(N<0);

        for(int i = 0; i <= N ; i++){                                               
          
            factorial = 1;
            for(int j = 1; j <= i; j++){
                factorial = factorial * j;
            }
            
            System.out.printf("%2d! = %.0f %n", i, factorial);
        }
    }
    
    public static void raiZcuadrada(){
        Scanner leer= new Scanner(System.in);
        System.out.println("Introduce un número:");
        double x = leer.nextDouble();
        double r = x;
        double precision = 0.0001;
        while(Math.abs(x - r * r) > precision) {
            r = (r + x / r) / 2;
        }
        System.out.println("La raíz cuadrada de " + x + " es " + r);
    }
    
    public static void serieFibonacci(){
         Scanner leer= new Scanner(System.in);
        System.out.println("Introduce un número entero positivo:");
        int n = leer.nextInt();
        int a = 0;
        int b = 1;
        System.out.println("Serie de Fibonacci hasta " + n + ":");
        while(a <= n) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
    
    public static void nuemroPimo(){
         Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero positivo: ");
        int num = sc.nextInt();
        boolean esPrimo = esPrimo(num);
        if (esPrimo) {
            System.out.println(num + " es un número primo.");
        } else {
            System.out.println(num + " es un número compuesto.");
        }
    }

    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void Piramidenumeros(){
         int altura = 10;
        int contador = 1;
        for(int i = 1; i <= altura; i++) {
            for(int j = 1; j <= altura - i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print(contador + " ");
                contador++;
            }
            System.out.println();
        }
    }
    
    public static void Circunferencia(){
        Scanner sc = new Scanner(System.in);
           double radio, longitud, area;
           System.out.println("Introduce radio de la circunferencia:");
           radio = sc.nextDouble();
           longitud = 2 * Math.PI * radio;
           area = Math.PI * Math.pow(radio, 2);
           System.out.println("Longitud de la circunferencia -> " + longitud);                                    
           System.out.println("Area de la circunferencia -> " + area);
    }

    public static void calculoDeareas(){
          Scanner leer= new Scanner(System.in);
        int Eleccion;
        do {
            System.out.println("Ingrese el numero de la figura que desea calcular:");
            System.out.println("1. Cuadrado");
            System.out.println("2. Triangulo");
            System.out.println("3. Rectangulo");
            System.out.println("4. Circulo");
            System.out.println("5. Salir");
            Eleccion = leer.nextInt();
            switch (Eleccion) {
                case 1:
                    System.out.println("Introdusca el lado del cuadrado:");
                    double lado = leer.nextDouble();
                    double areaSquare = lado * lado;
                    System.out.println("El area del cuadrado es: " + areaSquare);
                    break;
                case 2:
                    System.out.println("Introdusca la base del treingulo:");
                    double base = leer.nextDouble();
                    System.out.println("Introdusca la altura del triangulo:");
                    double altura = leer.nextDouble();
                    double areaTriangulo = (base * altura) / 2;
                    System.out.println("El area del tringulo es: " + areaTriangulo);
                    break;
                case 3:
                    System.out.println("Introdusca la altura del trinagulo:");
                    double longitud = leer.nextDouble();
                    System.out.println("Introduaca la base del rectangulo:");
                    double ancho = leer.nextDouble();
                    double areaRectangle = longitud * ancho;
                    System.out.println("El area del rectangulo es: " + areaRectangle);
                    break;
                case 4:
                    System.out.println("Introdusca el radio del circulo:");
                    double radius = leer.nextDouble();
                    double areaCirculo = Math.PI * Math.pow(radius, 2);
                    System.out.println("El area del circulo es: " + areaCirculo);
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Eleccion no valida!");
            }
        } while (Eleccion!=5);
    }

    public static void presioProducto(){
        Scanner leer= new Scanner(System.in);
        double precioUnidad, cantidad, iva, precioSinIva, totalIva;

        System.out.print("Introduzca precio por unidad del producto: ");                                          
        precioUnidad = leer.nextDouble();

        System.out.print("Introduzca número de productos vendidos: ");
        cantidad = leer.nextDouble();

        System.out.print("Introduzca %IVA: ");
        iva = leer.nextDouble();

        precioSinIva = precioUnidad * cantidad;
        totalIva = precioSinIva * iva / 100;

        System.out.println("Precio de venta -> " + (precioSinIva + totalIva));                                    
    }
    
    public static void gradosAcentigrados(){
        Scanner sc = new Scanner(System.in);
        double gradosC, gradosR, gradosK;
        
        System.out.print("Introduzca grados centígrados: ");                                                      
        gradosC = sc.nextDouble();
        
        gradosR = 80*gradosC/100;
        gradosK = gradosC+273;
        
        System.out.printf("\n%.2f ºC equivalen a %.2f ºR y a %.2f ºK \n", gradosC, gradosR, gradosK);             
    }

    public static void sueldodeEmpleados() {
        Scanner sc = new Scanner(System.in);
        String[] empleados = new String[20];
        double[] sueldos = new double[20];
        String nombreMayor;
        double mayorSueldo;
        int i = 0;

        
        System.out.println("Lectura de nombres y sueldos de empleados: ");                                        
        System.out.print("Empleado " + (i + 1) + ": ");
        empleados[i] = sc.nextLine();
        System.out.print("Sueldo: ");
        sueldos[i] = sc.nextDouble();

       
        mayorSueldo = sueldos[i];
        nombreMayor = empleados[i];

       
        for (i = 1; i < empleados.length; i++) {
            sc.nextLine(); //limpiar el buffer
            System.out.print("Empleado " + (i + 1) + ": ");
            empleados[i] = sc.nextLine();
            System.out.print("Sueldo: ");
            sueldos[i] = sc.nextDouble();
        
            if (sueldos[i] > mayorSueldo) {
                mayorSueldo = sueldos[i];
                nombreMayor = empleados[i];
            
        }

        System.out.println("Empleado con mayor sueldo: " + nombreMayor );                                         
        System.out.println("Sueldo: " + mayorSueldo);
    }
}
    
    public static void sumadosMatrices(){
        Scanner sc = new Scanner(System.in);
        int filas, columnas;

        do {
            System.out.print("Número de filas: ");
            filas = sc.nextInt();
        } while (filas < 1);
        do {
            System.out.print("Número de columnas: ");
            columnas = sc.nextInt();
        } while (columnas < 1);

        int[][] A = new int[filas][columnas];
        int[][] B = new int[filas][columnas];
        int[][] C = new int[filas][columnas];

        System.out.println("matriz A:");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print("Elemento[" + i + "][" + j + "] = ");                                            
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("matriz B:");
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                System.out.print("Elemento[" + i + "][" + j + "] = ");
                B[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        System.out.println("matriz A:");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.printf("%3d", A[i][j]);
            }
            System.out.println();
        }
        System.out.println("\nmatriz B:");
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                System.out.printf("%3d", B[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nmatriz Suma:");
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[i].length; j++) {
                System.out.printf("%3d", C[i][j]);
            }
            System.out.println();
        }
    }

    
      
    

    

    
    
    
       

}
