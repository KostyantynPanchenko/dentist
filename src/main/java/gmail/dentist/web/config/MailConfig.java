package gmail.dentist.web.config;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@Configuration
public class MailConfig {       
    
    @Autowired
    private Environment env;

    @Bean
    public JavaMailSenderImpl mailSender() {
        JavaMailSenderImpl sender = new JavaMailSenderImpl();
        sender.setHost(env.getProperty("mail.host"));
        sender.setPort(Integer.valueOf(env.getProperty("mail.port")));
        sender.setUsername(env.getProperty("mail.username"));
        sender.setPassword(env.getProperty("mail.password"));
        
        Properties props = new Properties();
        props.put("mail.smtp.auth", Boolean.valueOf(env.getProperty("mail.smtp.auth")));
        props.put("mail.smtp.socketFactory.port", Integer.valueOf(env.getProperty("mail.smtp.socketFactory.port")));
        props.put("mail.smtp.socketFactory.class", env.getProperty("mail.smtp.socketFactory.class"));
        props.put("mail.smtp.port", Integer.valueOf(env.getProperty("mail.smtp.port")));
        sender.setJavaMailProperties(props);
        
        return sender;
    }
}
