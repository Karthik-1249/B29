package Package.com.kk.samplearraylistsorting;

import java.util.ArrayList;
import java.util.LinkedList;

import javax.print.attribute.IntegerSyntax;

public class ConvertLinkedListToArrayList {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(40);
		list.add(60);
		System.out.println(list);
		ArrayList<Integer> alist = new ArrayList<>();
		alist.add(10);
		alist.add(40);
		alist.add(60);
		System.out.println(alist);

	}

}
