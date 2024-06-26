import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class ayush {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out)); // Use System.out instead of FileWriter
        String binary = bufferedReader.readLine();
        int result = getCount(binary);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
        bufferedReader.close();
        bufferedWriter.close();
    }
    public static int getCount(String binary) {
        Set<Integer> uniqueDecimals = new HashSet<>();
        int n = binary.length();
        // Generate all non-empty subsequences
        for (int i = 1; i < (1 << n); i++) { // Iterate over all possible non-empty subsets (1 to 2^n - 1)
            int decimalValue = 0;
            boolean hasNonZero = false;
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) { // Check if j-th bit is set in subset representation i
                    decimalValue = decimalValue * 2 + (binary.charAt(j) - '0');
                    hasNonZero |= (binary.charAt(j) - '0') != 0;
                }
            }
            if (hasNonZero) { // Non-empty subsequence
                uniqueDecimals.add(decimalValue);
            }
        }
        return uniqueDecimals.size();
    }
}