import java.util.ArrayList;

public class MergeSort {
    public static void mergeSort(ArrayList<Student> students) {
        if (students == null || students.size() <= 1) {
            return;
        }
        mergeSort(students, 0, students.size() - 1);
    }

    private static void mergeSort(ArrayList<Student> students, int start, int end) {
        if (start < end) {
            int mid = start + (end - start) / 2;
            mergeSort(students, start, mid);
            mergeSort(students, mid + 1, end);
            merge(students, start, mid, end);
        }
    }

    private static void merge(ArrayList<Student> students, int start, int mid, int end) {
        ArrayList<Student> temp = new ArrayList<>();
        int i = start;
        int j = mid + 1;
        while (i <= mid && j <= end) {
            if (students.get(i).getRollno() <= students.get(j).getRollno()) {
                temp.add(students.get(i));
                i++;
            } else {
                temp.add(students.get(j));
                j++;
            }
        }
        while (i <= mid) {
            temp.add(students.get(i));
            i++;
        }
        while (j <= end) {
            temp.add(students.get(j));
            j++;
        }
        for (int k = start; k <= end; k++) {
            students.set(k, temp.get(k - start));
        }
    }
}
