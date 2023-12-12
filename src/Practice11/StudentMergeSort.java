package Practice11;

import java.util.Arrays;

public class StudentMergeSort {
    public static void main(String[] args) {
        String[] names = {"Петя Иванов", "Алиса Язова", "Вася Васильков"};
        double[] scores = {4.2, 3.5, 4.9};

        String[] moreNames = {"Настя Назарова", "Ваня Строганов", "Маша Виноградова"};
        double[] moreScores = {4.7, 3.7, 5.0};

        String[] mergedNames = merge(names, moreNames);
        double[] mergedScores = merge(scores, moreScores);

        sort(mergedNames, mergedScores, 0, mergedNames.length - 1);

        for (int i = 0; i < mergedNames.length; i++) {
            System.out.println(mergedNames[i] + ": " + mergedScores[i]);
        }
    }

    public static String[] merge(String[] a, String[] b) {
        String[] merged = new String[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            merged[i] = a[i];
        }

        for (int i = 0; i < b.length; i++) {
            merged[a.length + i] = b[i];
        }

        return merged;
    }

    public static double[] merge(double[] a, double[] b) {
        double[] merged = new double[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            merged[i] = a[i];
        }

        for (int i = 0; i < b.length; i++) {
            merged[a.length + i] = b[i];
        }

        return merged;
    }

    public static void merge(String[] names, double[] scores, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        String[] leftNames = new String[n1];
        double[] leftScores = new double[n1];

        String[] rightNames = new String[n2];
        double[] rightScores = new double[n2];

        for (int i = 0; i < n1; i++) {
            leftNames[i] = names[left + i];
            leftScores[i] = scores[left + i];
        }

        for (int j = 0; j < n2; j++) {
            rightNames[j] = names[middle + 1 + j];
            rightScores[j] = scores[middle + 1 + j];
        }

        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (leftScores[i] <= rightScores[j]) {
                names[k] = leftNames[i];
                scores[k] = leftScores[i];
                i++;
            } else {
                names[k] = rightNames[j];
                scores[k] = rightScores[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            names[k] = leftNames[i];
            scores[k] = leftScores[i];
            i++;
            k++;
        }

        while (j < n2) {
            names[k] = rightNames[j];
            scores[k] = rightScores[j];
            j++;
            k++;
        }
    }

    public static void sort(String[] names, double[] scores, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;

            sort(names, scores, left, middle);
            sort(names, scores, middle + 1, right);

            merge(names, scores, left, middle, right);
        }
    }
}
