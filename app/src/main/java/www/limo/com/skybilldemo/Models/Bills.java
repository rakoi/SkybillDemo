package www.limo.com.skybilldemo.Models;

public class Bills {
    public String name;
    public Integer image;

    public Bills() {
    }

    public Bills(String name, Integer image) {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }
}
