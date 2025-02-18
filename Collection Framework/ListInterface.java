import java.util.*;
public class ListInterface{
    public static void main(String[] args) {

        // **ARRAYLIST CLASS**

        // creating object of list interface
        // implementing ArrayList class
        
        List<Integer> a1 = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        // List<Integer> al1 = new ArrayList<>(List.of()); // another way
        System.out.println("Elements in List al1 are: "+a1);

        a1.add(0,1); // adding element to  object of list interface
        a1.add(1,2);
        a1.add(2,3);

        System.out.println("Elements is list1 are: "+a1);

        // creating object of another list interface
        List<Integer> a2= new  ArrayList<Integer>();
        a2.add(0,4);
        a2.add(1,5);
        System.out.println("Elements is list2 are: "+a2);

        a1.addAll(3,a2); // adding element from the 3rd index in list1
        System.out.println("New list1: "+a1); // intersection of both list
        System.out.println("Size of list1 is: "+a1.size()); // size of list
        System.out.println("List1 is empty or not: "+a1.isEmpty()); // checking the list is empty 
        System.out.println("The Specified element is there or not: "+a1.contains(2)); // checking specified element
        System.out.println("list1 equals list2: "+a1.equals(a2));
        System.out.println("list1 after removing specified element: "+a1.remove(3)); // removing element
        System.out.println("Element at specified index in list1:"+a1.get(0)); // element at index
        System.out.println("Replacing the element at index: "+a1.set(2, 20)); // replacing the element
        System.out.println("Index of element is: "+a1.indexOf(3)); // returning the index of specified element



        //**LINKEDLIST CLASS**

        // creating the object of list interface
        //implementing linkedlist class

        int n=5;// declaring the size linked list
        List<Integer> l1 = new LinkedList<Integer>();

        for(int i=1;i<=n;i++){l1.add(i);}
        System.out.println("The elements in list are: "+l1); // printing the elements
        l1.remove(Integer.valueOf(3)); // removing element from 3rd index
        System.out.println("list after removing the element :"+l1);



        // **STACK CLASS**

        // creating the object of list interface
        // implementing stack class

         int m =5; // size of stack
        List<Integer> s1= new Stack<Integer>();       

        for(int i=1;i<=m;i++){
            s1.add(i);
        }
        System.out.println("Element in the list are: "+s1); // printing the elements

        s1.remove(2);
        s1.remove(3);
        System.out.println("Elements after removing the element: "+s1);
        


        // **VECTOR CLASS**

        // creating the object of list interface
        // implementing vector class

        int p =5; // size of stack
        List<Integer> v1= new Vector<Integer>(p);
        
        for(int i=1;i<=p;i++){
            v1.add(i);
        }
        System.out.println("Element in the list are: "+v1); // printing the elements

        v1.remove(2);
        v1.remove(3);
        System.out.println("Elements after removing the element: "+v1);
    }
}