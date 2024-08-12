package org.security.project.detail.siswa.util;

import java.util.Random;

public class UniqueInteger {

    public static int randomIdInteger() {
        Random rand = new Random();
        long current = System.currentTimeMillis();

        int uniqueInteger = (int) (current / 1000) + rand.nextInt(1000);

        return uniqueInteger;
    }
}
