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
<!--Navigation Bar-->
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

<!--Container Class-->
<div class="container" style="margin-top:15px">
    <h1>${form}</h1>
    <form id="new-lion" action="/lions/new" method="post">
        <input type="text" id="name" name="name" placeholder="Name"/>
        <input type="number" id="age" name="age" placeholder="Age"/>
        <input type="text" id="country" name="country" placeholder="Country"/>
        <input type="text" id="description" name="description" placeholder="description"/>
        <button type="submit" class="btn btn-primary">Save</button>
        <button type="reset" class="btn btn-danger" onclick="closeForm()">Cancel</button>
    </form>
</div>
<script>
    function closeForm(){
        document.getElementById("new-lion").style.display= "none";
    }
</script>
</body>
</html>