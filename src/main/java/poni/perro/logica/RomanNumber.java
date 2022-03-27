package poni.perro.logica;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RomanNumber {
    
    private final String romanNum;
    private int decimal;
    private RegexDic regexDic;

    public RomanNumber (String roman) {
        this.romanNum = roman;
        regexDic = new RegexDic();
    }

    public String getRoman() {
        return this.romanNum;
    }

    public int getDecimal() {
        return this.decimal;
    }

    public int toDecimal() {
        for (String regex : regexDic.getListValues()) {
            Matcher m = createMatcher(regex);
            Sumatory(m);

        }
        return getDecimal();
    }

    private Matcher createMatcher(String regex) {
           Pattern p = Pattern.compile(regex);
           Matcher matcher = p.matcher(this.romanNum);
            return matcher;
        }

    private void Sumatory(Matcher m) {
        while (m.find()) {
            this.decimal += decimalValue(m.group());
        } 
       
    }
    
    private int decimalValue(String romanNumber) {
       RomanEnum romans = Enum.valueOf(RomanEnum.class, String.valueOf(romanNumber));
       return romans.getDecimalValue();
    }
}
