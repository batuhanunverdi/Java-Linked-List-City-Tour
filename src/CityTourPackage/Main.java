package CityTourPackage;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
public class Main {
    public static void showProcess()
    {
        System.out.println("0 Show Processes again");
        System.out.println("1 Go to next city");
        System.out.println("2 Go to previous city");
        System.out.println("3 Leave the Program");
    }
    public static void TourTheCities(LinkedList<String> cities)
    {
        ListIterator<String> iterator = cities.listIterator();
        int process;
        showProcess();
        Scanner scanner = new Scanner(System.in);
        if (!iterator.hasNext())
        {
            System.out.println("There is no city.");
        }
        boolean exit = false;
        boolean next = true;
        while (!exit)
        {
            System.out.println("Choose a process");
            process = scanner.nextInt();
            switch(process)
            {
                case 0:
                    showProcess();
                    break;
                case 1:
                    if(!next)
                    {
                        if(iterator.hasNext())
                        {
                            iterator.next();
                        }
                        next = true;
                    }
                    if(iterator.hasNext())
                    {
                        System.out.println("Going to City "+iterator.next());
                    }
                    else
                    {
                        System.out.println("There is no city to go");
                        next = true;
                    }
                    break;

                case 2:
                    if(next)
                    {
                        if(iterator.hasPrevious())
                        {
                            iterator.previous();
                        }
                        next = false;
                    }
                    if(iterator.hasPrevious())
                    {
                        System.out.println("Going to City"+iterator.previous());
                    }
                    else
                    {
                        System.out.println("City tour has started");
                    }
                    break;
                case 3:
                    exit = true;
                    System.out.println("Leaving The Program");
                    break;
            }
        }
    }
    public static void main(String[] args) {
        LinkedList<String> Cities = new LinkedList<String>();
        Cities.add("Sivas");
        Cities.add("Ankara");
        Cities.add("Antalya");
        Cities.add("İstanbul");
        TourTheCities(Cities);
    }
}
