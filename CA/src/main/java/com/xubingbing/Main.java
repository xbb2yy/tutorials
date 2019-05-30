package com.xubingbing;

import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.crypto.util.PublicKeyFactory;
import org.bouncycastle.pkcs.PKCS10CertificationRequest;

import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.RSAPublicKeySpec;

public class Main {

    public static void main(String[] args) {

        byte[] der = Base64.decode("MIIBcjCB3AIBADAaMRgwFgYDVQQDEw80NjAwMDc3MDEzNzAzNjAwgZ8wDQYJKoZIhvcNAQEBBQADgY0AMIGJAoGBAIScjmQOW3kX0W+/8u4e8XHH+XTI8H3LhgBCxCocNDluH1K+dJFLSdp/rTe1rI+k6krop9A6mioPubQrnkdhKc/H2NzLxWJwggCmgd79zUJPqvP32oL3EdKmE1uco2rKEvxzKZZcrDLQxT8NZaTMQ7JRLFDNWBtv2U+mpb14cgfPAgMBAAGgGTAXBgkqhkiG9w0BCQcxChMIMTIzNDU2NzgwDQYJKoZIhvcNAQEFBQADgYEAd8CvB/ZGOSwWTjTE5dHceqt4+iihapYoymvf0kCwQggVRFa2ANgmC4aPFrHdNHfvf+5RV3iUzwbvUay54rmAYkCvYkRdgqYITyXVv/jYw+RO1sMNgaFYT7loDFvRYVCuzoQn2mZtMapf5L6lJ0oSiHWIY5UiPlLOYj6jgGgrNDA=");
        PKCS10CertificationRequest p10 = null;
        String publicKey = null;
        try {
            p10 = new PKCS10CertificationRequest(der);
            SubjectPublicKeyInfo pkInfo = p10.getSubjectPublicKeyInfo();
            RSAKeyParameters rsa = (RSAKeyParameters) PublicKeyFactory.createKey(pkInfo);
            RSAPublicKeySpec rsaSpec = new RSAPublicKeySpec(rsa.getModulus(), rsa.getExponent());
            KeyFactory kf = KeyFactory.getInstance("RSA");
            PublicKey rsaPub = kf.generatePublic(rsaSpec);
            publicKey = Base64.encode(rsaPub.getEncoded());
            System.out.println(publicKey);
        } catch (Exception e) {
            e.printStackTrace();

        }

    }


}
