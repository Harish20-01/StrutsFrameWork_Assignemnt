<%@ page import="java.util.List" %>
<html>
<head>
    <title>To-Do App</title>

    <style>
        body {
            font-family: Arial;
            background: #f4f6f8;
            text-align: center;
        }

        .container {
            width: 400px;
            margin: 50px auto;
            background: white;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
        }

        input[type=text] {
            width: 70%;
            padding: 8px;
        }

        button {
            padding: 8px 12px;
            margin: 5px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }

        .add { background: #4CAF50; color: white; }
        .delete { background: #f44336; color: white; }
        .update { background: #2196F3; color: white; }

        .task {
            display: flex;
            justify-content: space-between;
            margin-top: 10px;
        }
    </style>

</head>
<body>

<div class="container">

    <h2>To-Do List</h2>

    <form action="addTask.do" method="post">
        <input type="text" name="task" placeholder="Enter task"/>
        <button class="add">Add</button>
    </form>

    <hr>

    <%
        List<String> tasks = (List<String>) request.getAttribute("tasks");

        if (tasks != null) {
            for (int i = 0; i < tasks.size(); i++) {
    %>
    <div class="task">
        <form action="updateTask.do" method="post">
            <input type="hidden" name="id" value="<%= i %>"/>
            <input type="text" name="task" value="<%= tasks.get(i) %>"/>
            <button class="update">Update</button>
        </form>

        <form action="deleteTask.do" method="post">
            <input type="hidden" name="id" value="<%= i %>"/>
            <button class="delete">Delete</button>
        </form>
    </div>
    <%
            }
        }
    %>

</div>

</body>
</html>