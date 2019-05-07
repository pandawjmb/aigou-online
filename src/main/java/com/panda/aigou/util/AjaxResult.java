package com.panda.aigou.util;

//import com.sun.org.glassfish.gmbal.Description;这里会报错倒jar包

public class AjaxResult {
    private boolean success = true;//操作是否成功
    private String msg = "操作成功";//返回文本字符串的信息
    private Object data;//返回一个object对象可以方便返回更多的信息！
    public Object getData() {
        return data;
    }
    /*public void setObject(Object object) {
        this.object = object;
    }*/
    public AjaxResult setData(Object object) {
        this.data = object;
        return this;
    }
    /**提供获取对象的实例的方法me（）方法我自己的方法
     * @Author: Panda
     * @Description:
     * @Date: Administrator  * @param null :  0:05  * @return : null 2019/4/21
     */
    public static AjaxResult me(){
        return new AjaxResult();
    }

    /**默认成功的的构造函数
     * @Author: Panda
     * @Description:
     * @Date: Administrator  * @param null :  23:29  * @return : null 2019/4/20
    public AjaxResult() {
    }
    失败的构造函数
     * @Author: Panda
     * @Description:
     * @Date: Administrator  * @param null :  23:30  * @return : null 2019/4/20

    public AjaxResult(String msg) {
        this.success = false;
        this.msg = msg;
    }
     */
    public boolean isSuccess() {
        return success;
    }

  /*  public void setSuccess(boolean success) {
        this.success = success;
    }*/
   public AjaxResult setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public String getMsg() {
        return msg;
    }
    /*public void setMsg(String msg) {
        this.msg = msg;
    }*/
    public AjaxResult setMsg(String msg) {
        this.msg = msg;
        return this;
    }
   /* @Override
    public String toString() {
        return "AjaxResult{" +
                "success=" + success +
                ", msg='" + msg + '\'' +
                '}';
    }*/
    @Override
    public String toString() {
        return "AjaxResult{" +
                "success=" + success +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
