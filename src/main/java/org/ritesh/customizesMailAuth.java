package org.ritesh;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class customizesMailAuth extends Authenticator {

    @Override
    protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(MailMetaData.myEmail, MailMetaData.password);
    }
}
