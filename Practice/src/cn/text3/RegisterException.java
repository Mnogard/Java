package cn.text3;

// 业务逻辑异常
public class RegisterException extends Exception {
    /*
     * 空参构造
     */
    public RegisterException() {
    }

    /*
     *
     * @param message 表示异常提示
     */
    public RegisterException(String message) {
        super(message);
    }
}