package qmTools;


import org.python.google.common.util.concurrent.ThreadFactoryBuilder;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;


/**
 * @author maynard.ran
 * @date 2021/07/07
 */
public class Demo {
    // 线程数
    public static final int THREAD_POOL_SIZE = 16;


    public static void main(String[] args) throws InterruptedException {
        // 使用 ThreadFactoryBuilder 创建自定义线程名称的 ThreadFactory
        ThreadFactory namedThreadFactory = new ThreadFactoryBuilder().setNameFormat("hyn-demo-pool-%d").build();

        // 创建线程池，其中任务队列需要结合实际情况设置合理的容量
        ThreadPoolExecutor executor = new ThreadPoolExecutor(THREAD_POOL_SIZE,
                THREAD_POOL_SIZE,
                0L,
                TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(1024),
                namedThreadFactory,
                new ThreadPoolExecutor.AbortPolicy());

//        for (int i = 1; i <= 3; i++) {
//            System.out.println("第" + i + "次发送");
        Thread.sleep(1000);
//            executor.execute(() -> {
        try {
            sendMsg("标题", "正文内容");
        } catch (MessagingException e) {
            e.printStackTrace();
        }
//            });
//        }
        // 关闭线程池
        executor.shutdown();
        executor.awaitTermination(1000L, TimeUnit.SECONDS);
        // 任务执行完毕后打印"Done"
        System.out.println("Done");

    }

    public static void sendMsg(String title, String content) throws MessagingException {
        // 创建Properties 类用于记录邮箱的一些属性
        Properties props = new Properties();
        // 表示SMTP发送邮件，必须进行身份验证
        props.put("mail.smtp.auth", "true");
        //此处填写SMTP服务器
        props.put("mail.smtp.host", "smtp.163.com");
        //端口号，QQ邮箱端口587
        props.put("mail.smtp.port", "25");
        // TODO 此处填写，写信人的账号
        props.put("mail.user", "15324125117@163.com");
        // TODO 此处填写16位STMP口令
        props.put("mail.password", "OZOGFCYFYTCGATTF");
        // 构建授权信息，用于进行SMTP进行身份验证
        Authenticator authenticator = new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                // 用户名、密码
                String userName = props.getProperty("mail.user");
                String password = props.getProperty("mail.password");
                return new PasswordAuthentication(userName, password);
            }
        };
        // 使用环境属性和授权信息，创建邮件会话
        Session mailSession = Session.getInstance(props, authenticator);
        // 创建邮件消息
        MimeMessage message = new MimeMessage(mailSession);
        // 设置发件人
        InternetAddress form = new InternetAddress(props.getProperty("mail.user"));
        message.setFrom(form);
        // TODO 设置收件人的邮箱
        InternetAddress to = new InternetAddress("baosheng.zhang@questmobile.com.cn");
        message.setRecipient(Message.RecipientType.TO, to);
        // 设置邮件标题
        message.setSubject(title);
        // 设置邮件的内容体
        message.setContent(content, "text/html;charset=UTF-8");
        // 发送邮件
        Transport.send(message);
    }
}
