package Questions;
// iki urunun fiyatini toplayip yazdiran bir program yazdirin
public class Q34 {
    public static void main(String[] args){

        String str1 = "ilk urunun fiyati 1250 tl";
        String str2 = "ikinci urunun fiyati 2500 tl";
        int num1 = Integer.parseInt(str1.replaceAll("[^0-9]", ""));
        int num2 = Integer.parseInt(str2.replaceAll("[^0-9]", ""));


        // String str1 = "ilk urunun fiyati 1250.50 tl";
        // String str2 = "ikinci urunun fiyati 2500.50 tl";
        // double num1 = Double.parseDouble(str1.replaceAll("[^0-9.]", ""));
        // double num2 = Double.parseDouble(str2.replaceAll("[^0-9.]", ""));

        System.out.println( num1 + num2 );
    }
}
