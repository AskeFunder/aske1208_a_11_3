package SorteOpgaver.ch11.aske1208_a_11_3;

import java.util.LinkedList;

public class three
{
    public void removeInRange(LinkedList<Integer> list, int startIndex, int endIndex)
    {
        for (Integer integer : list)
        {
            System.out.print(integer + ", ");
        }
        System.out.println();

        for (int i = startIndex; i < endIndex; i++)
        {
            if ((list.get(i) % 2) == 0)
            {
                list.remove(i);
                i = i - 1;
                endIndex = endIndex - 1;
            }
        }

        for (Integer integer : list)
        {
            System.out.print(integer + ", ");
        }
        System.out.println();
    }
}
