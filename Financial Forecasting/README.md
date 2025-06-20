💰FINANCIAL FORECASTING TOOL
This project is a simple financial forecasting calculator built in Java using a recursive algorithm. It predicts the future value of an investment based on the present value, growth rate, and number of years.
***********************************************************************************************************************************************************************************************************************
📌OBJECTIVE
To understand and implement recursive algorithms by forecasting future financial values, and to explore the time complexity and optimization possibilities of such solutions.
***********************************************************************************************************************************************************************************************************************
🧠 HOW IT WORKS
The future value is calculated recursively using the formula:
FV(n) = FV(n - 1) * (1 + rate)
Where:
n = number of years
rate = annual growth rate (in decimal)
FV(0) = present value
************************************************************************************************************************************************************************************************************************
🧪 TIME COMPLEXITY
Time Complexity: O(n)
Each recursive call reduces years by 1, leading to a linear number of calls.
************************************************************************************************************************************************************************************************************************
✅ OPTIMIZATION TIPS
For better performance with large years, you can:
Use iteration instead of recursion
Or apply memoization to avoid repeated calculations
