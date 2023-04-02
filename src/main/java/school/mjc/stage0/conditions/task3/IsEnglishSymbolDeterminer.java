package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
        int isEnglish = symbol;
            if ((isEnglish>=65 && isEnglish<=90) || ((isEnglish>=97 && isEnglish<=122)))
                if (symbol=='a' || symbol=='A' 
                || symbol=='i' || symbol=='I' 
                || symbol=='O' || symbol=='O' 
                || symbol=='E' || symbol=='e' 
                || symbol=='U' || symbol=='u' 
                || symbol=='y' || symbol=='Y')
                    System.out.println("Vowel");
                else 
                    System.out.println("Consonant");
            else
                System.out.println("wrong alphabet!");
        }   

}
