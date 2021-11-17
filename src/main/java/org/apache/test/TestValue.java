package org.apache.test;

import org.apache.catalina.connector.Request;
import org.apache.catalina.connector.Response;
import org.apache.catalina.valves.RequestFilterValve;
import org.apache.juli.logging.Log;

import javax.servlet.ServletException;
import java.io.IOException;

/**
 * @Author ZhengQinfeng
 * @Date 2021/11/17 23:46
 * @dec
 */
public class TestValue extends RequestFilterValve {
    @Override
    public void invoke(Request request, Response response) throws IOException, ServletException {
        System.out.println("test value : " + request.getContextPath());

        // 调用下一个阈门
        getNext().invoke(request, response);
    }

    @Override
    protected Log getLog() {
        return null;
    }
}
