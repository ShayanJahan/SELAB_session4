# SELAB_session4

First, we initialize the code by defining the rectangle class and adding a test case. In the beginning, the computeArea method will simply return the value 0. Thus, it will fail the test.

Then, we are going to fake it! In our test case, the height and the width of the rectangle are 3 and 5, so the area will be 15. In the computeArea method, we simply return value 15. This way it will pass our only test case. Next, we will add another test case with height and width of 10 and 10. In this fashion, one of our test cases will be passed, and the other one will be failed.

In the end, we will fix the computeArea method, such that it will return height * width. Now, it will pass all three cases. Using TDD method, we have implemented computeArea method.

After implementing computeArea, we will add getter and setter for both height and width.