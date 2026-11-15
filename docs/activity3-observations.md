
# Tutorial 2 – Activity 3: Getter Experiment
## Objective
Observe how removing a JavaBean getter affects JSON serialization.

## Test 1 – All Getters Present
GET /products/1 returned:
- id: 1
- name: Laptop
- price: 999.99

## Test 2 – getName() Commented Out
GET /products/1 returned:
- id: 1
- price: 999.99

The name field was missing.

## Test 3 – getName() Restored
All three fields appeared again.

## Explanation
The name field is private. Without a public getName()
method, the JSON converter does not expose it as
a readable property.

## Conclusion
An API can return HTTP 200 while omitting an expected
JSON property. Getters are important for exposing
private fields through standard JavaBean conventions.
