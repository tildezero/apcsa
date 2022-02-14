## the questions
1. no 
2. 50
3. 45

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


### bulk rename package
`for f in *.java; do sed -i "1d" $f; sed -i "1i package PACKAGE.NAME;" $f; done`

### getters and setters 
- used to get/set values of private variables
- ap will use accessors and mutators
