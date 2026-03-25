public class CPU {

    double price;

 
    CPU(double price) {
        this.price = price;
    }

 
    class Processor {
        int numberOfCores;
        String manufacturer;

        Processor(int numberOfCores, String manufacturer) {
            this.numberOfCores = numberOfCores;
            this.manufacturer = manufacturer;
        }

        void displayProcessor() {
            System.out.println("Processor Information:");
            System.out.println("Number of Cores: " + numberOfCores);
            System.out.println("Manufacturer: " + manufacturer);
        }
    }

    // Static Nested Class
    static class RAM {
        int memory;
        String manufacturer;

        RAM(int memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }

        void displayRAM() {
            System.out.println("RAM Information:");
            System.out.println("Memory: " + memory + "GB");
            System.out.println("Manufacturer: " + manufacturer);
        }
    }

    // Main method inside CPU class
    public static void main(String[] args) {

        CPU cpu = new CPU(50000);

        CPU.Processor processor = cpu.new Processor(6, "Intel");
        CPU.RAM ram = new CPU.RAM(16, "Kingston");

        System.out.println("CPU Price: " + cpu.price);
        processor.displayProcessor();
        ram.displayRAM();
    }
}
