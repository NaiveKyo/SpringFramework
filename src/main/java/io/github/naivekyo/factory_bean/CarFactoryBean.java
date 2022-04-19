package io.github.naivekyo.factory_bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author NaiveKyo
 * @version 1.0
 * @description: 使用工厂为 Bean 赋值
 * @since 2022/3/18 20:19
 */
public class CarFactoryBean implements FactoryBean<Car> {
    
    private String carInfo;
    
    @Override
    public Car getObject() throws Exception {
        Car car = new Car();
        String[] properties = carInfo.split(",");

        car.setBrand(properties[0]);
        car.setMaxSpeed(Integer.parseInt(properties[1]));
        car.setPrice(Integer.parseInt(properties[2]));
        
        return car;
    }

    @Override
    public Class<?> getObjectType() {
        return Car.class;
    }

    public String getCarInfo() {
        return carInfo;
    }

    // 接收逗号分隔符设置属性角色
    public void setCarInfo(String carInfo) {
        this.carInfo = carInfo;
    }
}
