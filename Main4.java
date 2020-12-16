package main4;

import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
        Scanner VVOD = new Scanner(System.in);

        System.out.print("Введите номер задачи:");
        int zad = VVOD.nextInt();
        switch (zad) {
            case 1:
                // Задача 1
                System.out.print("Ввод количества слов: ");
                int n = VVOD.nextInt();
                System.out.print("Ввод количество символов в строке: ");
                int k = VVOD.nextInt();
                System.out.print("Ввод текста ");
                VVOD.nextLine();
                String stroka1 = VVOD.nextLine();
                if (stroka1.split(" ").length != n)
                    System.out.println("Вы ввели " + stroka1.split(" ").length + " слов. Введите " + n + " слов.");
                else
                    System.out.println(Bessy(n, k, stroka1));
                VVOD.close();
                break;

            case 2:
                // задача 2
                VVOD.nextLine();
                System.out.print("Ввод строки скобок: ");
                String stroka2 = VVOD.nextLine();
                String result2 = split(stroka2);
                System.out.println("Сбалансированный кластер скобок = " + result2);
                VVOD.close();
                break;

            case 3:
                // задача 3
                VVOD.nextLine();
                System.out.print("Ввод строки: ");
                String stroka3 = VVOD.nextLine();
                boolean camelcase = false;
                for (int i = 0; i < stroka3.length(); i++)
                 {
                    if (stroka3.charAt(i) != '_') {
                        camelcase = true;
                        break;
                    }
                }
                if (camelcase == true)
                    System.out.println("Вывод результата = " + toCamelCase(stroka3));
                else
                    System.out.println("Вывод результата = " + toSnakeCase(stroka3));
                    VVOD.close();
                    break;

            case 4:
                // Задача 4
                System.out.print("Ввод начала рабочего дня: ");
                double nachalo = VVOD.nextDouble();
                System.out.print("Ввод конца рабочего дня: ");
                double konec = VVOD.nextDouble();
                System.out.print("Ввод почасовой ставку: ");
                double stavka = VVOD.nextDouble();
                System.out.print("Ввод множитиля сверхурочных работ: ");
                double mnoj= VVOD.nextDouble();
                System.out.println("Результат = " + overTime (nachalo,konec,stavka,mnoj));
                VVOD.close();
                break;

            case 5:
                // задача 5
                VVOD.nextLine();
                System.out.print("Ввод веса: ");
                String ves = VVOD.nextLine();
                System.out.print("Ввод роста: ");
                String rost = VVOD.nextLine();
                System.out.println("Ваш ИМТ= " + BMI(ves, rost));
                VVOD.close();
                break;

            case 6:
                
                // задача 6
                System.out.print("Ввод числа: \n");
                int chislo6 = VVOD.nextInt();
                System.out.printf("Результат = " + bugger(chislo6));
                VVOD.close();
                break;

            case 7:
                // задача 7
                VVOD.nextLine();
                System.out.print("Ввод строки: \n");
                String stroka7 = VVOD.nextLine();
                System.out.printf("Звездная стенография = " + (toStarShorthand(stroka7)));
                VVOD.close();
                break;

            case 8:
                 // задача 5
                VVOD.nextLine();
                System.out.print("Ввод первой строки: ");
                String stroka8 = VVOD.nextLine();
                System.out.print("Ввод второй строки: ");
                String stroka81 = VVOD.nextLine();
                System.out.println("Результат " + doesRhyme(stroka8, stroka81));
                VVOD.close();
                break;

            case 9:
                // задача 9
                System.out.print("Ввод числа: \n");
                long chislo9 = VVOD.nextLong();
                System.out.print("Ввод второго числа: \n");
                long chislo91 = VVOD.nextLong();
                System.out.printf("Результат = " + (trouble(chislo9,chislo91)));
                VVOD.close();
                break;

            case 10:
                // задача 10
                 VVOD.nextLine();
                System.out.print("Ввод строки: ");
                String stroka10 = VVOD.nextLine();
                System.out.print("Ввод символа: ");
                String stroka101 = VVOD.nextLine();
                System.out.println("Результат = " + countUniqueBooks(stroka10,stroka101));
                VVOD.close();
                break;

            default:
                System.out.println("Такой задачи в четвертом блоке нет! Введи от 1 до 10");
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
    public static String Bessy(int n, int k, String stroka) // функция с параметрами
    {
        String[] words = new String[n];
        String newstr2 = "";
        String newstr = "";
        int a = 0;

        for (int q = 0; q < n; q++) {
            words[q] = "";
        }
        for (int i = 0; i < stroka.length(); i++) {
            if (stroka.charAt(i) != ' ') {
                words[a] = words[a] + stroka.charAt(i);
            } else {
                a++;
            }
        }
        newstr = words[0];
        newstr2 = words[0];
        for (int q = 1; q < n; q++) {
            if (newstr2.length() + words[q].length() <= k) {
                newstr = newstr + " " + words[q];
                newstr2 = newstr2 + " " + words[q];
            } else {
                newstr = newstr + "\n" + words[q];
                newstr2 = words[q];
            }
        }
        return newstr;
    }

    // функция второй задачи
    public static String split(String stroka) { // функция с параметрами
        int oskobka = 0;
        int zskobka = 0;
        String newstr = "['";
        for (int i = 0; i < stroka.length(); i++) {
            if (stroka.charAt(i) == '(') {
                newstr += "(";
                oskobka++;
            }
            if (stroka.charAt(i) == ')') {
                newstr += ")";
                zskobka++;
            }
            if (oskobka == zskobka) {
                if (i != stroka.length() - 1)
                    newstr += "','";
                else
                    newstr += "']";
            }
        }
        return newstr;
    }

    // функция третьей задачи
    public static String toCamelCase(String stroka) { // функция с параметрами
        char[] newstr = stroka.toCharArray();
        stroka = "";
        for (int i = 0; i < newstr.length; i++) {
            if (newstr[i] == '_')
                newstr[i + 1] = Character.toUpperCase(newstr[i + 1]);
            else
                stroka += newstr[i];
        }
        return stroka;
    }

    public static String toSnakeCase(String stroka2) { // функция с параметрами
        char[] newstr = stroka2.toCharArray();
        stroka2 = "";
        for (int i = 0; i < newstr.length; i++) {
            if (Character.isUpperCase(newstr[i])) {
                stroka2 += "_" + Character.toLowerCase(newstr[i]);
            } else
                stroka2 += newstr[i];
        }
        return stroka2;
    }

    // функция четвертой задачи
    public static String overTime(double nachalo, double konec,double stavka,double mnoz)// функция с параметрами 
    { 
        double oklad = 0;
        double rabvrem = 0;
        double pererabotka = 0;

        if(konec>17)
        {
        rabvrem=17-nachalo;    
        pererabotka=konec-17;
        oklad=rabvrem*stavka+pererabotka*mnoz*stavka;
        }
        else
        {
        rabvrem = Math.abs(nachalo-konec);
        oklad=rabvrem*stavka+pererabotka*mnoz;
        }
        return "$" + String.format("%.2f", oklad);
    }

    // функция пятой задачи
    public static String BMI(String stroka1, String stroka2)// функция с параметрами
     {   
        double ves = Double.parseDouble(stroka1.substring(0, stroka1.indexOf(' ')));
        if (stroka1.endsWith("pounds"))
         {
            ves = ves * 0.453592;
        }
        double rost = Double.parseDouble(stroka2.substring(0, stroka2.indexOf(' ')));
        if (stroka2.endsWith("inches")) 
        {
            rost = rost * 0.0254;
        }
        double IBM = ves / (rost*rost);
        if (IBM < 18.5)
         {
            return String.format("%.1f", IBM) + " Недостаточный Вес";
        }
        else if(IBM<24.9)
            return String.format("%.1f", IBM)+ " Нормальный вес";
        else
            return String.format("%.1f", IBM)+ " Избыточный вес";
    }

    // функция шестой задачи
     public static int bugger(int n) // функция с параметрами
     {
        String str = "" + n;
        int sum = 0;
        int s = 0;
        while (str.length() > 1)
        {
            sum = 1;
            for (int i = 0; i < str.length(); i++) {
               sum = sum * Integer.parseInt("" +str.charAt(i));
            }
            s++;
            str = "" + sum;
        }
        return s;
    }
    
    
    
    // функция седьмой задачи
    public static String toStarShorthand(String stroka7)// функция с параметрами
    {
        if(stroka7=="")
            return "";
        char simvol = stroka7.charAt(0);
        int kol = 1;
        String newst = "";
        for(int i=1;i<stroka7.length();i++)
        {
            if(stroka7.charAt(i) != simvol)
            {
                if(kol>1)
                {
                    newst += ""+simvol+ "*"+ kol;
                }
                else
                    newst += ""+simvol;
                kol = 1;
                if(i!=stroka7.length()-1)
                    simvol = stroka7.charAt(i);
                else
                    newst+=stroka7.charAt(i);
            }
            else
            {
                kol++;
                if(i== stroka7.length()-1)
                {
                    newst += ""+simvol+ "*"+ kol;
                }
            }
        }
        return newst;
    }
 
    // функция восьмой задачи
   public static boolean doesRhyme(String stroka1, String stroka2) // функция с параметрами
   {
        String s1 = "", s2 = "";
        char v = ' ';
        stroka1 = stroka1.substring(stroka1.lastIndexOf(" ") + 1);
        for (int i = 0; i < stroka1.length(); i++) {
            v = Character.toLowerCase(stroka1.charAt(i));
            if (v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u' || v == 'y') {
                s1 += v;
            }
        }
        stroka2 = stroka2.substring(stroka2.lastIndexOf(" ") + 1);
        for (int i = 0; i < stroka2.length(); i++) {
            v = Character.toLowerCase(stroka2.charAt(i));
            if (v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u' || v == 'y') {
                s2 += v;
            }
        }
        return  s1.equals(s2);
    }

    // функции девятой задачи
    public static boolean trouble(long a, long b) // функция с параметрами
    {
        String str1 = "" + a;
        String str2 = "" + b;
        int kol = 0, kol2 = 0;
        for (int i = 0; i < str1.length(); i++) 
        {
            if (i != str1.length() - 1)
            {
                if (str1.charAt(i) == str1.charAt(i + 1))
                    kol++;
                else
                    kol = 0;
                if (kol == 2) 
                {
                    for (int j = 0; j < str2.length(); j++) {
                        if (str1.charAt(i) == str2.charAt(j)) {
                            kol2++;
                        } else {
                            kol2 = 0;
                        }
                        if (kol2 == 2) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    // функция деcятой задачи
      public static int countUniqueBooks(String str, String ch) // функция с параметрами
      {
        String newstr1 = "";
        String newstr2 = "";
        String fin = "";
        int ind1 = 0, ind2 = 0;
        while(str.length()!= 0)
        {
            if(str.indexOf(ch)!=-1)
            {
                newstr1 = str.substring(str.indexOf(ch)+1);
                ind1 = str.indexOf(ch)+1;
                str = str.substring(ind1);
            }
            if(newstr1.indexOf(ch)!=-1)
            {
                newstr2 = newstr1.substring(0,newstr1.indexOf(ch));
                ind2 = newstr1.indexOf(ch)+1;
                str = str.substring(ind2);
            }
            for(int i=0;i<newstr2.length();i++)
            {
                if(fin.indexOf(newstr2.charAt(i))==-1)
                {
                    fin += newstr2.charAt(i);
                }
            }
        }
        return fin.length();
    }
}

