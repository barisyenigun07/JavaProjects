package Homework2;
import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Room room = new Room();
        StorageArea storageArea = new StorageArea();
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader("src/instructions.txt")))) {
            while (scanner.hasNextLine()) {
                String info = scanner.nextLine();
                String[] array = info.split(",");
                String instruction = array[0];
                String argument = array[1];
                if (instruction.equals("caregiver")){
                    System.out.print("CareGiver tries to feed: ");
                    if (room.size() != 0){ //If there is no animal in the shelter, the feed action cannot be done!
                        if (storageArea.feed()){
                            System.out.println("SUCCESS");
                        }
                        else {
                            System.out.println("FAIL");
                        }
                    }
                    else{
                        System.out.println("FAIL");
                    }
                }
                else if (instruction.equals("donor")){
                    System.out.print("Donors try to donate: ");
                    if (argument.equals("cannedfood")){
                        if (storageArea.pushCannedFood()){
                            System.out.println("SUCCESS");
                        }
                        else{
                            System.out.println("FAIL");
                        }
                    }
                    else if (argument.equals("dryfood")){
                        if (storageArea.pushDryFood()){
                            System.out.println("SUCCESS");
                        }
                        else{
                            System.out.println("FAIL");
                        }
                    }
                }
                else if (instruction.equals("rescuer")){
                    if (argument.equals("dog")){
                        System.out.print("Rescuer tries to adopt a dog: ");
                        if (room.dequeueDog()){
                            System.out.println("SUCCESSS");

                        }
                        else{
                            System.out.println("FAIL");
                        }
                    }
                    else if (argument.equals("cat")){
                        System.out.print("Rescuer tries to adopt a cat: ");
                        if (room.dequeueCat()){
                            System.out.println("SUCCESS");

                        }
                        else{
                            System.out.println("FAIL");
                        }
                    }
                    else if (argument.equals("any")){
                        System.out.print("Rescuer tries to adopt any animal: ");
                        if (room.dequeueAny()){
                            System.out.println("SUCCESS");

                        }
                        else{
                            System.out.println("FAIL");
                        }
                    }
                }
                else if (instruction.equals("animalcontrol")){
                    System.out.print("AnimalControl tries to bring new animals: ");
                    if (argument.equals("dog")){
                        if (room.enqueueDog()){
                            System.out.println("SUCCESS");
                        }
                        else{
                            System.out.println("FAIL");
                        }
                    }
                    else if (argument.equals("cat")){
                        if (room.enqueueCat()){
                            System.out.println("SUCCESS");

                        }
                        else{
                            System.out.println("FAIL");
                        }
                    }
                }

            }
        } catch (FileNotFoundException ex) {
            System.out.println("File not found!");
        }
    }
}
