<!DOCTYPE html>
<html>

<body>

<h1>Spring-Boot_Store_Management_System</h1>

<p><strong>Store Management System</strong> is a REST API with CRUD operations that allows the user to Create, Read, Update, and Delete several kinds of products listed in a database (MySQL). This API has an ADD PRODUCT function to save new products in the databse to be shown in the List of Products. 
  
<h2>Index</h2>

<ol>
   <li><a href="#classes">Classes</a>
        <ul>
            <li><a href="#storemanagementsystemapplication">StoreManagementSystemApplication</a></li>
            <li><a href="#producto">Producto</a></li>
            <li><a href="#productocontrolador">ProductoControlador</a></li>
            <li><a href="#productorepositorio">ProductoRepositorio</a></li>
            <li><a href="#productoservicio">ProductoServicio</a></li>
        </ul>
    </li>
</ol>

<h2 id="classes">Classes</h2>

<h3 id="storemanagementsystemapplication">AppLauncher</h3>
<p>The <code>StoreManagementSystemApplication</code> class contains the main method that runs the Spring Boot application.</p>

<h3 id="producto">Student</h3>
<p>The <code>producto</code> class stores the data that maps to database tables. In this case the <code>Producto</code> class corresponds to a table in MySQL, and its fields (id, nombre, marca, hecho en, precio) correspond to the columns in that table. </p>

<h3 id="productocontrolador">ProductoControlador</h3>
<p>The <code>productocontrolador</code>class will handles HTTP requests which define the endpoints of the API. Also, it uses service classes to perform business logic.

<h3 id="productorepositorio">ProductoRepositorio</h3>
<p>The <code>productorepositorio</code> interface extends JpaRepository and provides methods for CRUD operations inside the API REST.  
  
<h3 id="productoservicio">ProductoServicio</h3>
<p>The <code>productoservicio</code> class interacts directly with the <code>ProductoRepositorio</code>. In here we can define methods to handle the CRUD operations related to entities defined in the <code>Producto</code> class.</p>

</body>

</html>


![1](https://github.com/user-attachments/assets/bafeb017-6983-4028-b117-d9d5514333ad)

![2](https://github.com/user-attachments/assets/b01d3ec3-1f3e-402e-9640-643e55b73710)





