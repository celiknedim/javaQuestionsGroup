package Questions;

import java.util.Scanner;

// Kullanicidan isim ve soyismini ayri ayri alin
//-isim daha uzun ise isim ve soy ismini ilk harfler buyuk kalanlar kucuk olacak sekilde
//-soyisim daha uzun ise ismi ilk harf buyuk kalanlar kucuk soyismi tum harfler buyuk
//olacak sekilde yazdirin
public class Q36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("tapez votre nom s'il vous plaît");
        String nom = sc.nextLine();
        System.out.println("tapez votre prenom s'il vous plaît");
        String prenom = sc.nextLine();
        String str="";
        if(nom.length()>prenom.length()){

        }
        if(nom.length()<prenom.length()){

        }
        System.out.println(str);
    }
}
