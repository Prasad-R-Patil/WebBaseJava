<!DOCTYPE html>
<html>
<head>
  <meta charset="ISO-8859-1">
  <title>Table</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <link rel="stylesheet" href="./Resource/style.css">
  <style>
    body, html {
      height: 100%;
      background-color: #f8f9fa;
    }
    .center-box {
      border: 3px solid red;
      width: 400px;
      max-width: 90%;
      padding: 30px;
      border-radius: 10px;
      background-color: white;
      box-shadow: 0 0 10px rgba(0,0,0,0.1);
    }
  </style>
</head>
<body class="d-flex justify-content-center align-items-center">

  <div class="center-box text-center">
    <h1 class="mb-4">Create Table</h1>
    <form action="table.jsp" method="post">
      <label for="textnum" class="form-label">Enter Number:</label>
      <input id="textnum" type="text" name="textnum" class="form-control mx-auto mb-3" style="width: 200px; padding-left: 10px;">
      <button type="submit" class="btn btn-outline-primary w-100">Create Table</button>
    </form>
  </div>

</body>
</html>
