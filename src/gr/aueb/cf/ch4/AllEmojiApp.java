package gr.aueb.cf.ch4;

public class AllEmojiApp {
    public static void main(String[] args) {
        int emojiStart = 0x1F600;
        int emojiStop = 0x1F64F;
        int i = 0;

        i = emojiStart;
        while (i <= emojiStop){
            System.out.print(Character.toChars(i));
            System.out.print(" ");
            i++;
            if(i%16 == 0) System.out.println();
        }
    }
}
