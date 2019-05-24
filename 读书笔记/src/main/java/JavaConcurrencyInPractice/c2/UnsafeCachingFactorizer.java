package JavaConcurrencyInPractice.c2;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.math.BigInteger;

public class UnsafeCachingFactorizer extends GenericServlet {

    private long count = 0;

    public long getCount() {
        return count;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        BigInteger bigInteger = extract(servletRequest);
        BigInteger[] factor = factor(bigInteger);
        count++;
        encodeToResponse(servletResponse, factor);
    }

    /**
     * 方法仅做演示，处理逻辑忽略
     * @param request
     * @return
     */
    private BigInteger extract(ServletRequest request) {
        return new BigInteger("10000");
    }

    private BigInteger[] factor(BigInteger bigInteger) {
        return new BigInteger[10];
    }

    private void encodeToResponse(ServletResponse response, BigInteger[] bigIntegers) {}
}
