void main(){
    //Opgave 1
    double item1 = 25.50;
    double item2 = 15.00;
    double item3 = 30.00;
    double subTotal = item1 + item2 + item3;
    double taxPercent = 25.00;
    double total = subTotal + (subTotal * (taxPercent / 100));
    System.out.println(subTotal);
    System.out.println(total);
    //Opgave 2
    double priceFood = 450.0;
    double priceDrinks = 120.0;
    double tip = 50.0;
    int personCount = 4;
    double bill = priceFood + priceDrinks + tip;
    double splitBill = bill / personCount;
    System.out.println(splitBill);
    //Opgave 3
    double stickerPrice = 300.0;
    double discountPercentage = 20.0;
    double discountedPrice = stickerPrice - (stickerPrice * (discountPercentage / 100));
    double taxPercentage = 25.0;
    double finalPrice = discountedPrice + (discountedPrice * (taxPercentage / 100));
    System.out.println(stickerPrice);
    System.out.println(discountedPrice);
    System.out.println(finalPrice);
}