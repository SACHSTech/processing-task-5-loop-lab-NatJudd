import processing.core.PApplet;

/**
 * draws different patterns in 8 equal sections of the screen 
 * 
 * @author: N.Judd
 */
public class Sketch extends PApplet {
  // size of the screen
  public void settings() {
    size(1200, 600);
  }

  // background rgb
  public void setup() {
    background(45, 150, 207);
  }

  // draws the outline to seperate the sections
  public void draw_section_outlines() {
    stroke(0);
    noFill();

    // draws bottom row boxes
    rect(0, 300, 300, 300);
    rect(300, 300, 300, 300);
    rect(600, 300, 300, 300);
    rect(900, 300, 300, 300);

    // draws top row boxes
    rect(0, 0, 300, 300);
    rect(300, 0, 300, 300);
    rect(600, 0, 300, 300);
    rect(900, 0, 300, 300);
  }

  
  // draws bottom left section 
  public void draw_section1() {
    // x and y position of top left corner the sqaures
    int intX = 0;
    int intY = 0;

    for (int r = 0; r < 30; r++) {
      for (int c = 0; c < 30; c++) {
        intX = 3 + 2 * r * 5;
        intY = 300 + 3 + 2 * c * 5;

        // draws sqaures
        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }
  
  /**
   * Use the modulus operator and an if statement to select the color
   * Don't loop from 30 to 60 to shift everything over, just add 300 to x.
   */
  public void draw_section2() {

  }

  /**
   * Use the modulus operator and an if/else statement to select the color.
   * Don't use multiple 'if' statements.
   */
  public void draw_section3() {

  }

  /**
   * Use the modulus operator and just one 'if' statement to select the color.
   */
  public void draw_section4() {

  }

  /**
   * Do NOT use 'if' statements to complete 5-8. Manipulate the loops instead
   */
  public void draw_section5() {

  }

  public void draw_section6() {

  }

  public void draw_section7() {

  }

  public void draw_section8() {

  }

  // draws the output
  public void draw() {
    // calls methods
    draw_section_outlines();
    draw_section1();
    draw_section2();
    draw_section3();
    draw_section4();
    draw_section5();
    draw_section6();
    draw_section7();
    draw_section8();
  }
}
