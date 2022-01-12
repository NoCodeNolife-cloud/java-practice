import java.util.Arrays;
import java.util.Random;

/**
 * ProjectName: merge lists
 * Author: Administrator
 * Date: 2022/1/10 15:31
 * Description:
 */
public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Node node1 = makeLinkList(random.nextInt(20));
        Node node2 = makeLinkList(random.nextInt(20));
        System.out.println(node1);
        System.out.println(node2);
        System.out.println(mergeLinkList(node1, node2));
    }

    public static Node mergeLinkList(Node root1, Node root2) {
        if (root1 == null) {
            return root2;
        }
        if (root2 == null) {
            return root1;
        }
        Node result;
        if (root1.val > root2.val) {
            result = root2;
            root2 = root2.next;
        } else {
            result = root1;
            root1 = root1.next;
        }
        Node tmp = result;
        while (root1 != null && root2 != null) {
            if (root1.val > root2.val) {
                tmp.next = root2;
                tmp = tmp.next;
                root2 = root2.next;
            } else {
                tmp.next = root1;
                tmp = tmp.next;
                root1 = root1.next;
            }
        }
        if (root1 != null) {
            tmp.next = root1;
            tmp = tmp.next;
        }
        if (root2 != null) {
            tmp.next = root2;
        }
        return result;
    }

    public static Node makeLinkList(int len) {
        Random random = new Random();
        int[] tmp = new int[len];
        for (int i = 0; i < len; i++) {
            tmp[i] = random.nextInt(100);
        }
        Arrays.sort(tmp);
        if (len <= 0) {
            return null;
        }
        Node result = new Node(tmp[0]);
        Node point = result;
        if (len == 1) {
            return result;
        }
        for (int i = 1; i < len; i++) {
            point.next = new Node(tmp[i]);
            point = point.next;
        }
        return result;
    }
}

class Node {

    public int val;

    public Node next;

    public Node(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        if (next != null) {
            return val + " " + next;
        } else {
            return Integer.toString(val);
        }
    }
}
