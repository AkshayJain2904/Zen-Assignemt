package com.zensar.email;
import java.util.Properties;  
import javax.mail.*;  
import javax.mail.internet.*;  
  
public class SendMailBySite {  
 public static void main(String[] args) {  
  
  String host="smtp.gmail.com";  
  final String user="careerconsultancyzen@gmail.com";//change accordingly  
  final String password="Careercons";//change accordingly  
    
  String to="apandit04@gmail.com";//change accordingly  
  
   //Get the session object  
   Properties prop = new Properties();  
   prop.put("mail.smtp.auth", true);
   prop.put("mail.smtp.starttls.enable", "true");
   prop.put("mail.smtp.host", host);
   prop.put("mail.smtp.port", 587);
		/* prop.put("mail.smtp.ssl.trust", host); */

   Session session = Session.getDefaultInstance(prop,  
    new javax.mail.Authenticator() {  
      protected PasswordAuthentication getPasswordAuthentication() {  
    return new PasswordAuthentication(user,password);  
      }  
    });  
  
   //Compose the message  
    try {  
     MimeMessage message = new MimeMessage(session);  
     message.setFrom(new InternetAddress(user));  
     message.setRecipient(Message.RecipientType.TO,new InternetAddress(to));  
     message.setSubject("email sent using java program");  
     message.setText("Hello brother");  
       
    //send the message  
     Transport.send(message);  
  
     System.out.println("message sent successfully...");  
   
     } catch (MessagingException e) {e.printStackTrace();}  
 }  
}  