package pid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Scanner;

@SpringBootApplication
public class PIDSpringRunner {

    public static void main(String[] args) throws Exception {
        SpringApplication springApplication = new SpringApplication(PIDSpringRunner.class);
        springApplication.setDefaultProperties(Collections.singletonMap("server.port", "9999"));
        springApplication.addListeners(new ApplicationPidFileWriter());
        springApplication.run(args);

        Thread.sleep(7000);

        readPIDFromFile();
    }

    private static void readPIDFromFile() throws Exception {
        File myObj = new File("application.pid  paths...");
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            killProcess(Integer.valueOf(data));
        }
        myReader.close();
    }

    private static void killProcess(Integer processId) throws InterruptedException, IOException {
        Process proc = Runtime.getRuntime().exec("kill -9 " + processId);
        proc.waitFor();
    }


}
