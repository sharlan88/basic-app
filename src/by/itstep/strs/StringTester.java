package by.itstep.strs;

import by.itstep.oop.Cat;

import java.util.Locale;

public class StringTester {

    public static void main(String[] args) {
        // Strings creation
        String str1 = "ABC";

        String str2 = new String("ABC");
        String str3 = new String();

        char [] chars = {'h', 'e', 'l', 'l', 'o'};
        String str4 = new String(chars);


        System.out.println(str4);

        String str5 = new String(chars, 1, 2);
        System.out.println(str5);
                                      // 0123456789
        String str6 = new String("This is String !");

        int code = (int)'X';
        System.out.println(code);

        int first = str6.indexOf(code);
        System.out.println(" 'X' : " + first);


        int size = str6.length();
        System.out.println("String size is " + size);


        String str7 = str6.toLowerCase();
        //str6.toUpperCase();

        System.out.println(str6);
        System.out.println(str7);

        String str10 = "   Text Java 19, Java 18, Java 17     ";
        str10 = str10.trim();
        System.out.println(str10);



        int index = str10.indexOf('9');
        System.out.println(index);

        int index2 = str10.indexOf("Java");
        System.out.println(index2);

        int index3 = str10.lastIndexOf("Java");
        System.out.println(index3);

        int index4 = str10.indexOf("1", 12);
        System.out.println(index4);

        String text = "Search the world's information, including webpages, images, videos and more. " +
                "Google has many special features to help you find exactly what you're looking for.";

        boolean isContains = text.contains("images");
        System.out.println(isContains);

        boolean isContains2 = text.indexOf("images") != -1;

        boolean isContains3 = text.contains("Images");
        System.out.println(isContains3);

        char ch = (char) text.codePointAt(12);
        System.out.println(ch);

        text.codePointCount(10, 20);


        int result = "test".compareTo(text);
        System.out.println(result);

        String s1 = "AAA";
        String s2 = "AAa";
        int result2 = s1.compareToIgnoreCase(s2);
        System.out.println(result2);

        boolean isEqual = result2 == 0;
        System.out.println("Is Equal - " + isEqual);

        text = text.concat("see http://www.google.ru/");
        System.out.println(text);

        boolean isEq = text.equals("123");
        System.out.println(isEq);

        text.endsWith("ru/");
        System.out.println(text.startsWith("Search "));
        text = text.replace("Google", "Yandex");
        text = text.replace("google", "yandex");

        System.out.println(text);

        text = text.replace('Y', 'Q');
        System.out.println(text);

        String str100 = "             ";
        "1234".isEmpty();

        char [] arr = text.toCharArray();
        for (int i = 0; i < arr.length; i=i+2) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        for (int i = 0; i < text.length(); i=i+3) {
            System.out.print(text.charAt(i) + " ");
        }






    }
}
