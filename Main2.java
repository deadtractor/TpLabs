package Block2.src;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner VVOD = new Scanner(System.in);

        System.out.print("Введите номер задачи:");
        int zad = VVOD.nextInt();
        switch (zad) {
            case 1:
                // Задача 1
                System.out.print("Ввод слова: ");
                String chisl1 = VVOD.next();
                System.out.print("Сколько раз: ");
                int chisl2 = VVOD.nextInt();
                String res = repeat(chisl1, chisl2);
                System.out.println(res);
                VVOD.close();
                break;

            case 2:
                // задача 2
                System.out.print("Ввод длины массива: ");
                int dlinam = VVOD.nextInt();
                int[] array;
                array = arraycreator(dlinam);
                int result = differenceMaxMin(array, dlinam);
                System.out.printf("Разница между max и min = %d", result);
                VVOD.close();
                break;

            case 3:
                // задача 3
                System.out.print("Ввод длины массива: ");
                int dlinam3 = VVOD.nextInt();
                int[] array3;
                array3 = arraycreator(dlinam3);
                boolean result3 = isAvgWhole(array3,dlinam3);
                System.out.printf("Является ли среднее значение всех элементов целым = " + result3);
                VVOD.close();
                break;

            case 4:
             // Задача 4
            System.out.print("Ввод длины массива : \n");
            int dlinam4 = VVOD.nextInt();
            int[] array4;
            array4 = arraycreator(dlinam4);
            int[] array41=cumulativeSum(array4,dlinam4);
            System.out.print("Результат= ");
            for (int i=0;i< array41.length;i++)
            {
            System.out.print(array41[i]+" ");
            }
            VVOD.close();
            break;

            case 5:
                // задача 5
                System.out.print("Ввод числа: ");
                String stroka5 = VVOD.next();
                System.out.printf("Результат равен = "+(getDecimalPlaces(stroka5)));
                VVOD.close();
                break;

            case 6:
                // задача 6
                System.out.print("Ввод числа: ");
                int chislo6 = VVOD.nextInt();
                System.out.printf("Соответсвующее число Фибоначчи = " + (Fibonacci(chislo6)));
                VVOD.close();
                break;

            case 7:
                // задача 7
                System.out.print("Ввод почтового индекса: \n");
                String stroka7 = VVOD.next();
                System.out.printf("Является ли почтовым индексом = " + (isValid(stroka7)));
                VVOD.close();
                break;

            case 8:
                // задача 8
             System.out.print("Ввод первого слова: \n");
             String stroka8 = VVOD.next();
             System.out.print("Ввод второго слова: \n");
             String stroka81 = VVOD.next();
             System.out.printf("Результат = " + (isStrangePair(stroka8, stroka81)));
                VVOD.close();
                break;

            case 9:
                // задача 9
             System.out.print("Ввод слова: \n");
             String stroka9 = VVOD.next();
             System.out.print("Ввод префикса или суффикса : \n");
             String stroka91 = VVOD.next();
             if (stroka91.charAt(0) == '-') 
               {
             System.out.printf("Результат = " + (isSuffix(stroka9, stroka91)));
               } 
               else if (stroka91.charAt(stroka91.length() - 1) == '-')
             System.out.printf("Результат = " + (isPrefix(stroka9, stroka91)));
             VVOD.close();
                 break;

            case 10:
                // задача 10
                System.out.print("Ввод числа/шага: \n");
                int chislo10 =  VVOD.nextInt();
                System.out.printf("Результат = " + (boxSeq(chislo10)));
                VVOD.close();
                break;

            default:
                System.out.println("Такой задачи во втором блоке нет! Введи от 1 до 10");
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
    public static String repeat(String str, int n) {
        String fstr = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < n; j++) {
                char simvol = str.charAt(i);
                fstr = fstr + simvol;
            }
        }
        return fstr;
    }

    // функция второй задачи
    public static int differenceMaxMin(int mas[], int dlina) { // функция с параметрами
        int max = mas[0];
        int min = mas[0];
        int result;
        for (int i = 0; i < dlina; i++) {
            if (max < mas[i]) {
                max = mas[i];
            }
            if (min > mas[i]) {
                min = mas[i];
            }
        }
        result = max - min;
        return result;
    }

    // функция третьей задачи
    public static boolean isAvgWhole(int mas[], int dlina)
     {
        int sum=0;
        boolean result;
        for (int i=0;i<dlina;i++)
        {
        sum = sum + mas[i];
        }
        if (sum % dlina == 0)
        {
         result=true;
        }
        else 
        {
         result=false;
        }
        return result; // возвращение вычисленного значения
    }

    // функция четвертой задачи
    public static int[] cumulativeSum(int mas[],int dlina) { // функция с параметрами
        int sum=0;
        for (int i=0;i<dlina;i++)
        {
                sum=sum+mas[i];
                mas[i]=sum;     
        }
        return mas; 
    }

    // функция пятой задачи
    public static int getDecimalPlaces(String stroka5) {

        if(stroka5.indexOf(".")>=0)
        {
        return stroka5.substring(stroka5.indexOf(".") + 1).length();
        }
        else
        return 0;
        }
    

    // функция шестой задачи
    public static int Fibonacci(int a) {
        int chfibo1= 0;
        int chfibo2= 0;
        int chfibo3= 1;
        for(int i=0;i<a;i++)
        {
        chfibo1=chfibo2;
        chfibo2=chfibo3;
        chfibo3=chfibo1+chfibo2;
        }
        return chfibo3;
    }

    // функция седьмой задачи
    public static boolean isValid(String stroka)
     {
        boolean V;
        V = stroka.length() == 5 ? true : false;
        for (int i = 0; i < stroka.length(); i++)
            if (!(((int) stroka.charAt(i) <= 57) && (48 <= (int) stroka.charAt(i))))
                V = false;
        return (V);
    }

    // функция восьмой задачи
    public static boolean isStrangePair(String stroka1, String stroka2) 
    {
        return ((stroka1.charAt(0) == stroka2.charAt(stroka2.length() - 1)) 
         && (stroka2.charAt(0) == stroka1.charAt(stroka1.length() - 1))) ? true : false;
    }

    // функции девятой задачи
    public static boolean isPrefix(String stroka1, String stroka2) 
    {
        int U = 0; 
        for (int i = 0; i < stroka2.length(); i++)
         {
            if (stroka1.charAt(i) == stroka2.charAt(i))
                U++;
        }
        if (U == stroka2.length() - 1)
            return true;
        else
            return false;
    }
    public static boolean isSuffix(String stroka1, String stroka2) 
        {
        int U = 0;
        int S = stroka1.length() - stroka2.length();
        for (int i = 1; i < stroka2.length(); i++) 
        {
            if (stroka1.charAt(S + i) == stroka2.charAt(i))
            U++;
        }
        if (U == stroka2.length() - 1)
            return true;
        else
            return false;
    }

    // функция деcятой задачи
    public static int boxSeq(int a)
     {
        int V = 0;
            if (a % 2 == 0)
                V = a;
            else
                V = a + 2;
        return V;
     }
}
