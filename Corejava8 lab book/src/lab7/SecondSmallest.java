package lab7;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
public class SecondSmallest 
{
public int getSecondSmallest(int[] a)
{
	int len=a.length;
	ArrayList<Integer> l=new ArrayList<>();
	for(int a1:a)
	{
		l.add(a1);
	}
	Collections.sort(l);
	return l.get(1);
}
}
