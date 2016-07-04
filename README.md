Schrittweise Vorgehensweise - Kommentar
=======================================

Es soll ein Ticketsystem entwickelt werden, welches es einem Angestellten
einer IT-Firma erlaubt Anfragen von Kunden zu verwalten. Dazu soll der
Angestellte verschiedene Tickets in das System einpflegen können.
Außerdem soll er ihnen einen Status, eine Beschreibung und einer
Priorität zuordnen können. Zusätzlich sollen noch andere Angaben
abhängig von der Art des Tickets gemacht werden können. Insgesamt soll
es drei Ticketarten geben. Erstens ein Ticket für Anfragen, zweitens
eins für Bestellungen und drittens eins für Störungen. Nachdem das
Ticket angelegt wurde, soll ein Angestellter in der Lage sein den Status
und die Priority des Tickets zu ändern. Außerdem soll ein Angestellter
Notizen zu einem Ticket hinzufügen können.

Schritt 1 (feature/ticket)
--------------------------

### Aufgaben
* Erstelle die Klasse Ticket mit passenden Attributen und einem geeignetem
  Konstruktor. Danach erzeuge in der main-Methode ein neues Ticket Objekt.
* Was passiert, wenn du ein neues Ticket Objekt mit "new Ticket()" anlegt und warum?

### Ziele
* Verhältnis von Objekt und Klasse
* Die Klasse Ticket soll angelegt werden.
    * Wie in der Vorlesung (siehe VE03 Folie 11) werden zur Kapselung von
      Attributen direkt Getter/Setter verwendet.
    * Außerdem soll die Rolle des Default-Konstruktors thematisiert werden,
      indem Ticket-Objekte erzeugt werden.

### UML
![UML-Diagramm](docs/step_1.png?raw=true)

Schritt 2 (feature/customer-employee)
-------------------------------------

### Motivation
* Der Angestellte, sowie der Kunde sollen noch weitere Angaben erhalten. Dazu
  ist es sinnvoll die Beiden in eigene Klassen zu extrahieren.

### Aufgaben
* Erstelle die Klasse Employee und Customer. Danach passe die Klasse Ticket
  entsprechend an.
* Erzeuge ein neues Ticket Objekt.
* Was wird ausgeben?

### Ziele
* Unterschied von pass-by-value und pass-by-referenz
* Festigung der Begriffe Assoziation, Aggregation und Komposition

### UML
![UML-Diagramm](docs/step_2.png?raw=true)

Schritt 3 (feature/ticketmanager-array)
---------------------------------------

### Motivation
* Um eine vielzahl von Tickets sinnvoll verwalten zu können, biete es sich an
  eine Datenstruktur zu verwenden. Wir werden zunächst Arrays einsetzen. Da wir
  auch Methoden, die auf der Datenstruktur arbeiten, erstellen wollen, ist es
  sinnvoll eine Klasse TicketManager hinzufügen, die sich um die Verwaltung der
  Tickets kümmert.
* Außerdem ist es sinnvoll den Tickets ein Erstellungsdatum zu geben, um
  Tickets die lange nicht bearbeitet wurden herauszufiltern.

### Aufgaben
* Füge der Klasse Ticket das Attribut creationDate hinzu. Bei der Erstellung
  eines Tickets soll in diesem das aktuelle Datum gespeichert werden. Dazu
  sollst du die Klasse Date aus der Standardbibliothek von Java verwenden.
* Erstelle die Klasse TicketManager.
    * Der Konstruktor die Speicherkapazität bekommen
    * Die Methode add soll ein oder mehrere Tickets hinzufügen (Tipp: verwende
      dazu VarArgs)
    * Die Methode getOldest soll das älteste Ticket zurückgeben (Tipp: verwende
      dazu compareTo)
    * Die Methode next soll das Ticket zurückgeben, welches am höchsten
      priorisiert ist. Wenn zwei gleich priorisiert sind, entscheidet das
      creationDate - das älteste Ticket wird bevorzugt.

### Ziele
* Einführung von Paketen
* Umgang mit Arrays
* Umgang mit VarArgs

### UML
![UML-Diagramm](docs/step_3.png?raw=true)

Schritt 4 (feature/ticketmanager-list)
--------------------------------------

### Motivation
* Die Datenstruktur, die wir im Schritt 3 verwendet haben, ist sehr limitiert
  eignet sich nicht für größere Datenmengen oder einen Einsatz über einen
  längeren Zeitraum, da wir im Vorhinein festlegen müssen wie viel Speicherplätze
  wir reservieren. Daher weichen wir auch die Datenstruktur Liste aus.

### Aufgaben
* Implementiere die fehlenden Methoden der Klasse Liste und Klasse Node.
* Passe die anderen Klassen so an, dass anstelle des Arrays eine Liste verwendet
  wird. Dabei sollen alle Methoden ihre Funktionalität behalten.
  
### Ziele
* Umgang mit Listen

