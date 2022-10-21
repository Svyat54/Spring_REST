package com.example.demo.RestServer;

public class Quote {
    String category;
    String author;
    String quote;

    public String getCategory() {
        return category;
    }
    public String getAuthor() {
        return author;
    }
    public String getQuote() {
        return quote;
    }

    public Quote(String category, String author, String quote) {
        this.category = category;
        this.author = author;
        this.quote = quote;
    }

    public Quote(String category) {
        this.category = category;
        this.author = author;
        this.quote = quote;
    }


}
