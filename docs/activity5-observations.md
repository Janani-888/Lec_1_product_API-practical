
# Tutorial 2 – Activity 5: Customer and Address Experiment
## Objective
Understand the association between Customer and Address
and observe how getters affect nested JSON serialization.

## Test 1 – getAddress() Present

Endpoint: GET /customers/1

Expected response:
- id: 1
- name: Ada Lovelace
- email: ada@example.com
- address:
    - street: 115 New Cavendish Street
    - city: London
    - postcode: W1W 6UW

Observation:
The Customer response contains a nested Address object.

## Test 2 – getAddress() Commented Out

Endpoint: GET /customers/1

Expected response:
- id: 1
- name: Ada Lovelace
- email: ada@example.com

Observation:
The entire address object disappears from the JSON response.

## Test 3 – getAddress() Restored

Observation:
The complete nested Address object appears again.

## Explanation
Customer has a private Address field.

When getAddress() is removed, the JSON serializer
cannot discover the address property through the
standard public getter convention.

## Conclusion
The Customer and Address classes demonstrate an
association (has-a relationship).

Public getters make private object properties
available for JSON serialization.
