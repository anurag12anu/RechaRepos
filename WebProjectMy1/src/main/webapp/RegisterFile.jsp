<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
 <style>
        .myclass{
           
        }
        .mybclass{
            
            background-color:aquamarine;
        
        

        }
        .clabel{
            font-size:25px ;
            color:deepskyblue ;
        }
        .mydiv{
            color:brown;
            text-align:center;
            font-size:50px ;
            background-color:aqua
            
        }
        .myfdiv{
            text-align:center;
            background-color:antiquewhite;
            border:spx solid red;


        }
        .submits{
            background-color:rgb(212, 146, 146);
            font-size:18;
        }
        .files{
            background-color:rgb(212, 146, 203);
            font-size:18;
        }
        .div{
            display: flex;

        }
        


    </style>

    <body  class="mybclass">
        <div class="mydiv"> <h><b>User Registration Form</b>  </h>
        </div>
       <div>
        
        <button style="background-color:aqua;font-size:18px;text-align:left ;" type="button"
        onclick="document.getElementById('demo').style.backgroundColor='lightblue'">
                click on
        </Button><br><br>
        <button style="background-color:white;font-size:18px;text-align: right ;" type="button"
                onclick="document.getElementById('demo').style.backgroundColor='white'">
                click off
        </Button>

        
            <div class="div">
                <div>
                    <input style="text-align: left;" type="image"  name="fimage"
                 src="C:\Users\Hello\Desktop\profile.png" height="150" width="100"><br>

                </div>
                <div>
                    <form action ="RegisterServlete"id="demo" class="myfdiv">
            
                        <label class="clabel" type="text"> Name</label><br>
                        <input type="text" name="fname"><br>
                        <label class="clabel" type="text">Email</label> <br>
                        <input type="email"name="femail"><br>
                        <label class="clabel" type="text" >Password</label><br>
                        <input type="password" name="fpass"><br>
                        <lable class="clabel" type="text">DOB</lable><br>
                        <input type="Date" name ="fdate"><br>
                        <label class="clabel" type="text"> Address</label><br>
                        <input type="text" name="faddress"><br>
                        <label class="clabel" type="text">File</label><br>
                        <input class="files " type="file"><br><br>
                        <label type="text"> Image</label><br>
                        
                        <label  class="clabel"type="text">Submit Button</label><br><br>
                        <input class="submits" type="submit" value="Register">
            
            
                    </form>
                 

                </div>
            </div>

        
    

       </div>
           
        
    </body>
</html>