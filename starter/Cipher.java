
public abstract class Cipher {
    public abstract char encrypt(char c);
    public abstract char decrypt(char c);
    public String encrypt(String s){
        String encrypted = "";
        for(int i = 0; i < s.length() - 1; i++){
            encrypted += encrypt(s.charAt(i));
        }
        return encrypted;
    }
    public String decrypt(String s){
        String decrypted = "";

        for(int i = 0; i < s.length() - 1; i++){
            decrypted += decrypt(s.charAt(i));
        }
        return decrypted;
    }
    public abstract Cipher newCopy();

}
