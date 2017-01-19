/*
 * Iryna Aleksiychuk personal web portal
 */
package gmail.dentist.web;

/**
 * Starter class.
 * @author Kostyantyn Panchenko
 * @since 08.11.2016
 * @version 1.0
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

import gmail.dentist.web.config.MailConfig;

@SpringBootApplication
@Import(MailConfig.class)
@PropertySource("classpath:mail.properties")
public class DentistApplication {

	public static void main(String[] args) {
		SpringApplication.run(DentistApplication.class, args);
	}	
}
