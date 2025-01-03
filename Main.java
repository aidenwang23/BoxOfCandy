public class Main {
    public static void main(String[] args) {
        Candy[][] box = new Candy[4][3];
        box[0][1] = new Candy("lime");
        box[1][1] = new Candy("orange");
        box[2][2] = new Candy("cherry");
        box[3][1] = new Candy("lemon");
        box[3][2] = new Candy("grape");
        BoxOfCandy b = new BoxOfCandy(box);
        System.out.println(b);
        System.out.println(b.moveCandyToFirstRow(0));
        System.out.println(b.moveCandyToFirstRow(1));
        System.out.println(b.moveCandyToFirstRow(2));
        System.out.println("");
        System.out.println(b);

        System.out.println("");
        System.out.println("");
        System.out.println("");

        box = new Candy[3][5];
        box[0][0] = new Candy("lime");
        box[0][1] = new Candy("lime");
        box[0][3] = new Candy("lemon");
        box[0][4] = new Candy("orange");
        box[1][0] = new Candy("orange");
        box[1][3] = new Candy("lime");
        box[1][4] = new Candy("lime");
        box[2][0] = new Candy("cherry");
        box[2][2] = new Candy("lemon");
        b = new BoxOfCandy(box);
        System.out.println(b);
        System.out.println(b.removeNextByFlavor("cherry"));
        System.out.println(b);
        System.out.println(b.removeNextByFlavor("lime"));
        System.out.println(b);
        System.out.println(b.removeNextByFlavor("grape"));
        System.out.println(b);
    }
}