package movies;

import shapes.Measurable;

public class Movie {
    private String title;
    private String category;

    public Movie(String title, String category) {
        this.title = title;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }
    public String getCategory() {
        return category;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setCategory(String category) {
        this.category = category;
    }
}
