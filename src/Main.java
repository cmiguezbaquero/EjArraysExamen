public class Main {

    public static void main(String[] args) {

        System.out.println("Arrays modo examen 💪");
    }

    // =====================================================
    // =================== BÁSICOS =========================
    // =====================================================


    // 1. SUMA TOTAL
    public static int sumArray(int[] array){

        int suma = 0;

        for(int i = 0; i < array.length; i++){

            suma = suma + array[i];
        }

        return suma;
    }


    // 2. PRODUCTO TOTAL
    public static int productArray(int[] array){

        int producto = 1;

        for(int i = 0; i < array.length; i++){

            producto = producto * array[i];
        }

        return producto;
    }


    // 3. CONTAR POSITIVOS
    public static int countPositive(int[] array){

        int count = 0;

        for(int i = 0; i < array.length; i++){

            if(array[i] > 0){
                count++;
            }
        }

        return count;
    }


    // =====================================================
    // ================= FILTRAR ARRAYS ====================
    // =====================================================


    // 4. SOLO PARES
    public static int[] getEvenArray(int[] array){

        int count = 0;

        for(int i = 0; i < array.length; i++){

            if(array[i] % 2 == 0){
                count++;
            }
        }

        int[] result = new int[count];

        int j = 0;

        for(int i = 0; i < array.length; i++){

            if(array[i] % 2 == 0){

                result[j] = array[i];
                j++;
            }
        }

        return result;
    }


    // 5. SOLO IMPARES
    public static int[] getOddArray(int[] array){

        int count = 0;

        for(int i = 0; i < array.length; i++){

            if(array[i] % 2 != 0){
                count++;
            }
        }

        int[] result = new int[count];

        int j = 0;

        for(int i = 0; i < array.length; i++){

            if(array[i] % 2 != 0){

                result[j] = array[i];
                j++;
            }
        }

        return result;
    }


    // 6. MAYORES QUE X
    public static int[] getGreaterThan(int[] array, int value){

        int count = 0;

        for(int i = 0; i < array.length; i++){

            if(array[i] > value){
                count++;
            }
        }

        int[] result = new int[count];

        int j = 0;

        for(int i = 0; i < array.length; i++){

            if(array[i] > value){

                result[j] = array[i];
                j++;
            }
        }

        return result;
    }


    // =====================================================
    // =================== BÚSQUEDAS ======================
    // =====================================================


    // 7. CONTIENE NÚMERO
    public static boolean containsNumber(int[] array, int target){

        for(int i = 0; i < array.length; i++){

            if(array[i] == target){
                return true;
            }
        }

        return false;
    }


    // 8. ÍNDICE
    public static int indexOf(int[] array, int target){

        for(int i = 0; i < array.length; i++){

            if(array[i] == target){
                return i;
            }
        }

        return -1;
    }


    // =====================================================
    // =================== EXTREMOS ========================
    // =====================================================


    // 9. MÁXIMO
    public static int findMax(int[] array){

        int max = array[0];

        for(int i = 1; i < array.length; i++){

            if(array[i] > max){
                max = array[i];
            }
        }

        return max;
    }


    // 10. MÍNIMO
    public static int findMin(int[] array){

        int min = array[0];

        for(int i = 1; i < array.length; i++){

            if(array[i] < min){
                min = array[i];
            }
        }

        return min;
    }


    // =====================================================
    // =================== TRANSFORMACIONES ================
    // =====================================================


    // 11. INVERTIR
    public static int[] reverseArray(int[] array){

        int[] result = new int[array.length];

        for(int i = 0; i < array.length; i++){

            result[i] = array[array.length - 1 - i];
        }

        return result;
    }


    // 12. DUPLICAR
    public static int[] duplicateArray(int[] array){

        int[] result = new int[array.length * 2];

        int j = 0;

        for(int i = 0; i < array.length; i++){

            result[j] = array[i];
            j++;

            result[j] = array[i];
            j++;
        }

        return result;
    }


    // =====================================================
    // =================== COMPROBACIONES ==================
    // =====================================================


    // 13. ORDENADO
    public static boolean isSorted(int[] array){

        for(int i = 0; i < array.length - 1; i++){

            if(array[i] > array[i + 1]){
                return false;
            }
        }

        return true;
    }


    // 14. TODOS PARES
    public static boolean isEvenArray(int[] array){

        for(int i = 0; i < array.length; i++){

            if(array[i] % 2 != 0){
                return false;
            }
        }

        return true;
    }


    // =====================================================
    // =================== CONTADORES ======================
    // =====================================================


    // 15. OCURRENCIAS
    public static int countOccurrences(int[] array, int target){

        int count = 0;

        for(int i = 0; i < array.length; i++){

            if(array[i] == target){
                count++;
            }
        }

        return count;
    }


    // =====================================================
    // =================== SIN REPETIDOS ===================
    // =====================================================


    // 16. ELIMINAR DUPLICADOS
    public static int[] removeDuplicates(int[] array){

        int count = 0;

        for(int i = 0; i < array.length; i++){

            boolean repeated = false;

            for(int j = 0; j < i; j++){

                if(array[i] == array[j]){
                    repeated = true;
                }
            }

            if(!repeated){
                count++;
            }
        }

        int[] result = new int[count];

        int k = 0;

        for(int i = 0; i < array.length; i++){

            boolean repeated = false;

            for(int j = 0; j < i; j++){

                if(array[i] == array[j]){
                    repeated = true;
                }
            }

            if(!repeated){
                result[k] = array[i];
                k++;
            }
        }

        return result;
    }


    // =====================================================
    // =================== EXTRA EXAMEN ====================
    // =====================================================


    // 17. SEGUNDO MÁXIMO (MUY TÍPICO)
    public static int getSecondMax(int[] array){

        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int i = 0; i < array.length; i++){

            if(array[i] > max){

                second = max;
                max = array[i];
            }

            else if(array[i] > second && array[i] != max){

                second = array[i];
            }
        }

        return second;
    }


    // 18. SUMA SOLO IMPARES
    public static int sumOdd(int[] array){

        int suma = 0;

        for(int i = 0; i < array.length; i++){

            if(array[i] % 2 != 0){
                suma = suma + array[i];
            }
        }

        return suma;
    }


    // 19. PRIMOS EN ARRAY
    public static int getPrimeCount(int[] array){

        int count = 0;

        for(int i = 0; i < array.length; i++){

            int num = array[i];

            if(num <= 1){
                continue;
            }

            boolean prime = true;

            for(int j = 2; j < num; j++){

                if(num % j == 0){
                    prime = false;
                }
            }

            if(prime){
                count++;
            }
        }

        return count;
    }
}