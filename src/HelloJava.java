import kotlin.test.Asserter;
import kotlin.test.AssertionsKt;

import java.util.*;

public class HelloJava {
    public static void main(String[] args) {
//        String res = FilesUtils.eliminateDuplications("/home/yossifnassar/IdeaProjects/Training/src/yossif");
//        System.out.println(res);am","'Yossif"};
//        List<String> mergeRes = StringUtils.merge(words,words2);
//
////        String[] words = {"hello","world"};
////        String[] words2 = {"I","
//
//        System.out.println(Arrays.toString(mergeRes.toArray()));

//        String uniqueStr = "abc";
//        String notUniqueStr = "abcc";
//        System.out.println(StringUtils.isUnique(uniqueStr));
//        System.out.println(StringUtils.isUnique(notUniqueStr));

//        YLinkedList linkedList = new YLinkedList(1,2,3,4);
//        linkedList.reverse();
//        linkedList.forEach(e -> System.out.println(e));

//        YStack<Integer> stack = new YStack<>();
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        while(!stack.isEmpty()) {
//            System.out.println(stack.pop());
//        }
//
//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(1);
//        queue.add(2);
//        queue.add(3);
//        YQueue<Integer> myQueue = new YQueue<>();
//        myQueue.add(1);
//        myQueue.add(2);
//        myQueue.add(3);
//
//        AssertionsKt.assertEquals(queue.remove(),myQueue.remove(), "should be equal");
        Graph<String> graph = new Graph<>();
        graph.addVertices("A","B","C","D");
        graph.addEdge("A","B");
        graph.addEdge("A","D");
        graph.addEdge("B","C");
        List<String> topological = graph.topologicalSort();
        topological.forEach(a -> System.out.println(a));
    }
}