### UML
![UML-Diagramm](docs/step_4.png?raw=true)

Schritt 5 (feature/ticket-notes)
--------------------------------

### Motivation
* Im nächsten Schritt wollen wir den Tickets Notizen hinzufügen. Dafür soll jedes
  Ticket eine Liste von Notizen haben. Da es umständlich ist und zu doppelten
  Quellcode führen würde NoteList und NoteNode anzulegen, werden wir deshalb eine
  allgemeine Liste programmieren. Dazu verwenden wir Generics, diese ermöglichen
  es uns erst bei der Deklaration der List den Typ der beinhaltenden Objekte 
  festzulegen.

### Aufgaben
* Erstelle die Klasse List und die Klasse Note im Package util
* Lösche die Klasse TicketList und TicketNode und passe den TicketManager
  entsprechen an
* Erstelle die Klasse Note und füge der Klasse Ticket eine Liste von Notizen hinzu.
* Ergänze im Ticket die Methoden addNote und removeNote

### Ziele
* Umgang mit Generics
* Explizite Anwendung von Paketen 

### UML
![UML-Diagramm](docs/step_5.png?raw=true)

Schritt 6 (feature/ticketmanager-binarytree)
--------------------------------------------

### Motivation
Aus Geschwindigkeitsgründen ist es sinnvoll auf Binäredatenstrukturen zu setzten.
Daher werden wir im Folgenden die Listen aus den Managern durch Binärebäume
ersetzten.

### Aufgaben
* Implementiere die Klasse BinaryTree
* Tausche die Listen durch Binärbäume aus
* Passe die übrigen Methoden entsprechend an

### Ziele
* Generics
* Umgang mit Binärbäumen

### UML
![UML-Diagramm](docs/step_6.png?raw=true)

Schritt 7 (feature/abstraction)
-------------------------------

### Motivation
Da wir nun noch weitere Arten von Tickets einführen wollen, die sich in ihren
Attributen unterscheiden, ist es sinnvoll das Konzept der Vererbung anzuwenden,
sodass wir duplizierten Quellcode verhindern. Das gleiche Konzept können wir auch
für die Klassen Customer und Employee anwenden, indem wir diese zur Elternklasse
User generalisieren.

### Aufgaben
* Abstrakte Klasse User
* Abstrakte Klasse Ticket

### Ziele
* Vererbung
* Redefinieren, Überschreiben, Überladen
* Abstrakte Klassen

### UML
![UML-Diagramm](docs/step_7.png?raw=true)

Schritt 8 (feature/gui)
-----------------------

### Motivation
Bis jetzt haben wir unsere Daten fest in der Main-Methode verankert.
Auch Operationen aus diesen Daten wurden in der Main-Methode direkt
ausgeführt. Es wäre jedoch wünschenswert, wenn ein echter Benutzer Daten über
die Kommandozeile hinzufügen und anzeigen lassen könnte. Dazu programmieren wir
nun eine Benutzeroberfläche. Damit nicht jeder Daten in das System einpflegen kann
implementieren wir zusätzlich ein Authenifizierungssystem.

Ticket User Beziehung über IDs

### Aufgaben
* Abstrakte Klasse View
* Klasse LoginView
* Klasse NotesView
* Klasse TicketView
* Klasse TicketsView
* Klasse UserManager

### Ziele
* Umgang mit Paketen (Scanner)
* Eingaben vom Anwender verarbeiten

### UML
![UML-Diagramm](docs/step_8_presentation.png?raw=true)
![UML-Diagramm](docs/step_8_logic.png?raw=true)

Schritt 9 (feature/load-save)
-----------------------------

### Motivation
Nach dem Beenden des Programms sind alle Daten die der Benutzer eingeben hat verloren.
Daher bietet es sich an eine Schnittstelle anzubieten, die es erlaubt eine Datenbank
oder ähnliches an unser Programm "anzuschließen". Dazu müssen wir auch ein Protokoll
definieren, dass für den Datenaustausch zwischen der Datenbank und unserem Programm
verwendet wird.

### Aufgaben
* Klasse NoteManager
* Speichern von Daten
* Datenschlüssel definieren
* Laden von Daten

### Ziele
* Interfaces
* Comparable
* Exceptions
* Polymorphie

### UML
![UML-Diagramm](docs/step_9_logic.png?raw=true)
![UML-Diagramm](docs/step_9_data.png?raw=true)

Schritt 10 (feature/list-sort)
------------------------------

### Motivation
Anzeige sortieren. Anonyme Klasse Comparator. Statische Lists.

### UML
![UML-Diagramm](docs/step_10.png?raw=true)

Schritt 11
----------

### Motivation
Um die Logik-Schicht von der Präsentations-Schicht stärker zu trennen, ist es
sinnvoll das Konzept der Interfaces zur Verwenden.

### Aufgaben
* Verwende Interface für alle Klassen der Logik-Schicht, die mit der Präsentationsschicht
  in Verbindung stehen
  
