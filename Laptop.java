import java.util.Objects;

public class Laptop implements Comparable<Laptop>{
    private String brand;
    private String CPU;
    private int RAM;
    private int storageCapacity;
    private String operationSystem;
    private String color;
    private double monitorDiagonal;
    private String monitorType;

    public Laptop(String brand, String CPU, int RAM, int storageCapacity, String operationSystem, String color, double monitorDiagonal, String monitorType) {
        this.brand = brand;
        this.CPU = CPU;
        this.RAM = RAM;
        this.storageCapacity = storageCapacity;
        this.operationSystem = operationSystem;
        this.color = color;
        this.monitorDiagonal = monitorDiagonal;
        this.monitorType = monitorType;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMonitorDiagonal() {
        return monitorDiagonal;
    }

    public void setMonitorDiagonal(double monitorDiagonal) {
        this.monitorDiagonal = monitorDiagonal;
    }

    public String getMonitorType() {
        return monitorType;
    }

    public void setMonitorType(String monitorType) {
        this.monitorType = monitorType;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return RAM == laptop.RAM && storageCapacity == laptop.storageCapacity && Double.compare(laptop.monitorDiagonal, monitorDiagonal) == 0 && brand.equals(laptop.brand) && CPU.equals(laptop.CPU) && operationSystem.equals(laptop.operationSystem) && Objects.equals(color, laptop.color) && Objects.equals(monitorType, laptop.monitorType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, CPU, RAM, storageCapacity, operationSystem, color, monitorDiagonal, monitorType);
    }

    @Override
    public String toString() {
        return
                "\nBrand: " + brand +
                        "\nCPU: " + CPU +
                        "\nRAM: " + RAM +
                        "\nStorage Capacity: " + storageCapacity +
                        "\nOperation System: " + operationSystem +
                        "\nColor: " + color +
                        "\nMonitor Diagonal: " + monitorDiagonal +
                        "\nMonitorType: " + monitorType + "\n";
    }

    @Override
    public int compareTo(Laptop o) {
        return this.getRAM() - o.getRAM();
    }

}