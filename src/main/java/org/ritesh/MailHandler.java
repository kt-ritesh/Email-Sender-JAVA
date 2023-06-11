package org.ritesh;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class MailHandler {
    void sendMail(){
    Properties sysProperties = System.getProperties();//this give me a hashTable/ Hashmap
        System.out.println(sysProperties);

        sysProperties.put("mail.smtp.host", MailMetaData.HostServer);
        sysProperties.put("mail.smtp.port", MailMetaData.port);
        sysProperties.put(MailMetaData.sslProperty, "true");
        sysProperties.put(MailMetaData.authPer, "true");

        // Creating a session sender-main
        Authenticator mailAuthenticator = new customizesMailAuth();
        Session mailSession = Session.getInstance(sysProperties, mailAuthenticator);

        //mime massage builder
        MimeMessage newMassage = new MimeMessage(mailSession);
        try {
            newMassage.setFrom(MailMetaData.myEmail);
            newMassage.setSubject(MailMetaData.Sub);
            newMassage.setText(MailMetaData.mess);

            //setting the receiver
            Address receiversEmail = new InternetAddress(MailMetaData.receiverEmail);


            newMassage.setRecipient(Message.RecipientType.TO, receiversEmail);

            Transport.send(newMassage);
        }catch (Exception e){
            System.out.println(e);
        }


    }
}
