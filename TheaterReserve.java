package Arr_01;

import java.util.*;

public class TheaterReserve {
    public static void main(String[] args)
    {
        final int size = 10;
        int[] seats = new int[size];

        while(true)
        {
            System.out.println("-----------------");

            for(int i = 0; i < size; i++)
            {
                System.out.print(i + 1 + " ");
            }

            System.out.println("\n-----------------");

            for(int i = 0; i < size; i++)
            {
                System.out.println(seats[i] + " ");
            }

            System.out.println("\n-----------------");

            System.out.print("원하시는 좌석번호를 입력하세요(종료는 -1)");

            Scanner sc = new Scanner(System.in);
            int s = sc.nextInt();

            if(s == -1)
            {
                break;
            }

            if(seats[s-1] == 0)
            {
                seats[s-1] = 1;
                System.out.println("예약이되었습니다.");
            }
            else
            {
                System.out.println("이미 예약된 자리입니다.");
            }
        }
    }
}
