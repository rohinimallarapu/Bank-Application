<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Success Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-image: url('Transfer1.jpeg'); 
            background-size: cover;
            background-position: center;
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
            margin: 0;
            text-align: center;
            color: #fff;
        }

        .container {
            background-color: rgba(0, 0, 0, 0.7); 
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
            width: 400px;
        }

        h1 {
            color: #4CAF50; 
            margin-bottom: 20px;
            font-size: 32px;
        }

        p {
            margin: 10px 0;
            font-size: 18px;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Success</h1>
        <p><strong>Salutation:</strong> <%= session.getAttribute("sal") %></p>
        <p><strong>Recipient:</strong> <%= session.getAttribute("ral") %></p>
        <p><strong>Message:</strong> <%= session.getAttribute("al") %></p>
    </div>
</body>
</html>
