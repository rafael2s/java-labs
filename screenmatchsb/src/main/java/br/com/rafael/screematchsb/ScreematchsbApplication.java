package br.com.rafael.screematchsb;

import br.com.rafael.screematchsb.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreematchsbApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreematchsbApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        Principal principal = new Principal();
        principal.exibeMenu();
    }
}
