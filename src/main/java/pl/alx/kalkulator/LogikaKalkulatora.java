package pl.alx.kalkulator;

public class LogikaKalkulatora {

    public String[] dostepneOperacje() {
        return new String[] { "+", "-", "*" };
    }

    public long oblicz(long liczba1, long liczba2, String operacja) {
        return switch(operacja) {
            case "+" -> liczba1 + liczba2;
            case "-" -> liczba1 - liczba2;
            case "*" -> liczba1 * liczba2;
            case "/" -> dziel(liczba1,liczba2);
            default -> throw new IllegalArgumentException("Nieznana operacja " + operacja);
        };
    }
    public long dziel(long l1, long l2)
    {
        if (l2==0)
            throw new IllegalArgumentException("Nie dziel przez 0");
        return l1/l2;
    }
}
