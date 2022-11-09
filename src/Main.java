import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Note note1 = new Note("name1", "text2");
//        note1.setText("text6");

//        System.out.println("Hello, world!");
//        Scanner s = new Scanner(System.in);
//        var str = s.nextLine();

        int code = Authentification.authenticate();
        if(code==0) {
            System.out.println("Login success");
        }else{
            System.out.println("No access");
        }
    }
}
