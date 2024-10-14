import java.util.Scanner;

public class laba1 {
    // Метод для получения дробной части числа
    public double fraction(double x) {
        return x - (int) x;
    }

    // Вспомогательный метод для ввода числа с клавиатуры
    private double getDoubleInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        while (!scanner.hasNextDouble()) { // hasNextDouble проверяет является ли считанное Double и возвращает bool
            System.out.print("Неверный ввод. Пожалуйста, введите число: ");
            scanner.next();
        }
        return scanner.nextDouble();
    }

    // Вспомогательный метод для ввода символа с клавиатуры
    private char getCharInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.next().charAt(0);
    }

    // Вспомогательный метод для ввода целого числа с клавиатуры
    private int getIntInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        while (!scanner.hasNextInt()) { // hasNextInt проверяет является ли считанное Int и возвращает bool
            System.out.print("Неверный ввод. Пожалуйста, введите целое число: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    // Задание 1
    public void task1() {
        double x = getDoubleInput("Введите число: ");
        double result = fraction(x);
        System.out.println("Дробная часть числа: " + result);
    }

    // Задание 3
    public void task3() {
        char x = getCharInput("Введите символ (0-9): ");
        int result = charToNum(x);
        System.out.println("Код символа '" + x + "': " + result);
    }

    // Метод для преобразования символа в его код
    public int charToNum(char x) {
        return (int) x;
    }

    // Задание 5
    public void task5() {
        int x = getIntInput("Введите целое число: ");
        boolean result = is2Digits(x);
        System.out.println("Число " + x + " двузначное: " + result);
    }

    // Метод для проверки, является ли число двузначным
    public boolean is2Digits(int x) {
        return x >= 10 && x <= 99;
    }

    // Вспомогательный метод для ввода трех целых чисел с клавиатуры
    private int[] getThreeIntInputs(String prompt) {
        Scanner scanner = new Scanner(System.in);
        int[] inputs = new int[3];
        System.out.print(prompt);
        for (int i = 0; i < 3; i++) {
            while (!scanner.hasNextInt()) { // hasNextInt проверяет является ли считанное Int и возвращает bool
                System.out.print("Неверный ввод. Пожалуйста, введите целое число: ");
                scanner.next();
            }
            inputs[i] = scanner.nextInt();
        }
        return inputs;
    }
    // Задание 7
    public void task7() {
        int[] inputs = getThreeIntInputs("Введите три целых числа (a, b, num): ");
        int a = inputs[0];
        int b = inputs[1];
        int num = inputs[2];
        boolean result = isInRange(a, b, num);
        System.out.println("Число " + num + " входит в диапазон [" + a + ", " + b + "]: " + result);
    }

    // Метод для проверки, входит ли число в указанный диапазон
    public boolean isInRange(int a, int b, int num) {
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        return num >= min && num <= max;
    }
    // Задание 9
    public void task9() {
        int[] inputs = getThreeIntInputs("Введите три целых числа (a, b, c): ");
        int a = inputs[0];
        int b = inputs[1];
        int c = inputs[2];
        boolean result = isEqual(a, b, c);
        System.out.println("Числа " + a + ", " + b + " и " + c + " равны: " + result);
    }

    // Метод для проверки, равны ли три числа
    public boolean isEqual(int a, int b, int c) {
        return a == b && b == c;
    }

    // Главный метод
    // Задание 11
    public void task11() {
        int x = getIntInput("Введите целое число: ");
        int result = abs(x);
        System.out.println("Модуль числа " + x + ": " + result);
    }

    // Метод для вычисления модуля числа
    public int abs(int x) {
        return x < 0 ? -x : x;
    }

    // Задание 13
    public void task13() {
        int x = getIntInput("Введите целое число: ");
        boolean result = is35(x);
        System.out.println("Число " + x + " делится нацело на 3 или 5, но не на оба: " + result);
    }

    // Метод для проверки, делится ли число нацело на 3 или 5, но не на оба
    public boolean is35(int x) {
        boolean divisibleBy3 = x % 3 == 0;
        boolean divisibleBy5 = x % 5 == 0;
        return (divisibleBy3 || divisibleBy5) && !(divisibleBy3 && divisibleBy5);
    }

    // Задание 15
    public void task15() {
        int[] inputs = getThreeIntInputs("Введите три целых числа (x, y, z): ");
        int x = inputs[0];
        int y = inputs[1];
        int z = inputs[2];
        int result = max3(x, y, z);
        System.out.println("Максимальное из чисел " + x + ", " + y + " и " + z + ": " + result);
    }

    // Метод для нахождения максимального из трех чисел
    public int max3(int x, int y, int z) {
        int max = x;
        if (y > max) max = y;
        if (z > max) max = z;
        return max;
    }

    // Задание 17
    public void task17() {
        int x = getIntInput("Введите первое целое число: ");
        int y = getIntInput("Введите второе целое число: ");
        int result = sum2(x, y);
        System.out.println("Результат суммы чисел " + x + " и " + y + ": " + result);
    }

    // Метод для вычисления суммы чисел с учетом условия
    public int sum2(int x, int y) {
        int sum = x + y;
        if (sum >= 10 && sum <= 19) {
            return 20;
        }
        return sum;
    }
    // Задание 19
    public void task19() {
        int x = getIntInput("Введите число, обозначающее день недели (1-7): ");
        String result = day(x);
        System.out.println("День недели: " + result);
    }

    // Метод для определения дня недели
    public String day(int x) {
        switch (x) {
            case 1:
                return "понедельник";
            case 2:
                return "вторник";
            case 3:
                return "среда";
            case 4:
                return "четверг";
            case 5:
                return "пятница";
            case 6:
                return "суббота";
            case 7:
                return "воскресенье";
            default:
                return "это не день недели";
        }
    }
    // Задание 21
    public void task21() {
        int x = getIntInput("Введите целое число: ");
        String result = listNums(x);
        System.out.println("Числа от 0 до " + x + ": " + result);
    }

    // Метод для создания строки с числами от 0 до x
    public String listNums(int x) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= x; i++) {
            result.append(i).append(" ");
        }
        return result.toString().trim();
    }
    // Задание 23
    public void task23() {
        int x = getIntInput("Введите целое число: ");
        String result = chet(x);
        System.out.println("Четные числа от 0 до " + x + ": " + result);
    }

    // Метод для создания строки с четными числами от 0 до x
    public String chet(int x) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= x; i += 2) {
            result.append(i).append(" ");
        }
        return result.toString().trim();
    }
    // Задание 25
    public void task25() {
        long x = getLongInput("Введите целое число: ");
        int result = numLen(x);
        System.out.println("Количество знаков в числе " + x + ": " + result);
    }

    // Вспомогательный метод для ввода целого числа типа long с клавиатуры
    private long getLongInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        while (!scanner.hasNextLong()) { // hasNextLong проверяет является ли считанное Long и возвращает bool
            System.out.print("Неверный ввод. Пожалуйста, введите целое число: ");
            scanner.next();
        }
        return scanner.nextLong();
    }

    // Метод для вычисления количества знаков в числе
    public int numLen(long x) {
        if (x == 0) {
            return 1;
        }
        int length = 0;
        long temp = x;
        while (temp != 0) {
            temp /= 10;
            length++;
        }
        return length;
    }
    // Задание 27
    public void task27() {
        int x = getIntInput("Введите целое число: ");
        square(x);
    }

    // Метод для вывода квадрата из символов '*' размером x
    public void square(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Задание 29
    public void task29() {
        int x = getIntInput("Введите целое число: ");
        rightTriangle(x);
    }

    // Метод для вывода правого треугольника из символов '*' размером x
    public void rightTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= x - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Задание 31
    public void task31() {
        int[] arr = getIntArrayInput("Введите элементы массива через пробел: ");
        int x = getIntInput("Введите число для поиска: ");
        int result = findFirst(arr, x);
        System.out.println("Индекс первого вхождения числа " + x + " в массив: " + result);
    }

    // Вспомогательный метод для ввода массива целых чисел с клавиатуры
    private int[] getIntArrayInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        String input = scanner.nextLine();
        String[] stringArray = input.split(" ");
        int[] intArray = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            intArray[i] = Integer.parseInt(stringArray[i]);
        }
        return intArray;
    }

    // Метод для поиска индекса первого вхождения числа x в массив arr
    public int findFirst(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
    // Задание 33
    public void task33() {
        int[] arr = getIntArrayInput("Введите элементы массива через пробел: ");
        int result = maxAbs(arr);
        System.out.println("Наибольшее по модулю значение в массиве: " + result);
    }

    // Метод для поиска наибольшего по модулю значения в массиве arr
    public int maxAbs(int[] arr) {
        int maxAbsValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (Math.abs(arr[i]) > Math.abs(maxAbsValue)) {
                maxAbsValue = arr[i];
            }
        }
        return maxAbsValue;
    }
    // Задание 35
    public void task35() {
        int[] arr = getIntArrayInput("Введите элементы первого массива через пробел: ");
        int[] ins = getIntArrayInput("Введите элементы второго массива через пробел: ");
        int pos = getIntInput("Введите позицию для вставки второго массива: ");
        int[] result = add(arr, ins, pos);
        System.out.print("Результат: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Метод для добавления массива ins в массив arr на позицию pos
    public int[] add(int[] arr, int[] ins, int pos) {
        int[] result = new int[arr.length + ins.length];
        System.arraycopy(arr, 0, result, 0, pos);
        System.arraycopy(ins, 0, result, pos, ins.length);
        System.arraycopy(arr, pos, result, pos + ins.length, arr.length - pos);
        return result;
    }
    // Задание 37
    public void task37() {
        int[] arr = getIntArrayInput("Введите элементы массива через пробел: ");
        int[] result = reverseBack(arr);
        System.out.print("Результат: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Метод для создания нового массива с элементами массива arr, записанными задом наперед
    public int[] reverseBack(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }

    // Задание 39
    public void task39() {
        int[] arr = getIntArrayInput("Введите элементы массива через пробел: ");
        int x = getIntInput("Введите число для поиска: ");
        int[] result = findAll(arr, x);
        System.out.print("Индексы всех вхождений числа " + x + " в массив: ");
        for (int index : result) {
            System.out.print(index + " ");
        }
        System.out.println();
    }

    // Метод для поиска всех вхождений числа x в массив arr
    public int[] findAll(int[] arr, int x) {
        int count = 0;
        for (int num : arr) {
            if (num == x) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                result[index++] = i;
            }
        }

        return result;
    }
    // Главный метод
    public static void main(String[] args) {
        laba1 labWork = new laba1();

        System.out.println("Задание 1: Дробная часть числа");
        labWork.task1();
        System.out.println("Задание 3: Преобразование символа в его код");
        labWork.task3();
        System.out.println("Задание 5: Проверка, является ли число двузначным");
        labWork.task5();
        System.out.println("Задание 7: Проверка, входит ли число в указанный диапазон");
        labWork.task7();
        System.out.println("Задание 9: Проверка, равны ли три числа");
        labWork.task9();
        System.out.println("Задание 1 второй блок заданий: Вычисление модуля числа");
        labWork.task11();
        System.out.println("Задание 3 второй блок заданий: Проверка, делится ли число нацело на 3 или 5, но не на оба");
        labWork.task13();
        System.out.println("Задание 5 второй блок заданий: Нахождение максимального из трех чисел");
        labWork.task15();
        System.out.println("Задание 7 второй блок заданий: Вычисление суммы чисел с учетом условия(10-19)");
        labWork.task17();
        System.out.println("Задание 9 второй блок заданий: Определение дня недели");
        labWork.task19();
        System.out.println("Задание 1 третий блок заданий: Числа от 0 до x");
        labWork.task21();
        System.out.println("Задание 3 третий блок заданий: Четные числа от 0 до x");
        labWork.task23();
        System.out.println("Задание 5 третий блок заданий: Количество знаков в числе");
        labWork.task25();
        System.out.println("Задание 7 третий блок заданий: Квадрат из *");
        labWork.task27();
        System.out.println("Задание 9 третий блок заданий: Правый треугольник *");
        labWork.task29();
        System.out.println("Задание 1 четвертый блок заданий: Поиск первого вхождения числа в массив");
        labWork.task31();
        System.out.println("Задание 3 четвертый блок заданий: Поиск наибольшего по модулю значения в массиве");
        labWork.task33();
        System.out.println("Задание 5 четвертый блок заданий: Добавление массива в массив");
        labWork.task35();
        System.out.println("Задание 7 четвертый блок заданий: Возвратный реверс массива");
        labWork.task37();
        System.out.println("Задание 9 четвертый блок заданий: Поиск всех вхождений числа в массив");
        labWork.task39();
    }

}
