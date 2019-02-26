package designpattern.factorymethod.framework;

/**
 * @author xubingbing xbbjava@163.com
 * @date 2018/8/30 16:07
 */
public abstract class Factory {

    public final Product create(String owner) {
        Product product = createProduct(owner);
        registerProduct(product);
        return product;
    }
    protected abstract Product createProduct(String owner);
    protected abstract void registerProduct(Product product);
}
