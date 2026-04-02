public class Main {

    // 1. SUMA DE TODOS LOS ELEMENTOS

    public static int sumArray(int[] array) {
        int suma = 0; // acumulador empieza en 0
        for (int i = 0; i < array.length; i++) {
            suma += array[i]; // sumamos cada elemento
        }
        return suma;
    }

    // 2. PRODUCTO DE TODOS LOS ELEMENTOS
    public static int productArray(int[] array) {
        int producto = 1; // IMPORTANTÍSIMO: empezar en 1
        for (int i = 0; i < array.length; i++) {
            producto *= array[i]; // multiplicamos acumulando
        }
        return producto;
    }

    // 3. DEVOLVER SOLO PARES
    public static int[] getEvenArray(int[] array) {
        int count = 0;

        // 1. contar pares
        for (int num : array) {
            if (num % 2 == 0) count++;
        }

        // 2. crear array del tamaño exacto
        int[] result = new int[count];

        int j = 0;
        // 3. rellenar
        for (int num : array) {
            if (num % 2 == 0) {
                result[j++] = num;
            }
        }

        return result;
    }

    // 4. DEVOLVER SOLO IMPARES
    public static int[] getOddArray(int[] array) {
        int count = 0;

        for (int num : array) {
            if (num % 2 != 0) count++;
        }

        int[] result = new int[count];

        int j = 0;
        for (int num : array) {
            if (num % 2 != 0) {
                result[j++] = num;
            }
        }

        return result;
    }

    // 5. INVERTIR ARRAY
    public static int[] reverseArray(int[] array) {
        int[] result = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            result[i] = array[array.length - 1 - i]; // índice inverso
        }

        return result;
    }

    // 6. COMPROBAR SI ES CAPICÚA
    public static boolean isPalindrome(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length - 1 - i]) {
                return false; // si falla una comparación, ya no es capicúa
            }
        }
        return true;
    }

    // 7. CONTIENE NÚMERO
    public static boolean containsNumber(int[] array, int target) {
        for (int num : array) {
            if (num == target) return true;
        }
        return false;
    }

    // 8. ÍNDICE DE UN NÚMERO
    public static int indexOf(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) return i;
        }
        return -1;
    }

    // 9. NÚMERO MÁXIMO
    public static int findMax(int[] array) {
        int max = array[0]; // empezamos con el primero

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }

    // 10. NÚMERO MÍNIMO
    public static int findMin(int[] array) {
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }

    // 11. CONTAR MAYORES QUE X
    public static int countGreaterThan(int[] array, int value) {
        int count = 0;

        for (int num : array) {
            if (num > value) count++;
        }

        return count;
    }

    // 12. SUMAR SOLO POSITIVOS
    public static int sumPositive(int[] array) {
        int suma = 0;

        for (int num : array) {
            if (num > 0) suma += num;
        }

        return suma;
    }

    // 13. UNIR DOS ARRAYS
    public static int[] mergeArrays(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];

        int k = 0;

        for (int i = 0; i < a.length; i++) {
            result[k++] = a[i];
        }

        for (int i = 0; i < b.length; i++) {
            result[k++] = b[i];
        }

        return result;
    }

    // 14. INTERCALAR ARRAYS
    public static int[] mergeAlternate(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];

        int i = 0, j = 0, k = 0;

        while (i < a.length || j < b.length) {
            if (i < a.length) result[k++] = a[i++];
            if (j < b.length) result[k++] = b[j++];
        }

        return result;
    }

    // 15. DESPLAZAR A LA DERECHA
    public static int[] shiftRight(int[] array) {
        int[] result = new int[array.length];

        result[0] = array[array.length - 1]; // último pasa al primero

        for (int i = 1; i < array.length; i++) {
            result[i] = array[i - 1];
        }

        return result;
    }

    // 16. DESPLAZAR A LA IZQUIERDA
    public static int[] shiftLeft(int[] array) {
        int[] result = new int[array.length];

        result[array.length - 1] = array[0]; // primero pasa al final

        for (int i = 0; i < array.length - 1; i++) {
            result[i] = array[i + 1];
        }

        return result;
    }

    // 17. COMPROBAR SI DOS ARRAYS SON IGUALES
    public static boolean areArraysEqual(int[] a, int[] b) {
        if (a.length != b.length) return false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }

        return true;
    }

    // 18. DUPLICAR ELEMENTOS
    public static int[] duplicateArray(int[] array) {
        int[] result = new int[array.length * 2];

        int k = 0;

        for (int num : array) {
            result[k++] = num;
            result[k++] = num;
        }

        return result;
    }

    // 19. COMPROBAR SI ES PRIMO
    public static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }

    // 20. FILTRAR PRIMOS
    public static int[] getPrimeArray(int[] array) {
        int count = 0;

        for (int num : array) {
            if (isPrime(num)) count++;
        }

        int[] result = new int[count];

        int j = 0;
        for (int num : array) {
            if (isPrime(num)) {
                result[j++] = num;
            }
        }

        return result;
    }
}