package Firstassignmentjava;

    class Box {
        protected double length;
        protected double breadth;

        public Box(double length, double breadth) {
            this.length = length;
            this.breadth = breadth;
        }

        public void setDimensions(double length, double breadth) {
            this.length = length;
            this.breadth = breadth;
        }

        public double calculateArea() {
            return length * breadth;
        }
    }

    class Box3D extends Box {
        protected double height;

        public Box3D(double length, double breadth, double height) {
            super(length, breadth);
            this.height = height;
        }

        public void setDimensions(double length, double breadth, double height) {
            super.setDimensions(length, breadth);
            this.height = height;
        }

        public double calculateVolume() {
            return length * breadth * height;
        }
    }

    public class BoxClass {
        public static void main(String[] args) {
            Box3D box3D = new Box3D(15, 7, 2);
            double area = box3D.calculateArea();
            double volume = box3D.calculateVolume();

            System.out.println("Area: " + area);
            System.out.println("Volume: " + volume);
        }
    }


