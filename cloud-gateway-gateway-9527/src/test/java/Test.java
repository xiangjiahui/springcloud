import java.time.ZonedDateTime;

/**
 * @author xjh
 * @date 2022/1/14 16:36
 */

public class Test {

    @org.junit.Test
    public void show(){
        ZonedDateTime now = ZonedDateTime.now();    //用指定时区获取当前时间
        System.out.println(now);
    }

}
