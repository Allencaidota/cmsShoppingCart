# cmsShoppingCart
It is a shopping cart by using spring boot

Admin section

12/7 Page crud. 

	M.  lombok to ued get, and set int models(data).

	V.  html and css for views.

	C.  servlet.mvc.support.RedirectAttributes func to direct page in controller.

	used Mysql and JPA to deal with data.

12/10 categories curd

	same code with page in categories, but i got more practice 

12/15 product page

	current step : working with curd 
		added foreign key constraints, so if i delete categoires, the rest of its products should be gone

12/16 product page

	current step : finished Admin products pagination
               		added a WYSWIG by using ckeditor5
               
Home page section

12/17 Front display products

            created PagesController and cateogriesController for home page
            used same pagigination steps form admin products page

12/18 Cart model and Cart partial

           	created cart model and cart partial view

12/19 add to cart

            added "Product added!" notification in products.html
            used css to move its position and hide the notification
            used script to do the effect that when we click "add to cart" it will show the "Product added!" notification

Cart section

        	created cart view
            cart view has all products informatiom.
            customer can add, subtract, and remove prodcuts in the cart view

12/20 Subtract product

            get the hashmap from the view
            if the products have more than 1, we only need to subtract the qty of the product
            if the product only has one qty, we will remove the product from the cart
			
12/20 Remove product and clear cart

            remove the product in the hashmap by id
            clear cart would be remove everything

12/21 Paypal checkout

		customer will get a redirect to paypal checkout after click pay in cart page. 
		First, I used css to make the notification clear that the page will overlay while 50%, and hide the original paypal button.
        	Next, I added palpay checkout function from using paypal developer api, and created a new paypal sanbox.
        	Then, I used time thyme to get all name, price, and amount of products to the submit form.
		Finally, I used script to make the checkout button to submit info.
         

12/22 Adding String boot security dependency

12/22 Try YAML which is a convenient format for specifying hierarchical configuration data.
		
		having bug when switch YAML to applictaion.properties, which was solve by update configuration  in springboot
	
12/23 limit partial page visibility by SecurityConfig

		@Service
			public class SecurityConfig extends WebSecurityConfigurerAdapter {

    		@Override
    		protected void configure(HttpSecurity http) throws Exception {
        		http
                .authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers("/**").hasAnyRole("USER");S
    		}
		}

12/23 Creating users and admin tables in MySQL

12/24 Creating User and Admin entities 
		
		mainly use org.springframework.security.core.authority.SimpleGrantedAuthority

12/24 Registration controller and user and admin repository

		created paswordEncoder in SecurityConfig as Bean

12/24 GET register and POST register

		creating register.html views for allow customer to get register 

		after user register the form will be submit and it will be redrict to login 