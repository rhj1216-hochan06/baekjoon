package test;

import java.util.LinkedList;
import java.util.Scanner;

public class test11866_2 {
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt(); // 인원
      int K = sc.nextInt(); // 번째
      LinkedList<Integer> list = new LinkedList<Integer>();
      StringBuilder sb = new StringBuilder();

      sb.append("<");

      for (int i = 1; i <= N; i++) {
         list.add(i);
      }

      while (!list.isEmpty()) {
         for (int i = 1; i <= N; i++) {
            if (K > i) {
               list.add(list.poll());
            } else if (K == i) {
               if (list.size() == 1) {
                  sb.append(list.poll() + ">");
                  System.out.println(sb);
                  return;
               } else {
                  sb.append(list.poll() + ", ");
                  break;
               }

            }

         } // for end

      } // while end
   }
}