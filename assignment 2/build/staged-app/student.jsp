
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Student info</title>

  <!-- Bootstrap -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
  <div class="page-header">
    <h1>Create Studnet</h1>
  </div>

  <form role="form" action="hello" method="post">
    <div class="form-group">
      <div class="input-group">
        <span class="input-group-addon">Student name</span>
        <input name="name" type="text" class="form-control">
      </div>
    </div>
    <div class="form-group">
      <div class="input-group">
        <span class="input-group-addon">Email</span>
        <input name="email" type="text" class="form-control">
      </div>
    </div>

    <div class="form-group">
      <div class="input-group">
        <span class="input-group-addon">ID</span>
        <input name="id" type="text" class="form-control">
      </div>
    </div>


    <a href="/" class="btn btn-default">Cancel</a>
    <button type="submit" class="btn btn-success">Save</button>
  </form>

</div>
</body>
</html>