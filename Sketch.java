import processing.core.PApplet;

/**
 * draws different patterns in 8 equal sections of the screen using nested for
 * loops
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

    // calculates the position and amount of sqaures
    for (int i = 0; i < 30; i++) {
      for (int j = 0; j < 30; j++) {
        intX = 3 + 2 * i * 5;
        intY = 300 + 3 + 2 * j * 5;

        // draws sqaures
        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }

  // draws bottom middle left section
  public void draw_section2() {
    // x and y position of top left corner the sqaures
    int intX = 0;
    int intY = 0;
    // colour of the sqaures
    int intRGB;

    // calculates the position and amount of sqaures
    for (int i = 0; i < 30; i++) {
      for (int j = 0; j < 30; j++) {
        intX = 300 + 3 + 2 * i * 5;
        intY = 300 + 3 + 2 * j * 5;

        // calculates colour
        if (i % 2 == 0) {
          intRGB = 255;
        } else {
          intRGB = 0;
        }

        // draws sqaures
        fill(intRGB);
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }

  // draws bottom middle right section
  public void draw_section3() {
    // x and y position of top left corner the sqaures
    int intX = 0;
    int intY = 0;
    // colour of the sqaures
    int intRGB;

    // calculates the position and amount of sqaures
    for (int i = 0; i < 30; i++) {
      for (int j = 0; j < 30; j++) {
        intX = 600 + 3 + 2 * i * 5;
        intY = 300 + 3 + 2 * j * 5;

        // calculates colour
        if (j % 2 == 0) {
          intRGB = 0;
        } else {
          intRGB = 255;
        }

        // draws sqaures
        fill(intRGB);
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }

  // draws bottom right section
  public void draw_section4() {
    // x and y position of top left corner the sqaures
    int intX = 0;
    int intY = 0;
    // colour of the sqaures
    int intRGB;

    // calculates the position and amount of sqaures
    for (int i = 0; i < 30; i++) {
      for (int j = 0; j < 30; j++) {
        intX = 900 + 3 + 2 * i * 5;
        intY = 300 + 3 + 2 * j * 5;

        // calculates colour
        if (j % 2 == 0) {
          intRGB = 0;
        } else if (i % 2 == 0) {
          intRGB = 255;
        } else {
          intRGB = 0;
        }

        // draws sqaures
        fill(intRGB);
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }

  // draws top left section
  public void draw_section5() {
    // x and y position of top left corner the sqaures
    int intX = 0;
    int intY = 0;

    // calculates the position and amount of sqaures
    for (int i = 1; i < 30; i++) {
      for (int j = i; j < 30; j++) {
        intX = 3 + 300 - 2 * i * 5;
        intY = 3 + 2 * j * 5;

        // draws sqaures
        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }

  // draws top middle left section
  public void draw_section6() {
    // x and y position of top left corner the sqaures
    int intX = 0;
    int intY = 0;

    // calculates the position and amount of sqaures
    for (int i = 0; i < 30; i++) {
      for (int j = i; j < 30; j++) {
        intX = 300 + 3 + 2 * i * 5;
        intY = 3 + 2 * j * 5;

        // draws sqaures
        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }

  public void draw_section7() {

  }

  // draws top right section
  public void draw_section8() {
    // x and y position of top left corner the sqaures
    int intX = 0;
    int intY = 0;

    // calculates the position and amount of sqaures
    for (int i = 0; i < 30; i++) {
      for (int j = 0; j <= i; j++) {
        intX = 900 + 3 + 2 * i * 5;
        intY = 3 + 2 * j * 5;

        // draws sqaures
        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
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
