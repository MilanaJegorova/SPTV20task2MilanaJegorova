package sptv20task2milanajegorova;

import java.util.Scanner;

public class SPTV20task2MilanaJegorova {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = Integer.parseInt(Integer.toString(number).substring(0,1))
                +Integer.parseInt(Integer.toString(number).substring(1,2))
                +Integer.parseInt(Integer.toString(number).substring(2,3));
            System.out.println(sum);
    }
    
}
