package cn.object.Interface;

/*
默认方法：
public default 返回值类型 方法名称（参数列表）{
    方法体
}

接口中的默认方法，可以解决接口升级的问题
 */
public interface MyInterfaceDefault {

    public default void fly(){
        System.out.println("天上飞");
    }
}
