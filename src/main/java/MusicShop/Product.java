package MusicShop;

import Behaviours.ISell;

public abstract class Product implements ISell {

    private double buyprice;
    private double sellprice;

    public Product(double buyprice, double sellprice) {
        this.buyprice = buyprice;
        this.sellprice = sellprice;
    }

    public double getBuyprice() {
        return buyprice;
    }

    public void setBuyprice(double buyprice) {
        this.buyprice = buyprice;
    }

    public double getSellprice() {
        return sellprice;
    }



    public void setSellprice(double sellprice) {
        this.sellprice = sellprice;
    }
}
