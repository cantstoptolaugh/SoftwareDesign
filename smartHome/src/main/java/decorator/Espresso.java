
package decorator;

class Espresso extends Beverage {
  public Espresso() {
      description = "Espresso Coffee";
  }

  public double cost() {
      return .50;
  }
}
