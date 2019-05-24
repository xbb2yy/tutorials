package JavaConcurrencyInPractice.c2;

import javax.servlet.*;
import java.io.IOException;
import java.math.BigInteger;

public class StatelessFactorizer extends GenericServlet {

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        BigInteger bigInteger = extract(servletRequest);
        BigInteger[] factor = factor(bigInteger);
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
