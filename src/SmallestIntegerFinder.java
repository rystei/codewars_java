//8 kyu
//Find the smallest integer in the array

public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {

        int menor = args[0];
        for (int numero : args) {
            if (numero < menor) {
                menor = numero;
            }
        }
        return menor;
    }
}