package Exercise;

import java.util.*;

public class AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] bigArr = scanner.nextLine().split("\\|");
        List<String> allNumbers = new ArrayList<>();
        for (int i = 0; i < bigArr.length; i++) {
            String[] smallArr = bigArr[i].split("\s+");
                for (int j = 0; j < smallArr.length; j++) {
                    if (!smallArr[j].equals("")){
                    allNumbers.add(smallArr[j]);
                    } else {
                        j++;
                    }
            }
        }
        allNumbers.stream().sorted();
        System.out.println(allNumbers);
    }
}
