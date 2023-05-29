# Test automation course final work

Tested webpage: www.egzotika.en 

Github repository: https://github.com/Yogaracer/EgzotikaLT_Baigiamasis


## Test cases

### 1. New user registration with valid data

1.1 Open https://www.egzotika.lt/en/ website <br>
1.2 Click on „Create an Account“ header link <br>
1.3 Insert First Name in a line „First Name" <br>
1.4  Insert Last Name in a line „Last Name“ <br>
1.5  Insert email in a line „Email“ <br>
1.6  Insert password in a line „Password“ <br>
1.7 Insert the same password in a line „Confirm password“ <br>
1.8 Click a button „Create an account“<br>

Expected result: My Account page contains Contact information: <br>
- email entered in the registration form <br>
- user first name and last name entered in the registration form <br>

### 2. New user registration with invalid data
2.1 Open https://www.egzotika.lt/en/ website <br>
2.2 Click on „Create an Account“ header link <br>
2.3  Insert valid First Name in a line „First Name" <br>
2.4  Insert valid Last Name in a line „Last Name“ <br>
2.5  Insert already registered email in a line „Email“ <br>
2.6  Insert valid password in a line „Password“ <br>
2.7 Insert the same valid password in a line „Confirm password“ <br>
2.8 Click a button „Create an account“<br>

Expected result:  error notification "There is already an account with this email address. If you are sure that it is your email address, click here to get your password and access your account." appeared <br>

### 3. Login into account using valid user name and password <br>

3.1 Open https://www.egzotika.lt/en/ website <br>
3.2 Click on "Sign In" header link <br>
3.3 Insert valid email address in line "Email" <br>
3.4 Insert valid password in line "Password" <br>
3.5 Click on button „Sign In“ <br>

Expected result: header link name "SignIn" is changed to name "Your Dashboard"

### 4.  Login into account using invalid email 

4.1 Open https://www.egzotika.lt/en/ website <br>
4.2 Click on "Sign In" header link <br>
4.3 Insert invalid email address in line "Email" <br>
4.4 Insert valid password in line "Password" <br>
4.5 Click on button „Sign In“ <br>

Expected result: Notification with error message "The account sign-in was incorrect or your account is disabled 
temporarily. Please wait and try again later." appeared <br>

### 5.  Products search by dimensions 

5.1 Open www.egzotika.en website <br>
5.2 Click on search category "Tyres" <br>
5.3 Insert product width "225" in a filter category <br>
5.4 Insert product height "45" in a filter category <br>
5.5 Insert product rim size "19" in a filter category <br>
5.6 Insert product season "All seasons" <br>
5.7 Click on button "Search" <br>

Expected result: all product in the search list contains attributes "225", "45", "R19" <br>

### 6. Add products into shopping cart
6.1 Open www.egzotika.en/tyres website <br>
6.2 Click on "Allseason" option on the left side "Season" options menu  <br> 
6.3 Add product "ROADSTONE N Priz 4 season" to cart" by clicking button<br>
6.4. Click on menu item "Tyres" <br>
6.5 Click on "Winter" option on the left side "Season" options menu  <br>
6.6 Add product "ROADSTONE EUROVIS ALPINE WH1 (2022)" to cart" by clicking button<br>
6.7 Click on menu item "Tyres" <br>
6.8 6.4 Click on "Summer" option on the left side "Season" options menu  <br>
6.9 Add product "STARMAXX NOVARO ST532 (2020-2023)" to cart" by clicking button<br>

Expected result: shopping cart contains 3 items 


