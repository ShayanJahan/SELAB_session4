# SELAB_session4

## Experiment

First, we initialize the code by defining the rectangle class and adding a test case. In the beginning, the computeArea method will simply return the value 0. Thus, it will fail the test.

Then, we are going to fake it! In our test case, the height and the width of the rectangle are 3 and 5, so the area will be 15. In the computeArea method, we simply return value 15. This way it will pass our only test case. Next, we will add another test case with height and width of 10 and 10. In this fashion, one of our test cases will be passed, and the other one will be failed.

In the end, we will fix the computeArea method, such that it will return height * width. Now, it will pass all three cases. Using TDD method, we have implemented computeArea method.

After implementing computeArea, we will add getter and setter for both height and width.


## Questions

### 1. Define five principles of SOLID.

1) Single Responsibility Principle (SRP)

هر کلاس باید یک، و فقط یک دلیل برای تغییر داشته باشد. این به این معنی است که هر کلاس بید فقط به یک اکتور خاص پاسخگو باشد. اگر یک کلاس بخواهد به چند اکتور جواب بدهد، ممکن است توسط یک اکتور تغییر کند در حالی که اکتور  دیگر از این تغییر با خبر نیست و تغییری در عملکرد بخش‌ آن اکتور به وجود بیاید که باعث ایجاد مشکل شود. در نتیجه نیاز است هر کلاس فقط به یک اکتور پاسخگو باشد. البته این اصل به این معنا نیست که هر کلاس باید فقط یک کار انجام دهد، بلکه به این معنی است که تمام کار‌های آن باید در راستای پاسخگویی به فقط یک اکتور باشد.
 
2) Open-Closed Principle (OCP)



3) Liskov Substitution Principle (LSP)

4) Interface Segregation Principle (ISP)

5) Dependency Inversion Principle (DIP)

