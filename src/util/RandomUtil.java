package util;

import java.util.Random;

public class RandomUtil {
    Random random = new Random();

    public boolean calculateChance(int chance){
        return chance > random.nextInt(chance);
    }

    public int calculateDays(int min, int max){
        return random.nextInt((max - min + 1)) + min;
    }

}
