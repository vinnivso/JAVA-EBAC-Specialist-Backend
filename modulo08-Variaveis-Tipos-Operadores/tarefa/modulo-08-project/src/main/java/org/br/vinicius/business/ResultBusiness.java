package org.br.vinicius.business;

import org.br.vinicius.models.Result;

import java.util.Scanner;

/**
 * @author VINNIVSO
 */
public class
ResultBusiness {
    public static void main(String[] args) {
        System.out.println("Please enter the 4 expected arguments. Separate each value by an ENTER");
        System.out.println("The average is: " + average());
    }

    public static double average() {
        Scanner first = new Scanner(System.in);
        Scanner second = new Scanner(System.in);
        Scanner third = new Scanner(System.in);
        Scanner fourth = new Scanner(System.in);
        double firstInput = first.nextDouble();
        double secondInput = second.nextDouble();
        double thirdInput = third.nextDouble();
        double fourthInput = fourth.nextDouble();

        Result newResult = new Result();
        newResult.setFirstValue(firstInput);
        newResult.setSecondValue(secondInput);
        newResult.setThirdValue(thirdInput);
        newResult.setFourthValue(fourthInput);

        double calculate = (newResult.getFirstValue() + newResult.getSecondValue() + newResult.getThirdValue() + newResult.getFourthValue()) / 4;
        return calculate;
    }
}
