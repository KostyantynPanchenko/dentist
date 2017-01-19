package gmail.dentist.web.service;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import gmail.dentist.web.controller.HomeController;

@Service
public class MailServiceImpl implements MailService {
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);    
    
    private JavaMailSender mailSender;
    
    @Autowired
    private Environment env;
    
    @Autowired
    public MailServiceImpl(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }
    
    @Override
    public void sendMail(HttpServletRequest request) {
        String name = request.getParameter("name");        
        String from = request.getParameter("from");
        String subject = request.getParameter("subject");
        String message = request.getParameter("message");
        String address = env.getProperty("mail.username");
        
        StringBuilder text = new StringBuilder("Ви отримали лист від ").append(name)
                .append(", email: ").append(from)
                .append("\n")
                .append("Тема: ").append(subject)
                .append("\n\n").append(message);
        
        SimpleMailMessage email = new SimpleMailMessage();
        email.setTo(address);
        email.setSubject(subject);
        email.setText(text.toString());
        
        mailSender.send(email);
        
        StringBuilder sb = new StringBuilder("Successfully sent email\n")
                            .append("to: ").append(address).append("\n")
                            .append("from: ").append(from).append("\n")
                            .append("subject: ").append(subject);
        logger.info(sb.toString());
    }

}
