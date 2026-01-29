void main(){
    //Opgave 4
    int guests = 15;
    int cupcakes = 40;
    int cupcakesPerGuest = cupcakes / guests;
    int excessCupcakes = cupcakes % guests;
    System.out.println("Each guest gets " + cupcakesPerGuest + " cupcakes");
    System.out.println(excessCupcakes + " cupcakes left over");
    //Opgave 5
    StringBuilder message = new StringBuilder();
    String name = "Anna";
    int age = 25;
    message.append("Hello, ");
    message.append(name);
    message.append("! ");
    message.append("You are ");
    message.append(age);
    message.append(" years old.");
    System.out.println(message.toString());
    //Opgave 6
    int score = 100;
    System.out.println(score);
    score += 50;
    System.out.println(score);
    score += 25;
    System.out.println(score);
    //Opgave 7
    int hitPoints = 100;
    hitPoints -= 15;
    System.out.println(hitPoints);
    hitPoints -= 20;
    System.out.println(hitPoints);
    //Opgave 8
    float price = 50.0f;
    System.out.println(price);
    price *= 2;
    System.out.println(price);
    //Opgave 9
    int counter = 10;
    System.out.println(counter);
    counter++;
    System.out.println(counter);
    counter--;
    System.out.println(counter);
    //Opgave 10
    int number = 10;
    number += 5;
    System.out.println(number);
    number -= 3;
    System.out.println(number);
    number++;
    System.out.println(number);
    number--;
    System.out.println(number);
}