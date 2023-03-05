
package ec.edu.intsuperior.vista;


import java.util.Scanner;



public class Aplicacion {
    public static void main(String[] args) {  
        menu();
    }
    
    public static void Numniños_niñas(){
        Scanner leer=new Scanner(System.in);
        
        int gen=0,cn=0,cna=0;
        do{
            System.out.println("Ingrese genero (1 niño) (2 niña) (0 finalizar conteo)");
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
    
    public static void menu(){
        Scanner leer=new Scanner(System.in);
        int op=0;
        do {
            System.out.println("Ingrese una opcion \n"
                    + "******************************\n\n"
                    + "1.-Calcular cuantos niños y cuantas niñas nacioeron\n"
                    + "2.-Intercambio de valores entre dos variables\n"
                    + "3.-Comparar si un numero ingresado es negativo,mayor a 100,intervalo 0-100\n"
                    + "4.-ingresar 15 numero y Contar cuantas veses a sido ingresado el numero tres \n"
                    + "5.-Calculo de notas de 4 estudiantes\n"
                    + "6.-ngresar 10 números y en un arreglo y mostrar el número mayor y el número menor.\n"
                    + "7.-Control para almacenar el tiempo de cada corredor y además determinar por los datos obtenidos en los tiempos de los corredores cual es el ganador.\n"
                    + "8.-Ingresar el peso de 5 personas,obtener el peso mayor, el menor, el peso medio y si ay al menos una persona con un peso mayor de 100kg.\n"
                    + "9.-El factoria de los numeros ingresados\n"
                    + "10.-Calcular la raiz cuadrada de un numero\n"
                    + "11.-Serie Fibonacci de un Numero\n"
                    + "12.-Saber si un numero es Primo o Compuesto\n"
                    + "13.-Areglo de una piramide de numeros\n"
                    + "14.-Calculo de una circunferencia\n"
                    + "15.-Calculo de las areas de ciertas figiuras:circulo, cuadrado, rectángulo y triangul.\n"
                    + "16.-Calcule el precio de venta de un producto conociendo el precio por unidad\n"
                    + "17.-lee una temperatura en grados centígrados y calcula y muestra por pantalla su valor equivalente en grados Reamur y Kelvin\n"
                    + "18.-ingresar elnombre y el sueldo de 20 empleados y muestre el nombre y el sueldo del empleado que más gana\n"
                    + "19.-Sumar dos matrices de Numeros enteros\n"
                    + "20.-Mostrar el presio de siertos Productos\n"
                    + "0.-Salir del Menu\n");
                    
        op=leer.nextInt();
        switch(op){
            case 1:
                Numniños_niñas();
                break;
            case 2:
                intercambioValores();
                break;
            case 3:
                Comparacion();
                break;
            case 4:
                Vector();
                break;
            case 5:
                NotasdeAlumnos();
                break;
            case 6:
                mostrarMayomenor();
                break;
            case 7:
                tiempodeCorredores();
                break;
            case 8:
                Pesos();
                break;
            case 9:
                bucleAnimado1();
                break;
            case 10:
                raiZcuadrada();
                break;
            case 11:
                serieFibonacci();
                break;
            case 12:
                nuemroPimo();
                break;
            case 13:
                Piramidenumeros();
                break;
            case 14:
                Circunferencia();
                break;
            case 15:
                calculoDeareas();
                break;    
            case 16:
                presioProducto();
                break;
            case 17:
                gradosAcentigrados();
                break;
            case 18:
                sueldodeEmpleados();
                break;
            case 19:
                sumadosMatrices();
                break;
            case 20:
                productosPresios();
                break;
        }
                
                
                 } while(op!=0);
    }
    
    
    
    //Ejercicos de Examen 
    
    //Ejercicio 1
    
    public class OrdenaNumeros {
        
    
        
        int a = 5;
        int b = 3;
        int c = 9;
        
        ordena(a, b, c);
        
        System.out.println(a + " " + b + " " + c); // Output: 3 5 9
    }
    
    public static void ordena(int a, int b, int c) {
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        
        if (b > c) {
            int temp = b;
            b = c;
            c = temp;
            
            if (a > b) {
                temp = a;
                a = b;
                b = temp;
            }
        }
    }
    
    //Ejercico 2
    
    public class DadoAleatorio {
      
        int n = 4;
        int lanzamientos = dado_aleatorio(n);
        System.out.println( "Se necesitaron " +  lanzamientos  + "  lanzamientos para obtener el número  " +  n);
    }
    
    public static int dado_aleatorio(int n) {
        Random rnd = new Random();
        int lanzamientos = 0;
        
        while (true) {
            lanzamientos++;
            int resultado = rnd.nextInt(6) + 1;
            if (resultado == n) {
                break;
            }
        }
        
        return lanzamientos;
    }
    
    //Ejercicio 3

    public class SumaProgresionGeometrica {
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el valor de a: ");
        double a = sc.nextDouble();
        
        System.out.print("Ingrese el valor de r (r diferente de 1): ");
        double r = sc.nextDouble();
        while (r == 1) {
            System.out.print("El valor de r debe ser diferente de 1. Ingrese otro valor: ");
            r = sc.nextDouble();
        }
        
        System.out.print("Ingrese el valor de n: ");
        int n = sc.nextInt();
        
        double suma = 0;
        for (int i = 0; i <= n; i++) {
            suma += a * Math.pow(r, i);
        }
        
        System.out.println("La suma de los términos de la progresión geométrica es: " + suma);
    }
}
    
        }

    
