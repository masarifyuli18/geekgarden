package masarifyuli.co.geek;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class U {

    public Integer getFibonacci(Integer index) {
        int tmp1 = 0;
        int tmp2 = 1;
        List<Integer> tmp = new ArrayList<>();
        tmp.add(1);
        for (int i = 0; i < index; i++) {
            Integer sum = tmp1 + tmp2;
            tmp1 = tmp2;
            tmp2 = sum;
            tmp.add(sum);
        }
        System.out.println("fibonacci[" + index + "]: " + tmp.stream().map(Object::toString).collect(Collectors.joining(",")));
        if (tmp.isEmpty()) return 0;
        else return tmp.get(index - 1);
    }

    public String nonPalindrom(String s) {
        List<String> tmp = new ArrayList<>();
        String[] si = s.split("");
        for (int i = 1; i < si.length; i++) {
            for (int u = (si.length); u > i; u--) {
                tmp.add(s.substring(i, u));
            }
        }
        String pn = "";
        if (!tmp.isEmpty()) {
          try {
              List<String> a = tmp.stream().filter(f ->
                      f.toLowerCase().equals(new StringBuilder(f).reverse().toString().toLowerCase())
              ).sorted(Comparator.comparingInt(String::length)).toList();
              pn = a.get(a.size() - 1);
          } catch (Exception e) {
              e.printStackTrace();
          }
        }
        return pn;
    }

}
