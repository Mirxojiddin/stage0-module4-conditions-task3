package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        int isEnglish = character; 
        if ((isEnglish>=65 && isEnglish<=90) || ((isEnglish>=97 && isEnglish<=122)))
            if (character=='a' || character=='A' 
            || character=='i' || character=='I' 
            || character=='o' || character=='O' 
            || character=='e' || character=='E' 
            || character=='u' || character=='U' 
            || character=='y' || character=='Y')
                System.out.println("Vowel");
            else 
                System.out.println("Consonant");
        else
            System.out.println("wrong alphabet!");
    
    
    
        
    }
}
