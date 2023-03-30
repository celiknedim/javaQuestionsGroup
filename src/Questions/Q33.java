package Questions;

// String str = "J1ava2 G9uzel5dir8"; verilen String'deki sayilari silip "Java Guzeldir"
// seklinde yazilmasini saglayan bir program yaziniz.

public class Q33 {
    public static void main(String[] args){
        String str = "J1ava2 G9uzel5dir8";

        String strNew = str.replaceAll("[0-9]", "");

        System.out.println(strNew);

    }
}