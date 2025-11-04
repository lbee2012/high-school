package com.example.sd202033.buoi6.service;

import com.example.sd202033.buoi6.model.BacSi;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service

public class BacSiService {
    private List<BacSi> bsList = new ArrayList<>();

    public BacSiService() {
//            bsList = new ArrayList(Arrays.asList(
//                    new BacSi(1, "BS01", "DC01", 100f, 10, true),
//                    new BacSi(2, "BS02", "DC02", 200f, 20, false),
//                    new BacSi(3, "BS03", "DC03", 300f, 30, true),
//                    new BacSi(4, "BS04", "DC04", 400f, 40, false),
//                    new BacSi(5, "BS05", "DC05", 500f, 50, true)
//            ));
        bsList.add(new BacSi(1, "BS01", "DC01", 100f, 10, true));
        bsList.add(new BacSi(2, "BS02", "DC02", 200f, 20, false));
        bsList.add(new BacSi(3, "BS03", "DC03", 300f, 30, true));
        bsList.add(new BacSi(4, "BS04", "DC04", 400f, 40, false));
        bsList.add(new BacSi(5, "BS05", "DC05", 500f, 50, true));
    }

    public List<BacSi> getAll() {
        return bsList;
    }

    public BacSi getOne(Integer id) {
        for (BacSi bs : bsList) {
            if (bs.getId() == id) {
                return bs;
            }
        }
        return null;
    }

    public void addBS(BacSi bs) {
        bsList.add(bs);
    }

    public void updBS(BacSi bs) {
        int ind = -1;
        for (int i = 0; i < bsList.size(); i++) {
            if (bs.getId() == bsList.get(i).getId()) {
                ind = i;
            }
        }
        bsList.set(ind, bs);
    }

    public void delBS(Integer id) {
        bsList.removeIf(bs -> bs.getId() == id);
    }
}
