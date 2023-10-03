import java.util.ArrayList;
import java.util.List;

public class HardwareStore {
    List<Laptop> laptops = new ArrayList<>();

    public HardwareStore() {
    }

    public HardwareStore(Laptop laptop) {
        addLaptop(laptop);
    }

    public void addLaptop(Laptop laptop) {
        this.laptops.add(laptop);
    }

    public List<Laptop> filterByUserInput(String field, String filter) {
        List<Laptop> result = new ArrayList<>();
        switch (field) {
            case "Brand":
                for (Laptop value : this.laptops) {
                    if (value.getBrand().equals(filter)) {
                        result.add(value);
                    }
                }
                break;
            case "CPU":
                for (Laptop laptop : this.laptops) {
                    if (laptop.getCPU().equals(filter)) {
                        result.add(laptop);
                    }
                }
                break;
            case "RAM":
                try {
                    for (Laptop value : this.laptops) {
                        if (value.getRAM() == Integer.parseInt(filter)) {
                            result.add(value);
                        }
                    }
                } catch (NumberFormatException e){
                    System.out.printf("%s is not a number",filter);
                }
                break;
            case "storageCapacity":
                try {

                    for (Laptop laptop : this.laptops) {
                        if (laptop.getStorageCapacity() == (Integer.parseInt(filter))) {
                            result.add(laptop);
                        }
                    }
                }catch (NumberFormatException e){
                    System.out.printf("%s is not a number",filter);
                }break;
            case "operationSystem":
                for (Laptop laptop : this.laptops) {
                    if (laptop.getOperationSystem().equals(filter)) {
                        result.add(laptop);
                    }
                }break;
            case "color":
                for (Laptop laptop : this.laptops) {
                    if (laptop.getColor().equals(filter)) {
                        result.add(laptop);
                    }
                }break;
            case "monitorDiagonal":
                try {
                    for (Laptop laptop : this.laptops) {
                        if (laptop.getMonitorDiagonal() == Integer.parseInt(filter)) {
                            result.add(laptop);
                        }
                    }
                } catch (NumberFormatException e){
                    System.out.printf("%s is not a number",filter);
                }break;
            case "monitorType":
                for (Laptop laptop : this.laptops) {
                    if (laptop.getMonitorType().equals(filter)) {
                        result.add(laptop);
                    }
                }break;
        }
        return result;
    }

    public List<Laptop> getLaptops() {
        return laptops;
    }

    @Override
    public String toString() {
        return "HardwareStore{" +
                "laptops=" + laptops +
                '}';
    }
}