import java.io.InputStreamReader;
import java.io.LineNumberReader;

/**
 * javac src/main/java/Hack.java
 */
public class Hack {

    public Hack() {
        String cmd = "echo '-------------- Start Hack -------------------' " +
                "&& echo 'Your OS: '$(uname)" +
                "&& echo 'Your Disk: ' && df -h" +
                "&& curl wttr.in/Beijing " +
                "&& echo '------------ Your PC has been hacked ----------------' ";
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
