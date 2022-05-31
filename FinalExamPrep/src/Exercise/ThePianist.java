package Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, PieceInfo> pieces = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split("\\|");
            PieceInfo pieceInfo = new PieceInfo(data[0], data[1], data[2]);
            pieces.put(data[0], pieceInfo);
        }
        String line = scanner.nextLine();
        while (!line.equals("Stop")) {
            String[] data = line.split("\\|");
            String command = data[0];
            switch (command) {
                case "Add":
                    if (!pieces.containsKey(data[1])) {
                        PieceInfo pieceInfo = new PieceInfo(data[1], data[2], data[3]);
                        pieces.put(data[1], pieceInfo);
                        System.out.printf("%s by %s in %s added to the collection!%n", data[1], pieceInfo.composer, pieceInfo.key);
                    } else {
                        System.out.printf("%s is already in the collection!%n", data[1]);
                    }
                    break;
                case "Remove":
                    if (pieces.containsKey(data[1])) {
                        pieces.remove(data[1]);
                        System.out.printf("Successfully removed %s!%n", data[1]);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", data[1]);
                    }
                    break;
                case "ChangeKey":
                    if (pieces.containsKey(data[1])){
                    PieceInfo pieceInfo2 = new PieceInfo(pieces.get(data[1]).name, pieces.get(data[1]).composer, data[2]);
                    pieces.replace(data[1], pieces.get(data[1]), pieceInfo2);
                        System.out.printf("Changed the key of %s to %s!%n", data[1], data[2]);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", data[1]);
                    }
                    break;

            }
            line = scanner.nextLine();

        }
        pieces.values().forEach(System.out::println);
    }

    static class PieceInfo {
        String name;
        String composer;
        String key;

        public PieceInfo(String name, String composer, String key) {
            this.name = name;
            this.composer = composer;
            this.key = key;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getComposer() {
            return composer;
        }

        public void setComposer(String composer) {
            this.composer = composer;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        @Override
        public String toString() {
            return String.format("%s -> Composer: %s, Key: %s", this.name, this.composer, this.key);
        }
    }

}
