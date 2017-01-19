/*
 * Iryna Aleksiychuk personal web portal
 */
package gmail.dentist.web.controller;

import java.util.concurrent.Callable;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import gmail.dentist.web.service.MailService;

/**
 * Core controller class.
 * @author Kostyantyn Panchenko
 * @since 19.01.2017
 * @version 2.0
 */
@Controller
public class HomeController {
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
    
    @Autowired
    private MailService mailService;

    @PostMapping("/send-a-note")
    public Callable<String> home(HttpServletRequest request) {
        return new Callable<String>() {
            public String call() {
                String view;
                try {
                    mailService.sendMail(request);
                    view = "redirect:/mail-sent-successfully.html";
                } catch (Exception e) {
                    view = "redirect:/mail-sending-error.html";
                    logger.error(e.getMessage());
                }
                return view;
            }
        };        
    }
}
