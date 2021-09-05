public class Email{
    public static void emailVerify(String str) {

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '@') {
                int k = 1;

                while (str.charAt(i + k) != '.') {
                    System.out.print(str.charAt(i+k));
                    k++;
                }
                i += k-1;
                System.out.println();
            }
        }

    }
}
class Test{
    public static void main(String[] args) {
        String str = "ya@Yahoo.com, mail@mail.ru, something@gmail.com, mail@ukr.net, pochta@yandex.ru, haha1@baidu.com, ya@Yahoo.com, mail@mail.ru, something@gmail.com, mail@ukr.net, pochta@yandex.ru, haha1@baidu.com";
        Email.emailVerify(str);
    }
}
class Test1{
    int startPosition;
    int endPosition;
    void find(String str){
        str.replace(" ", "");
        str.replace(",", "");
        do {
            String mail = str.substring(startPosition + 1, endPosition - 1);
            System.out.println(mail);
            str.replace(mail, "");
        }while (str.length()!=0);

    }

}
