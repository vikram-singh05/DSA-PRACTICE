public class reverse{
    public static void main(String[] args){
        String str = "Hello";
        char[] chars= str.toCharArray();
        for(int i=0; i<chars.length/2; i++){
            char temp = chars[i];
            chars[i] = chars[chars.length-1-i];
            chars[chars.length-1-i] = (char) temp;
        }
        for (int i=0; i<chars.length; i++){
            System.out.print(chars[i]);
        }
    }
}