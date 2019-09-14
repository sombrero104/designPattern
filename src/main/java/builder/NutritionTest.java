package builder;

public class NutritionTest {

    public static void main(String[] args) {
        /*NutritionFacts.Builder builder = new NutritionFacts.Builder(240, 8);
        builder.calories(100);
        builder.sodium(35);
        builder.carbohydrate(27);
        NutritionFacts cocaCola = builder.build();
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println(cocaCola.toString());
        System.out.println(builder.toString());
        System.out.println("----------------------------------------------------------------------------------------");*/

        /**
         * 메소드 체인 호출 방식.
         */
        /*NutritionFacts cocalCola = new NutritionFacts
                .Builder(240, 8)
                .calories(100)
                .sodium(35)
                .carbohydrate(27)
                .build();*/
        NutritionFacts.Builder builder = new NutritionFacts.Builder(240, 8);
        NutritionFacts cocaCola = builder.calories(100)
                .sodium(35)
                .carbohydrate(27)
                .build();
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println(cocaCola.toString());
        System.out.println(builder.toString());
        System.out.println("----------------------------------------------------------------------------------------");
    }

}
