package javaplay;

public class Grade {
	public static void main(String[] args) {
		if(args.length==1){
			String type = args[0];
			switch (type) {
			case "a":
				System.out.println("first mark");
				break;
			case "b":
				System.out.println("second mark");
				break;
			default:
				System.out.println("not matched");
				break;
			}
		}else {
			System.out.println("No Argument provided");
		}
	}

}
