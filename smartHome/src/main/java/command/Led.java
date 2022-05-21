package command;

class Led {
  private String description;

  public  Led(String description) {
      this.description=description;
  }

  public void on() {
      System.out.println(description + " Led on.");
  }

  public void off( ) {
        System.out.println(description + " Led off.");
  }

  public void up() {
        System.out.println(description + " Led up.");
  }

  public void down() {
        System.out.println(description + " Led down.");
  }

}
