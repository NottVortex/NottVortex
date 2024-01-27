import java.util.Scanner;
public class Decrypt {
    public String dInput;
    private String dOutput = "";
    private Scanner input = new Scanner(System.in);
    private String alpha = " abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789\"+=-_`'~!@#$%^&*()[]{}:;,<.>/?\"";
    private String val = "";
    private int index = 0;
        
    public Decrypt(String dInput){
        this.dInput = dInput;
    }
        
    public void ask(){
        System.out.print("Input any line of text to decrypt: ");
    }
    
    public void setInput(String input){
        dInput = input;
    }
    
    public void dLoop(){
        while(true){
            if(checkInput() == true){
                break;
            }
            System.out.println("Special invalid character detected.");
            ask();
            setInput(input.nextLine());
        }
    }
        
    public boolean checkInput(){
        for(int i = 0;i < dInput.length();i++){
            if(dInput.substring(i, i + 1).equals("|")){
                return false;
            }
        }
        return true;
    }

    public void decryptInput(String[] encryption) {
        while (index < dInput.length()) {
            boolean match = false;
            for (int i = 0; i < encryption.length; i++) {
                if (dInput.startsWith(encryption[i], index)) {
                    dOutput += alpha.charAt(i);
                    index += encryption[i].length();
                    match = true;
                    break;
                }
            }
            if (!match) {
                dOutput += dInput.charAt(index);
                index++;
            }
        }
    }
    
    public String outputDecrypt(){
        return dOutput;
    }
}