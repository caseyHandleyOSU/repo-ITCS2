public class HelloWorld
{
    public char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    public static void main(String[] args)
    {
        System.out.println("Hello, world!");

        String[] printArray = {"By","the","power","of","arrays,","I've","printed","this!"};
        String processed;
        for (int i = 0; i < printArray.length; i++) //Combine all elements of printArray into one line with a forLoop
        {
            System.out.print(" " + printArray[i]);
        }

        sortStringArray(printArray);
    }

    public static String[] sortStringArray(String[] input)
    {
        String[] sorted = input;
        Boolean finished = false;
        
        for(int i = 0; i < input.length; i++)
        {
            if(input[i].charAt(0) < sorted[i].charAt(0))
            {
                System.out.println("Lesser @ " + i);
            }
            System.out.println(i);
        }
        
        return sorted;
    }
}