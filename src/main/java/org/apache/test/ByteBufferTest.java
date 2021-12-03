package org.apache.test;

import org.junit.jupiter.api.Test;

import java.nio.ByteBuffer;

/**
 * @Author ZhengQinfeng
 * @Date 2021/12/3 23:19
 * @dec
 */
public class ByteBufferTest {
    @Test
    public void testByteBuffer() throws Exception {
        ByteBuffer buffer = ByteBuffer.allocate(10);
        System.out.println(buffer.position());
        System.out.println(buffer.limit());
        buffer.put((byte)1);
        buffer.put((byte) 2);
        buffer.put((byte) 'a');

        System.out.println(buffer.position());
        System.out.println(buffer.limit());

        buffer.flip();

        System.out.println(buffer.position());
        System.out.println(buffer.limit());
    }
}
