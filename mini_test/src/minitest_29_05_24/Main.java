package minitest_29_05_24;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MaterialManager manager = new MaterialManager();
        manager.addMaterial(new CrispyFlour("01","CF 1", LocalDate.of(2024,01,01),200,5));
        manager.addMaterial(new CrispyFlour("02","CF 2", LocalDate.of(2023,07,15),250,6));
        manager.addMaterial(new CrispyFlour("03","CF 3", LocalDate.of(2023,11,18),210,3));
        manager.addMaterial(new CrispyFlour("04","CF 4", LocalDate.of(2024,03,22),200,4));
        manager.addMaterial(new CrispyFlour("05","CF 5", LocalDate.of(2023,12,17),200,5));
        manager.addMaterial(new Meat("06","M 1",LocalDate.of(2024,05,29),300,15));
        manager.addMaterial(new Meat("07","M 2",LocalDate.of(2024,05,27),310,16));
        manager.addMaterial(new Meat("08","M 3",LocalDate.of(2024,05,26),300,11));
        manager.addMaterial(new Meat("09","M 4",LocalDate.of(2024,05,29),320,17));
        manager.addMaterial(new Meat("10","M 1",LocalDate.of(2024,05,25),280,18));

        List<Material> materials = manager.getAll();
        for (Material material : materials){
            System.out.println(material);
        }
    }
}
