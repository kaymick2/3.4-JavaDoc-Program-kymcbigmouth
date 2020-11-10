/**
This class calculates the area of a rectangle and uses a switch statement
*/

class Main {

  /**
    * This subroutine computes the area of a rectangle, given its width and height.
    * @param width the length of one side of
    * @param height the lenght of the second side
    * @return the area of the rectangle
    * @throws IllegalArgumentException if either the width or the height is negative
    */
  public static double areaOfRectangle ( double height, double width ) {
      if ( width < 0 || height < 0 ) {
        throw new IllegalArgumentException("Sides must be positive.");
      }
      double area;
      area = width * height;
      return area;
    } // end of areaOfRectangle subroutine

  /**This is the main method*/
  public static void main(String[] args) {
    int number;
    number = 10;
    switch (number) {
      case 1:
        System.out.println("The number is 1.");
        break;
      case 2:
      case 4:
      case 8:
        System.out.println("The number is 2, 4, or 8.");
        break;
      case 3:
      case 6:
      case 9:
        System.out.println("The number is 3, 6, or 9.");
        break;
      case 5:
        System.out.println("The number is 5.");
        break;
      case 7:
        System.out.println("The number is 7.");
        break;
      default:
        System.out.println("The number is not in the range 1-9.");
        break;
    } // end of switch statement
    System.out.println(areaOfRectangle(14,23));
  } // end of main ()
} // end of main Class