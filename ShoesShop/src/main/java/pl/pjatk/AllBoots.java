package pl.pjatk;

public class AllBoots {
        private int size;
        private int price;
        private String mark;
        private String color;

        public AllBoots(int size, int price, String mark, String color) {
            this.size = size;
            this.price = price;
            this.mark = mark;
            this.color = color;
        }
        void pack(){
            System.out.println("Please allready packed your boots");
        }
    }

