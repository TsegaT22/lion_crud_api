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
<!--Container class-->
<div class="container" style="margin-top: 15px">
  <h1>${form}</h1>
  <a href="/lions/createForm" class="btn btn-outline-primary" style="float:right;">Create New Lion</a>
  <form action="/lions/name">
    <input type="text" name="search" placeholder="Search By Name &#128270;">
  </form>

  <!--Lions table-->
  <table class="table table-striped rounded-3 overflow-hidden">
    <tr>
      <th>ID</th>
      <th>Name</th>
      <th>Age</th>
      <th>Country</th>
      <th>Description</th>
    </tr>
    <#List lionList as lion>
    <tr>
      <td>
        <a href="/lions/${lion.lionId?c}" style="color:#000000">${lion.lionId?c}</a>
      </td>
      <td>${lion.name}</td>
      <td>
        <a href="/lions/age/${lion.age}" style="color:#000000">${lion.age}</a>
      </td>
    </tr>
    </#List>
  </table>
</div>
</body>
</html>