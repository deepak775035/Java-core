package session19;



public class UMLDriver {
        public static void main(String[] args) {
            
        Point start = new Point();
        Point end = new Point();
        
        start.setX(0);
        start.setY(0);
        end.setX(0);
        end.setY(5);
        System.out.println(start.distance(end));
            


             Line line = new Line(5, 5, 0, 10);
             System.out.println(line.length());

        
        
            end.setY(40);
             Line line2 = new Line(start, end);
             System.out.println(line2.length());

        }
}
