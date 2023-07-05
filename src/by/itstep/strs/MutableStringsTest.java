package by.itstep.strs;

import java.util.Arrays;

public class MutableStringsTest {
    public static void main(String[] args) {
        StringBuffer sBuff;

        StringBuilder sBuild = new StringBuilder();
        sBuild.append("Hello");
        String str = null;
        sBuild.append(str);
        sBuild.append(123).append('x').append(" World! ");
        System.out.println(sBuild);


        String str3 = "Hi!";

        StringBuilder sBuild2 = new StringBuilder(1024);
        sBuild2.append("Hello World!");
        sBuild2.append("Hello World!");
        sBuild2.append("Hello World!").append(str3);

        System.out.println(sBuild2);

        StringBuilder sBuild3 = new StringBuilder("1024");
        StringBuilder sBuild4 = new StringBuilder(sBuild.append(sBuild2));
        System.out.println(sBuild4);


        System.out.println( sBuild4.reverse());

        System.out.println( "capacity: " + sBuild4.capacity());
        System.out.println( "length: " + sBuild4.length());
        System.out.println( "free: " + (sBuild4.capacity() - sBuild4.length()));

        String words[] = sBuild4.toString().split("\\s+");
//        for(String word: words){
//            System.out.println(word);
//        }
        System.out.println(Arrays.toString(words));

        HTMLTableBuilder htmlTable = new HTMLTableBuilder();

        htmlTable.addHeaders("ID", "NAME", "LAST NAME", "AVG");

        htmlTable.addStudents(new Student(123, "John", "J", 3, 9.5),
                new Student(321, "Jack", "J", 2, 8.5));

        System.out.println(htmlTable.build());




    }
}

