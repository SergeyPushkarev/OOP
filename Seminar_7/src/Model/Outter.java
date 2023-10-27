package Model;

import View.Text;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Outter implements Logger{
    private List<String> history = new ArrayList<>();
    @Override
    public String dateTime() {
        DateFormat dateF = new SimpleDateFormat("dd-MM-yyyy HH:mm - ");
        Calendar cal = Calendar.getInstance();
        String time = dateF.format(cal.getTime());
        return time;
    }

    @Override
    public void writeHistory(String result) {
        history.add(result);
    }

    @Override
    public void readHistory() {
        System.out.println();
        if(history.isEmpty()){
            Text.noCalculations();
        } else {
            for (String item : history) {
                System.out.println(item);
            }
        }
        System.out.println();
    }

}