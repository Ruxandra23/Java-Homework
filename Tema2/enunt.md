# Tema 2

## 🔹Exercițiul 1

### Cerință:

#### a. Crearea proiectului
- Creați un proiect nou cu numele Bookstore și următoarele clase:
  - Clasa `Book` cu atributele: title, author, publisher, pageCount
  - Clasa `BookstoreTest` pentru testarea funcționalităților bibliotecii
- Implementați metode CRUD (create, read, update, delete) pentru simularea funcționalității

#### b. Gestionarea datelor
- Creați obiecte de tip carte și setați atributele introducând date de la tastatură
- Validați ca numărul de pagini introdus să fie diferit de zero

#### c. Funcționalități avansate
- Creați o clasă nouă, `BookstoreCheck`, ce va conține două metode:
  - O metodă care verifică dacă o carte este în dublu exemplar
  - O metodă care verifică dacă o carte este mai groasă decât alta și returnează cartea mai groasă
- Testați ambele metode implementate

#### d. Afișarea informațiilor
- Afișați informația despre o carte în următorul format:
```text
BOOK_TITLE: [insert_book_title]
BOOK_AUTHOR: [insert_book_author]
BOOK_PUBLISHER: [insert_book_publisher]
```
- Cu precizările:
  - Titlul cărții va fi scris în întregime cu majuscule
  - Numele editurii va fi scris în întregime cu minuscule
  - Numele autorului rămâne neschimbat

## 🔹Exercițiul 2

### Cerință:

#### a. Definirea clasei de bază
- Definiți clasa `Form` cu:
  - Un membru `color` de tip String
  - O metodă `getArea()` care inițial va returna 0
  - O metodă `toString()` care va returna culoarea
  - Un constructor fără parametri
  - Un constructor care inițializează culoarea

#### b. Derivarea claselor specifice
- Din clasa `Form` derivați clasele `Triangle` și `Circle`:
  - Clasa `Triangle` va avea membrii `height` și `base` de tip float
  - Clasa `Circle` va avea membrul `radius` de tip float
  - Ambele clase vor avea constructori fără parametri
  - Ambele clase vor avea constructori pentru inițializarea membrilor, reutilizând codul existent

#### c. Instanțierea și utilizarea claselor
- Instanțiați clasele `Triangle` și `Circle` 
- Apelați metoda `toString()` pentru fiecare instanță
- Suprascrieți metoda `getArea()` pentru a returna aria specifică figurii geometrice

#### d. Suprascriere metodelor
- Adăugați metode `toString()` în clasele derivate care să returneze:
  - Pentru `Triangle`: "Triunghi: [culoare] [arie]"
  - Pentru `Circle`: "Cerc: [culoare] [arie]"
- Modificați implementarea pentru a utiliza metoda `toString()` din clasa de bază

#### e. Implementarea metodei equals()
- Adăugați o metodă `equals()` în clasa `Triangle`
- Justificați criteriul de echivalență ales

#### f. Upcasting și polimorfism
- Creați un vector de obiecte `Form`
- Populați-l cu obiecte de tip `Triangle` și `Circle` (upcasting)
- Parcurgeți vectorul și apelați metoda `toString()` pentru fiecare element
- Notați observațiile

#### g. Downcasting și verificarea tipului
- Adăugați clasei `Triangle` metoda `printTriangleDimensions()`
- Adăugați clasei `Circle` metoda `printCircleDimensions()`
- Parcurgeți vectorul creat anterior și folosind downcasting și operatorul `instanceof`:
  - Apelați `printTriangleDimensions()` pentru obiectele de tip `Triangle`
  - Apelați `printCircleDimensions()` pentru obiectele de tip `Circle`

#### h. Alternativă la instanceof
- Implementați o soluție alternativă care să nu folosească operatorul `instanceof`