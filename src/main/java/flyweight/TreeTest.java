package flyweight;

import java.awt.*;

/**
 * 애플릿 사용.
 * 애플릿은 자바 9버전부터 사라짐. (Java Web Start로 대신 사용해야 함.)
 */
public class TreeTest {
    private static int CANVAS_SIZE = 500;
    private static int TREES_TO_DRAW = 1000000;
    private static int TREE_TYPES = 2;

    public static void main(String[] args) {
        Forest forest = new Forest();
        for(int i=0; i<Math.floor(TREES_TO_DRAW / TREE_TYPES); i++) {
            forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE)
                    , "Summer Oak", Color.GREEN, "Oak texture stub");
            forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE)
                    , "Autumn Oak", Color.ORANGE, "Autumn Oack texture stub");
        }
        forest.setSize(CANVAS_SIZE, CANVAS_SIZE);
        forest.setVisible(true);

        System.out.println("-----------------------------------------");
        System.out.println(TREES_TO_DRAW + " trees drawn");
        System.out.println("-----------------------------------------");
        System.out.println("Memory usage:");
        System.out.println("\t(Tree size(8bytes) * " + TREES_TO_DRAW
            + ") + (TreeTypes size(~30bytes) * " + TREE_TYPES + ")");
        System.out.println("\t\t=> Total: " + ((TREES_TO_DRAW * 8 + TREE_TYPES * 30) / 1024 / 1024)
            + "MB (instead of " + ((TREES_TO_DRAW * 38) / 1024 / 1024) + "MB)");
        System.out.println("-----------------------------------------");

        /**
         * 나무(8bytes) 1,000,000개에 대해 각각 나무 타입(30bytes)을 만들게 되면 용량이 36MB를 차지하게 된다.
         * 하지만 나무 타입(30bytes)을 2개만 만들어서 사용하면 숲을 그리는데에 사용되는 용량은 7MB로 절약할 수 있다.
         */
    }

    private static int random(int min, int max) {
        return min + (int)(Math.random() * ((max - min) + 1));
    }

}
