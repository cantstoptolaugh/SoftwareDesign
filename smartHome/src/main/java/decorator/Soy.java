
package decorator;

public class Soy extends Condimentdecorator {
  private Beverage beverage;

  public Soy(Beverage beverage) {
      this.beverage = beverage;
  }

  public String getDescription() {
      return beverage.getDescription() + ", Soy";
  }

  public double cost() {
      return .15 + beverage.cost();
  }
}
