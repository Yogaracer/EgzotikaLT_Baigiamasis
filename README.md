# Test automation course final work

Webpage www.egzotika.en main functionalities test

LINK TO MARKDOWN DOCUMENTATION
https://github.com/Yogaracer/EgzotikaLT_Baigiamasis


## Test cases

### 1. New user registration with valid data

1.1 Open www.egzotika.en website <br>
1.2 Click on „Create an Account“ header link <br>
1.3 Insert First Name in a line „First Name" <br>
1.4  Insert Last Name in a line „Last Name“ <br>
1.5  Insert email in a line „Email“ <br>
1.6  Insert password in a line „Password“ <br>
1.7 Insert the same password in a line „Confirm password“ <br>
1.8 Click a button „Create an account“<br>

Expected result: My Account page contains Contact information: <br>
- email entered in the registration form
- user first name and last name entered in the registration form <br>

### 2. Login into account using valid user name and password <br>

2.1 Open www.egzotika.en website <br>
2.2 Click on „Sign In“ header link <br>
2.3 Insert valid email address <br>
2.4 Insert valid password <br>
2.5 Click on button „Sign In“ <br>

Expected result: My Account page contains Contact information: <br>
- email entered into login form <br>
- user first name and last name entered in the registration form <br>

### 3.  Login into account using invalid email 

3.1 Open www.egzotika.en website <br>
3.2 Click on „Sign In“ header link <br>
3.3 Insert invalid email address <br>
3.4 Insert valid password <br>
3.5 Click on button „Sign In“ <br>

Expected result: Notification with error message "The account sign-in was incorrect or your account is disabled 
temporarily. Please wait and try again later." appeared <br>

### 4.Products link verification

4.1 Open www.egzotika.en website <br>
4.2 Click on menu item "Tyres" <br>

Expected result: all product links are active

### 5. Add product into shopping cart
5.1 Open www.egzotika.en website <br>
5.2 Click on menu item "Tyres" <br>
5.3 Click on first item "Add to cart" <br>
5.4 Click on second item "Add to cart" <br>
5.5 Open Shopping cart <br>

Expected result: shopping cart contains all added items 


