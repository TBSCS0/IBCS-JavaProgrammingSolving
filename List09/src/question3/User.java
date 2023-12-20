package question3;

public class User {
    private String name;
    private String image;

    private Post post;

    public User(String name, String image, Post post) {
        this.name = name;
        this.image = image;
        this.post = post;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }
}
