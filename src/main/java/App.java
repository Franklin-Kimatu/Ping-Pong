import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
// this carries the user interface.
public class App {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("I am a ping pong application");
        System.out.println("Enter a number:");
        try{
            String stringUserNumber= bufferedReader.readLine();
            int intUserNumber = Integer.parseInt(stringUserNumber);
            PingPong pingpong = new PingPong();
            ArrayList<Object> pingpongresult = pingpong.runPingPong(intUserNumber);
            System.out.println(pingpongresult);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
