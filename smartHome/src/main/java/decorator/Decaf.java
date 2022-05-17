
package decorator;

class Decaf extends Beverage {
  public Decaf() {
      description = "Decaf Coffee";
  }

  public double cost() {
      return .50;
  }
}
