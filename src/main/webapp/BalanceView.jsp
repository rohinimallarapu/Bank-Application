<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Balance</title>
    <style>
        body {
            margin: 0;
            padding: 0;
            font-family: Arial, sans-serif;
            background-image: url('BalanceView.jpg'); 
            background-size: cover;
            background-position: center;
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
            color: #fff;
            text-align: center;
        }

        h1 {
            font-size: 4rem;
            margin-bottom: 20px;
            text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.7);
            color:black;
            margin-right:300px;
        }

        .balance {
            font-size: 2.5rem;
            font-weight: bold;
            background-color: rgba(0, 0, 0, 0.6); 
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 15px rgba(0, 0, 0, 0.5);
            display: inline-block;
            color: white;
            
        }
        div{
        margin-right:400px;
        }
    </style>
</head>
<body>
    <div>
        <h1>Current Balance:</h1>
        <div class="balance">
        <span>$
            <%
            session = request.getSession();
            out.println(session.getAttribute("bal"));
            %>
            /-</span>
        </div>
    </div>
</body>
</html>
