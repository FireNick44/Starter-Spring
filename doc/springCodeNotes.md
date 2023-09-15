## Package structure:

```
// com.sleepingbranch.starterspring
// ├── controller
// │   └── ToDoController.java
// ├── model
// │   ├── ToDoEntry.java
// │   └── ToDoList.java
// ├── repository
// │   ├── ToDoEntryRepo.java
// │   └── ToDoListRepo.java
// ├── service
// │   ├── ToDoEntryService.java
// │   └── ToDoListService.java
// └── StarterspringApplication.java
```

## Controller class that handles HTTP requests

```java

@RestController
@RequestMapping("todo/list")
public class ToDoController {

    // GET request to retrieve all entries
    @GetMapping("/all")
    public ResponseEntity<List<ToDoEntry>> getAllEntries() {
        // Implementation here
    }

    // GET request to find an entry by ID
    @GetMapping("/find/{id}")
    public ResponseEntity<ToDoEntry> findEntryById(@PathVariable Long id) {
        // Implementation here
    }

    // POST request to add a new entry
    @PostMapping("/add")
    public ResponseEntity<ToDoEntry> addEntry(@RequestBody ToDoEntry entry) {
        // Implementation here
    }

    // PUT request to update an existing entry
    @PutMapping("/update")
    public ResponseEntity<ToDoEntry> updateEntry(@RequestBody ToDoEntry entry) {
        // Implementation here
    }

    // DELETE request to delete an entry by ID
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteEntryById(@PathVariable Long id) {
        // Implementation here
    }
}
```

## Model class representing a ToDoEntry entity

```
@Entity
public class ToDoEntry implements Serializable {

    @Id
    @Column(nullable = false)
    private Long id;
    private Long listId;
    private Long orderId;
    private String entry;

    public ToDoEntry() {}
    public ToDoEntry(Long listId, Long orderId, String entry) {
        this.listId = listId;
        this.orderId = orderId;
        this.entry = entry;
    }

    // Getters and setters
}
// Other classes like: ToDoList, ToDoEntryRepository, ToDoListRepository, ToDoEntryService, 
                       ToDoListService, and StarterspringApplication follow a similar structure.
```

## SQL

BLOB is for binary data (videos, images, documents, other)
CLOB is for large text data (text)

Maximum size on MySQL 2GB
Maximum size on Oracle 128TB

## Testing

| Assertion Library | Assertion Method                 | Example                                                             | Description                                      |
|-------------------|----------------------------------|---------------------------------------------------------------------|--------------------------------------------------|
| JUnit             | `assertEquals`                   | `assertEquals(5, calculator.add(2, 3));`                            | Checks if two values are equal.                  |
| JUnit             | `assertNotEquals`                | `assertNotEquals("apple", "banana");`                               | Checks if two values are not equal.              |
| JUnit             | `assertTrue`                     | `assertTrue(result > 0);`                                           | Checks if a condition is true.                   |
| JUnit             | `assertFalse`                    | `assertFalse(errors.isEmpty());`                                    | Checks if a condition is false.                  |
| JUnit             | `assertNull`                     | `assertNull(value);`                                                | Checks if a value is null.                       |
| JUnit             | `assertNotNull`                  | `assertNotNull(result);`                                            | Checks if a value is not null.                   |
| JUnit             | `assertSame`                     | `assertSame(expected, actual);`                                     | Checks if two objects are the same instance.     |
| JUnit             | `assertNotSame`                  | `assertNotSame(original, copy);`                                    | Checks if two objects are not the same instance. |
| JUnit             | `assertThrows`                   | `assertThrows(NullPointerException.class, () -> person.getName());` | Checks if a specific exception is thrown.        |

## Regex (not really spring specific but always helpful)

| Regular Expression | Description                                     |
|--------------------|-------------------------------------------------|
| `[0-9]` or `\d`    | Matches any single digit (0 through 9).         |
| `[1-9]`            | Matches any digit from 1 through 9.             |
| `[0-7]`            | Matches any digit from 0 through 7.             |
| `[2-7]`            | Matches any digit from 2 through 7.             |
| `[A-Fa-f0-9]`      | Matches any hexadecimal digit (0-9, A-F, a-f).  |
| `\p{Digit}`        | Matches any digit (Unicode category).           |
| `\p{IsDigit}`      | Matches any digit (Unicode character property). |
| `[:digit:]`        | Matches any digit (POSIX character class).      |

These shortcuts can be used interchangeably depending on your specific regex needs. For example, if you want to match
any single digit from 1 to 9, you can use `[1-9]`, `\d`, or `\p{Digit}`.


## Validation annotations example

| Annotation        | Description                                        |
|-------------------|----------------------------------------------------|
| `@NotNull`        | Not null                                           |
| `@NotEmpty`       | Not null and not empty                            |
| `@NotBlank`       | Not null and non-whitespace                       |
| `@Size`           | Size or length constraints                         |
| `@Min`            | Minimum value                                      |
| `@Max`            | Maximum value                                      |
| `@DecimalMin`     | Minimum decimal value                              |
| `@DecimalMax`     | Maximum decimal value                              |
| `@Digits`         | Exact number of digits                             |
| `@Email`          | Valid email address                                |
| `@Pattern`        | Matches a regular expression                       |
| `@Future`         | Date or time in the future                         |
| `@Past`           | Date or time in the past                           |
| `@AssertTrue`     | Must be `true`                                     |
| `@AssertFalse`    | Must be `false`                                    |
| `@Positive`       | Positive numeric value (greater than zero)         |
| `@PositiveOrZero` | Positive numeric value or zero                     |
| `@Negative`       | Negative numeric value (less than zero)            |
| `@NegativeOrZero` | Negative numeric value or zero                     |
