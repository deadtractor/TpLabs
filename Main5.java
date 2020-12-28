package main5;
import java.util.Scanner;
import static main3.Main3.arraycreator;
import java.security.MessageDigest;

public class Main5 {

    public static void main(String[] args) {
        Scanner VVOD = new Scanner(System.in);

        System.out.print("Введите номер задачи:");
        int zad = VVOD.nextInt();
        switch (zad) 
        {
            case 1:
                // Задача 1
                VVOD.nextLine();
                System.out.print("Ввод строки: ");
                String stroka1 = VVOD.nextLine();
                System.out.print("Ввод длины первого массива: \n");
                int dlinam1 = VVOD.nextInt();
                int[] array1;
                array1 = arraycreator(dlinam1);
                System.out.println ("Кодирование - 1, Декодирование - 2 ");
                int vibor = VVOD.nextInt();
                switch (vibor)
                {
                 case 1:
                 System.out.println("Ваше закодированное сообщение = " + encrypt (stroka1));
                 VVOD.close();  
                 break;
                case 2:
                System.out.println("Ваше декодированное сообщение = " + decrypt (array1));
                VVOD.close();
                break;
                }
                break;

            case 2:
                // задача 2
                VVOD.nextLine();
                System.out.print("Ввод фигуры: ");
                String stroka2 = VVOD.nextLine();
                System.out.print("Ввод начальной позиции: ");
                String stroka21 = VVOD.nextLine();
                System.out.print("Ввод цели: ");
                String stroka22 = VVOD.nextLine();
                System.out.println("Может ли фигура двигаться к цели = " + canMove(stroka2,stroka21,stroka22));
                VVOD.close();
                break;

            case 3:
             // задача 3
             VVOD.nextLine();
             System.out.print("Ввод слова: ");
             String stroka31 = VVOD.nextLine();
             System.out.print("Ввод полного слова: ");
             String stroka32 = VVOD.nextLine();
             System.out.println(canComplete(stroka31,stroka32));
             VVOD.close();
             break;
             
            case 4:
                // Задача 4
                 System.out.print("Ввод количества цифр: ");
                int dlinam4 = VVOD.nextInt();
                int[] array4;
                array4 = arraycreator(dlinam4);
                System.out.println("Результат = " +sumDigProd(array4));
                VVOD.close();
                break;
                
            case 5:
                // задача 5
                VVOD.nextLine();
                System.out.print("Ввод кол-ва слов: ");
                int num51 = VVOD.nextInt();
                VVOD.nextLine();
                String[] array5= new String[num51];
                  for (int i = 0; i < num51; i++) 
                     {
                array5[i] = VVOD.nextLine();
                     }
                System.out.println("Результат = " + sameVowelGroup(array5));
                VVOD.close();
                break;
                
            case 6:
                // задача 6
                System.out.print("Ввод номера кредитной карты: \n");
                long num61 = VVOD.nextLong();
                System.out.println("Результат = " + (validateCard(num61)));
                VVOD.close();
                break;

            case 7:
                // задача 7
                System.out.print("Ввод числа от 0 до 999 : ");
                int num71 = VVOD.nextInt();
                System.out.println("Результат = " + (numToEng(num71)));
                VVOD.close();
                break;

            case 8:
                 // задача 8
                VVOD.nextLine();
                System.out.print("Ввод строки: ");
                String stroka8 = VVOD.nextLine();
                System.out.println("Результат " + getSha256Hash(stroka8));
                VVOD.close();
                break;

            case 9:
                // задача 9
                VVOD.nextLine();
                System.out.print("Ввод строки: ");
                String stroka9 = VVOD.nextLine();
                System.out.println("Результат = " + correctTitle(stroka9));

            case 10:
                // задача 10
                System.out.print("Ввод числа: ");
                int number10 = VVOD.nextInt();
                System.out.println("Результат \n" + (hexLattice(number10)));
                VVOD.close();
                break;

            default:
                System.out.println("Такой задачи в пятом блоке нет! Введи от 1 до 10");
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

    // функции первой задачи
       public static String encrypt(String stroka) // функция с параметрами
       {  
        char[] ch = stroka.toCharArray();
        String newstr = "[" + (int) ch[0] + ", ";
        for (int i = 1; i < ch.length; i++) {
            newstr += (int) ch[i] - (int) ch[i - 1] + ", ";
        }
        return newstr.substring(0, newstr.length() - 2) + "]";
    }

    public static String decrypt(int[] mas) // функция с параметрами
    {
        String newstr = "" + (char) mas[0];
        int sum = mas[0];
        for (int i = 1; i < mas.length; i++) {
            sum += mas[i];
            newstr += (char) sum;
        }
        return newstr;
    }

    // функция второй задачи
      public static boolean canMove(String figura, String hod1, String hod2) // функция с параметрами
      {
        hod1 = hod1.toUpperCase();
        hod2 = hod2.toUpperCase();
        figura = figura.toUpperCase();
        if (hod1.matches("([A-H]{1}[1-8]{1})") && hod2.matches("([A-H]{1}[1-8]{1})") && hod1.equals(hod2) == false) {
            if (figura.equals("PAWN")) {
                if (hod1.charAt(1) >= 50 && hod1.charAt(1) <= 55 && hod2.charAt(0) == hod1.charAt(0)
                        && (int) hod2.charAt(1) == (int) hod1.charAt(1) + 1)
                    return true;
                else
                    return false;
            }
            if (figura.equals("ROOK")) {
                if (hod2.charAt(0) == hod1.charAt(0) || hod2.charAt(1) == hod1.charAt(1))
                    return true;
                else
                    return false;
            }
            if (figura.equals("BISHOP")) {
                if (Math.abs((int) hod2.charAt(0) - (int) hod1.charAt(0)) == Math.abs(hod2.charAt(1) - hod1.charAt(1)))
                    return true;
                else
                    return false;
            }
            if (figura.equals("QUEEN")) {
                if (hod2.charAt(0) == hod1.charAt(0) || hod2.charAt(1) == hod1.charAt(1) || Math
                        .abs((int) hod2.charAt(0) - (int) hod1.charAt(0)) == Math.abs(hod2.charAt(1) - hod1.charAt(1)))
                    return true;
                else
                    return false;
            }
            if (figura.equals("KING")) {
                if (Math.abs((int) hod2.charAt(0) - (int) hod1.charAt(0)) <= 1
                        && Math.abs(hod2.charAt(1) - hod1.charAt(1)) <= 1)
                    return true;
                else
                    return false;
            }
            if (figura.equals("HORSE")) {
                if (Math.abs((int) hod2.charAt(0) - (int) hod1.charAt(0)) == 1
                        && Math.abs(hod2.charAt(1) - hod1.charAt(1)) == 2
                        || Math.abs((int) hod2.charAt(0) - (int) hod1.charAt(0)) == 2
                                && Math.abs(hod2.charAt(1) - hod1.charAt(1)) == 1)
                    return true;
                else
                    return false;
            }
        }
        return false;
    }

      
    // функция третьей задачи
    public static boolean canComplete(String stroka1, String stroka2) // функция с параметрами
    {
        String fin = stroka2;
        String fin2 = "" + stroka1.charAt(0);
        ;
        char[] ch = stroka1.toCharArray();
        String newstr = "" + stroka1.charAt(0);
        String newstr2 = "";
        int k = 0;
        if (stroka1.charAt(0) != stroka2.charAt(0))
            return false;
        while (stroka2.length() > 1 && k < stroka1.length() - 1) {
            if (stroka2.indexOf(ch[k]) != -1) {
                if (stroka1.charAt(k) == stroka1.charAt(k + 1)) {
                    newstr2 = stroka2.substring(stroka2.indexOf(ch[k]) + 1);
                    if (newstr2.indexOf(ch[k + 1]) == -1) {
                        return false;
                    }

                }
                if (stroka2.indexOf(ch[k + 1]) != -1) {
                    fin2 += ch[k + 1];
                    newstr += stroka2.substring(stroka2.indexOf(ch[k]) + 1, stroka2.indexOf(ch[k + 1]) + 1);
                    stroka2 = stroka2.substring(stroka2.indexOf(ch[k + 1]));
                } else
                    return false;
            } else
                return false;
            k++;
        }
        return fin.equals(newstr) && fin2.equals(stroka1);
    }


    // функция четвертой задачи
    public static int sumDigProd(int... mas) // функция с параметрами
    {
        int rezult = 0;
        String im = "";
        for (int n : mas)
            rezult += n;
        while (Integer.toString(rezult).length() != 1) {
            im = Integer.toString(rezult);
            rezult = 1;
            for (int i = 0; i < im.length(); i++)
                rezult *= Integer.parseInt(im.substring(i, i + 1));
        }
        return rezult;
    }

    // функция пятой задачи
     public static String sameVowelGroup(String[] mas) // функция с параметрами
     {
        String str = mas[0];
        String pervoeSlovo = "";
        String sledSovo = "";
        String sl = "";
        String Otvet = "['" + str + "',";
        boolean a = true;
        int k1 = 0, k2 = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u' || str.charAt(i) == 'y') {
                if (pervoeSlovo.indexOf(str.charAt(i)) == -1)
                    k1++;
                pervoeSlovo += str.charAt(i);
            }
        }
        for (int i = 1; i < mas.length; i++) {
            sledSovo = mas[i].toLowerCase();
            for (int j = 0; j < sledSovo.length(); j++) {
                if (sledSovo.charAt(j) == 'a' || sledSovo.charAt(j) == 'e' || sledSovo.charAt(j) == 'i'
                        || sledSovo.charAt(j) == 'o' || sledSovo.charAt(j) == 'u' || sledSovo.charAt(j) == 'y') {
                    if (pervoeSlovo.indexOf(sledSovo.charAt(j)) != -1) {
                        if (sl.indexOf(sledSovo.charAt(j)) == -1) {
                            k2++;
                        }
                        sl += sledSovo.charAt(j);
                    } else
                        a = false;
                }
            }
            if (a == true && k1 == k2) {
                Otvet += "'" + sledSovo + ",'";
            }
            a = true;
            k2 = 0;
            sl = "";
        }
        return Otvet.substring(0, Otvet.length() - 2) + "']";
    }

