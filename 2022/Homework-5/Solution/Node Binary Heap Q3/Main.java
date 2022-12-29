public class Main {

    public static void main(String[] args) {
        LLHeapTree obj = new LLHeapTree();
        System.out.printf("The Binary Search Tree Array is created.\nFirstly, the adding process is being tried...\n\n");

        if(obj.add(4)) System.out.printf("\nThe integer object 4 is added successfuly. The current tree is below:\n");
        else System.out.printf("\nThe integer object 4 is NOT added successfuly! The current tree is below:\n");
        System.out.printf("%s",obj.toString());

        if(obj.add(5)) System.out.printf("\nThe integer object 5 is added successfuly. The current tree is below:\n");
        else System.out.printf("\nThe integer object 5 is NOT added successfuly! The current tree is below:\n");
        System.out.printf("%s",obj.toString());

        if(obj.add(6)) System.out.printf("\nThe integer object 6 is added successfuly. The current tree is below:\n");
        else System.out.printf("\nThe integer object 6 is NOT added successfuly! The current tree is below:\n");
        System.out.printf("%s",obj.toString());

        if(obj.add(2)) System.out.printf("\nThe integer object 2 is added successfuly. The current tree is below:\n");
        else System.out.printf("\nThe integer object 2 is NOT added successfuly! The current tree is below:\n");
        System.out.printf("%s",obj.toString());

        if(obj.add(3)) System.out.printf("\nThe integer object 3 is added successfuly. The current tree is below:\n");
        else System.out.printf("\nThe integer object 3 is NOT added successfuly! The current tree is below:\n");
        System.out.printf("%s",obj.toString());

        if(obj.add(8)) System.out.printf("\nThe integer object 8 is added successfuly. The current tree is below:\n");
        else System.out.printf("\nThe integer object 8 is NOT added successfuly! The current tree is below:\n");
        System.out.printf("%s",obj.toString());

        if(obj.add(1)) System.out.printf("\nThe integer object 1 is added successfuly. The current tree is below:\n");
        else System.out.printf("\nThe integer object 1 is NOT added successfuly! The current tree is below:\n");
        System.out.printf("%s",obj.toString());

        System.out.printf("\n\nNow, the removing process is being tried...\n\n");

        if(obj.remove()) System.out.printf("\nThe integer object at the root of the tree is removed successfuly. The current tree is below:\n");
        else System.out.printf("\nThe integer object at the root is NOT removed successfuly! The current tree is below:\n");
        System.out.printf("%s",obj.toString());

        if(obj.remove()) System.out.printf("\nThe integer object at the root of the tree is removed successfuly. The current tree is below:\n");
        else System.out.printf("\nThe integer object at the root is NOT removed successfuly! The current tree is below:\n");
        System.out.printf("%s",obj.toString());

        if(obj.remove()) System.out.printf("\nThe integer object at the root of the tree is removed successfuly. The current tree is below:\n");
        else System.out.printf("\nThe integer object at the root is NOT removed successfuly! The current tree is below:\n");
        System.out.printf("%s",obj.toString());

        if(obj.remove()) System.out.printf("\nThe integer object at the root of the tree is removed successfuly. The current tree is below:\n");
        else System.out.printf("\nThe integer object at the root is NOT removed successfuly! The current tree is below:\n");
        System.out.printf("%s",obj.toString());

    }
}
