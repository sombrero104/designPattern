package builder.builder2;

/**
 * Product
 */
public class NutritionFacts {
    private final int servingSize;
    private final int servings;

    public NutritionFacts(Builder builder) {
        servingSize = builder.servingSize;
        servings = builder.servings;
    }

    /**
     * Builder
     */
    public static class Builder {
        // Required parameter (필수 인자)
        private final int servingSize;
        private final int servings;

        // Optional parameter (선택적 인자, 선택적 인자는 기본값으로 초기화)
        private int calories = 0;
        private int fat = 0;
        private int carbohydrate = 0;
        private int sodium = 0;

        // Builder 생성자에서 필수 인자를 받음.
        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        /**
         * NutritionFacts 객체를 생성하면서 이 Builder 객체를 넘겨줌.
         */
        public NutritionFacts build() {
            return new NutritionFacts(this);
        }

        public Builder calories(int calories) {
            this.calories = calories;
            return this;
        }

        public Builder fat(int fat) {
            this.fat = fat;
            return this;
        }

        public Builder carbohydrate(int carbohydrate) {
            this.carbohydrate = carbohydrate;
            return this;
        }

        public Builder sodium(int sodium) {
            this.sodium = sodium;
            return this;
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "servingSize=" + servingSize +
                    ", servings=" + servings +
                    ", calories=" + calories +
                    ", fat=" + fat +
                    ", carbohydrate=" + carbohydrate +
                    ", sodium=" + sodium +
                    '}';
        }

    }

    @Override
    public String toString() {
        return "NutritionFacts{" +
                "servingSize=" + servingSize +
                ", servings=" + servings +
                '}';
    }

}
