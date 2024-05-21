# 4.6 ArrayLists - Dynamic Arrays

**ArrayList** is a dynamic array that allows us to resize the array. The size of an *array* cannot be modified once it has been created. For example, if you want to add more elements or remove certain elements, this is not possible with an array. However, you have this capability with ArrayLists. **ArrayLists are dynamic in size**

In order to use ArrayLists, we need to import the `ArrayList` object:
```java
import java.util.ArrayList
```

## Declaring an ArrayList
The declaration is slightly different than an array.

The general structure:
```java
ArrayList<object type> array-name;
```
<span style="color:red">
<b>NOTE:</b> Array Lists can only hold <b>objects</b> (e.g. String) NOT primitive data types (e.g. double, int, char)
</span>

### Cars Example:
```java
ArrayList<String> strCars;
```

## Creating an ArrayList
Similar to arrays, we need to use the `new` keyword, followed by `ArrayList` and the **base data type**.

The general structure:
```java
array-name = new ArrayList<object type>();
```

### Cars Example:
```java
strCars = new ArrayList<String>();
```

Just like with arrays, you can do this all in one line if you wish:
```java
ArrayList<String> strCars = new ArrayList<String>();
```

Notice, we never specified the number of elements in the ArrayList. We don't need to. Right now, the ArrayList has nothing inside of it, and we don't need to tell it how many elements we want in it. We can just start adding to it. 

## Adding Elements to an ArrayList
To add elements to an ArrayList, we simply use the `add()` method.

The general struture:
```java
array-name.add(element);
```

### Cars Example:
```java
strCars.add("Toyota");
strCars.add("Honda");
strCars.add("Acura");
strCars.add("BMW");
```

## Printing ArrayList
Remember when we tried to print an array, it would show us the memory address of the array but not the array itself. However, with ArrayLists, we have more flexibility

### Cars Example:
```java
System.out.println(strCars);
```

<ins>Output:</ins>
```
[Toyota, Honda, Acura, BMW]
```

## Accessing/Setting Elements
Similar to arrays, we need to use the index value but also the `get()` method:

### Cars Example:
Let's say we want to get the element stored at index 1:
```java
System.out.println(strCars.get(1));
```

## Changing Elements
To change or modify an existing element, we need to use the `set()` method and specify the index value and the new value for that element.

### Cars Example:
```java
strCars.set(3, "Tesla");
```

## Removing Elements
With arrays, we cannot remove an element. However, with ArrayLists, we can use the `remove()` method.

### Cars Example:
```java
strCars.remove(2);
```

## Adding Elements to a Specific Position
Anytime a value is added to an ArrayList, it is always added to the end of the list. What if we wanted to insert a value but at a specific position? We can add this parameter in the `add()` method.

### Cars Example:
```java
strCars.add(1, "Lexus");
```

## Get the Length of an ArrayList
Unfortunately, getting the length of an ArrayList is not consisten with arrays. Instead, we use the `size()` method.

### Cars Example:
```java
System.out.println(strCars.size());
```

## Iterating over an ArrayList
We can use the traditional for loop OR the for-each loop to loop through an ArrayList just like we do with arrays:

### Cars Example - Traditional for loop:
```java
for (int i = 0; i < strCars.size(); i++) {
  System.out.println(strCars.get(i));
}
```

### Cars Example - foreach loop:
```java
for (String car:strCars) {
  System.out.println(car);
}
```

## Sorting
When sorting with arrays, we had to import the java library `Arrays` then used the `sort()` method.

With ArrayLists, we import the java library `Collections` instead.

### Cars Example:
In this example, since our object type in the ArrayList is String, then it will sort it in alphabetical order.
```java
import java.util.Collections;

Collections.sort(strCars);
```
