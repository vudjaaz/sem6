import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //init laptops
        Laptop lt1 = new Laptop("MSI", "Intel", 16, 512, "Windows", "Red", 17, "IPS");
        Laptop lt2 = new Laptop("Apple", "M2", 64, 1024, "macOS 14 Sonoma", "Space Gray", 15, "Liquid Retina XDR");
        Laptop lt3 = new Laptop("Acer", "AMD", 32, 512, "NO OS", "Black", 17, "VA");

        //creating store and adding laptops
        HardwareStore hardwareStore = new HardwareStore(lt1);
        hardwareStore.addLaptop(lt2);
        hardwareStore.addLaptop(lt3);


        filteringByUserInput(hardwareStore);
//        sortingByUserInput(hardwareStore);
    }

    private static void sortingByUserInput(HardwareStore hardwareStore) {
        List<Laptop> list = hardwareStore.getLaptops();
        Map<Integer, String> filters = initFilters();
        int userInput = chooseFilter();
        list.sort(new CustomComparator(filters.get(userInput)));
        System.out.println(list);
    }

    private static void filteringByUserInput(HardwareStore hardwareStore) {
        int userInput = chooseFilter();
        Map<Integer, String> filters = initFilters();
        String filter;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value: ");
        filter = scanner.next();
        List<Laptop> filtered = hardwareStore.filterByUserInput(filters.get(userInput), filter);
        System.out.println(filtered);
    }

    public static Map<Integer, String> initFilters() {
        Map<Integer, String> filters = new HashMap<>();
        filters.put(1, "RAM");
        filters.put(2, "Brand");
        filters.put(3, "CPU");
        filters.put(4, "storageCapacity");
        filters.put(5, "monitorDiagonal");
        return filters;
    }

    public static int chooseFilter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Pick one filter to sort laptops:
                1 - RAM
                2 - Brand
                3 - CPU
                4 - Storage Capacity
                5 - Monitor Diagonal
                Your answer:
                """);
        return scanner.nextInt();
    }
}