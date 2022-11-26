# MaintanceMonitor
***
## Inhaltsverzeichnis
1. [Projektbeschreibung](#Projektbeschreibung)
2. [Prozess](#Prozess)
3. [User Stories](#UserStories)
4. [Repository URL](#RepositoryURL)
5. [Nutzung der Software](#NutzungDerSoftware)

## Projektbeschreibung:
We are a small hydro-power electricity supplier near Vienna. Our customers expect electricity 
around the clock with a service level agreement of 99.95%. This means that the maximum 
outage of 21 minutes and 54 seconds (monthly in sum) is tolerated. It is easy to derive that 
service times are very important to us. Huge monitors were installed that should show

* a green monitor in case everything looks fine and
* a red monitor in case of problems.
All monitors show the same content: a maximized website.

### Screenshot green monitor
![green](https://user-images.githubusercontent.com/31740404/203803493-00285254-dcb4-4ff8-94a2-b30f4815d814.png)

### Screenshot red monitor
![red](https://user-images.githubusercontent.com/31740404/203803825-5e5f032c-d194-4bc4-bf49-15ad300a6e6c.png)


## Prozess:
1. Prozesse Dokumentiert
2. Branching (Branches und Kanbanboard erstellt)
3. Anforderungen defeniert (User Stories erstellt)
4. Implementation
5. Testphase
6. Erstellen einer Pipeline (Continuous Integration and Gradle)
7. Artefacts

## User Stories:
![UserStories](https://user-images.githubusercontent.com/31740404/203805321-c4466343-6ee0-4279-81f9-c9d9fb26c11d.JPG)


## Repository URL:

#### URL: https://github.com/Khaled010897/MaintanceMonitor.git


## Nutzung von der Software:

1. REST-Server starten (MaintenanceMonitorApplication.Java)
2. Webbrowser mit localhost:8080 verbinden
3. Eine Nachricht ändern/löschen oder abrufen

