package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> A = new ArrayList<>();
        ArrayList<String> B = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5 ; i++) {
            try {
                A.add(bufferedReader.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
            System.out.println(A);
            for (int j = 0; j < 5 ; j++) {
                try {
                    B.add(bufferedReader.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
                System.out.println(B);
                ArrayList <String> C = new ArrayList<>();
                Collections.reverse(B);
                ListIterator<String> IterB = B.listIterator();
                while (IterB.hasNext()) {
                    ListIterator<String> IterA = A.listIterator();
                    while (IterB.hasNext()) {
                        C.add(IterA.next());
                        IterA.remove();
                        break;

                    }
                    C.add(IterB.next());
                }
        System.out.println(C);
             Collections.sort(C, new LengthFirstComparator());
        System.out.println(C);


            }

        }


