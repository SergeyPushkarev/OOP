import java.util.ArrayList;

public class GenBox<T> {
    T obj;
    public GenBox(T obj) {
        this.obj = obj;
    }

    public boolean isTypeAString() {
        return this.obj instanceof String;
    }

    public boolean isTypeImplementANumber() {
        return this.obj instanceof Number;
    }

    public Integer returnIntegerPart() {
        return Integer.parseInt(this.obj.toString());
    }
    public Double returnDouble() {
        return Double.parseDouble(this.obj.toString());
    }

    private StringBuilder returnBinary(Integer num) {
        StringBuilder result = new StringBuilder();
        while (num != 0) {
            result.insert(0, num % 2);
            num /= 2;
        }
        return result;
    }
    private ArrayList<String> returnListNumber(){
        ArrayList<String> listNumber = new ArrayList<>();
        for (Integer i=0;i<10;i++) {
            listNumber.add(i.toString());
        }
        return  listNumber;
    }

    public String transferToBinaryNotation() {
        StringBuilder result = new StringBuilder();
        if(isTypeAString()) {
            StringBuilder resultDecimal = new StringBuilder();
            char[] arrChar = this.obj.toString().toCharArray();
            ArrayList<String> listNumber = returnListNumber();
            String charStrTemp = "";

            for (char item : arrChar) {
                charStrTemp = Character.toString(item);
                if(listNumber.contains(charStrTemp)) {
                    StringBuilder tempStr = returnBinary(Integer.parseInt(charStrTemp));
                    resultDecimal.append(tempStr);
                }
                else {
                    StringBuilder tempStr = returnBinary(Integer.parseInt(CharNumbering.valueOf(charStrTemp).getNumber()));
                    resultDecimal.append(tempStr);
                }
            }

            result.append(resultDecimal);
        }
        else {
            int intPart = returnIntegerPart();
            int intPartTemp = intPart;
            double fullValue = returnDouble();

            result = returnBinary(intPartTemp);

            StringBuilder floatResult = new StringBuilder();
            double floatPart = fullValue-intPart;
            if (floatPart != 0) {
                while (floatPart != 0) {
                    floatPart *= 2;
                    if (floatPart >= 1) {
                        floatResult.insert(0, "1");
                        floatPart -= 1;
                    }
                }
                floatResult.insert(0, ".0");
                result.append(floatResult);
            }
        }

        return result.toString();
    }
}