# cmsShoppingCart
It is a shopping cart by using spring boot

12/7 Page crud. 

M. used lombok to ued get, and set int models.

V. used html and css for views.

C. used servlet.mvc.support.RedirectAttributes func to direct page in controller.

used Mysql and JPA to deal with data.


12/10 categories curd

same code with page in categories, but i got more practice 

12/15 product page

current step : working with curd 
               added foreign key constraints, so if i delete categoires, the rest of its products should be gone

12/16 product page

current step : finished Admin products pagination
               added a WYSWIG by using ckeditor5
               
               Start to work with home page with nav bar html


12/17 Front display products
            created PagesController and cateogriesController for home page
            used same pagigination steps form admin products page

12/18 Cart model and Cart partial
            created cart model and cart partial view

12/19 add to cart
            added "Product added!" notification in products.html
            used css to move its position and hide the notification
            used script to do the effect that when we click "add to cart" it will show the "Product added!" notification