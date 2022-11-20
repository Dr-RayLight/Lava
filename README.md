# Lava

Lava (**L**ambda **a**s Ja**va**) is a functional programming freamwork with Java, It support and sumulate a similar concept with FP as could as possible. 

## Features

- Easy to use currying with Java Lambda Expression
- CurryN  is a wrapper similar with Currying Pattern

## FP Basic

### Currying

```java
import fp.curry.Curry3;
import fp.curry.Curry4;
import fp.curry.CurryN;
import fp.curry.Fn;
...

public static void main(String[] args){
	Fn<String, Fn<String, String>> fns = familyName -> firstName -> familyName.concat(firstName);
	Curry3<String, String, String> curry3 = new Curry3(fns);
	curry3.apply("H").apply("Raymond"); // "HRaymond"
	
	// Use CurryN in applies method
	Curry3<String, String, String> curryN = CurryN.of3(fns);
	curryN.applies("H", "R"); // "HR"

	// Other Sample 
	Curry4<Integer, Integer, Integer, String> curryN2 = CurryN.of4(n1 -> n2 -> n3 -> String.valueOf((n1 + n2 - n3)));
	curryN2.applies(10, 5, 2); // "13"
}

```

## List Basic

### LavaList

```java

// Foreach
 LavaList.of("a", "a", "b", "c")
          .distinct()
          .forEach(s -> System.out.println(s)); // a, b, c

// Some, BackSome 
 LavaList.of(1, 2, 3, 4, 5, 6, 7)
            .some(n -> n == 4) // 1, 2, 3, 4
            .backSome(n -> n == 2); // 7, 6, 5, 4, 3, 2

// Map 
 LavaList.of(1, 2, 3)
            .map(n -> String.valueOf(n)); // "1", "2", "3"

// Convert to another 
LavaList<String> lavaList = LavaList.of("a", "b", "c");
lavaList.asArray(); // String[]
lavaList.asStream(); // Stream<String>
lavaList.toSet(); // Set<String>
lavaList.asList(); // List<String>
lavaList.asArrayList(); // ArrayList<String>

// Other Sample 
 LavaList.of("1", "2", "3", "3")
        .distinct()
        .reverse()
        .map(s -> Integer.parseInt(s))
        .map(n -> n++); // 3, 4, 2

```
### Pairs (PairList)

```java
 Pair<String, Integer> p1 = Pair.of("a", 1);
 Pair<String, Integer> p2 = Pair.of("b", 2);
 Pair<String, Integer> p3 = Pair.of("c", 3);

 Pairs<String, Integer> ps = Pairs.of(p1, p2, p3);
 ps.swap(); // Swap all kv
 ps.toKList(); // to K LavaList();
 ps.toVList(); // to V LavaList();

```
