package com.tiv.design.patterns.creational.builder;

/**
 * 汽车
 */
public class Car {

    private String wheel;

    private String dashboard;

    private String seat;

    private String engine;

    private String door;

    // 私有构造方法 参数是建造者内部类
    private Car(builder builder) {
        this.wheel = builder.wheel;
        this.dashboard = builder.dashboard;
        this.seat = builder.seat;
        this.engine = builder.engine;
        this.door = builder.door;
    }

    public String getWheel() {
        return wheel;
    }

    public void setWheel(String wheel) {
        this.wheel = wheel;
    }

    public String getDashboard() {
        return dashboard;
    }

    public void setDashboard(String dashboard) {
        this.dashboard = dashboard;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheel='" + wheel + '\'' +
                ", dashboard='" + dashboard + '\'' +
                ", seat='" + seat + '\'' +
                ", engine='" + engine + '\'' +
                ", door='" + door + '\'' +
                '}';
    }

    /**
     * 建造者
     */
    public static class builder {

        private String wheel;

        private String dashboard;

        private String seat;

        private String engine;

        private String door;

        public builder wheel(String wheel) {
            this.wheel = wheel;
            return this;
        }

        public builder dashboard(String dashboard) {
            this.dashboard = dashboard;
            return this;
        }

        public builder seat(String seat) {
            this.seat = seat;
            return this;
        }

        public builder engine(String engine) {
            this.engine = engine;
            return this;
        }

        public builder door(String door) {
            this.door = door;
            return this;
        }

        public Car build() {
            return new Car(this);
        }

    }

}
