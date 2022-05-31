package chapters.chapter5.ifSwitch;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class IfElse {
    public static void main(String[] args) {
        int month = 4;
        String season;
        if (month == 12 || month == 1 || month == 2)
            season = " Ձմեռ ";
        else if (month == 3 || month == 4 || month == 5)
            season = " Գարուն";
        else if (month == 6 || month == 7 || month == 8)
            season = " Ամառ ";
        else if (month == 9 || month == 11 || month == 12)
            season = " Աշուն ";
        else
            season = " Հորինված ամիս է";
        System.out.println("Ապրիլը " + season + " է");

    }
}
