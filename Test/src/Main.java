import static java.lang.System.*;

public class Main implements Name, Person{
    public String getName(){
        return Name.super.getName();
    }

    public static void main(String[] args){
        Main p = new Main();
        out.println(p.getName());
    }
}
