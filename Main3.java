import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        Scanner VVOD = new Scanner(System.in);

        System.out.print("Введите номер задачи:");
        int zad = VVOD.nextInt();
        switch (zad) {
            case 1:
                // Задача 1
                System.out.print("Ввод a ");
                int a = VVOD.nextInt();
                System.out.print("Ввод b ");
                int b = VVOD.nextInt();
                System.out.print("Ввод c");
                int c = VVOD.nextInt();
                int res = solutions(a, b, c);
                System.out.println(res);
                VVOD.close();
                break;

            case 2:
                // задача 2
                VVOD.nextLine();
                System.out.print("Ввод строки: ");
                String stroka2 = VVOD.nextLine();
                int result2 = findZip(stroka2);
                System.out.println("Позиция второго вхождения zip = " + result2);
                VVOD.close();
                break;

            case 3:
                // задача 3
                System.out.print("Ввод числа: ");
                int chislo3 = VVOD.nextInt();
                boolean result3 = checkPerfect(chislo3);
                System.out.printf("Является ли число совершенным = " + result3);
                VVOD.close();
                break;

            case 4:
                // Задача 4
                VVOD.nextLine();
                System.out.print("Ввод строки : \n");
                String stroka4 = VVOD.nextLine();
                String result4 = flipEndChars(stroka4);
                System.out.print("Результат= " + result4);
                VVOD.close();
                break;

            case 5:
                // задача 5
                System.out.print("Ввод кода: ");
                String stroka5 = VVOD.next();
                System.out.printf("Является ли строка 16-ичным кодом = " + (isValidHexCode(stroka5)));
                VVOD.close();
                break;

            case 6:

                 // задача 6
                System.out.print("Ввод длины первого массива: \n");
                int dlinam6 = VVOD.nextInt();
                int[] array6;
                array6 = arraycreator(dlinam6);
                System.out.print("Ввод длины второго массива: \n");
                int dlinam7 = VVOD.nextInt();
                int[] array7;
                array7 = arraycreator(dlinam7);
                System.out.printf("Результат = " + same(array6, array7));
                VVOD.close();
                break;

            case 7:
                // задача 7
                System.out.print("Ввод число: \n");
                int chislo7 = VVOD.nextInt();
                System.out.printf("Является ли числом Капрекара = " + (isKapreka(chislo7)));
                VVOD.close();
                break;

            case 8:
                // задача 8
                System.out.print("Ввод последовательности: \n");
                String stroka8 = VVOD.next();
                System.out.printf("Самая длинная последовательность нулей = " + longestZero(stroka8));
                VVOD.close();
                break;

            case 9:
                // задача 9
                System.out.print("Ввод числа: \n");
                int chislo9 = VVOD.nextInt();
                System.out.printf("Результат = " + (nextPrime(chislo9)));
                VVOD.close();
                break;

            case 10:
                // задача 10
                System.out.print("Ввод стороны x: ");
                int x = VVOD.nextInt();
                System.out.print("Ввод стороны y: ");
                int y = VVOD.nextInt();
                System.out.print("Ввод стороны z: ");
                int z = VVOD.nextInt();
                System.out.println("Результат = " + rightTriangle(x, y, z));
                VVOD.close();
                break;

            default:
                System.out.println("Такой задачи в третьем блоке нет! Введи от 1 до 10");
                break;
        }
    }

    public static int[] arraycreator(int s) {
        Scanner Cmas = new Scanner(System.in);
        int[] mas = new int[s];
        System.out.println("Введите массив:");
        for (int i = 0; i < s; i++) {
            mas[i] = Cmas.nextInt();
        }
        return mas;
    }

    // функция первой задачи
    public static int solutions(int a, int b, int c) // функция с параметрами
    {
        double D = b * b - 4 * a * c;
        if (D < 0)
            return 0;
        else if (D == 0)
            return 1;
        else
            return 2;
    }

    // функция второй задачи
    public static int findZip(String stroka) // функция с параметрами
    {
        return stroka.indexOf("zip", stroka.indexOf("zip") + 1);
    }

    // функция третьей задачи
    public static boolean checkPerfect(int n) // функция с параметрами
    {
        int Sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0)
                Sum += i;
        }
        if (Sum == n)
            return true;
        else
            return false;
    }

    // функция четвертой задачи
    public static String flipEndChars(String stroka) // функция с параметрами
    {
        if (stroka.length() < 2)
            return "Несовместимо!";
        if (stroka.charAt(0) == stroka.charAt(stroka.length() - 1))
            return "Два - это пара.";
        stroka = stroka.charAt(stroka.length() - 1) + stroka.substring(1, stroka.length() - 1) + stroka.charAt(0);
        return stroka;
    }

    // функция пятой задачи
    public static boolean isValidHexCode(String stroka)
    {
         int rez = 0;
         if ((int)stroka.charAt(0) == 35 && stroka.length()==7);
            for(int i=1;i<stroka.length();i++)
            if ((((int) stroka.charAt(i) <= 57) && (48 <= (int) stroka.charAt(i)))
            || (((int) stroka.charAt(i) <= 70) && (65<= (int) stroka.charAt(i))))
                   rez = rez++;
        return (rez+1==stroka.length());
    }

    // функция шестой задачи
    public static boolean same(int[] massiv, int[] massiv2) // функция с параметрами
    {
        int Sum1 = 0;
        int Sum2 = 0;
        for (int i = 0; i < massiv.length; i++) {
            int j;
            for (j = 0; j < i; j++) {
                if (massiv[i] == massiv[j])
                    break;
            }
            if (i == j)
                Sum1++;
        }
        for (int i = 0; i < massiv2.length; i++) {
            int j;
            for (j = 0; j < i; j++) {
                if (massiv2[i] == massiv2[j])
                    break;
            }
            if (i == j)
                Sum2++;
        }
        if (Sum1 != Sum2)
            return false;
        else
            return true;
    }

    // функция седьмой задачи
    public static boolean isKapreka(int a) // функция с параметрами
    {
        String stroka = "" + (int) Math.pow(a, 2);
        int Kaprek = 0;
        if (stroka.length() > 1) {
            for (int i = 1; i < stroka.length(); i++) {
                Kaprek = Integer.parseInt(stroka.substring(0, i))
                        + Integer.parseInt(stroka.substring(i, stroka.length()));
                if (Kaprek == a)
                    return true;
            }
        }
        return false;
    }

    // функция восьмой задачи
    public static String longestZero(String stroka) // функция с параметрами
    {
        int min = 0;
        int max = 0;
        int index = 0;
        int index1 = 0;
        for (int i = 0; i < stroka.length(); i++) {
            if (stroka.charAt(i) == '0') {
                index = i + 1;
                min++;
                if (min > max) {
                    max = min;
                    index1 = index;
                }
            } else {
                min = 0;
            }
        }
        return stroka.substring(index1 - max, index1);
    }

    // функции девятой задачи
    public static int nextPrime(int n) // функция с параметрами
    {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                i = 2;
                n = n + 1;
            }
        }
        return n;
    }

    // функция деcятой задачи
    public static boolean rightTriangle(int a, int b, int c) // функция с параметрами
    {
        return (c * c == a * a + b * b || a * a == b * b + c * c || b * b == a * a + c * c) ? true : false;
    }
}
