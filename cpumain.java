
	import java.util.Scanner;

class cpu {
    double price;

    cpu(double p) {
        price = p;
    }

    class processor {
        int cores;
        String manufacturer;

        processor(int a, String b) {
            cores = a;
            manufacturer = b;
        }
    }

    static class ram {
        int memory;
        String manufacturer;

        ram(int m, String n) {
            memory = m;
            manufacturer = n;
        }
    }
}

public class cpumain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the price for cpu");
        double p = sc.nextDouble();
        cpu cpuobj = new cpu(p);

        System.out.println("Enter the no of cores for processor");
        int q = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the manufacturer for processor");
        String r = sc.nextLine();

        cpu.processor proc = cpuobj.new processor(q, r);

        System.out.println("Enter the memory for ram");
        int s = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the manufacturer for ram");
        String t = sc.nextLine();

        cpu.ram r1 = new cpu.ram(s, t);

        System.out.print("\nDetails----------\n");
        System.out.println("CPU price: " + cpuobj.price);
        System.out.println("Processor cores: " + proc.cores);
        System.out.println("Processor manufacturer: " + proc.manufacturer);
        System.out.println("RAM memory: " + r1.memory);
        System.out.println("RAM manufacturer: " + r1.manufacturer);

        sc.close();
    }
}

	
	
