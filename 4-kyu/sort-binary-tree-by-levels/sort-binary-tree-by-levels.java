import java.util.*;
​
class Kata {
  public static List<Integer> treeByLevels(Node node)
    {
        if(node == null){
            return new ArrayList<>();
        }
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(node);
        List<Integer> list = new ArrayList<>();
        while (!queue.isEmpty()){
            Node current = queue.remove();
            list.add(current.value);
            if (current.left != null)
                queue.add(current.left);
            if (current.right != null)
                queue.add(current.right);
        }
        return list;
    }
}