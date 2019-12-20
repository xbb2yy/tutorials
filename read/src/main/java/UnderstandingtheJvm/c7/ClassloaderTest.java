package UnderstandingtheJvm.c7;

import java.io.IOException;
import java.io.InputStream;

public class ClassloaderTest {

    public static void main(String[] args) throws Exception {
        ClassLoader my = new ClassLoader() {
            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                String fileName = name.substring(name.lastIndexOf(".") + 1) + ".class";
                InputStream stream = getClass().getResourceAsStream(fileName);
                if (stream == null) {
                    return super.loadClass(name);
                }
                try {
                    byte[] b = new byte[stream.available()];
                    stream.read(b);
                    return defineClass(name, b, 0, b.length);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return super.loadClass(name);
            }
        };

        Object obj = my.loadClass("UnderstandingtheJvm.c7.ConstClass").newInstance();
        System.out.println(obj.getClass());
        System.out.println(obj instanceof UnderstandingtheJvm.c7.ConstClass);
    }
}
