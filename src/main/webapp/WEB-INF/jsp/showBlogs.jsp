
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Show Blogs</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <style>
        .blogs {
            margin-top:10px;
        text-align: center;
        margin-left: 10px;
        height:300px;
        width:250px;
        border-radius:10px;
        }


        .delete {
            text-decoration: none;
            color:white;
            background-color:red;
        }

        .edit {
            text-decoration: none;
            color:white;
            background-color:gray;
        }
    </style>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">Blogs</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="/blogs">Add Blog</a>
                </li>
            </ul>
        </div>
    </div>
</nav>
<div style="margin-left:600px">
    <h2>Blogs:</h2>
    <div class="blogs">
    <c:forEach items="${blogs}" var="blog">
        <p>${blog.blogTitle}</p>
        <p>${blog.blogBody}</p> <a class="edit" href="/blogs/edit/${blog.id}">Edit Blog</a> <span><a class="delete" href="/blogs/delete/${blog.id}">Delete Blog</a></span></p>
    </c:forEach>
        <c:if test="${not empty deleteMessage}">
            <div><p>${deleteMessage}</p></div>
        </c:if>
    </div>
</div>
</body>
</html>
