package util;

import java.util.Comparator;

public class Lists {
    public static <T> void sort(List<T> list, Comparator<? super T> c) {
        for (int i = list.size() - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (c.compare(list.get(j), list.get(j + 1)) > 0) {
                    T temp = list.get(j);
                    list.remove(j);
                    list.add(j, list.get(j + 1));
                    list.remove(j + 1);
                    list.add(j + 1, temp);
                }
            }
        }
    }
}
