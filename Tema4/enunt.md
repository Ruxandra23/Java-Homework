# Tema 4

## 🔹Exercițiul 1

### Cerință:

#### a. Implementarea unei clase pentru operații pe `double`
- Definiți o clasă care implementează interfața `Calculator`, ce conține următoarele metode:
  - `add(double a, double b)`: întoarce suma celor două numere
  - `divide(double a, double b)`: întoarce rezultatul împărțirii
  - `average(double[] values)`: întoarce media valorilor din vector
- Toate valorile se citesc dintr-un fișier.
- Metodele pot arunca următoarele excepții definite în interfața `Calculator`:
  - `NullParameterException`: aruncată dacă vreun parametru este `null`
  - `OverflowException`: aruncată dacă suma este `Double.POSITIVE_INFINITY`
  - `UnderflowException`: aruncată dacă suma este `Double.NEGATIVE_INFINITY`

#### b. Tratarea excepțiilor personalizate
- Definiți clase proprii de excepții, extinzând clase existente din Java:
  - Ex: `MyArithmeticException`, utilizată în metoda `divide()` pentru tratarea împărțirii la 0
- Gestionați excepțiile legate de:
  - Crearea fișierului
  - Citirea fișierului
  - Format incorect de date

#### c. Clasa client
- Creați o clasă `Main` cu metoda `main`:
  - Citiți datele din fișier
  - Apelați metodele definite în interfața `Calculator`
  - Testați fiecare caz care poate genera o excepție

## 🔹Exercițiul 2

### Cerință:

#### a. Găsirea celui mai lung cuvânt
- Scrieți un program care citește un fișier text și identifică:
  - Cel mai lung cuvânt conținut în fișier

#### b. Adăugarea codului sursă în fișier
- Adăugați conținutul clasei Java curente în același fișier text utilizat anterior

#### c. Stocarea conținutului fișierului într-un array
- Citiți fișierul linie cu linie
- Stocați fiecare linie într-un array de tip `String[]`
