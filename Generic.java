package assignment1;

class customException extends Exception
{
    @Override
    public String getMessage()
    {
        return "Strings are not allowed in this function";
    }
}

class genericFunctionClass
{
    public <T> void genericFunction(T... args)
    {
        int itemsToPrint = (args.length * 2)/3;
        try
        {
            for(T i : args)
            {
                if(i instanceof String)
                {
                    throw new customException();
                }
            }
            for(int i = 0; i <= itemsToPrint; i++)
            {
                System.out.println(args[i]);
            }
        }
        catch (customException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
public class Generic
{
    Generic()
    {
        genericFunctionClass gen = new genericFunctionClass();
        gen.genericFunction(1,2,3,"String");
        gen.genericFunction(1,2,3,4,5,6,7,8,9,0);
    }

    public static void main(String[] args)
    {
        Generic test = new Generic();
    }
}

