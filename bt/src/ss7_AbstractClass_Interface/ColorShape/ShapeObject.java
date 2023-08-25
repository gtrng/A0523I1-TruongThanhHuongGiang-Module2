package ss7_AbstractClass_Interface.ColorShape;

public abstract class ShapeObject {
        private String color = "while";
        private boolean filled;
        private java.util.Date dateCreated;


        protected ShapeObject() {
            dateCreated = new java.util.Date();
        }


        protected ShapeObject(String color, boolean filled) {
            dateCreated = new java.util.Date();
            this.color = color;
            this.filled = filled;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }


        public boolean isFilled() {
            return filled;
        }

        public void setFilled(boolean filled) {
            this.filled = filled;
        }

        public java.util.Date getDateCreated() {
            return dateCreated;
        }

        @Override
        public String toString() {
            return "created on " + dateCreated + "\ncolor: " + color +
                    " and filled: " + filled;
        }

        public abstract double getArea();

        public abstract double getPerimeter();
}
