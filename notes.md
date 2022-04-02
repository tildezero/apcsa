## the notes
- && before || 
- ^ = XOR, only 1 side must be right, if both are right, false
- `!||` = `&` and `!&` = `||`

```java
if (x == 0)
    if (y == 0)
        // some code
else // THIS IS PART OF CONDITIONAL NUMBER 2
    // do another thing
```

### demorgans law
- `!(a && b) == !a || !b`
- `!(a||b) == !a && !b`
- if you negate a < or > it becomes <= or >=


### command line utilities
- bulk rename packages: `for f in *.java; do sed -i "1d" $f; sed -i "1i package PACKAGE.NAME;" $f; done`
- remove all classes in directory: `rm *.class`
- j function: 
```sh
j() {
    javac $1.java
    java $1
}
```

### getters and setters 
- used to get/set values of private variables
- ap will use accessors and mutators

### array list methods
- `int size()` - gets **size** of array (diff from capacity)
- `boolean isEmpty()` - checks if array is empty
- `boolean add(E element)` - adds something to the array, true if successful
- `void add(int i, E element)` - add item to index `i`
- `E get(int i)` - get element of type `E` at index `i`
- `E remove(int i)` - removes an element at index `i` and returns it
- `boolean contains(Object obj)` - sees if the arraylist contains `obj`
- `int indexOf(Object obj)` - if arraylist contains `obj`, return the index of it (first occurence), if it doesn't, return -1
- `String toString()` - displays the ArrayList as a string