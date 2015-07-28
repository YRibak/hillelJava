package homework10;

/**
 * Created by yura on 27.07.15.
 */
public class AppTree {
    public static void main(String[] args) {
        MyTreeSet tree = new MyTreeSet();
        tree.add(8);
        tree.add(5);
        tree.add(10);
        tree.add(4);
        tree.add(1);
        tree.add(14);
        tree.add(21);
        tree.add(7);
        tree.add(19);
        tree.add(6);

        System.out.println(tree.getMin());
        System.out.println(tree.getMax());
        System.out.println(tree.contains(1));
        System.out.println(tree.contains(22));
        System.out.println(tree.contains(23));
        System.out.println(tree.maxSubTree(5));
        System.out.println(tree.minSubTree(5));
        System.out.println(tree.floor(5));
        System.out.println(tree.ceiling(5));


    }
}
