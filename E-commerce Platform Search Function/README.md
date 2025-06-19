E-commerce Product Search
This project focuses on developing a simple yet efficient product search feature for an e-commerce system using Java. It compares Linear Search and Binary Search to evaluate which is better suited for various scenarios in real-world applications.

🎯 Purpose of the Project
To implement two popular searching techniques and assess their:

Efficiency with increasing data sizes

Suitability for real-time product lookup

Application based on whether data is sorted or not

The core goal is to ensure fast product search performance in an online shopping platform.

📖 Big O Notation — What and Why?
Big O notation gives an estimate of how well an algorithm scales when more data is introduced. It helps in:

Predicting runtime

Choosing the right algorithm

Understanding worst-case performance

🔍 Search Case Comparison
Scenario	Linear Search	Binary Search
Best Case	O(1) — first element	O(1) — middle element
Average Case	O(n)	O(log n)
Worst Case	O(n)	O(log n)

⚠️ Note: Binary Search is faster, but it only works when the product list is sorted.

🛠️ Project Setup
The application revolves around a simple Product class.

Product Attributes:
productId: Unique ID of the product

productName: Name of the product

category: Product category (e.g., electronics, clothing)

These fields are used as search keys.

💻 Implementation Snapshot
🔸 Linear Search
No sorting needed

Checks each element one by one

Simple logic, slower for big data

🔸 Binary Search
Needs sorted list (by productId)

Reduces search space by half every time

More efficient for large datasets

📈 Performance Analysis
Search Type	Complexity	Recommended For
Linear Search	O(n)	Small/unsorted product lists
Binary Search	O(log n)	Large/sorted product lists

✅ Conclusion
Use Binary Search when your product catalog is large and static/sorted.
Choose Linear Search when working with small or frequently updated data where sorting might be overhead.
