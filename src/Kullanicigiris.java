import java.util.Scanner;

public class Kullanicigiris {
    public static void main(String[] args) {
        String username,password,newPassword ;
        int secim ;
        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı adınızı giriniz: ");
        username = input.nextLine();
        System.out.print("Şifrenizi giriniz: ");
        password = input.nextLine();
        if(username.equals("patika")&& password.equals("java123")){
            System.out.println("Giriş yaptınız.");
        }else {
            System.out.println("Bilgileriniz yanlış!");}
        System.out.print("Sifrenizi sıfırlamak ister misiniz? " +
                "\nSeçiminiz evet ise 1'e, hayır ise lütfen 2'ye basınız: ");
        secim = input.nextInt();
        input.nextLine();
        switch(secim) {
            case 1:
                System.out.print("Lütfen yeni bir şifre belirleyiniz: ");
                newPassword = input.nextLine();
                if(newPassword.equals("java123")) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz! ");

                }else{
                    System.out.println("Şifre oluşturuldu, yeni şifreniz: " +newPassword);
                }
                break;
            case 2:
                System.out.println("O halde şifrenizi tekrar giriniz.");
                break;
        }
    }
}