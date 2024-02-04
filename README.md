Imagine you're developing an e-commerce application where customers create accounts with varying levels of detail.

Initially, you use a standard constructor for the User class:

public User(String firstName, String lastName, String email,
           String address, String phone, int age) {
     // ...
}

However, you encounter challenges:

Registration forms: It's cumbersome to ensure users enter all fields in the correct order, leading to errors and frustration.
Optional fields: Not all customers provide complete information, but the constructor forces them to.
Data consistency: Changes to user profiles after registration can cause unexpected issues due to mutable fields.

Implement solution using the Builder Pattern to address the issue.

![2BSCS_CC211-18CCL211-18IM1_MERINO_LECA3](https://github.com/MerinoYalaine/builderPattern/assets/142370694/0a9af6c3-b205-4392-90c3-a5e193e4e559)
