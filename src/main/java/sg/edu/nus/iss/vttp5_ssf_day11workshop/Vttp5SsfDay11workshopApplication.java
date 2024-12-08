package sg.edu.nus.iss.vttp5_ssf_day11workshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.DefaultApplicationArguments;

@SpringBootApplication
public class Vttp5SsfDay11workshopApplication {

	public static void main(String[] args) {

		SpringApplication app = new SpringApplication(Vttp5SsfDay11workshopApplication.class);
		ApplicationArguments cliOpts = new DefaultApplicationArguments(args);
		
		String port = "3000";
		if (System.getenv("SERVER_PORT") != null) {
            port = System.getenv("SERVER_PORT");
        }
		if (cliOpts.containsOption("port")){
			port = cliOpts.getOptionValues("port").get(0);
		}
		

		app.setDefaultProperties(Collections.singletonMap("server.port", port));

		app.run(args);
	}

}
