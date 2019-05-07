package JavaConcurrencyInPractice.c3;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.math.BigInteger;

public class VolatileCachedFactorizer extends GenericServlet {

    private volatile OneValueCache cache = new OneValueCache(null, null);
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        BigInteger bigInteger = extract(req);
        BigInteger[] factors = cache.getFactors(bigInteger);
        if (factors == null) {
            factors = factor(bigInteger);
            cache = new OneValueCache(bigInteger, factors);
        }
        encodeToResponse(res, factors);
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
