package org.br.vinicius.business;

import org.br.vinicius.models.Result;

import java.util.Scanner;

/**
 * @author VINNIVSO
 */
public class ResultBusiness {
    public static void main(String[] args) throws Exception {
        System.out.println("Please enter the 4 expected arguments. Separate each value by an ENTER");
        System.out.println("The student is " + finalResult());
    }

    public static Double average() throws Exception {
        try {
            Scanner first = new Scanner(System.in);
            Scanner second = new Scanner(System.in);
            Scanner third = new Scanner(System.in);
            Scanner fourth = new Scanner(System.in);
            Double firstInput = first.nextDouble();
            if (firstInput.isNaN() || firstInput < 0) {
                throw new Exception("Error in first argument");
            }
            Double secondInput = second.nextDouble();
            if (secondInput.isNaN() || secondInput < 0) {
                throw new Exception("Error in second argument");
            }
            Double thirdInput = third.nextDouble();
            if (thirdInput.isNaN() || thirdInput < 0) {
                throw new Exception("Error in third argument");
            }
            Double fourthInput = fourth.nextDouble();
            if (fourthInput.isNaN() || fourthInput < 0) {
                throw new Exception("Error in fourth argument");
            }
            Result newResult = new Result();
            newResult.setFirstValue(firstInput);
            newResult.setSecondValue(secondInput);
            newResult.setThirdValue(thirdInput);
            newResult.setFourthValue(fourthInput);

            return (newResult.getFirstValue() + newResult.getSecondValue() + newResult.getThirdValue() + newResult.getFourthValue()) / 4;
        }   catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String finalResult() {
        try {
            Double value = average();
            if (value >= 7 && value <= 10) {
                return "Student approved." + "\nResult: "+value;
            } else if (value >= 5 && value < 7) {
                return "Student Eligible to Educational Recovery." + "\nResult: "+value;
            } else if (value >= 0 && value < 5) {
                return "Student Disapproved" + "\nResult: "+value;
            } else {
                return "The value of" + value + "needs to be greater than or equal to 0";
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
