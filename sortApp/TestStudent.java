package org.sorting.sortApp;

import java.util.*;
import java.util.Scanner;


public class TestStudent {
    public static void main(String[] args) {
        Set list = new HashSet();
        list.add(new Student2("BALA", 100, 98, 21));
        list.add(new Student2("JESWANT", 107, 100, 26));
        list.add(new Student2("AMITH", 105, 30, 24));
        list.add(new Student2("MADHU", 106, 55, 29));
        list.add(new Student2("MADHU", 106, 55, 29));
        List l = new ArrayList(list);

        Scanner sc = new Scanner(System.in);

        /*System.out.println("PRESS 1 FOR ID-WISESHORT   "+1);
        System.out.println("PRESS 2 FOR AGE-WISESHORT  "+2);
        System.out.println("PRESS 3 FOR NAME-WISESHORT "+3);
        System.out.println("PRESS 4 FOR MARK-WISESHORT "+4);
        System.out.println("PRESS 5 FOR EXIT           "+5);*/

        do {

            System.out.println("PRESS 1 FOR ID-WISESHORT   " + 1);
            System.out.println("PRESS 2 FOR AGE-WISESHORT  " + 2);
            System.out.println("PRESS 3 FOR NAME-WISESHORT " + 3);
            System.out.println("PRESS 4 FOR MARK-WISESHORT " + 4);
            System.out.println("PRESS 5 FOR EXIT           " + 5);
            int y = sc.nextInt();
            if (y != 5) {
                switch (y) {
                    case 1:
                        Collections.sort(l, new IdWiseShort());
                        for (Object obj : l) {
                            System.out.println(obj);
                        }
                        break;
                    case 2:
                        Collections.sort(l, new AgewiseShort());
                        for (Object obj : l) {
                            System.out.println(obj);
                        }
                        break;
                    case 3:
                        Collections.sort(l, new NamewiseShort());
                        for (Object obj : l) {
                            System.out.println(obj);
                        }
                        break;
                    case 4:
                        Collections.sort(l, new MarkWiseShort());
                        for (Object obj : l) {
                            System.out.println(obj);
                        }
                        break;
                }
                System.out.println(" ");
                System.out.println("would you like to CONTINUE press 1 " + " OR " + " press 5 to EXIT");

                int xc = sc.nextInt();
                if (xc == 5) {
                    break;
                }
            }
            else
            {
                break;
            }
        }while (true) ;
    }
    }

