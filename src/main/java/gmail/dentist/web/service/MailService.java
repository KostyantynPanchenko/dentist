package gmail.dentist.web.service;

import javax.servlet.http.HttpServletRequest;

public interface MailService {
    void sendMail(HttpServletRequest request);
}
