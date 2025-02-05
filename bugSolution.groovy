```groovy
def myMethod(Object str) {
  if (str == null) {
    return ""
  } else if (str instanceof String) {
    // String handling
    return str.toUpperCase()
  } else if (str instanceof List) {
    //List handling
    return str.join(',')
  } else {
    return "Invalid input"
  }
}

println myMethod(null) // prints ''
println myMethod('')   // prints ''
println myMethod([1,2,3]) // prints 1,2,3
println myMethod(123) //prints Invalid input
```