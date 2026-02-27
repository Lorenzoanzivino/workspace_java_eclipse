package it.corso;

import java.util.Scanner;
import it.corso.dao.ToDoDao;

public class App {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                System.out.println("Premi 1 per aggiungere un task, premi 2 per vedere la lista di task, premi 9 per uscire");
                int scelta = sc.nextInt();
                sc.nextLine(); // Consuma il \n rimasto

                if (scelta == 9) {
                    System.out.println("Uscita...");
                    break;
                }

                switch (scelta) {
                    case 1:
                        while (true) {
                            System.out.println("Inserisci il nome del task");
                            String sceltaTask = sc.nextLine();
                            if (!sceltaTask.trim().isEmpty()) {
                                boolean ok = ToDoDao.inserisciTask(sceltaTask);
                                if (ok) {
                                    System.out.println("Task inserito correttamente");
                                } else {
                                    System.out.println("Task non salvato");
                                }
                                break;
                            } else {
                                System.out.println("Errore, inserisci un nome valido");
                            }
                        }
                        break;

                    case 2:
                        ToDoDao.findAll();
                        break;

                    default:
                        System.out.println("Errore, scelta non valida");
                        break;
                }
            }
        }
    }
}