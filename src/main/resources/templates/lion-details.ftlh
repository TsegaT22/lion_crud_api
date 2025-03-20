<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
            crossorigin="anonymous"></script>
    <title>Lion List</title>
    <link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
<!--Navigation bar-->
<nav class="navbar  navbar-expand-lg navbar-light" style="background-color: darkorange">
    <a class="navbar-brand" href="/lions/all" style="margin: 10px">
        <img src="cute-lion-face-logo-design-vector.jpg" alt="" width="80" height="60">
    </a>
    <ul class="nav justify-content-end">
        <li class="nav-item">
            <a class="nav-link active" aria-current="page" href="/lions/all" >Home</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="#">Second</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="#">Third</a>
    </ul>
</nav>
<div class="container" style="margin-top: 15px">
    <h1>${title}</h1>
    <div class="card">
        <h5 class="card-header">${lion.name}</h5>

        <div class="card-body">
            <span style="float:right">
                <a href="/lions/update/${lionId?c}" class="btn btn-primary">Edit Lion</a></span>
            <h5 class="card-title">ID: ${lion.lionId?c}</h5>
            <p class="card-text">Name: ${lion.name}</p>
            <p class="card-text">Age: ${lion.age}</p>
            <p class="card-text">Country: ${lion.country}</p>
            <p class="card-text">Description: ${lion.description}</p>
            <a href="/lions/delete/${lionId?c}" class="btn btn-danger">Delete Lion</a>
            <a href="/lions/all" class="btn btn-primary">Go Back</a>

        </div>
    </div>

</div>
</body>
</html>