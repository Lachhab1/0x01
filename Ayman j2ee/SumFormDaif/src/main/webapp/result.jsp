<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Sum Form</title>
    </head>
    <style>
        .form_sum{
            margin: 40px auto;
            width: 60vw;
            height: 70vh;
           
            border: 2px solid rgba(136, 134, 240, 0.781);
            border-radius: 10px;
            padding: 20px;
            background-color: rgb(165, 241, 241);
            display: flex;
            flex-direction: column;
            align-items: center;
            
        }
        .form_sum p{
            align-self: center;
            color: red;
            font-size: 20pt;
            font-weight: 700;
        }
      
    </style>
    <body style="background-color: rgb(241, 255, 181);">
        <div class="form_sum">
        <%int v1= Integer.parseInt(request.getParameter("v1"));
        int v2= Integer.parseInt(request.getParameter("v2"));
        int res= Integer.parseInt(request.getParameter("res"));
           %>
           <h1>Result : </h1>
           <h2>
          
           <%=v1 %> <%if(v2>=0){ out.print("+"); }else{out.print("-");v2=-v2;} %>  <%=v2 %> = <span style="color:red"><%=res %></span>
           </h2>
             
        </div>
    </body>
</html>