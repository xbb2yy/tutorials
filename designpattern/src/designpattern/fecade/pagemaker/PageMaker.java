package designpattern.fecade.pagemaker;

import java.io.FileWriter;
import java.util.Properties;

public class PageMaker {
    private PageMaker() {
    }

    public static void makeWelcomePage(String mailAdder, String fileName) {
        try {
            Properties mailProp = Database.getProperties("maildata");
            String username = mailProp.getProperty(mailAdder);
            HtmlWriter writer = new HtmlWriter(new FileWriter(fileName));
            writer.title("welcome to " + username + "'s page");
            writer.paragraph(username + "欢迎来到" + username + "的主页");
            writer.paragraph("等着你的邮件哦！");
            writer.mailTo(mailAdder, username);
            writer.close();
            System.out.println(fileName + " is created for " + mailAdder + " (" + username + ")");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
