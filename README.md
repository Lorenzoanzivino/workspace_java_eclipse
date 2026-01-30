# Workspace Java Eclipse

## Descrizione
Questo repository contiene un workspace Eclipse dedicato a progetti Java didattici e personali. Include applicazioni, esercizi e progetti Spring, organizzati in cartelle con `src` e package tematici. La struttura è pensata per esercizi, lezioni e sviluppo continuo, pronta per il versionamento su GitHub.

---

## Struttura
Ogni cartella principale corrisponde a un **Project Eclipse**:
- `BibliotecaCampus` → Applicazione gestione biblioteca
- `java_project_01` → Esercizi e piccoli progetti Java suddivisi per package/lezione
- `RipassoEsame` → Progetti di ripasso con esercizi per preparazione esami
- `spring01` → Progetto Spring Boot con Maven
- `Test` → Piccoli esperimenti o test di codice
- `Testing` / `TestTamagotchi` → Progetti di test o esercizi sperimentali

All’interno di ogni project:
```bash
Project
├── src
│ └── package
│ └── file.java
├── bin / target # directory generate da Eclipse / Maven
└── pom.xml # solo se progetto Maven
```

---

- **Project** → corrisponde a una cartella principale importata in Eclipse  
- **Package** → sotto-cartelle di `src` che organizzano le classi per tema o lezione  
- **File.java** → singoli file sorgente

---

## Come importare in Eclipse
1. Aprire Eclipse
2. `File → Import → Existing Projects into Workspace`
3. Selezionare la root: cartella del repository clonata (`workspace_java_eclipse`)
4. Spuntare `Copy projects into workspace` se vuoi duplicare i progetti locali
5. Ogni cartella principale diventerà un Project
6. Dentro ogni Project vedrai: `src → package → .java files`

---

## Maven (per progetti Spring o con pom.xml)
Per i progetti con `pom.xml` (es. `spring01`, `Test`):
- `Right-click Project → Maven → Update Project`
- `Run as → Maven build` o `Run as → Spring Boot App` per Spring
- Le dipendenze verranno scaricate automaticamente e il target/`classes` sarà aggiornato

---

## Note
- Mantieni i bin/target fuori dal controllo versione, Git ignorerà questi file tramite `.gitignore`
- Organizza i nuovi esercizi creando un nuovo package dentro `src` del project corrispondente
- Tutti i progetti sono pronti per import in Eclipse o esecuzione locale

