/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.apache.tomcat.util.net;

/**
 * Defines events that occur per socket that require further processing by the
 * container. Usually these events are triggered by the socket implementation
 * but they may be triggered by the container.
 * 通常这些事件都会被socket 的实现触发 ，但是他们也可能被容器触发
 *
 *  static final 与枚举的区别： 由于每举类中每一个枚举都是一个对象（16个字节）， static final 4个字节
 *
 *
 *  这个类指示如何操作socket
 *
 *  名字叫SocketEvent ,其实就是指示socket的状态
 */
public enum SocketEvent {

    /**
     * Data is available to be read.
     * （16个字节 ）
     */
    OPEN_READ,

    /**
     * The socket is ready to be written to.
     */
    OPEN_WRITE,

    /**
     * The associated Connector/Endpoint is stopping and the connection/socket
     * needs to be closed cleanly.
     */
    STOP,

    /**
     * A timeout has occurred and the connection needs to be closed cleanly.
     * Currently this is only used by the Servlet 3.0 async processing.
     */
    TIMEOUT,

    /**
     * The client has disconnected.
     */
    DISCONNECT,

    /**
     * An error has occurred on a non-container thread and processing needs to
     * return to the container for any necessary clean-up. Examples of where
     * this is used include:
     * <ul>
     * <li>by NIO2 to signal the failure of a completion handler</li>
     * <li>by the container to signal an I/O error on a non-container thread
     *     during Servlet 3.0 asynchronous processing.</li>
     * </ul>
     */
    ERROR,

    /**
     * A client attempted to establish a connection but failed. Examples of
     * where this is used include:
     * <ul>
     * <li>TLS handshake failures</li>
     * </ul>
     */
    CONNECT_FAIL
}
