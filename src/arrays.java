import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        // Массив - объект, представляющий некоторую непрерывную область памяти,
        // группа однотипных переменных, для доступа к которым используется общее имя

//        могут быть любой длинны, но она является фиксированной

        int arr1 [] = new int[4];
        String [] arr2 = new String[3];

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        int a = 3;
        int [] arr3 = {a, 8, 9, 1, -23, 67};

        // доступ к элементам массива по индексу
        int arr3Elem = arr3[2];

        // заполнение массива данными в цикле
        for (int i = 0; i < arr2.length; i++){
            arr2[i] = "elem # " + i;
        }
        System.out.println(Arrays.toString(arr2));

        for (int i = 0; i < arr3.length; i++) {
            System.out.println("val " + arr3[i]);
        }

        for (int arr_val : arr3) {
            System.out.println("val " + arr_val);
        }

        System.out.println(Arrays.toString(arr3));

//        arr3 = {3, 8, 9, 1, -23, 67};

        // копирование массива
        int [] newArr3 = arr3.clone(); // 1
        //System.arraycopy(
                // массив - источник,
                // позиция - начало нового массива,
                // массив назначения,
                // начальная позиция целевого массива
                // количество копируемых элементов
        //);

        int [] newArr4 = new  int[3];
        System.arraycopy(arr3, 2, newArr4, 0, 2);
        System.out.println(Arrays.toString(newArr4));

        int [] newArr5 = Arrays.copyOf(arr3, 2);
        System.out.println(Arrays.toString(newArr5));
//        Arrays.copyOfRange(arr3, start_index, end);
        int [] newArr6 = Arrays.copyOfRange(arr3, 2, 4);
        System.out.println(Arrays.toString(newArr6));

        // сравнение массивов
        Arrays.equals(arr1, arr3);

        // заполнение массива
//        Arrays.fill(arr1, 2);

        // поиск в массиве (двоичный поиск) -
//        Arrays.binarySearch(array, key);
//        Arrays.binarySearch(array, start_pos, end_pos, key);

        // arrays sort
//        Arrays.sort(arr3);
//        [3, 8, 9, 1, -23, 67]
        Arrays.parallelSort(arr3);
        System.out.println(Arrays.toString(arr3));

        int c = Arrays.binarySearch(arr3,-23);
        System.out.println(c);

        // многомерные массивы
        int [][] arr2D;
        int [][][] arr4D;


        int [][] arr2d = new int[10][];
        for (int i = 0; i < arr2d.length; i++) {
            arr2d[i] = new int[i];
            System.out.println(Arrays.deepToString(arr2d));
        }

//        [1|2|8|9|12]
//        [0|1|2|3|4]
    }
}