    // функция шестой задачи
     public static boolean validateCard(long num) // функция с параметрами
     {
        if (("" + num).length() <= 14 && ("" + num).length() >= 19) {
            return false;
        }
        String s;
        int sum = 0;
        int kontrolChifra = Integer.parseInt(("" + num).substring(("" + num).length() - 1));// Последняя цифра
        int len = ("" + num).length() - 2;
        while (len >= 0) {
            s = "" + ("" + num).charAt(len);//Переворот цифр
            if (Integer.parseInt(s) % 2 != 0) {
                s = "" + Integer.parseInt(s) * 2;
                if (s.length() > 1) {
                    s = "" + (Integer.parseInt(s.substring(0, 1)) + Integer.parseInt(s.substring(1, 2)));
                }
            }
            sum += Integer.parseInt(s);
            len--;
        }
        return ("" + (10 - Integer.parseInt(("" + sum).substring(("" + sum).length() - 1)))).equals("" + kontrolChifra);
    }
    
    
    
    // функция седьмой задачи
   public static String numToEng(int num)  // функция с параметрами
   {
        String res = "";
        String[] nums = new String[] { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
                "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
                "nineteen" };

        String[] decades = new String[] { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty",
                "ninety" };

        String hund = "hundred";
        if (num == 0)
            return "zero";
        if (num >= 100) {
            res += nums[num / 100] + " " + hund + " ";
        }
        if (num % 100 < 20 && num % 100 != 0)
            res += nums[num % 100];
        else
            res += decades[num % 100 / 10] + " " + nums[num % 10];
        return res;
    }
 
