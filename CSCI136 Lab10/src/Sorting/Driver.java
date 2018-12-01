package Sorting;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;



public class Driver {

	public static void main(String[] args) {
		File myFile = new File("./src/Coyote and the Bitterroot Valley.txt");
		File myFile1 = new File("./src/Coyote.txt");
		Scanner myFileScanner = null;
		
		try {
			myFileScanner = new Scanner(myFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ArrayList<String> file1 = new ArrayList();
		
		while(myFileScanner.hasNextLine()) {
			String line = myFileScanner.nextLine();
			
			Scanner myLineScanner = new Scanner(line);
			myLineScanner.useDelimiter("[\\s\\n\\t*.?!-,\":]");
			while(myLineScanner.hasNext()) {
				file1.add(myLineScanner.next());
				
			}
		}
		
		
		
		for(int i = 0; i < file1.size(); i++){
			if(file1.get(i).equalsIgnoreCase("the")) {
				file1.remove(i);
			}
		}
		for(int j = 0; j < file1.size(); j++) {
			if(file1.get(j).equalsIgnoreCase("in")) {
				file1.remove(j);
			}
		}
		for(int k = 0; k < file1.size(); k++) {
			if(file1.get(k).equalsIgnoreCase("and")) {
				file1.remove(k);
			}
		}
		for(int h = 0; h < file1.size(); h++) {
			if(file1.get(h).equalsIgnoreCase("a")) {
				file1.remove(h);
			}
		}
		for(int g = 0; g < file1.size(); g++) {
			if(file1.get(g).equalsIgnoreCase("it")) {
				file1.remove(g);
			}
		}
		for(int f = 0; f < file1.size(); f++) {
			if(file1.get(f).equalsIgnoreCase("on")) {
				file1.remove(f);
			}
			//System.out.println(file1.get(f));
		}
		
		String[] newerFile1 = file1.toArray(new String[file1.size()]);
		for(int b = 0; b < newerFile1.length; b++) {
			newerFile1[b] = newerFile1[b].trim();
		}
		Sorting.insertionSort(newerFile1);
		
		
		for(int a = 0; a < newerFile1.length; a++) {
			int count = 0;
			int c = 0;
			if(newerFile1[a] == newerFile1[c])
			
			System.out.println(newerFile1[a]);
		}
		
		Arrays.stream(newerFile1)
	      .collect(Collectors.groupingBy(s -> s))
	      .forEach((k, v) -> System.out.println(k+" "+v.size()));
		
		
			
		
	}
	

}
