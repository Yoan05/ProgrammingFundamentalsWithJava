package Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Articles2point0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Article> products = new ArrayList<>();


        for (int i = 1; i <= n; i++) {

            String[] data = scanner.nextLine().split(", ");
            String title = data[0];
            String content = data[1];
            String author = data[2];
            Article article = new Article(title, content, author);
            products.add(article);

        }
        String command = scanner.nextLine();
        switch (command) {
            case "title":
                products.stream().sorted((a1, a2) -> a1.title.compareTo(a1.title))
                        .forEach(a -> System.out.println(a.toString()));
                break;
            case "content":
                products.stream().sorted((a1, a2) -> a1.content.compareTo(a1.content))
                        .forEach(a -> System.out.println(a.toString()));
                break;
            case "author":
                products.stream().sorted((a1, a2) -> a1.author.compareTo(a1.author))
                        .forEach(a -> System.out.println(a.toString()));
                break;
        }
    }



    static class Article {
        String title;
        String content;
        String author;

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public String getContent() {
            return content;
        }

        public String getAuthor() {
            return author;
        }


        @Override
        public String toString() {
            return String.format("%s - %s: %s", this.title, this.content, this.author);
        }
    }
}