    // функция восьмой задачи
   
    public static String getSha256Hash(String str)  // функция с параметрами
    {
        try{
            MessageDigest dig = MessageDigest.getInstance("SHA-256");
            byte[] hesh = dig.digest(str.getBytes("UTF-8"));
            StringBuffer hexStr = new StringBuffer();
            for (int i = 0; i < hesh.length; i++) {
                String hexS = Integer.toHexString(0xff & hesh[i]);
                if(hexS.length() == 1)
                    hexStr.append('0');
                hexStr.append(hexS);
            }
            return hexStr.toString();
        } catch(Exception exc){
           throw new RuntimeException(exc);
        }
    }

    // функции девятой задачи
   public static String correctTitle(String str) {  // функция с параметрами
        str = str.toLowerCase();
        char[] newstr = str.toCharArray();
        newstr[0] = Character.toUpperCase(newstr[0]);
        str = "";
        for (int i = 0; i < newstr.length; i++) {
            if (newstr[i] == ' ' || newstr[i] == '-') {
                if ((newstr[i + 1] == 'i' && newstr[i + 2] == 'n')
                        || (newstr[i + 1] == 'a' && newstr[i + 2] == 'n' && newstr[i + 3] == 'd')
                        || (newstr[i + 1] == 't' && newstr[i + 2] == 'h' && newstr[i + 3] == 'e')
                        || (newstr[i + 1] == 'o' && newstr[i + 2] == 'f')) {
                } else
                    newstr[i + 1] = Character.toUpperCase(newstr[i + 1]);
            }
            str += newstr[i];
        }
        return str;
    }

    // функция деcятой задачи
      public static String hexLattice(int n) {
        String res = "";
        int c, i, j;
        double x = 1 / 2.0 + 1 / 6.0 * Math.sqrt(12.0 * n - 3); // hexagonal formula
        if (Math.ceil(x) == Math.floor(x)) { // check integer
            c = (int) x;
            for (i = 0; i < c; i++) { // each string to half
                for (j = 0; j < c - i; j++) // spaces before
                    res += " ";
                for (j = 0; j < c + i; j++) // letters "o"
                    res += "o ";
                for (j = 0; j < c - i - 1; j++) // spaces after
                    res += " ";
                res += "\n"; // next string
            }
            for (i = c - 2; i >= 0; i--) { // each string from half+1 to end
                for (j = 0; j < c - i; j++) // spaces before
                    res += " ";
                for (j = 0; j < c + i; j++) // letters "o"
                    res += "o ";
                for (j = 0; j < c - i - 1; j++) // spaces after
                    res += " ";
                res += "\n"; // next string
            }
        } else
            res = "Invalid";
        return res;
    }

}

