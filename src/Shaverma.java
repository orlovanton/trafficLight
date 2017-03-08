/**
 * Created by antonorlov on 04/03/2017.
 */
public class Shaverma {

    private String taste;
    private int catNum;
    private double price;

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public int getCatNum() {
        return catNum;
    }

    public void setCatNum(int catNum) {
        this.catNum = catNum;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price < 0.0){
            throw new RuntimeException("Negative price");
        }
        this.price = price;
    }

    @Override
    public String toString() {
        return  taste + System.lineSeparator()
                +catNum + System.lineSeparator()
                +price;
    }
}
