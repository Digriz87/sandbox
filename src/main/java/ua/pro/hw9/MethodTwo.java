package ua.pro.hw9;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class MethodTwo {

    public static class Pair {
        private final int x;
        private final int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }

        @Override
        public boolean equals(Object other) {
            if (other instanceof Pair) {
                Pair o = (Pair) other;
                return this.x == o.x && this.y == o.y;
            }

            return false;
        }

        @Override
        public String toString() {
            return String.format("(%d, %d)", x, y);
        }
    }

    public static Set<Pair> findAllPairs(int input[], int target) {
        int numbers[] = Arrays.copyOf(input, input.length);
        Set<Pair> pairs = new HashSet<>();

        Arrays.sort(numbers);

        for (int low = 0, high = numbers.length - 1; low < high; ) {
            int sum = numbers[low] + numbers[high];

            if (sum > target) {
                high--;
            } else if (sum < target) {
                low++;
            } else {
                pairs.add(new Pair(input[low], input[high]));
                high--;
                low++;
            }
        }

        return pairs;
    }
}