package vjezbe.vjezbe5.zadatak3;

public abstract class Item {
    abstract float itemPrice();
    abstract float getPrice();
    abstract int getNumberOf();


    private class TShirt extends Item {

        int tShirtPrice = 10;
        int numberOfTShirts = 20;

        @Override
        float itemPrice() {
            return tShirtPrice * numberOfTShirts;
        }

        @Override
        float getPrice() {
            return tShirtPrice;
        }

        @Override
        int getNumberOf() {
            return numberOfTShirts;
        }
    }

    private class Pants extends Item {

        int pantsPrice = 10;
        int numberOfPants = 20;

        @Override
        float itemPrice() {
            return pantsPrice * numberOfPants;
        }

        @Override
        float getPrice() {
            return pantsPrice;
        }

        @Override
        int getNumberOf() {
            return numberOfPants;
        }
    }
}
