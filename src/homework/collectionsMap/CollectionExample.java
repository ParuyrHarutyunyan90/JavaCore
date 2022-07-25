package homework.collectionsMap;

import java.util.*;

public class CollectionExample {

    public static void main(String[] args) {
        String[] str = {"hello", "2", "from", "3", "4", "java"};
        List<String> stringList = new ArrayList<>(List.of(str));
        printFirstFive(stringList);
    }

    //մեթոդը գրել այնպես, որ կանչենք, ու իրան ստրինգների մասիվ տանք,
    // ինքը վերադարձնի նույն էլեմենտներով ArrayList
    static List<String> arrayToList(String[] values) {
        List<String> stringList = new ArrayList<>(List.of(values));

        return stringList;
    }

    //մեթոդը գրել այնպես, որ կանչենք ու տանք ինչ որ լիստ, ու ինդեքս,
    // ինքը ջնջե էդ ինդեքսի տակ գտնվող էլեմենտը, ու վերադարձնե նույն լիստը,
    // առանց էդ էլեմենտի։
    static List<String> removeById(List<String> list, int index) {
        list.remove(index);
        return list;
    }

    // մեթոդը գրել այնպես, որ ընդունի ցանկացած String-ների լիստ,
    // վերադարձնի նույն արժեքներով HashSet
    static Set<String> listToSet(List<String> list) {
        return (HashSet<String>) list;
    }

    // մեթոդը գրել այնպես, որ ընդունի ցանկացած Integer-ների լիստ,
    // վերադարձնի նույն արժեքներով LinkedList-ի օբյեկտ։
    static LinkedList<Integer> listToLinkedList(List<Integer> list) {
        return (LinkedList<Integer>) list;
    }

    // մեթոդը գրել այնպես, որ ընդունի ցանկացած Integer-ների լիստ,
    // վերադարձնի նոր լիստ, որի մեջ էլեմենտները կլինեն հակառակ հերթականությամբ։
    static List<Integer> reverseNumbers(List<Integer> list) {
        List<Integer> list1 = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            list1.add(list.get(i));
        }
        return list1;
    }

    // մեթոդը գրել այնպես, որ ինչ մեծությամբ լիստ էլ տանք էս մեթոդին, ինքը տպե մենակ սկզբի 5 հատը։
    static void printFirstFive(List<String> list) {
        System.out.println(list.subList(0, 4));

    }

    // մեթոդը գրել այնպես, որ ինչ list տանք վերադարձնի թե քանի էլեմենտ կա էդ լիստ-ի մեջ
    static int sizeOfList(List<String> list) {
        return list.size();
    }

}