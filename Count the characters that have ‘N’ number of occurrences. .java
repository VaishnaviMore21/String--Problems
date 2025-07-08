// User function Template for Java

class Sol {
    int getCount(String s, int N) {
        // your code here
        Map<Character,Integer>groupCount=new HashMap<>();
        int len=s.length();
        for(int i=0;i<len;i++)
        {
            char current=s.charAt(i);
            if(i==0|| s.charAt(i)!=s.charAt(i-1))
            {
                  groupCount.put(current, groupCount.getOrDefault(current, 0) + 1);
            }
        }
           // Count characters with exactly N occurrences
        int result = 0;
        for (int count : groupCount.values()) {
            if (count == N) {
                result++;
            }
        }

        return result;
        
        
        
    }
}


Let’s dry run the Java code for the example:

---

### 🧪 **Input:**

```java
S = "aabbaaaaccd"
N = 2
```

We want to count **characters** that have exactly **2 non-consecutive occurrences**.

---

### ✅ **Step-by-Step Dry Run**

We initialize:

```java
Map<Character, Integer> groupCount = new HashMap<>();
```

We iterate over `S = "aabbaaaaccd"` character-by-character.

---

#### i = 0

* `current = 'a'`
* `i == 0`, so we count it → `groupCount[a] = 1`

`groupCount = { a: 1 }`

---

#### i = 1

* `current = 'a'`
* Same as previous → **skip** (consecutive character)

---

#### i = 2

* `current = 'b'`
* `s.charAt(2) != s.charAt(1)` → `groupCount[b] = 1`

`groupCount = { a: 1, b: 1 }`

---

#### i = 3

* `current = 'b'` → same as previous → **skip**

---

#### i = 4

* `current = 'a'`
* `s.charAt(4) != s.charAt(3)` → new group for `'a'`
  → `groupCount[a] = 2`

`groupCount = { a: 2, b: 1 }`

---

#### i = 5

* `current = 'a'` → same → **skip**

#### i = 6

* `current = 'a'` → same → **skip**

---

#### i = 7

* `current = 'c'`
* `s.charAt(7) != s.charAt(6)` → `groupCount[c] = 1`

`groupCount = { a: 2, b: 1, c: 1 }`

---

#### i = 8

* `current = 'c'` → same → **skip**

---

#### i = 9

* `current = 'd'`
* `s.charAt(9) != s.charAt(8)` → `groupCount[d] = 1`

`groupCount = { a: 2, b: 1, c: 1, d: 1 }`

---

#### i = 10

* `current = 'd'` → same → **skip**

---

### Final Map:

```java
groupCount = {
    'a': 2,
    'b': 1,
    'c': 1,
    'd': 1
}
```

---

### 🔍 Final Step:

We count how many characters have `2` groupings.

Loop through values:

* `a = 2` ✅
* `b = 1` ❌
* `c = 1` ❌
* `d = 1` ❌

---

### ✅ Final Output:

```text
1
```

Only `'a'` has 2 non-consecutive occurrences.

---

Let me know if you’d like the dry run done for another string or shown visually in a table.
