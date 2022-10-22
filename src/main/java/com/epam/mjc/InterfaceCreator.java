package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return  (list) -> {
            List<Integer> ls = new ArrayList<>();
            for (int el : list){
                ls.add(el / divider);
            }
            return ls;
        };
    }
}
