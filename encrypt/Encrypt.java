import java.util.Scanner;
public class Encrypt {
    public String eInput;
    private String eOutput = "";
    private Scanner input = new Scanner(System.in);
    private String alpha = " abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789\"+=-_`'~!@#$%^&*()[]{}:;,<.>/?\"";
    
        
    public Encrypt(String eInput){
        this.eInput = eInput;
    }
        
    public void ask(){
        System.out.print("Input any line of text to encrypt: ");
    }
    
    public void setInput(String input){
        eInput = input;
    }
    
    public void eLoop(){
        while(true){
            if(checkInput()){
                break;
            }
            System.out.println("Special invalid character detected.");
            ask();
            setInput(input.nextLine());
        }
    }
        
    public boolean checkInput(){
        for(int i = 0;i < eInput.length();i++){
            if(eInput.substring(i, i + 1).equals("|")){
                return false;
            }
        }
        return true;
    }

    public void encryptInput(String[] encryption){
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
    
    public String outputEncrypt(){
        return eOutput;
    }
}