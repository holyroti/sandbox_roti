package nl.carlodvm.androidapp.Core;

public class Destination extends Grid {
    private String name, comment;
    private int imageIndex;

    public Destination(int x, int y, String name, int imageIndex, String comment) {
        super(x, y, true);
        this.name = name;
        this.imageIndex = imageIndex;
        this.comment = comment;
    }

    public String getComment() {return comment;}

    public int getImageIndex() {
        return imageIndex;
    }

    @Override
    public String toString() {
        return name + " (x:" + (getX() + 1)  + ", y:" + (getY() + 1) + ")";
    }
}
