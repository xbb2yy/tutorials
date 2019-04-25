package com.xubing.util;

import com.google.zxing.*;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

//解析读取二维码图片信息
public class ReadQRCode {

    public static void main(String[] args) {
        MultiFormatReader formatReader = new MultiFormatReader();
        // 二维码图片位置
        File file = new File("h:/a.jpg");
        // 读取图片
        BufferedImage image = null;
        try {
            image = ImageIO.read(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        BinaryBitmap binaryBitmap = new BinaryBitmap(new HybridBinarizer(new BufferedImageLuminanceSource(image)));
        // 定义二维码的参数
        HashMap hints = new HashMap();
        //设置编码字符集
        hints.put(EncodeHintType.CHARACTER_SET, "utf-8");

        //处理读取结果
        Result result = null;
        try {
            result = formatReader.decode(binaryBitmap, hints);
        } catch (NotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("解析结果：" + result.toString());
        System.out.println("二维码格式类型：" + result.getBarcodeFormat());
        System.out.println("二维码文本内容：" + result.getText());


    }

}
