import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("podaj tekst do testów");
        Scanner scanner = new Scanner(System.in);
        String tekst = scanner.next();
        System.out.println("Liczba samoglosek"
                +NarzedziaTekstowe.policzSamogloski(tekst));
        System.out.println("Liczba samoglosek"
                +NarzedziaTekstowe.policzSamogloski(null));
    }
}