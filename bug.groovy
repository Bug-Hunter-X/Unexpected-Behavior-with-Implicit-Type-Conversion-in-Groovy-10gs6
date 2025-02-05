```groovy
def myMethod(String str) {
  if (str == null) {
    return ""
  }
  // ... rest of the method
}

println myMethod(null) // this works fine
println myMethod('')  // this also works fine

println myMethod([1,2,3]) // this will cause an exception 
```