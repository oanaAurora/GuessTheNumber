/**
 * Created by OanaAurora on 09.05.2018.
 */
public class GuessTheNumber {

    public static void howBgIsMyNumber(int x){
        if(x >=0 && x <= 10){
            System.out.println("the number is pretty small");
        }else if(x >= 11 && x<=100){
            System.out.println("our number is pretty big");
        }else
            System.out.println("our number is out of range");

    }

    public static void main(String[] args){


    }
}
