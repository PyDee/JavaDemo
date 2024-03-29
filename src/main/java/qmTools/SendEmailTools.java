package qmTools;


// email 依赖

import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.*;
import java.util.Properties;


public class SendEmailTools {
    private static final String HOST = MailConfig.host;
    private static final Integer PORT = MailConfig.port;
    private static final String USERNAME = MailConfig.userName;
    private static final String PASSWORD = MailConfig.passWord;
    private static final String emailForm = MailConfig.emailForm;
    private static final String timeout = MailConfig.timeout;
    private static final String personal = MailConfig.personal;
    private static final String subject = MailConfig.subject;
    private static final String html = MailConfig.html;
    private static JavaMailSenderImpl mailSender = createMailSender();

    public static void main(String[] args) throws Exception {
//        sendMail("baosheng.zhang@questmobild.com.cn", html);
        readConfig();
    }

    /**
     * 邮件发送器
     *
     * @return 配置好的工具
     */
    private static JavaMailSenderImpl createMailSender() {
        JavaMailSenderImpl sender = new JavaMailSenderImpl();
        sender.setHost(HOST);
        sender.setPort(PORT);
        sender.setUsername(USERNAME);
        sender.setPassword(PASSWORD);
        sender.setDefaultEncoding("Utf-8");
        Properties p = new Properties();
        p.setProperty("mail.smtp.timeout", timeout);
        p.setProperty("mail.smtp.auth", "false");
        sender.setJavaMailProperties(p);
        return sender;
    }

    /**
     * 发送邮件
     *
     * @param to   接受人
     *             //     * @param subject 主题
     * @param html 发送内容
     * @throws MessagingException           异常
     * @throws UnsupportedEncodingException 异常
     */
    public static void sendMail(String to, String html) throws MessagingException, UnsupportedEncodingException {
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        // 设置utf-8或GBK编码，否则邮件会有乱码
        MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage, true, "UTF-8");
        messageHelper.setFrom(emailForm, personal);
        messageHelper.setTo(to);
        messageHelper.setSubject(subject);
        messageHelper.setText(html, true);
//      messageHelper.addAttachment("", new File(""));//附件
        mailSender.send(mimeMessage);
    }

    // todo 自己实现的读取配置文件 方法
    public static void readConfig() throws Exception {
        InputStream inputStream = SendEmailTools.class.getClassLoader().getResourceAsStream("common.properties");
        Properties pros = new Properties();
        pros.load(inputStream);
        String email_host = pros.getProperty("email_host");
        System.out.println(email_host);

    }


}


