public class NarzedziaTekstowe {

    public static int policzSamogloski(String tekst){
        String samogloski = "aeuioąęóyAĄEĘYUIOÓ";
        int liczbaSamoglosek = 0;
        if(tekst == null)
            return liczbaSamoglosek;
        for (int i = 0; i < tekst.length(); i++) {
            if(samogloski.indexOf(tekst.charAt(i))>-1){
                liczbaSamoglosek++;
            }
        }
        return liczbaSamoglosek;
    }

    public static String usunPowtorzenia(String tekst){
        String tekstbez ="";
        if(tekst == null)
            return tekstbez;
        if(tekst.length()<1)
            return tekstbez;
        tekstbez = tekstbez+tekst.charAt(0);
        for (int i = 1; i < tekst.length(); i++) {
            if(tekst.charAt(i) != tekst.charAt(i-1)){
                tekstbez = tekstbez+tekst.charAt(i);
            }
        }
        return tekstbez;
    }
}
