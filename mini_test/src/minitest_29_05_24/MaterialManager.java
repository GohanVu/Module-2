package minitest_29_05_24;

import java.util.ArrayList;
import java.util.List;

public class MaterialManager {
    private List<Material> materials;

    public MaterialManager (){
        materials = new ArrayList<>() ;
    }
    public  void addMaterial(Material material){
        materials.add(material);
    }
    public void deleteMaterial(Material material){
        materials.remove(material);
    }
    public List<Material> getAll(){
        return materials;
    }
}
