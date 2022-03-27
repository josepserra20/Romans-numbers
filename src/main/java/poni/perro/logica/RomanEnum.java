package poni.perro.logica;

public enum RomanEnum {
    I(1), V(5), X(10), L(50), C(100), D(500), M(1000),
    CD(400), CM(900), XL(40), XC(90), IV(4), IX(9);

    private int DecimalValue; 

    private RomanEnum(int decimalvalue) {
        this.DecimalValue = decimalvalue;
    }

    public int getDecimalValue() {
        return this.DecimalValue;
    }

}
