package flyweight.flyweight1;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Flyweight Factory
 */
public class TreeTypeFactory {
    static Map<String, TreeType> treeTypeMap = new HashMap<>();

    public static TreeType getTreeType(String name, Color color, String otherTreeData) {
        TreeType treeType = treeTypeMap.get(name);
        if(treeType == null) {
            treeType = new TreeType(name, color, otherTreeData);
            treeTypeMap.put(name, treeType);
        }
        return treeType;
    }

}
