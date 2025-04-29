


# Java Set Collection - Pen Store Management System  

## 📌 Overview  
This project demonstrates the usage of **Java Collections (`Set`)** to manage a collection of pens. Users can **add, remove, and display pens** while choosing a sorting mechanism using **Comparators**. The program allows dynamic selection of `HashSet`, `LinkedHashSet`, or `TreeSet` for storage.

---

## 📌 Features  
✅ Add a Pen with brand, color, cost, and type.  
✅ Remove a Pen from the collection.  
✅ Display all Pens in the collection.  
✅ Choose different **Set** types (`HashSet`, `LinkedHashSet`, `TreeSet`).  
✅ Sort Pens based on **brand, color, cost, or type** using **Comparators**.  

---

## 📌 Explanation of Key Components  

### **1️⃣ `SetUtil.java` - Choosing the Set Type**
- `chooseSetType()` method prompts the user to select a **Set** type:
  - **`HashSet`** - Unordered storage.
  - **`LinkedHashSet`** - Maintains insertion order.
  - **`TreeSet`** - Stores elements in **sorted order** based on a selected attribute.
- If `TreeSet` is selected, the user must choose a **Comparator** for sorting.

---

### **2️⃣ `Set` - Java Collection Interface**  
- `Set` is an **interface** in Java that prevents duplicate elements.
- Implementations used in this project:
  - **`HashSet`**: Unordered collection, no duplicate values.
  - **`LinkedHashSet`**: Maintains insertion order.
  - **`TreeSet`**: Stores elements in **sorted order**.

---

### **3️⃣ Comparators - Sorting Mechanism**  
The `Comparator` interface is used to define **custom sorting logic**. The following comparator classes are created:

#### **✔ CompareBasedOnBrand.java**  
Sorts Pens **alphabetically by brand**.
```java
class CompareBasedOnBrand implements Comparator<Pen> {
    @Override
    public int compare(Pen p1, Pen p2) {
        return p1.getBrand().compareTo(p2.getBrand());
    }
}
```
#### **✔ CompareBasedOnColor.java
Sorts Pens alphabetically by color.
```java
class CompareBasedOnColor implements Comparator<Pen> {
    @Override
    public int compare(Pen p1, Pen p2) {
        return p1.getColor().compareTo(p2.getColor());
    }
}
```
#### **✔ CompareBasedOnCost.java
Sorts Pens by cost in ascending order.
```java
class CompareBasedOnCost implements Comparator<Pen> {
    @Override
    public int compare(Pen p1, Pen p2) {
        return Integer.compare(p1.getCost(), p2.getCost());
    }
}

```
#### **✔ CompareBasedOnType.java
Sorts Pens alphabetically by type.
```java
class CompareBasedOnType implements Comparator<Pen> {
    @Override
    public int compare(Pen p1, Pen p2) {
        return p1.getType().compareTo(p2.getType());
    }
}
```

### **4️⃣ TreeSet - Sorted Set Collection
TreeSet uses a Comparator to store elements in sorted order.
When TreeSet is selected, users must choose how they want the pens to be sorted.
Example: Sorting by brand.
```java
Set<Pen> set = new TreeSet<>(new CompareBasedOnBrand());
```

### **5️⃣ hashCode() - Uniqueness in Set
The hashCode() method ensures Pens with the same attributes are not duplicated.
```java
@Override
public int hashCode() {
    return brand.hashCode() + cost + color.hashCode() + type.hashCode();
}
```
- The combination of brand, color, cost, and type generates a unique hash value.

### **6️⃣ chooseSetType() - Dynamic Set Selection
Allows the user to select the type of Set at runtime.
If TreeSet is selected, it prompts the user to choose a sorting order.

#### 🛠 Example Usage:
```
1. HashSet
2. LinkedHashSet
3. TreeSet
Choose an option: 3
1. Store by Brand
2. Store by Color
3. Store by Cost
4. Store by Type
Choose sorting: 1 (Brand)
```
- Now, all Pens will be stored in TreeSet, sorted by Brand.

### 🚀 How to Run the Program
1️⃣ Clone the Repository
```
git clone https://github.com/Ananthadatta02/Java-PenStore-SetCollection.git
```
## 📌 Conclusion
- This project demonstrates Java Set Collections and Comparator sorting.
- TreeSet automatically sorts elements when a Comparator is provided.
- hashCode() ensures uniqueness in Set.
- Dynamic selection of Set type allows flexibility.
