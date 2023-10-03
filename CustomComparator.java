import java.util.Comparator;

public class CustomComparator implements Comparator<Laptop> {
    private String filter;

    public CustomComparator(String filter) {
        this.filter = filter;
    }

    @Override
    public int compare(Laptop o1, Laptop o2) {
        return switch (filter) {
            case "RAM" -> o1.getRAM() - o2.getRAM();
            case "Brand" -> o1.getBrand().compareToIgnoreCase(o2.getBrand());
            case "CPU" -> o1.getCPU().compareToIgnoreCase(o2.getCPU());
            case "storageCapacity" -> o1.getStorageCapacity() - o2.getStorageCapacity();
            case "monitorDiagonal" -> (int) (o1.getMonitorDiagonal() - o2.getMonitorDiagonal());
            default -> 0;
        };
    }

}