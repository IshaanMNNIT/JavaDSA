import java.util.*;

class Union {
    public int[] unionArray(int[] nums1, int[] nums2) {
        ArrayList<Integer> l = new ArrayList<>();
        int i = 0, j = 0;
        int n1 = nums1.length;
        int n2 = nums2.length;

        while (i < n1 && j < n2) {
            if (nums1[i] < nums2[j]) {
                if (l.isEmpty() || l.get(l.size() - 1) != nums1[i])
                    l.add(nums1[i]);
                i++;
            } else if (nums1[i] > nums2[j]) {
                if (l.isEmpty() || l.get(l.size() - 1) != nums2[j])
                    l.add(nums2[j]);
                j++;
            } else {
                if (l.isEmpty() || l.get(l.size() - 1) != nums1[i])
                    l.add(nums1[i]);
                i++;
                j++;
            }
        }

        while (i < n1) {
            if (l.isEmpty() || l.get(l.size() - 1) != nums1[i])
                l.add(nums1[i]);
            i++;
        }

        while (j < n2) {
            if (l.isEmpty() || l.get(l.size() - 1) != nums2[j])
                l.add(nums2[j]);
            j++;
        }

        // Convert ArrayList<Integer> to int[]
        int[] result = new int[l.size()];
        for (int k = 0; k < l.size(); k++) {
            result[k] = l.get(k);
        }
        return result;
    }
}
