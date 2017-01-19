package gmail.dentist.web.service;

import javax.servlet.http.HttpServletRequest;

/**
 * MailService interface.
 * @author Kostyantyn Panchenko
 * @since 19.01.2017
 * @version 1.0
 */
public interface MailService {
    void sendMail(HttpServletRequest request);
}
