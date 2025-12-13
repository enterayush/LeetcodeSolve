import java.util.*;

class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {

        Map<String, Integer> order = new HashMap<>();
        order.put("electronics", 0);
        order.put("grocery", 1);
        order.put("pharmacy", 2);     // ✅ fixed spelling
        order.put("restaurant", 3);

        List<String[]> valid = new ArrayList<>();

        for (int i = 0; i < code.length; i++) {

            // condition 1: is active
            if (!isActive[i]) continue;

            // condition 2: businessLine
            if (!order.containsKey(businessLine[i])) continue;

            // condition 3: length and characters
            if (code[i].length() == 0) continue;
            if (!code[i].matches("[a-zA-Z0-9_]+")) continue;

            valid.add(new String[]{businessLine[i], code[i]});
        }

        // ✅ STEP 1: sort valid coupons
        Collections.sort(valid, (a, b) -> {
            int cmp = order.get(a[0]) - order.get(b[0]);
            if (cmp != 0) return cmp;
            return a[1].compareTo(b[1]);
        });

        // ✅ STEP 2: convert to List<String> (only codes)
        List<String> result = new ArrayList<>();
        for (String[] v : valid) {
            result.add(v[1]);
        }

        // ✅ STEP 3: return result
        return result;
    }
}
