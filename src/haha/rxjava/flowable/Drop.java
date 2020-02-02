package haha.rxjava.flowable;

/**
 * @ClassName Drop
 * @Description 1. 丢弃
 * @Author zhangchao
 * @Date 2020-02-02 09:51
 * @Version 1.0
 */
public interface Drop {
    void request(long n);

    void drop();
}
