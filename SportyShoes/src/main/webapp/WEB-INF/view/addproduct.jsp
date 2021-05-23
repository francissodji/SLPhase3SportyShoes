<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product registration</title>
<link rel="stylesheet"
 href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
 integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
 crossorigin="anonymous">
</head>
<body>

	<div class="container col-md-8 col-md-offset-3" style="overflow: auto">
	  <h1>Login Form</h1>
	  <form method="post">
	  
		   <div class="form-group">
		    <label for="uname">Designation</label> <input type="text"
		     class="form-control" id="aProddesign" placeholder="Product designation" name="aProddesign" required>
		   </div>
		   
		   <div class="form-group">
		    <label for="uname">Unit Price</label> <input type="text"
		     class="form-control" id="aProdUnitprice" placeholder="Unit price" name="aProdUnitprice" required>
		   </div>
	   
	       <div class="form-group">
		    <label for="uname">category</label> <input type="text"
		     class="form-control" id="aProdCategory" placeholder="Password" name="aProdCategory" required>
		   </div>
		   
		   <div class="form-group">
		    	<label>Photos: </label>
    			<input type="file" name="image" accept="image/png, image/jpeg" name="aProdPicture" required/>
		   </div>
		   
		   <div>
		   		<input type="file" name="image" accept="image/png, image/jpeg" />
		   </div>
	   	   <button type="submit" class="btn btn-primary">Submit</button>
	  </form>
 	</div>
</body>
</html>