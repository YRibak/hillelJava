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

        System.out.println("I'm min element in the tree " + tree.getMin());
        System.out.println("I'm max element in the tree " + tree.getMax());
        System.out.println("1 is contains in the tree " + tree.contains(1));
        System.out.println("22 is contains in the tree " + tree.contains(22));
        System.out.println("23 is contains in the tree " + tree.contains(23));
        System.out.println("I'm max element in the sub tree towards element 5 " + tree.maxSubTree(5));
        System.out.println("I'm min element in the sub tree towards element 5 " +tree.minSubTree(5));
        System.out.println("I'm result of floor method:" + tree.floor(5));
        System.out.println("I'm result of ceiling method: " + tree.ceiling(5));
        System.out.println("Size of my tree: " + tree.getSize());


    }
}
