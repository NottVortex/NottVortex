import java.util.Scanner;
public class encrypt {
    public static String eInput;
    private static String eOutput = "";
    private static Scanner input = new Scanner(System.in);
    private static String alpha = " abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789\"+=-_`'~!@#$%^&*()[]{}:;,<.>/?\"";
    
        
    public Encrypt(String eInput){
        this.eInput = eInput;
    }
        
    public static void ask(){
        System.out.print("Input any line of text to encrypt: ");
    }
    
    public static void setInput(String input){
        eInput = input;
    }
    
    public static void eLoop(){
        while(true){
            if(checkInput() == true){
                break;
            }
            System.out.println("Special invalid character detected.");
            ask();
            setInput(input.nextLine());
        }
    }
        
    public static boolean checkInput(){
        for(int i = 0;i < eInput.length();i++){
            if(eInput.substring(i, i + 1).equals("|")){
                return false;
            }
        }
        return true;
    }

    public static void encryptInput(String[] encryption){
        int currentLetterIndex;
        String currentLetter;
        for (int i = 0; i < eInput.length(); i++) {
            currentLetter = eInput.substring(i, i + 1);
            currentLetterIndex = alpha.indexOf(currentLetter);
            if (currentLetterIndex != -1) {
                eOutput += encryption[currentLetterIndex];
            } else {
                System.out.println("current character " + currentLetter + " is not found in var alpha");
            }
        }
    }
    
    public static String outputEncrypt(){
        return eOutput;
    }
}