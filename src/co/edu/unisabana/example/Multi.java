package co.edu.unisabana.example;

class Multijava {
    public static void main(String[] args) {
        raiz();
        int EsPush = 1;
        int NoPull = 2;
        int resultant = EsPush * NoPull;
        System.out.println(resultant);

    }

    public int suma(){

        return 0;
    }

    public static void raiz() {
        int a = 5;
        int b = 2;
        int c =3 ;

        System.out.println("la raiz cuadrada del numero " + Math.sqrt((a+b+c)*(a+b+c-a)*(a+b+c-b)));
    }
}

