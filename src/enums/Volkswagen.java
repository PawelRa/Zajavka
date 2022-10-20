package enums;

public enum Volkswagen implements ExtendingVolkswagen {
    PASSAT("white", 2020),
    GOLF("red", 2010),
    ARTEON("green", 2014),
    TIGUAN("blue", 2021),
    TOUAREG("brown", 2023);

    private String colors;
    private int productionYear;

    Volkswagen(String colors, int productionYear) {
        this.colors = colors;
        this.productionYear = productionYear;
    }

    public String getColors() {
        return colors;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    @Override
    public String doSomething() {
        return "production year = " + productionYear;
    }


//    @Override
//    public String toString() {
//        return "Volkswagen{" +
//                "colors='" + colors + '\'' +
//                ", productionYear=" + productionYear +
//                '}';
//    }
}
