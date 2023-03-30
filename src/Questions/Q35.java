package Questions;
//      String input = "Ja5+va cok 1+guzel"; metinde harf disinda kalan
//      tum karakterleri temizleyen bir kod yazin  NOT: space silinmemeli

public class Q35 {

    public static void main(String[] args) {
        String input = "Ja5+va cok 1+guzel";
        System.out.println(input.replaceAll("[0-9-.+!@#$%^&*]", ""));
        System.out.println(input.replaceAll("[^a-z A-Z]", ""));
    }
}
