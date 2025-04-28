// displays a greeting message
public class Welcome { //class declaration

    void sayHello() { //method declaration (void doesn't return any value)
        System.out.println("Welcome home"); //print statement
    }

    public static void main(String[] args) { //declararion of starter
        (new Welcome()).sayHello(); // starter code
    }
}
