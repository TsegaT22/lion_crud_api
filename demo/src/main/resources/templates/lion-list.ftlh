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
    <img src="/images/lion-symbol-cute-lion-cartoon-vector.jpg" alt="" width="90" height="80">
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
<!--Container class-->
<div class="container" style="margin-top: 15px">
  <h1>${title}</h1>
  <a href="/lions/createForm" class="btn btn-outline-primary" style="float:right;">Create New Lion</a>
  <form action="/lions/name">
    <input type="text" name="search" placeholder="Search By Name &#128270;">
  </form>

  <!--Lions Card Bodies-->
  <div class="row g-3">
    <#list lionList as lion>
    <div class="col-md-6 col-lg-4">
      <div class="card shadow-sm h-100">
        <div class="card-body">
          <h5 class="card-title">${lion.name}</h5>
          <h6 class="card-subtitle mb-2 text-muted">ID: ${lion.lionId}</h6>
          <p class="card-text">
            <strong>Age:</strong> <a href="/lions/age/${lion.age}" class="text-decoration-none text-dark">${lion.age}</a><br>
            <strong>Country:</strong> <a href="/lions/country/${lion.country}" class="text-decoration-none text-dark">${lion.country}</a><br>
            <strong>Description:</strong> <a href="/lions/description/${lion.description}" class="text-decoration-none text-dark">${lion.description}</a>
          </p>
        </div>
      </div>
    </div>
  </#list>
</div>
</div>
</body>
</html>