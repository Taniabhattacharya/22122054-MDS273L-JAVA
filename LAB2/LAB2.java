import java.util.Arrays;
import java.util.Scanner;
public class LAB2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int k = 0;

		String[] arr = new String[1024];
		String[] newarr = new String[arr.length-1];
		boolean flag = true;

		String search;

		String Del_Name;
		int search_index;


		do{
			System.out.println("***************************************");
			System.out.println("1.Enter a name.");
			System.out.println("2.Search for a name.");
			System.out.println("3.Remove a name");
			System.out.println("0.Exit");
			System.out.println("***************************************");
			

			System.out.println();
			System.out.print("Enter Your Choice:");
			int ch = Integer.parseInt(sc.nextLine());
	
			switch (ch) {

				case 1: {
					Boolean ExistName = false;

					System.out.println("Enter the name:");

					String name = sc.nextLine();

					for (String s : arr) {
						if (name.equalsIgnoreCase(s)) {
							System.out.println(name + " already exist in the list.");
							System.out.println("Please enter different name.");
							ExistName = true;
							break;
						}
					}

					if (ExistName == false) {
						arr[k++] = name;
						System.out.println(name + " added successfully.");
					}

                    for(int i = 0 ; i<arr.length ; i++){
                        if(arr[i]!=null){
                            System.out.print(arr[i]+",");
                        }
                    }
   
					break;
				}
				case 2: {
					System.out.print("Search Name: ");

					search = sc.nextLine();

					search_index = 0;
					for (String s : arr) {
						search_index++;
						if (search.equalsIgnoreCase(s)) {
							System.out.println(search + " is in the list at " + search_index + "th position");
							break;
						}
					}

					break;
				}
				case 3: {
					System.out.print("Enter name: ");

					Del_Name = sc.nextLine();

					for (int i = 0, p = 0; i < arr.length; i++) {
						if (arr[i] == Del_Name) {
							arr[i] = arr[arr.length-1];
						}
					}

					System.out.println("\n-----------------------------------");
					System.out.println("Name Successfully Removed.");
					for (int i = 0; i < k; i++) {
						System.out.print(arr[i] + ",");
					}

					break;
				}
				case 0: {
					flag = false;
					break;
				}
				default: {
					System.out.println("\nEnter valied input.\n");
					break;
				}
			}
		}while(flag);
	}
}