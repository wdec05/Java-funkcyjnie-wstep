# Java funkcyjnie - Wstęp
## Zadania:
Pobierz pliki potrzebne do wykonania zadań: Book.java, books.csv.
Rozwiązania wyślij na UPEL.

Zadanie 1:
- Użyj Predicate do wyfiltrowania książek wydanych po 1900 roku.

Zadanie 2:
- Oblicz średni rok wydania wszystkich książek.

Zadanie 3:
- Posortuj książki malejąco po ocenie, a następnie po tytule (alfabetycznie).
  <details>
  <summary>Wskazówka</summary> 
    Użyj metody comparing i thenComparing z interfejsu Comparator
  </details>

Zadanie 4:
- Wczytaj plik books.csv (format: tytuł,autor,rok,ocena), przefiltruj książki z oceną ≥ 4.0 i zapisz je do nowego pliku.
  <details>
  <summary>Wskazówka</summary>
    
    List<Book> books = Files.lines(Paths.get("books.csv"))
            .map(line -> {
                String[] parts = line.split(",");
                return new Book(
                    parts[0], // title
                    parts[1], // author
                    Integer.parseInt(parts[2]), // year
                    Double.parseDouble(parts[3]) // rating
                );
      Wczytaj w ten sposób plik
  </details>

Zadanie 5:
- Przekształć poniższy kod na wersję funkcyjną:
```
List<String> titles = new ArrayList<>();
for (Book book : books) {
    if (book.getYear() > 1850) {
        titles.add(book.getTitle().toUpperCase());
    }
}
```
