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

### arraylist vs array

#### making
- AL: `ArrayList<Object> list = new ArrayList<Object>();`
- L: `Object[] a = new Object[size];`

#### updating element
- AL: `list.get(index)`
- L: `a[index]`

#### returning size
- L: `a.length`
- AL: `list.size()`

#### adding new element
- L:

```java
Object[] temp = new Object[a.length * 2];
for (int i = 0; i < a.length; i++) {
    temp[i] = a[i];
}

temp[a.length] = "New Object"
a = temp
```

- AL: `list.add("New Object")`

#### inserting new element
- L: lots of work
- AL: `list.add(index, "new object")`

### arraylist stuff

#### removing an object
- AL: `list.remove(5)` (by index) and `list.remove("London")` (remove first occurence of value)
- Also AL:
```java
ArrayList<Integer> is = new ArrayList<>();
is.remove(5) // removes index 5
is.remove(new Integer(5)) // removes first occurence of value 5
```

#### clearing a list 
- `list.clear()` - makes size 0

### choosing between array and arraylist
- fixed size: array
- lots of primitives, good performance: array
- everything else: arraylist

### concurrentmodificationexception
- you cannot modify an arraylist while looping over it 

### string methods
`String.length()` - gets length of a string (**this is a method not an attribute**, so it has parenthesis)