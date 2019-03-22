package com.xubing;

import org.apache.commons.codec.binary.Base32;
import org.junit.Test;

import java.time.LocalTime;

public class JunitTest {

    //当测试authTest时候，把genSecretTest生成的secret值赋值给它
    private static String secret="R2Q3S52RNXBTFTOM";

    @Test
    public void test() {
        String qrcode = GoogleAuthenticator.getQRBarcode("983126@qq.com", secret);
        System.out.println("qrcode:" + qrcode + ",key:" + secret);
    }


    // public static void main(String[] args) {
//     secret = OtpUtil3.generateSecretKey(); 
//     // 把这个qrcode生成二维码，用google身份验证器扫描二维码就能添加成功 
//     String qrcode = OtpUtil3.getQRBarcode("983126@qq.com", secret); 
//     System.out.println("qrcode:" + qrcode + ",key:" + secret); 
//     System.out.println("########################################"); 
//     long code = 251665; 
//     long t = System.currentTimeMillis(); 
//     OtpUtil3 ga = new OtpUtil3(); 
//     ga.setWindowSize(5); 
//     boolean r = ga.check_code(secret, code, t); 
//     System.out.println("检查code是否正确？" + r); 
//}

    /**
     *  
     *  * 对app的随机生成的code,输入并验证 
     *  * WindowSize5 动态密码3分钟
     *  * WindowSize4 动态密码2.5分钟
     *  * WindowSize3 动态密码2分钟
     *  * WindowSize2 动态密码1.5分钟
     *  * WindowSize1 动态密码1分钟
     *  
     */
    @Test
    public void verifyTest() {
        long code = 72242; //34:55
        long t = System.currentTimeMillis();
        System.out.println(LocalTime.now());
        GoogleAuthenticator ga = new GoogleAuthenticator();
        ga.setWindowSize(3);
        boolean r = ga.check_code(secret, code, t);
        System.out.println("检查code是否正确？" + r);
    }

    @Test
    public void test1() {
        System.out.println(GoogleAuthenticator.generateSecretKey());
    }

    public static void main(String[] args) throws Exception{
        Base32 codec = new Base32();
        byte[] decodedKey = codec.decode(secret);
        System.out.println(LocalTime.now());
        int i = GoogleAuthenticator.verify_code(decodedKey, System.currentTimeMillis() / 1000 / 30);
        System.out.println(i);

        System.out.println(3300 / 1000 / 30);

    }

}