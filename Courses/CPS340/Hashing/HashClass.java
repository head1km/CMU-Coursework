import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Kyle Head Creates a hashtable that stores distinct words from a file
 *         and counts the frequency of each word. I take the absolute value of
 *         java's default hascode function as a hash value. I display the
 *         position in the hashtable of the linked list and it's contents as
 *         well as the frequency of each word.
 * 
 */
public class HashClass {

    public static void main(String[] args) throws IOException {
	String aKey;
	Link dataItem;
	double size, count;
	size = 857;
	count = 0;
	HashClass hashTable = new HashClass(size);
	String aFile = "hw8data";
	File file = new File(aFile);
	Scanner scan = new Scanner(file);
	while (scan.hasNext()) {
	    scan.useDelimiter(" ");
	    aKey = scan.next();
	    dataItem = new Link(aKey);
	    hashTable.insert(dataItem);
	    count++;
	}
	hashTable.displayTable();
	System.out.println("The Load Factor is " + (1 + ((count / size) / 2))
		+ " for successful searches and " + count / size
		+ " for unsucessful searches");
    }

    private SortedList[] hashArray;
    private int arraySize;

    public HashClass(double size) {
	arraySize = (int) size;
	hashArray = new SortedList[arraySize];
	for (int i = 0; i < arraySize; i++)
	    hashArray[i] = new SortedList();
    }

    public void insert(Link theLink) {

	String key = theLink.getKey();
	int hashVal = hashFunc(key);
	hashArray[hashVal].insert(theLink);

    }

    public void displayTable() {
	for (int j = 0; j < arraySize; j++) {
	    System.out.print(j + ". ");
	    hashArray[j].displayList();
	}
    }

    public int hashFunc(String key) {
	int func = Math.abs(key.hashCode() % arraySize);
	return func;
    }

}

class Link {
    private String data;
    private int freq;
    public Link next;

    public Link(String d) {
	data = d;
	freq = 1;
    }

    public String getKey() {
	return data;
    }

    public void setFreq() {
	freq++;
    }

    public void displayLink() {
	System.out.print(data + " freq:" + freq + ", ");
    }
}

class SortedList {
    private Link first;

    public SortedList() {
	first = null;
    }

    public void insert(Link theLink) {
	String key = theLink.getKey();
	Link previous = null;
	Link current = first;

	if (first != null && current.getKey().contentEquals(key))
	    current.setFreq();
	else {
	    while (current != null
		    && key.codePointCount(0, key.length()) > current.getKey()
			    .codePointCount(0, current.getKey().length())) {
		previous = current;
		current = current.next;
	    }
	    if (previous == null)
		first = theLink;
	    else
		previous.next = theLink;
	    theLink.next = current;
	}

    }

    public void displayList() {
	System.out.print("List: ");
	Link current = first;
	while (current != null) {
	    current.displayLink();
	    current = current.next;
	}
	System.out.println("");
    }
}