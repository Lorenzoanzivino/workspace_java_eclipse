# Architettura del Progetto :

## Elevator Pitch

_“Come ho strutturato il progetto?”_ :

> Ho utilizzato una **Layered Architecture (architettura a livelli)** per garantire una chiara separazione delle responsabilità, migliorare la manutenibilità del codice e facilitare l’estendibilità e il testing dell’applicazione.

Questa scelta evita l’accoppiamento tra le parti del sistema e rende ogni livello responsabile di un solo compito ben definito.

---

## Struttura a Livelli :

### Entity

**Entity** - _"entity/Resource.java"_ rappresenta il **modello di dominio persistente** dell’applicazione.

È una **JPA Entity** che mappa una risorsa applicativa su una tabella del database e definisce in modo esplicito la struttura dei dati salvati a livello di persistenza.

### Responsabilità

- Definire la struttura dei dati persistiti
- Mappare i campi dell’oggetto alle colonne del database
- Rappresentare lo stato interno della risorsa nel dominio applicativo

Non contiene:

- logica di business
- logica di presentazione
- dipendenze da controller o servizi

### Campi principali

- `id`  
  Identificatore univoco della risorsa (chiave primaria).

- `nome`  
  Nome descrittivo della risorsa.

- `descrizione`  
  Testo esplicativo che descrive il contenuto o lo scopo della risorsa.

- `url`  
  Collegamento esterno associato alla risorsa (documentazione, sito, repository, ecc.).

- `categoria`
  Categoria funzionale della risorsa, utilizzata per la classificazione e il filtraggio logico (es. _framework_, _libreria_, _tool_, _API_).  
  Rappresenta un attributo di dominio e può essere modellata come una Stringa o, in futuro, come un'Enum per limitare i valori possibili.

- `dataInserimento`  
  Data e ora di creazione della risorsa, inizializzata automaticamente (`LocalDateTime.now()`).

### Getter e Setter

La classe espone getter e setter per consentire a JPA e ai layer superiori (Service / Mapper) di accedere e modificare lo stato dell’entità in modo controllato.

### Nota Architetturale

`ResourceEntity` è un **dettaglio interno del layer di persistenza**.

Per evitare di esporre direttamente la struttura del database tramite le API, l’Entity viene convertita in un **DTO** prima di essere restituita al client.

---

### Controller

Il **Controller** - _"controller/ResourceController.java"_ gestisce esclusivamente l’interfaccia HTTP (REST).

- Espone gli endpoint
- Valida i dati in ingresso (a livello superficiale)
- Delega completamente la logica applicativa al Service

Non contiene:

- logica di business
- accesso diretto al database

Questo mantiene il layer web sottile e facilmente sostituibile.

---

### Service

Il **Service** - _"service/ResourceService.java"_ contiene la logica applicativa.

- Implementa le regole di business
- Coordina le operazioni
- Gestisce le transazioni
- È l’unico layer che comunica con il Repository

Il Service rappresenta il **cuore dell’applicazione** ed è indipendente dal trasporto (HTTP) e dal database.

---

### Repository (Spring Data JPA)

Il **Repository** _("DAO")_ - _"repository/ResourceRepository.java"_ astrae completamente l’accesso ai dati.

- Utilizza Spring Data JPA
- Evita la scrittura manuale di query SQL
- Esente _"JpaRepository"_ ottienendo i metodi CRUD standard (save, findById, delete, ecc.) senza scrivere codice. È il vero vantaggio pratico.
- Rende il codice indipendente dal database specifico

Questo approccio consente di cambiare DBMS con impatto minimo sul codice applicativo.

---

### DTO (Data Transfer Object)

I **DTO** - _dto/ResourceDTO.java_ sono usati per separare:

- **Entity** → modello di persistenza (database)
- **DTO** → modello esposto tramite API

Vantaggi:

- non si espone mai direttamente la struttura del database
- maggiore sicurezza
- maggiore controllo sui dati in ingresso e in uscita

Le Entity restano un dettaglio interno dell’applicazione.

---

### Perché usare interfacce nel Service e l’injection nel costruttore?

Per rispettare il principio della **Dependency Injection**.

Questo approccio:

- elimina l’uso diretto di `new`
- riduce l’accoppiamento
- rende il codice più testabile (mock o repository finti nei test)
- migliora la leggibilità e la pulizia del design

---

### A cosa serve il DataInitializer?

Il **DataInitializer** serve a popolare il database in fase di sviluppo con dati di test (mock data).

- utile per sviluppo e debugging
- accelera il test delle API

In un ambiente di produzione:

- verrebbe disabilitato
- oppure sostituito da migrazioni strutturate (es. Flyway o Liquibase)

---

## Conclusione

Questa architettura segue principi consolidati di progettazione software:

- separazione delle responsabilità
- manutenibilità
- testabilità
- scalabilità

È una struttura standard, ma applicata in modo consapevole e motivato.
