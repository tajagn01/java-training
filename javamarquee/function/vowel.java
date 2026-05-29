package function;

public class vowel {
    public static boolean isVowel(char c) {
    return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
} 
    public static void main(String[] args){
        char ch ='a';
        System.out.print(isVowel(ch));
    }
}
