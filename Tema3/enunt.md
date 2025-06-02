# Tema 3

## 🔹Exercițiul 1

### Cerință:

#### a. Implementare `OutTask`
- Implementați clasa `OutTask` care:
  - Implementează interfața `Task`
  - Primește un mesaj în constructor
  - Afișează mesajul la apelul metodei `execute()`

#### b. Implementare `RandomOutTask`
- Implementați clasa `RandomOutTask` care:
  - Implementează interfața `Task`
  - Generează un număr aleator în constructor
  - Afișează un mesaj cu numărul generat în metoda `execute()`

#### c. Implementare `CounterOutTask`
- Implementați clasa `CounterOutTask` care:
  - Implementează interfața `Task`
  - Incrementează un contor global static la fiecare instanțiere
  - Afișează valoarea contorului în metoda `execute()`

#### d. Testare
- Creați o clasă de test sau un `main` care:
  - Creează instanțe pentru fiecare dintre cele 3 tipuri de `Task`
  - Apelează metoda `execute()` și observă comportamentul

---

## 🔹Exercițiul 2

### Cerință:

#### a. Definirea interfeței `Container`
- Definiți interfața `Container` cu următoarele metode:
  - `void push(Task task)` – adaugă un element
  - `Task pop()` – elimină și returnează un element
  - `boolean isEmpty()` – verifică dacă containerul este gol
  - `int size()` – întoarce numărul de elemente

#### b. Implementarea clasei `StackContainer` (LIFO)
- Implementați clasa `StackContainer` care:
  - Stochează obiecte de tip `Task` într-un array
  - Utilizează o strategie de tip **Last-In-First-Out**
  - Respectă structura și metodele interfeței `Container`

#### c. Implementarea clasei `QueueContainer` (FIFO)
- Implementați clasa `QueueContainer` care:
  - Stochează obiecte de tip `Task` într-un array
  - Utilizează o strategie de tip **First-In-First-Out**
  - Respectă structura și metodele interfeței `Container`

#### d. Cerințe suplimentare
- Nu folosiți colecții din Java (`ArrayList`, `LinkedList` etc.)
- Evitați duplicarea logicii în clasele `StackContainer` și `QueueContainer`
  - Sugestie: folosiți o clasă abstractă de bază sau compunere pentru codul comun

#### e. Testare
- Creați o clasă de test sau `main` care:
  - Adaugă mai multe `Task`-uri în fiecare container
  - Apelează metoda `pop()` până când containerul este gol
  - Verifică respectarea ordinii de procesare (LIFO vs FIFO)
