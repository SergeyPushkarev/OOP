package Model;

import java.util.ArrayList;

public class FunctionsComplex implements Calculate {
    public String sum(ArrayList<Number> list) {
        StringBuilder sB = new StringBuilder();
        Integer numA = list.get(0).intValue();
        Integer numB = list.get(1).intValue();
        Integer numA2 = list.get(2).intValue();
        Integer numB2 = list.get(3).intValue();

        if(numB + numB2 > 0){
            sB.append(numA + numA2)
                    .append("+")
                    .append(numB + numB2)
                    .append("i");
        } else if (numB + numB2 < 0) {
            sB.append(numA + numA2)
                    .append(numB + numB2)
                    .append("i");
        } else {
            sB.append(numA + numA2);
        }
        return sB.toString();
    }


    public String subtraction(ArrayList<Number> list) {
        StringBuilder sB = new StringBuilder();
        Integer numA = list.get(0).intValue();
        Integer numB = list.get(1).intValue();
        Integer numA2 = list.get(2).intValue();
        Integer numB2 = list.get(3).intValue();
        if(numB - numB2 > 0){
            sB.append(numA - numA2)
                    .append("+")
                    .append(numB - numB2)
                    .append("i");
        } else if (numB - numB2 < 0) {
            sB.append(numA - numA2)
                    .append(numB - numB2)
                    .append("i");
        } else {
            sB.append(numA - numA2);
        }
        return sB.toString();
    }



    public String multiplication(ArrayList<Number> list) {
        StringBuilder sB = new StringBuilder();
        Integer numA = list.get(0).intValue();
        Integer numB = list.get(1).intValue();
        Integer numA2 = list.get(2).intValue();
        Integer numB2 = list.get(3).intValue();
        if((numA * numB2 - numA2 * numB) > 0){
            sB.append(numA * numA2 - numB * numB2)
                    .append("+")
                    .append(numA * numB2 - numA2 * numB)
                    .append("i");
        } else if ((numA * numB2 - numA2 * numB) < 0) {
            sB.append(numA * numA2 - numB * numB2)
                    .append(numA * numB2 - numA2 * numB)
                    .append("i");
        } else {
            sB.append(numA * numA2 - numB * numB2);
        }
        return sB.toString();
    }


    public String division(ArrayList<Number> list) {
        StringBuilder sB = new StringBuilder();
        Integer numA = list.get(0).intValue();
        Integer numB = list.get(1).intValue();
        Integer numA2 = list.get(2).intValue();
        Integer numB2 = list.get(3).intValue();
        if((numA2 * numB - numA * numB2) > 0){
            sB.append((double) (numA * numA2 + numB * numB2) / (numA2 * numA2 + numB2 * numB2))
                    .append("+")
                    .append((double)(numA2 * numB - numA * numB2) / (numA2 * numA2 + numB2 * numB2))
                    .append("i");
        } else if ((numA2 * numB - numA * numB2) < 0) {
            sB.append((double)(numA * numA2 + numB * numB2) / (numA2 * numA2 + numB2 * numB2))
                    .append((double)(numA2 * numB - numA * numB2) / (numA2 * numA2 + numB2 * numB2))
                    .append("i");
        } else {
            sB.append((double)(numA * numA2 + numB * numB2) / (numA2 * numA2 + numB2 * numB2));
        }
        return sB.toString();
    }
}