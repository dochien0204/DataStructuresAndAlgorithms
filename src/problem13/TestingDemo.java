package problem13;

import java.util.*;
import java.util.stream.Collectors;

public class TestingDemo {
    public static void main(String[] args) {
        List<NhanVien> nvs = new ArrayList<>();
        nvs.add(new NhanVien(1, "Ba", "9/1/1985", "Dev2"));
        nvs.add(new NhanVien(2, "Huy", "10/1/1985", "Dev3"));
        nvs.add(new NhanVien(3, "Nguyen", "11/1/1985", "Dev2"));
        nvs.add(new NhanVien(4, "Hoang", "9/1/1985", "Dev2"));
        nvs.add(new NhanVien(5, "Tien", "9/1/1985", "Dev1"));
        nvs.add(new NhanVien(6, "Tuan", "9/1/1985", "Dev3"));

        List<KetQua> kq = new ArrayList<>();
        kq.add(new KetQua("9/13/2020", 5, 1,10));
        kq.add(new KetQua("9/13/2020", 5, 1,20));
        kq.add(new KetQua("9/13/2020", 5, 1,30));
        kq.add(new KetQua("9/13/2020", 5, 1,40));
        kq.add(new KetQua("9/13/2020", 4, 1,40));
        kq.add(new KetQua("9/13/2020", 4, 1,45));
        kq.add(new KetQua("9/13/2020", 1, 1,25));
        kq.add(new KetQua("9/13/2020", 1, 1,35));
        kq.add(new KetQua("9/13/2020", 1, 1,30));
        kq.add(new KetQua("9/13/2020", 1, 1,40));
        kq.add(new KetQua("9/13/2020", 2, 1,50));
        kq.add(new KetQua("9/13/2020", 2, 1,50));
        kq.add(new KetQua("9/13/2020", 3, 1,50));
        kq.add(new KetQua("8/10/2019", 3, 1,25));
        kq.add(new KetQua("8/10/2019", 3, 1,35));
        kq.add(new KetQua("8/10/2019", 3, 1,30));
        kq.add(new KetQua("8/10/2019", 3, 1,40));


        //giai thuat
        Map<Integer, Integer> ketQuaMap = new HashMap<>();
        for (int i = 0; i < kq.size(); i++) {
            if(!(kq.get(i).getNgayThi().compareTo("9/13/2020") == 0)) {
                continue;
            }
            int totalMark = ketQuaMap.getOrDefault(kq.get(i).getId(), 0);
            totalMark += kq.get(i).getDiem();
            ketQuaMap.put(kq.get(i).getId(), totalMark);
        }

        Map<NhanVien, Integer> nvMap = new HashMap<>();
        for(int i = 0; i < nvs.size(); i++) {
            if(!(nvs.get(i).getDEV().compareTo("Dev2") == 0)) {
                continue;
            }
            int id = nvs.get(i).getId();
            System.out.println(id);
            if(ketQuaMap.containsKey(id)) {
                nvMap.put(nvs.get(i), ketQuaMap.get(id));
            }
        }
        nvMap = nvMap.entrySet().stream().sorted(Map.Entry.<NhanVien, Integer> comparingByValue().reversed()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        System.out.println(ketQuaMap);
        System.out.println(nvMap);
    }
}
