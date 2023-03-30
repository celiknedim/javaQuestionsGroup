package Questions;

// String str = "Java candir"; verilen String'deki ilk 'a' harfini 'A' harfi ile degistiren bir program yaziniz.

public class Q32 {
    public static void main(String[] args){
        String str = "Java candir";

        String strNew = str.replaceFirst("a", "A");

        System.out.println(strNew);

    }
}

