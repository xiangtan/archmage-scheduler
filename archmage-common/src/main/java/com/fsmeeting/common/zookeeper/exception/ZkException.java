package com.fsmeeting.common.zookeeper.exception;

/**
 * 
 *
 * @author yicai.liu
 * @date 2017年1月14日 下午12:05:25
 *
 */
public class ZkException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public ZkException() {
	super();
    }

    public ZkException(String message) {
	super(message);
    }

    public ZkException(String message, Throwable cause) {
	super(message, cause);
    }

    public ZkException(Throwable cause) {
	super(cause);
    }

}
