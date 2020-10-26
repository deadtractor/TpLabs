package Block1.src;
import java.util.Scanner;
public class Main {
    
    public static void main (String[]args)
    {
        Scanner VVOD = new Scanner(System.in);
        
        System.out.print("Введите номер задачи:");
        int zad = VVOD.nextInt();
        switch (zad){
            
            case 1:
        //Задача 1 
        System.out.print("Ввод первого числа: ");
        int chisl1 = VVOD.nextInt();
        System.out.print("Ввод второго числа: ");
        int chisl2 = VVOD.nextInt();
        int res1 = remainder(chisl1,chisl2);
        System.out.printf("Остаток деления %d ", res1);
        VVOD.close();
           break;

           case 2:
        //задача 2
        System.out.print("Ввод высоты: ");
        int Vis = VVOD.nextInt();
        System.out.print("Ввод основания: ");
        int Osn = VVOD.nextInt();
        int result = triArea(Vis,Osn);
        System.out.printf("Площадь треугольника = %d",result);
        VVOD.close();
           break;
               
           case 3:
           //задача 3
        System.out.print("Куриц: ");
        int Chickens = VVOD.nextInt();
        System.out.print("Коров: ");
        int Cows = VVOD.nextInt(); 
        System.out.print("Свиней: ");
        int Pigs = VVOD.nextInt();
        int Animals = animals(Chickens,Cows,Pigs);
        System.out.printf("Общее количество ног всех животных = %d",Animals);
        VVOD.close();
           break;

           case 4:
           //задача 4
           System.out.print("prob: ");
           float prob = VVOD.nextFloat();
           System.out.print("prize: ");
           float prize = VVOD.nextFloat(); 
           System.out.print("pay: ");
           float pay = VVOD.nextFloat();
           profitableGamble(prob,prize,pay);
           VVOD.close();
           break;

           case 5:
           //задача 5
           System.out.print("Ввод N: ");
           int N = VVOD.nextInt();
           System.out.print("Ввод a: ");
           int a = VVOD.nextInt();
           System.out.print("Ввод b: ");
           int b = VVOD.nextInt(); 
           String Deyst =  operation(N,a,b);
           System.out.println("Требуемая операция= " + Deyst);
           VVOD.close();
           break;

           case 6:
           //задача 6
           System.out.print("Ввод символа: ");
           String Slovo = VVOD.next();
           char Simvol = Slovo.charAt(0);
            int Znach = ctoa(Simvol);
            System.out.println("Значение переданного символа = " + Znach);
           VVOD.close();
           break;

           case 7:
           //задача 7
           System.out.print("Ввод числа: ");
           int Chisl = VVOD.nextInt();
           
            int Sum = addUpTo(Chisl);
            System.out.println("Сумма всех чисел до него и включая его = " + Sum);
           VVOD.close();
           break;

           case 8:
           //задача 8
           System.out.print("Ввод первой стороны: ");
           int a8 = VVOD.nextInt();
           System.out.print("Ввод второй стороны: ");
           int b8 = VVOD.nextInt();
           int maxz = nextEdge(a8,b8);
           System.out.println("Третья сторона =  " + maxz);
           VVOD.close();
           break;

           case 9:
           //задача 9
           System.out.print("Ввод количества чисел в массиве: ");
           int A = VVOD.nextInt();
           int SumK = sumOfCubes(A);
           System.out.println("Сумма кубов введенных чисел = "+ SumK);
           VVOD.close();
           break;

           case 10:
           //задача 10
           System.out.print("Ввод а: ");
           int a10 = VVOD.nextInt();
           System.out.print("Ввод b: ");
           int b10 = VVOD.nextInt(); 
           System.out.print("Ввод с: ");
           int c10 = VVOD.nextInt();
           abcmath(a10,b10,c10);
           VVOD.close();
           break;

        default: 
        System.out.println("Такой задачи в первом блоке нет!");
        break;
        }   
    }

    //функция первой задачи
    public static int remainder(int chisl1, int chisl2)
    {
     return chisl1%chisl2; 
    }

    //функция второй задачи
    public static int triArea(int Vis, int Osn)
    {  //функция с параметрами
        int n = (Vis * Osn)/2;
        return n;  //возвращение вычисленного значения
    }

    //функция третьей задачи
    public static int animals(int chickens, int cows, int pigs)
    {  
        int animals   = (chickens*2) + (cows*4) + (pigs*4);
        return animals;  //возвращение вычисленного значения
    }

    //функция четвертой задачи
    public static void profitableGamble(float prob, float prize, float pay)
    {  //функция с параметрами
        System.out.println((prob * prize > pay));
    }

    //функция пятой задачи
    public static String operation(int N,int a,int b)
    {  //функция с параметрами
        String Deyst;
        if (N==a+b)
        Deyst = "Сложение";
        else if (N==a-b)
        Deyst = "Вычитание";
        else if (N==a*b)
        Deyst = "Умножение";
        else if (N==a/b)
        Deyst = "Деление";
        else 
        Deyst= "NONE";
        return Deyst;  
    }

    //функция шестой задачи
    public static int ctoa(char Simvol)
    {  //функция с параметрами
        int Znach  =  (int) Simvol;
        return Znach;
    }

//функция седьмой задачи
public static int addUpTo(int Chisl)
 {  //функция с параметрами
    int Sum = 0;
 for (int i = 1; i <= Chisl; i++)
 {
    Sum = Sum + i;
 }
    return Sum;
}

//функция восьмой задачи
public static int nextEdge(int a, int b) 
    {
        // Недопустимые условия
        if (a <= 0 || b <= 0)
        {
            System.out.print("Неверный формат");
            return 0;
        }
        else 
        {
            int c = a + b - 1;
            return c;
        }
    }

//функция девятой задачи
public static int sumOfCubes(int A) 
{
    Scanner VVOD = new Scanner(System.in);
    int[] mas = new int[A];
    int SumK = 0;
    for (int i = 0; i < A; i++) 
    {
        System.out.print("Ввод числа: ");
        mas[i] = VVOD.nextInt();
        SumK = SumK + (mas[i] * mas[i] * mas[i]);
    }
    VVOD.close();
    return SumK;
}

//функция деcятой задачи
public static void abcmath(int a,int b,int c) 
{
    for (int i = 1; i < b; i++) 
    {
        a = a*2;  
    }
    System.out.println((a % c) == 0);
}

}
