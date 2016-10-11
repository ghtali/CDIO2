# CDIO2

##Indledning

IOOuterActive har fået endnu en opgave, og rollerne er de samme som sidst. I denne opgave skal I
bl.a. vise, at I kan bruge klasser, relationer og **GRASP**.

###Kundens vision:

Vi blev imponeret over jeres terningespil og vil derfor gerne have at i udvikler et nyt spil til os.
Ligesom tidligere skal det være et spil mellem 2 personer, der kan spilles på maskinerne i DTU’s
databarer, uden bemærkelsesværdige forsinkelser.
Spillerne slår på skift med 2 terninger og lander på et felt med numrene fra 2 - 12. At lande på hvert
af disse felter har en positiv eller negativ effekt på spillernes pengebeholdning. (Se den følgende
feltoversigt), derudover udskrives en tekst omhandlende det aktuelle felt. Når en spiller lander på
Goldmine kan der f.eks. udskrives: “Du har fundet guld i bjergene og sælger det for 650, du er rig!”.
Spillerne starter med en beholdning på 1000.
Spillet er slut når en spiller har 3000.
Spillet skal let kunne oversættes til andre sprog.
Det skal være let at skifte til andre terninger.
Vi vil gerne have at I holder jer for øje at vi gerne vil kunne bruge spilleren og hans pengebeholdning
i andre spil.
####Feltliste:
1. Tower +250
2. Crater -100
3. Palace gates +100
4. Cold Desert -20
5. Walled city +180
6. Monastery 0
7. Black cave -70
8. Huts in the mountain +60
9. The Werewall (werewolf-wall) -80 men spilleren får en ekstra tur.
10.The pit -50
11. Goldmine +650

I kan ligesom sidst benytte GUI’en hvis I har overskud til det. Husk at tilrette feltnavne i GUI'en vha.
dennes metoder.

###Versionering:
Kunden ønsker efterfølgende at kunne arbejde videre på systemet og ønsker at kunne følge med i,
hvordan udviklingen er foregået, herunder se de enkelte gruppemedlemmers bidrag.
I afleveringen skal I derfor også levere et GIT repository (mappen .git) hvor kunden kan se hvilke
commits, der er foretaget, og af hvem. Alternativt kan afleveres et link til et repository på nettet eks.
https://github.com/cbudtz/TestRepo42.git.

Der skal committes hver gang en delopgave er løst eller forbedret (dvs mindst én gang i timen når
der arbejdes på projektet).
Med hver commit gives en kort beskrivelse, der forklarer, hvad der er blevet lavet. Det skal tilstræbes
at committet kun indeholder relevante ændringer (andre ændringer, såsom formatering eller
omstrukturering skal ske i et separat commit).
NB:Husk at kontrollere at repositoriet kan importeres i eclipse! Skal projektet kunne importeres i
eclipse (uden for mange krumspring), er det vigtigt at .classpath og -project også versionsstyres.

###Afprøvning:

Kunden ønsker at programmet er overbevisende afprøvet og ønsker at kunne gentage afprøvningen.
I skal have afprøvningskoden med i projektet (vi foreslår et antal JUnit tests).

###Projektlederens bemærkninger:
Det er tilladt at lave udskrifter på engelsk, men vær konsekvent.
Overhold GRASP principperne Creator, Controller, Høj binding (High Cohesion), Information
Expert, Lav kobling (Low Coupling).
Rapporten kunne have samme struktur som CDIO_del1
Benyt de terninger I allerede har lavet.
Jeg vil foreslå, at I løser opgaven i følgende rækkefølge:

###Krav / Analyse:

Lav følgende artefakter:
* Kravspecificering
* Use-case diagram
* Use-case beskrivelser
* Domæne-model
* SSD’er.
* BCE
Såfremt nogle af disse undlades, skal der være gode begrundelser for dette.

###Design-dokumentation
#####Lav følgende artefakter:
* Design-klasse-diagram
* DSD’er (Design Sekvens Diagrammer)
* Argumentation for test (evt. en klasse i java, der tester programmet)
* Dokumentation for overholdt GRASP

###Kode
* Lav en klasse Spiller der indeholder en spillers attributter og funktioner.
* Lav tilsvarende en klasse Konto der beskriver Spillerens pengebeholdning.
* Overvej hvilke typer attributterne i Spiller, samt i Konto skal have. Lav passende
* konstruktører.
* Lav passende get og set metoder.
* Lav passende toString metoder.
* Tilføj metoder til at indsætte og hæve penge på en Konto.
* Ændr nu Konto-klassen således at der ikke kan komme en negativ balance,
* ligeledes skal metoderne fortælle om transaktionen er blevet gennemført (Hint: brug
statementet **return** til at returnere denne information).
* Lav det spil kunden har bedt om med de klasser I nu har.
* Hvis I vælger at bruge GUI’en kan I evt. benytte metoderne i Bilag 1.
* Husk at skrive en oversigt over pakkerne og deres klasser - klassernes ansvarsområder og evt.
spændende funktioner.

###Test
* Lav en test der sandsynliggør at balancen aldrig kan blive negativ, uanset hvad hæv og indsæt
metoderne bliver kaldt med.

###Konfiguration

Kunden ønsker at vide hvilke krav, der er til styresystemet og installerede programmer.
I skal derfor udfærdige en beskrivelse af minimumskrav og en vejledning i hvordan kildekoden
compiles, installeres og afvikles. Dette inkluderer en beskrivelse af hvorledes koden importeres fra et
git repository.
