# Lava

Lava (**L**ambda **a**s Ja**va**) is a functional programming freamwork with Java, It support and sumulate a similar concept with FP as could as possible. 

## Features

- Easy to use currying with Java Lambda Expression
- CurryN  is a wrapper similar with Currying Pattern

## Basic

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
