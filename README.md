# SELAB_session4

## Experiment

First, we initialize the code by defining the rectangle class and adding a test case. In the beginning, the computeArea method will simply return the value 0. Thus, it will fail the test.

Then, we are going to fake it! In our test case, the height and the width of the rectangle are 3 and 5, so the area will be 15. In the computeArea method, we simply return value 15. This way it will pass our only test case. Next, we will add another test case with height and width of 10 and 10. In this fashion, one of our test cases will be passed, and the other one will be failed.

In the end, we will fix the computeArea method, such that it will return height * width. Now, it will pass all three cases. Using TDD method, we have implemented computeArea method.

After implementing computeArea, we will add a getter and setter for both height and width.

Finally, we will add the Square class. This method will not inherit from the Rectangle class, because even though a square is mathematically a rectangle, here we are dealing with resizable rectangles, and a square is not a resizable rectangle! If the square class inherits from the rectangle class, it would have a contradiction with SOLID principles; more specifically, it would have a contradiction with Liskov Substitution Principle (LSP), because the square class could not guarantee the post-conditions of methods of the rectangle class.

## Questions

### 1. Define five principles of SOLID.

1) Single Responsibility Principle (SRP)

هر کلاس باید یک، و فقط یک دلیل برای تغییر داشته باشد. این به این معنی است که هر کلاس بید فقط به یک اکتور خاص پاسخگو باشد. اگر یک کلاس بخواهد به چند اکتور جواب بدهد، ممکن است توسط یک اکتور تغییر کند در حالی که اکتور  دیگر از این تغییر با خبر نیست و تغییری در عملکرد بخش‌ آن اکتور به وجود بیاید که باعث ایجاد مشکل شود. در نتیجه نیاز است هر کلاس فقط به یک اکتور پاسخگو باشد. البته این اصل به این معنا نیست که هر کلاس باید فقط یک کار انجام دهد، بلکه به این معنی است که تمام کار‌های آن باید در راستای پاسخگویی به فقط یک اکتور باشد.
 
2) Open-Closed Principle (OCP)

هر کلاس باید برای گسترش باز، و برای تغییر دادن بسته باشد. این به این معنی است که بتوانیم به راحتی قابلیت به کلاس اضافه کنیم بدون آنکه نیاز به تغییر در کد داشته باشیم. یکی از راه‌های رعایت این اصل، رعایت اصل پنجم است. 

3) Liskov Substitution Principle (LSP)

این اصل می‌گوید کلاس بچه باید بتواند جایگزین کلاس پدر شود. این موضوع به این معنی است که اگر شرط‌‌های اولیه و شرط‌های نهایی هر متد را در نظر بگیریم، متد‌های بچه نباید شرط‌های اولیه‌ی بیشتر (قوی‌تر) یا شرط‌های نهایی کمتر (ضعیف‌تر) داشته باشد.

4) Interface Segregation Principle (ISP)

داشتن تعداد بیشتری واسط مشخص بسیار بهتر از آن است که یک واسط جنرال داشته باشیم. این اصل تاکید بر مشخص و منسجم بودن اینترفیس‌ها دارد.

5) Dependency Inversion Principle (DIP)

این اصل ارتباط نزدیکی با اصل دوم دارد و یکی از راه‌های ارضا کردن اصل دوم،، ارضای این اصل است. این اصل می‌گوید که باید تمام تلاش‌ها انجام شود که تا جای ممکن کلاس‌هایی که قرار است از آن‌ها در کلاس‌های دیگر استفاده شود (برای مثال با ارث‌بری) ابسترکت (حالت کلی و با جزییات کمتر) باشند.


### 2. In which of the main steps of designing software SOLID principles will be used?

این اصول در گام طراحی مورد استفاده قرار می‌گیرند. تمامی ۵ اصل گفته شده قوانینی در مورد طراحی ما می‌گویند، برای مثال اصل اول می‌گوید باید طراحی به گونه‌ای باشد که هر کلاس فقط پاسخگو به یک اکتور باشد. به همین طریق چهار اصل دیگر نیز قواعدی در مورد گام تحلیل می‌گویند. در نتیجه این اصول در گام طراحی مورد استفاده قرار می‌گیرند.

### 3. TDD defines tests at the beginning of designing software; does it make any contradiction?

خیر، این موضوع تناقضی ایجاد نمی‌کند. زیرا این روش، یک روش دولوپمنت و پیاده سازی است و جدا از بخش تستی است که در انتها انجام می‌شود. در واقع تست‌هایی که در این روش در ابتدا انجام می‌دهیم جزیی از گام پیاده‌سازی ما هستند و نه برای اینکه از صحت برنامه‌ی پیاده سازی شده اطمینان حاصل می‌کنیم. پس این روش تماما پیاده سازی است، و جداگانه می‌توانیم در انتهای این روش تست‌های دیگری نیز داشته باشیم که همان تست‌های اصلی برنامه و برای درستی سنجی باشند.

### 4. In the experiment, how would designing the models change if we did not need to change the dimensions of the rectangle?

اگر در این آزمایش نیازی به تغییر ابعاد مستطیل نداشتیم، و مستطیل ما قابلیت تغییر سایز نداشت، آن وقت کلاس مربع می‌توانست از آن ارث ببرد. در واقع ما می‌دانیم که در حالت کلی هر مربع یک مستطیل است، پس در حالت کلی مربع می‌تواند از مستطیل ارث‌بری کند، اما در اینجا ما با یک مستطیل ریسایزبل (یک مستطیل با قابلیت تغییر اندازه) روبرو هستیم. یک مربع یک مستطیل ریسایزبل نیست، و نمی‌تواند متد‌های تغییر اندازه موجود در مستطیل را ارث‌بری کند، زیرا طول و عرض آن باید همیشه مساوی باشد. در نتیجه، در اینجا نمی‌توانیم از متد مستطیل میوتبل ارث‌بری کنیم و باید کاملا جداگانه مربع را تعریف کنیم، اما اگر مستطیل ایمیوتبل بود، مربع می‌توانست از آن ارث‌بری کند.