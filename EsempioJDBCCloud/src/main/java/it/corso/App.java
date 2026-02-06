package it.corso;

import java.util.Scanner;

import it.corso.dao.ToDoDao;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Premi 1 per aggiungere un task, premi 2 per vedere la lista di task");
			int scelta = sc.nextInt();
			if (scelta != 9) {

				switch (scelta) {
				case 1:
					while (true) {
						System.out.println("Inserisci il nome del task");
						String sceltaTask = sc.nextLine();
						if (!sceltaTask.isEmpty() || !sceltaTask.isBlank()) {
							ToDoDao.inserisciTask(sceltaTask);
							break;
						} else {
							System.out.println("Errore, Inserisci un nome valido");
						}
					}
				case 2:
					ToDoDao.findAll();

				default:
					System.out.println("Errore, scelta non valida");

				}

			}
			System.out.println("----------Inserisci il nuovo task-----------");
			String task = sc.nextLine();

			if (task.isBlank()) {
				System.out.println();
			}
			boolean ok = ToDoDao.inserisciTask(task);

			if (ok) {
				System.out.println("Task inserito correttamente");
			} else {
				System.out.println("Task non salvato");
			}

		}

	}
}
